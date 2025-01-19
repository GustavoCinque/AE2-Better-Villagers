package com.reggarf.mods.ae_better_villagers.villager;

import appeng.core.definitions.AEBlocks;
import com.google.common.collect.ImmutableSet;
import com.reggarf.mods.ae_better_villagers.Ae_better_villagers;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class ModVillagers {
    //================================================================
    //                      AE TOOLSMITH
    //================================================================

    public static final RegistryKey<PointOfInterestType> AE_TOOLSMITH_POI_KEY = poiKey("ae_toolsmith_poi");
    public static final PointOfInterestType AE_TOOLSMITH_POI = registerPoi("ae_toolsmith_poi", AEBlocks.CELL_WORKBENCH.block());
    public static final VillagerProfession AE_TOOLSMITH = registerProfession("ae_toolsmith", AE_TOOLSMITH_POI_KEY);

    //================================================================
    //                      AE_ENGINEER
    //================================================================

    public static final RegistryKey<PointOfInterestType> AE_ENGINEER_POI_KEY = poiKey("ae_engineer_poi");
    public static final PointOfInterestType AE_ENGINEER_POI = registerPoi("ae_engineer_poi", AEBlocks.CONTROLLER.block());
    public static final VillagerProfession AE_ENGINEER = registerProfession("ae_engineer", AE_ENGINEER_POI_KEY);

    //================================================================
    //                      AE_SPECIALIST
    //================================================================

    public static final RegistryKey<PointOfInterestType> AE_SPECIALIST_POI_KEY = poiKey("ae_specialist_poi");
    public static final PointOfInterestType AE_SPECIALIST_POI = registerPoi("ae_specialist_poi", AEBlocks.CRAFTING_STORAGE_16K.block());
    public static final VillagerProfession AE_SPECIALIST = registerProfession("ae_specialist", AE_SPECIALIST_POI_KEY);


    private static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(Ae_better_villagers.MOD_ID, name),
                new VillagerProfession(name, entry -> entry.matchesKey(type), entry -> entry.matchesKey(type),
                        ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_SHEPHERD));
    }

    private static PointOfInterestType registerPoi(String name, Block block) {
        return PointOfInterestHelper.register(new Identifier(Ae_better_villagers.MOD_ID, name), 1, 1, block);
    }

    private static RegistryKey<PointOfInterestType> poiKey(String name) {
        return RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, new Identifier(Ae_better_villagers.MOD_ID, name));
    }

    public static void registerVillagers() {
        Ae_better_villagers.LOGGER.info("Registering Villagers " + Ae_better_villagers.MOD_ID);
    }
}
