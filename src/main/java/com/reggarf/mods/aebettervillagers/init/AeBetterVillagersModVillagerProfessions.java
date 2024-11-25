
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.reggarf.mods.aebettervillagers.init;

import appeng.core.definitions.AEBlocks;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.ai.village.poi.PoiTypes;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import java.util.function.Supplier;
import java.util.function.Predicate;
import java.util.Optional;
import java.util.Map;
import java.util.HashMap;

import com.reggarf.mods.aebettervillagers.AeBetterVillagersMod;

import com.google.common.collect.ImmutableSet;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AeBetterVillagersModVillagerProfessions {
	private static final Map<String, ProfessionPoiType> POI_TYPES = new HashMap<>();
	public static final DeferredRegister<VillagerProfession> PROFESSIONS = DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, AeBetterVillagersMod.MODID);
	public static final RegistryObject<VillagerProfession> AE_TOOLSMITH = registerProfession("ae_toolsmith", AEBlocks.CELL_WORKBENCH::block, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.smithing_table.use")));
	public static final RegistryObject<VillagerProfession> AE_ENGINEER = registerProfession("ae_engineer", AEBlocks.CONTROLLER::block, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.grindstone.use")));
	public static final RegistryObject<VillagerProfession> AE_SPECIALIST = registerProfession("ae_specialist", AEBlocks.CRAFTING_STORAGE_16K::block, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.use")));
	public static final RegistryObject<VillagerProfession> AE_CRYSTAL_HARVESTER = registerProfession("ae_crystal_harvester", AEBlocks.CONDENSER::block , () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_cluster.break")));

	private static RegistryObject<VillagerProfession> registerProfession(String name, Supplier<Block> block, Supplier<SoundEvent> soundEvent) {
		POI_TYPES.put(name, new ProfessionPoiType(block, null));
		return PROFESSIONS.register(name, () -> {
			Predicate<Holder<PoiType>> poiPredicate = poiTypeHolder -> (POI_TYPES.get(name).poiType != null) && (poiTypeHolder.get() == POI_TYPES.get(name).poiType.get());
			return new VillagerProfession(AeBetterVillagersMod.MODID + ":" + name, poiPredicate, poiPredicate, ImmutableSet.of(), ImmutableSet.of(), soundEvent.get());
		});
	}

	@SubscribeEvent
	public static void registerProfessionPointsOfInterest(RegisterEvent event) {
		event.register(ForgeRegistries.Keys.POI_TYPES, registerHelper -> {
			for (Map.Entry<String, ProfessionPoiType> entry : POI_TYPES.entrySet()) {
				Block block = entry.getValue().block.get();
				String name = entry.getKey();
				Optional<Holder<PoiType>> existingCheck = PoiTypes.forState(block.defaultBlockState());
				if (existingCheck.isPresent()) {
					AeBetterVillagersMod.LOGGER.error("Skipping villager profession " + name + " that uses POI block " + block + " that is already in use by " + existingCheck);
					continue;
				}
				PoiType poiType = new PoiType(ImmutableSet.copyOf(block.getStateDefinition().getPossibleStates()), 1, 1);
				registerHelper.register(name, poiType);
				entry.getValue().poiType = ForgeRegistries.POI_TYPES.getHolder(poiType).get();
			}
		});
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
