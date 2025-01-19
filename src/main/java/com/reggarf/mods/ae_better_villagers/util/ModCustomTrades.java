package com.reggarf.mods.ae_better_villagers.util;

import appeng.core.definitions.AEBlocks;
import appeng.core.definitions.AEItems;
import appeng.core.definitions.AEParts;
import com.reggarf.mods.ae_better_villagers.villager.ModVillagers;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;

import net.minecraft.block.Blocks;
import net.minecraft.enchantment.EnchantmentLevelEntry;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.EnchantedBookItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class ModCustomTrades {
    public static void registerCustomTrades() {



        //================================================================
        //                      AE TOOLSMITH
        //================================================================

        TradeOfferHelper.registerVillagerOffers(ModVillagers.AE_TOOLSMITH, 1,
                factories -> {
                    //LEVEL 1

                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 3), new ItemStack(Items.STICK), new ItemStack(AEItems.NETHER_QUARTZ_AXE), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 3), new ItemStack(Items.STICK), new ItemStack(AEItems.NETHER_QUARTZ_SHOVEL), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 3), new ItemStack(Items.STICK), new ItemStack(AEItems.NETHER_QUARTZ_KNIFE), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 3), new ItemStack(Items.STICK), new ItemStack(AEItems.CERTUS_QUARTZ_KNIFE), 10, 5, 0.05f));
        });


        TradeOfferHelper.registerVillagerOffers(ModVillagers.AE_TOOLSMITH, 2,
                factories -> {
                    //LEVEL 2

                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 4), new ItemStack(Items.STICK), new ItemStack(AEItems.NETHER_QUARTZ_PICK), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 5), new ItemStack(Items.STICK), new ItemStack(AEItems.CERTUS_QUARTZ_PICK), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 5), new ItemStack(Items.STICK), new ItemStack(AEItems.CERTUS_QUARTZ_KNIFE), 10, 5, 0.05f));

                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.AE_TOOLSMITH, 3,
                factories -> {
                    //LEVEL 3

                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 1), new ItemStack(Items.STICK), new ItemStack(AEItems.NETHER_QUARTZ_HOE), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 1), new ItemStack(Items.STICK), new ItemStack(AEItems.CERTUS_QUARTZ_HOE), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 2), new ItemStack(Items.STICK), new ItemStack(AEItems.CERTUS_QUARTZ_SHOVEL), 10, 5, 0.05f));

        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.AE_TOOLSMITH, 4,
                factories -> {
                    //LEVEL 4

                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 3), new ItemStack(Items.STICK), new ItemStack(AEItems.NETHER_QUARTZ_SWORD), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 3), new ItemStack(Items.STICK), new ItemStack(AEItems.CERTUS_QUARTZ_SWORD), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 3), new ItemStack(Items.STICK), new ItemStack(AEItems.CERTUS_QUARTZ_AXE), 10, 5, 0.05f));

                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.AE_TOOLSMITH, 5,
                factories -> {
                    //LEVEL 5

                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 10), new ItemStack(Blocks.GRAVEL), new ItemStack(Items.QUARTZ, 5), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 10), new ItemStack(Items.QUARTZ), new ItemStack(AEItems.NETHER_QUARTZ_WRENCH), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 5), new ItemStack(Items.QUARTZ), new ItemStack(AEItems.CERTUS_QUARTZ_WRENCH), 10, 5, 0.05f));

                });

        //================================================================
        //                      AE_ENGINEER
        //================================================================

        TradeOfferHelper.registerVillagerOffers(ModVillagers.AE_ENGINEER, 1,
                factories -> {
                    //LEVEL 1

                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 15), new ItemStack(Blocks.QUARTZ_BLOCK), new ItemStack(AEBlocks.QUARTZ_PILLAR), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 15), new ItemStack(Items.QUARTZ, 2), new ItemStack(AEItems.CERTUS_QUARTZ_CRYSTAL), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 3), new ItemStack(Blocks.GLASS, 2), new ItemStack(AEBlocks.QUARTZ_VIBRANT_GLASS,3), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 2), new ItemStack(Items.STICK), new ItemStack(AEBlocks.CRANK), 10, 5, 0.05f));
                });


        TradeOfferHelper.registerVillagerOffers(ModVillagers.AE_ENGINEER, 2,
                factories -> {
                    //LEVEL 2

                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 30), new ItemStack(Blocks.GLASS,2), new ItemStack(AEParts.QUARTZ_FIBER,3), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 10), new ItemStack(Items.IRON_INGOT,2), new ItemStack(AEParts.CABLE_ANCHOR,8), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 40), new ItemStack(AEItems.CERTUS_QUARTZ_CRYSTAL_CHARGED,2), new ItemStack(AEBlocks.QUARTZ_FIXTURE,5), 10, 5, 0.05f));

                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.AE_ENGINEER, 3,
                factories -> {
                    //LEVEL 3

                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 45), new ItemStack(AEItems.CERTUS_QUARTZ_CRYSTAL_CHARGED,2), new ItemStack(AEItems.FLUIX_DUST,3), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 30), new ItemStack(AEItems.CERTUS_QUARTZ_CRYSTAL_CHARGED,2), new ItemStack(AEItems.CERTUS_QUARTZ_DUST,4), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 50), new ItemStack(AEBlocks.SKY_STONE_BLOCK,1), new ItemStack(AEItems.SKY_DUST,2), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 30), new ItemStack(Items.ENDER_EYE), new ItemStack(AEItems.ENDER_DUST,3), 10, 5, 0.05f));

                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.AE_ENGINEER, 4,
                factories -> {
                    //LEVEL 4

                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 3), new ItemStack(AEItems.ENGINEERING_PROCESSOR), new ItemStack(AEParts.ME_P2P_TUNNEL,2), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 3), new ItemStack(AEItems.CERTUS_QUARTZ_CRYSTAL_CHARGED), new ItemStack(AEItems.CHARGED_STAFF,2), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 10), new ItemStack(AEItems.CERTUS_QUARTZ_DUST), new ItemStack(AEItems.SILICON,2), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 20), new ItemStack(AEItems.CERTUS_QUARTZ_CRYSTAL), new ItemStack(AEItems.WIRELESS_BOOSTER,2), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 10), new ItemStack(AEItems.FLUIX_PEARL), new ItemStack(AEItems.WIRELESS_RECEIVER,2), 10, 5, 0.05f));

                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.AE_ENGINEER, 5,
                factories -> {
                    //LEVEL 5

                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 20), new ItemStack(AEItems.CALCULATION_PROCESSOR), new ItemStack(AEItems.BASIC_CARD, 3), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 21), new ItemStack(AEItems.CALCULATION_PROCESSOR), new ItemStack(AEItems.ADVANCED_CARD, 2), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 24), new ItemStack(AEItems.CALCULATION_PROCESSOR), new ItemStack(AEItems.SPEED_CARD, 2), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 26), new ItemStack(AEItems.CALCULATION_PROCESSOR), new ItemStack(AEItems.FUZZY_CARD, 2), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 29), new ItemStack(AEItems.CALCULATION_PROCESSOR), new ItemStack(AEItems.MEMORY_CARD, 3), 10, 5, 0.05f));

                });

        //================================================================
        //                      AE_SPECIALIST
        //================================================================

        TradeOfferHelper.registerVillagerOffers(ModVillagers.AE_SPECIALIST, 1,
                factories -> {
                    //LEVEL 1

                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 20), new ItemStack(AEItems.CERTUS_QUARTZ_CRYSTAL), new ItemStack(AEItems.CAPACITY_CARD, 2), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 5), new ItemStack(AEItems.BASIC_CARD), new ItemStack(AEItems.INVERTER_CARD, 2), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 24), new ItemStack(AEItems.ADVANCED_CARD), new ItemStack(AEItems.EQUAL_DISTRIBUTION_CARD, 2), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 26), new ItemStack(AEItems.CALCULATION_PROCESSOR), new ItemStack(AEItems.FUZZY_CARD, 2), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 20), new ItemStack(Items.REDSTONE), new ItemStack(AEItems.ITEM_CELL_HOUSING, 2), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 20), new ItemStack(Items.REDSTONE), new ItemStack(AEItems.FLUID_CELL_HOUSING, 2), 10, 5, 0.05f));

                });


        TradeOfferHelper.registerVillagerOffers(ModVillagers.AE_SPECIALIST, 2,
                factories -> {
                    //LEVEL 2

                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 40), new ItemStack(Items.IRON_INGOT,2), new ItemStack(AEItems.VIEW_CELL,2), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 39), new ItemStack(AEItems.CELL_COMPONENT_1K), new ItemStack(AEItems.ITEM_CELL_1K,2), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 44), new ItemStack(AEItems.CELL_COMPONENT_4K), new ItemStack(AEItems.ITEM_CELL_4K,2), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 50), new ItemStack(AEItems.CELL_COMPONENT_16K), new ItemStack(AEItems.ITEM_CELL_16K,2), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 56), new ItemStack(AEItems.CELL_COMPONENT_64K), new ItemStack(AEItems.ITEM_CELL_64K,2), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 56), new ItemStack(AEItems.CELL_COMPONENT_256K), new ItemStack(AEItems.ITEM_CELL_256K,2), 10, 5, 0.05f));

                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.AE_SPECIALIST, 3,
                factories -> {
                    //LEVEL 3

                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 39), new ItemStack(AEItems.LOGIC_PROCESSOR), new ItemStack(AEItems.CELL_COMPONENT_1K,2), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 44), new ItemStack(AEItems.CALCULATION_PROCESSOR,3), new ItemStack(AEItems.CELL_COMPONENT_4K,2), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 50), new ItemStack(AEItems.CALCULATION_PROCESSOR,9), new ItemStack(AEItems.CELL_COMPONENT_16K,2), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 56), new ItemStack(AEItems.CALCULATION_PROCESSOR,16), new ItemStack(AEItems.CELL_COMPONENT_64K,2), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 56), new ItemStack(AEItems.CALCULATION_PROCESSOR,32), new ItemStack(AEItems.CELL_COMPONENT_256K,2), 10, 5, 0.05f));

                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.AE_SPECIALIST, 4,
                factories -> {
                    //LEVEL 4

                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 39), new ItemStack(AEItems.CELL_COMPONENT_1K), new ItemStack(AEItems.ITEM_CELL_1K,2), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 44), new ItemStack(AEItems.CELL_COMPONENT_4K), new ItemStack(AEItems.ITEM_CELL_4K,2), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 50), new ItemStack(AEItems.CELL_COMPONENT_16K), new ItemStack(AEItems.ITEM_CELL_16K,2), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 56), new ItemStack(AEItems.CELL_COMPONENT_64K), new ItemStack(AEItems.ITEM_CELL_64K,2), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 56), new ItemStack(AEItems.CELL_COMPONENT_256K), new ItemStack(AEItems.ITEM_CELL_256K,2), 10, 5, 0.05f));

                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.AE_SPECIALIST, 5,
                factories -> {
                    //LEVEL 5

                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 64), new ItemStack(AEBlocks.CRAFTING_UNIT), new ItemStack(AEBlocks.CRAFTING_STORAGE_1K,2), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 40), new ItemStack(AEItems.CELL_COMPONENT_1K,5), new ItemStack(AEBlocks.CRAFTING_STORAGE_4K,2), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 44), new ItemStack(AEItems.CELL_COMPONENT_4K,5), new ItemStack(AEBlocks.CRAFTING_STORAGE_16K,2), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 64), new ItemStack(AEItems.CELL_COMPONENT_16K,5), new ItemStack(AEBlocks.CRAFTING_STORAGE_64K,2), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 43), new ItemStack(AEItems.CELL_COMPONENT_64K,5), new ItemStack(AEBlocks.CRAFTING_STORAGE_256K,2), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 64), new ItemStack(AEBlocks.CRAFTING_UNIT), new ItemStack(AEBlocks.CRAFTING_STORAGE_1K,2), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 40), new ItemStack(AEItems.LOGIC_PROCESSOR), new ItemStack(AEItems.FLUID_CELL_1K,2), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 44), new ItemStack(AEItems.CELL_COMPONENT_1K,4), new ItemStack(AEItems.FLUID_CELL_4K,2), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 64), new ItemStack(AEItems.CELL_COMPONENT_4K,4), new ItemStack(AEItems.FLUID_CELL_16K,2), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 43), new ItemStack(AEItems.CELL_COMPONENT_16K,4), new ItemStack(AEItems.FLUID_CELL_64K,2), 10, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 43), new ItemStack(AEItems.CELL_COMPONENT_64K,4), new ItemStack(AEItems.FLUID_CELL_256K,2), 10, 5, 0.05f));

                });


    }
}
