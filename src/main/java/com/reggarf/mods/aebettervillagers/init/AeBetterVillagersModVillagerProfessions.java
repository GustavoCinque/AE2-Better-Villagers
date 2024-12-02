package com.reggarf.mods.aebettervillagers.init;

import appeng.core.definitions.AEBlocks;
import appeng.core.definitions.BlockDefinition;
import com.google.common.collect.ImmutableSet;
import com.reggarf.mods.aebettervillagers.AeBetterVillagersMod;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.ai.village.poi.PoiTypes;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.EventBusSubscriber.Bus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.RegisterEvent;

@EventBusSubscriber(
        bus = Bus.MOD
)
public class AeBetterVillagersModVillagerProfessions {
    private static final Map<String, ProfessionPoiType> POI_TYPES = new HashMap();
    public static final DeferredRegister<VillagerProfession> PROFESSIONS;
    public static final DeferredHolder<VillagerProfession, VillagerProfession> AE_TOOLSMITH;
    public static final DeferredHolder<VillagerProfession, VillagerProfession> AE_ENGINEER;
    public static final DeferredHolder<VillagerProfession, VillagerProfession> AE_SPECIALIST;

    public AeBetterVillagersModVillagerProfessions() {
    }

    private static DeferredHolder<VillagerProfession, VillagerProfession> registerProfession(String name, Supplier<Block> block, Supplier<SoundEvent> soundEvent) {
        POI_TYPES.put(name, new ProfessionPoiType(block, (Holder)null));
        return PROFESSIONS.register(name, () -> {
            Predicate<Holder<PoiType>> poiPredicate = (poiTypeHolder) -> ((ProfessionPoiType)POI_TYPES.get(name)).poiType != null && poiTypeHolder.value() == ((ProfessionPoiType)POI_TYPES.get(name)).poiType.value();
            return new VillagerProfession("ae_better_villagers:" + name, poiPredicate, poiPredicate, ImmutableSet.of(), ImmutableSet.of(), (SoundEvent)soundEvent.get());
        });
    }

    @SubscribeEvent
    public static void registerProfessionPointsOfInterest(RegisterEvent event) {
        event.register(Registries.POINT_OF_INTEREST_TYPE, (registerHelper) -> {
            for(Map.Entry<String, ProfessionPoiType> entry : POI_TYPES.entrySet()) {
                Block block = (Block)((ProfessionPoiType)entry.getValue()).block.get();
                String name = (String)entry.getKey();
                Optional<Holder<PoiType>> existingCheck = PoiTypes.forState(block.defaultBlockState());
                if (existingCheck.isPresent()) {
                    AeBetterVillagersMod.LOGGER.error("Skipping villager profession " + name + " that uses POI block " + String.valueOf(block) + " that is already in use by " + String.valueOf(existingCheck));
                } else {
                    PoiType poiType = new PoiType(ImmutableSet.copyOf(block.getStateDefinition().getPossibleStates()), 1, 1);
                    registerHelper.register(ResourceLocation.fromNamespaceAndPath("ae_better_villagers", name), poiType);
                    ((ProfessionPoiType)entry.getValue()).poiType = BuiltInRegistries.POINT_OF_INTEREST_TYPE.wrapAsHolder(poiType);
                }
            }

        });
    }

    static {
        PROFESSIONS = DeferredRegister.create(Registries.VILLAGER_PROFESSION, "ae_better_villagers");
        BlockDefinition var10001 = AEBlocks.CELL_WORKBENCH;
        Objects.requireNonNull(var10001);
        AE_TOOLSMITH = registerProfession("ae_toolsmith", var10001::block, () -> (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.smithing_table.use")));
        var10001 = AEBlocks.CONTROLLER;
        Objects.requireNonNull(var10001);
        AE_ENGINEER = registerProfession("ae_engineer", var10001::block, () -> (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.grindstone.use")));
        var10001 = AEBlocks.CRAFTING_STORAGE_16K;
        Objects.requireNonNull(var10001);
        AE_SPECIALIST = registerProfession("ae_specialist", var10001::block, () -> (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.anvil.use")));
    }

    private static class ProfessionPoiType {
        final Supplier<Block> block;
        Holder<PoiType> poiType;

        ProfessionPoiType(Supplier<Block> block, Holder<PoiType> poiType) {
            this.block = block;
            this.poiType = poiType;
        }
    }
}
