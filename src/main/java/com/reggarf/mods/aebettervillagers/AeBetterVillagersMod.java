package com.reggarf.mods.aebettervillagers;


import com.reggarf.mods.aebettervillagers.init.AeBetterVillagersModVillagerProfessions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.util.Tuple;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.util.thread.SidedThreadGroups;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.tick.ServerTickEvent;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.network.handling.IPayloadHandler;
import net.neoforged.neoforge.network.registration.PayloadRegistrar;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("ae_better_villagers")
public class AeBetterVillagersMod {
    public static final Logger LOGGER = LogManager.getLogger(AeBetterVillagersMod.class);
    public static final String MODID = "ae_better_villagers";
    private static boolean networkingRegistered = false;
    private static final Map<CustomPacketPayload.Type<?>, NetworkMessage<?>> MESSAGES = new HashMap();
    private static final Collection<Tuple<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue();

    public AeBetterVillagersMod(IEventBus modEventBus) {
        NeoForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::registerNetworking);
        AeBetterVillagersModVillagerProfessions.PROFESSIONS.register(modEventBus);
    }

    public static <T extends CustomPacketPayload> void addNetworkMessage(CustomPacketPayload.Type<T> id, StreamCodec<? extends FriendlyByteBuf, T> reader, IPayloadHandler<T> handler) {
        if (networkingRegistered) {
            throw new IllegalStateException("Cannot register new network messages after networking has been registered");
        } else {
            MESSAGES.put(id, new NetworkMessage(reader, handler));
        }
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    private void registerNetworking(final RegisterPayloadHandlersEvent event) {
        final PayloadRegistrar registrar = event.registrar(MODID);
        MESSAGES.forEach((id, networkMessage) -> registrar.playBidirectional(id, ((NetworkMessage) networkMessage).reader(), ((NetworkMessage) networkMessage).handler()));
        networkingRegistered = true;
    }



    public static void queueServerWork(int tick, Runnable action) {
        if (Thread.currentThread().getThreadGroup() == SidedThreadGroups.SERVER) {
            workQueue.add(new Tuple(action, tick));
        }

    }

    @SubscribeEvent
    public void tick(ServerTickEvent.Post event) {
        List<Tuple<Runnable, Integer>> actions = new ArrayList();
        workQueue.forEach((work) -> {
            work.setB((Integer)work.getB() - 1);
            if ((Integer)work.getB() == 0) {
                actions.add(work);
            }

        });
        actions.forEach((e) -> ((Runnable)e.getA()).run());
        workQueue.removeAll(actions);
    }

    private static record NetworkMessage<T extends CustomPacketPayload>(StreamCodec<? extends FriendlyByteBuf, T> reader, IPayloadHandler<T> handler) {
        private NetworkMessage(StreamCodec<? extends FriendlyByteBuf, T> reader, IPayloadHandler<T> handler) {
            this.reader = reader;
            this.handler = handler;
        }

        public StreamCodec<? extends FriendlyByteBuf, T> reader() {
            return this.reader;
        }

        public IPayloadHandler<T> handler() {
            return this.handler;
        }
    }
}
