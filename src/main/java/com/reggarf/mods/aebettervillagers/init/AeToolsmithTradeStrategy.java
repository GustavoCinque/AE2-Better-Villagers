package com.reggarf.mods.aebettervillagers.init;

import appeng.core.definitions.AEItems;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

import java.util.List;
import java.util.Map;

public class AeToolsmithTradeStrategy implements TradeStrategy {

    @Override
    public Map<Integer, List<TradeEntry>> getTrades() {
        return Map.of(
                1, List.of(
                        new TradeEntry(new ItemStack(Items.EMERALD, 3), new ItemStack(Items.STICK), new ItemStack(AEItems.NETHER_QUARTZ_AXE), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 3), new ItemStack(Items.STICK), new ItemStack(AEItems.NETHER_QUARTZ_SHOVEL), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 3), new ItemStack(Items.STICK), new ItemStack(AEItems.NETHER_QUARTZ_KNIFE), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 3), new ItemStack(Items.STICK), new ItemStack(AEItems.CERTUS_QUARTZ_KNIFE), 10, 5, 0.05f)

                ),
                2, List.of(
                        new TradeEntry(new ItemStack(Items.EMERALD, 4), new ItemStack(Items.STICK), new ItemStack(AEItems.NETHER_QUARTZ_PICK), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 5), new ItemStack(Items.STICK), new ItemStack(AEItems.CERTUS_QUARTZ_PICK), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 5), new ItemStack(Items.STICK), new ItemStack(AEItems.CERTUS_QUARTZ_KNIFE), 10, 5, 0.05f)

                ),
                3, List.of(
                        new TradeEntry(new ItemStack(Items.EMERALD, 1), new ItemStack(Items.STICK), new ItemStack(AEItems.NETHER_QUARTZ_HOE), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 1), new ItemStack(Items.STICK), new ItemStack(AEItems.CERTUS_QUARTZ_HOE), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 2), new ItemStack(Items.STICK), new ItemStack(AEItems.CERTUS_QUARTZ_SHOVEL), 10, 5, 0.05f)
                ),
                4, List.of(
                        new TradeEntry(new ItemStack(Items.EMERALD, 3), new ItemStack(Items.STICK), new ItemStack(AEItems.NETHER_QUARTZ_SWORD), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 3), new ItemStack(Items.STICK), new ItemStack(AEItems.CERTUS_QUARTZ_SWORD), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 3), new ItemStack(Items.STICK), new ItemStack(AEItems.CERTUS_QUARTZ_AXE), 10, 5, 0.05f)
                ),
                5, List.of(
                        new TradeEntry(new ItemStack(Items.EMERALD, 10), new ItemStack(Blocks.GRAVEL), new ItemStack(Items.QUARTZ, 5), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 10), new ItemStack(Items.QUARTZ), new ItemStack(AEItems.NETHER_QUARTZ_WRENCH), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 5), new ItemStack(Items.QUARTZ), new ItemStack(AEItems.CERTUS_QUARTZ_WRENCH), 10, 5, 0.05f)
                ));
    }
}
