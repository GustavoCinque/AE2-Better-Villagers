package com.reggarf.mods.aebettervillagers.init;

import appeng.core.definitions.AEBlocks;
import appeng.core.definitions.AEItems;
import appeng.core.definitions.AEParts;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

import java.util.List;
import java.util.Map;

public class AeEngineerTradeStrategy implements TradeStrategy {

    @Override
    public Map<Integer, List<TradeEntry>> getTrades() {
        return Map.of(
                1, List.of(
                        new TradeEntry(new ItemStack(Items.EMERALD, 15), new ItemStack(Blocks.QUARTZ_BLOCK), new ItemStack(AEBlocks.QUARTZ_PILLAR), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 15), new ItemStack(Items.QUARTZ, 2), new ItemStack(AEItems.CERTUS_QUARTZ_CRYSTAL), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 3), new ItemStack(Blocks.GLASS, 2), new ItemStack(AEBlocks.QUARTZ_VIBRANT_GLASS,3), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 2), new ItemStack(Items.STICK), new ItemStack(AEBlocks.CRANK), 10, 5, 0.05f)
                ),
                2, List.of(
                        new TradeEntry(new ItemStack(Items.EMERALD, 30), new ItemStack(Blocks.GLASS,2), new ItemStack(AEParts.QUARTZ_FIBER,3), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 10), new ItemStack(Items.IRON_INGOT,2), new ItemStack(AEParts.CABLE_ANCHOR,8), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 40), new ItemStack(AEItems.CERTUS_QUARTZ_CRYSTAL_CHARGED,2), new ItemStack(AEBlocks.QUARTZ_FIXTURE,5), 10, 5, 0.05f)
                ),
                3, List.of(
                        new TradeEntry(new ItemStack(Items.EMERALD, 45), new ItemStack(AEItems.CERTUS_QUARTZ_CRYSTAL_CHARGED,2), new ItemStack(AEItems.FLUIX_DUST,3), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 30), new ItemStack(AEItems.CERTUS_QUARTZ_CRYSTAL_CHARGED,2), new ItemStack(AEItems.CERTUS_QUARTZ_DUST,4), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 50), new ItemStack(AEBlocks.SKY_STONE_BLOCK,1), new ItemStack(AEItems.SKY_DUST,2), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 30), new ItemStack(Items.ENDER_EYE), new ItemStack(AEItems.ENDER_DUST,3), 10, 5, 0.05f)
                ),
                4, List.of(
                        new TradeEntry(new ItemStack(Items.EMERALD, 3), new ItemStack(AEItems.ENGINEERING_PROCESSOR), new ItemStack(AEParts.ME_P2P_TUNNEL,2), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 3), new ItemStack(AEItems.CERTUS_QUARTZ_CRYSTAL_CHARGED), new ItemStack(AEItems.CHARGED_STAFF,2), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 10), new ItemStack(AEItems.CERTUS_QUARTZ_DUST), new ItemStack(AEItems.SILICON,2), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 20), new ItemStack(AEItems.CERTUS_QUARTZ_CRYSTAL), new ItemStack(AEItems.WIRELESS_BOOSTER,2), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 10), new ItemStack(AEItems.FLUIX_PEARL), new ItemStack(AEItems.WIRELESS_RECEIVER,2), 10, 5, 0.05f)
                ),
                5, List.of(
                        new TradeEntry(new ItemStack(Items.EMERALD, 20), new ItemStack(AEItems.CALCULATION_PROCESSOR), new ItemStack(AEItems.BASIC_CARD, 3), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 21), new ItemStack(AEItems.CALCULATION_PROCESSOR), new ItemStack(AEItems.ADVANCED_CARD, 2), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 24), new ItemStack(AEItems.CALCULATION_PROCESSOR), new ItemStack(AEItems.SPEED_CARD, 2), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 26), new ItemStack(AEItems.CALCULATION_PROCESSOR), new ItemStack(AEItems.FUZZY_CARD, 2), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 29), new ItemStack(AEItems.CALCULATION_PROCESSOR), new ItemStack(AEItems.MEMORY_CARD, 3), 10, 5, 0.05f)
                ));
    }
}
