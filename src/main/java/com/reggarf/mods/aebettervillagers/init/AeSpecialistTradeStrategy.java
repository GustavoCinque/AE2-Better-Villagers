package com.reggarf.mods.aebettervillagers.init;

import appeng.core.definitions.AEBlocks;
import appeng.core.definitions.AEItems;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import java.util.List;
import java.util.Map;

public class AeSpecialistTradeStrategy implements TradeStrategy {

    @Override
    public Map<Integer, List<TradeEntry>> getTrades() {
        return Map.of(
                1, List.of(
                        new TradeEntry(new ItemStack(Items.EMERALD, 20), new ItemStack(AEItems.CERTUS_QUARTZ_CRYSTAL), new ItemStack(AEItems.CAPACITY_CARD, 2), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 5), new ItemStack(AEItems.BASIC_CARD), new ItemStack(AEItems.INVERTER_CARD, 2), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 24), new ItemStack(AEItems.ADVANCED_CARD), new ItemStack(AEItems.EQUAL_DISTRIBUTION_CARD, 2), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 26), new ItemStack(AEItems.CALCULATION_PROCESSOR), new ItemStack(AEItems.FUZZY_CARD, 2), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 20), new ItemStack(Items.REDSTONE), new ItemStack(AEItems.ITEM_CELL_HOUSING, 2), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 20), new ItemStack(Items.REDSTONE), new ItemStack(AEItems.FLUID_CELL_HOUSING, 2), 10, 5, 0.05f)
                ),
                2, List.of(
                        new TradeEntry(new ItemStack(Items.EMERALD, 40), new ItemStack(Items.IRON_INGOT,2), new ItemStack(AEItems.VIEW_CELL,2), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 39), new ItemStack(AEItems.CELL_COMPONENT_1K), new ItemStack(AEItems.ITEM_CELL_1K,2), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 44), new ItemStack(AEItems.CELL_COMPONENT_4K), new ItemStack(AEItems.ITEM_CELL_4K,2), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 50), new ItemStack(AEItems.CELL_COMPONENT_16K), new ItemStack(AEItems.ITEM_CELL_16K,2), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 56), new ItemStack(AEItems.CELL_COMPONENT_64K), new ItemStack(AEItems.ITEM_CELL_64K,2), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 56), new ItemStack(AEItems.CELL_COMPONENT_256K), new ItemStack(AEItems.ITEM_CELL_256K,2), 10, 5, 0.05f)
                ),
                3, List.of(
                        new TradeEntry(new ItemStack(Items.EMERALD, 39), new ItemStack(AEItems.LOGIC_PROCESSOR), new ItemStack(AEItems.CELL_COMPONENT_1K,2), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 44), new ItemStack(AEItems.CALCULATION_PROCESSOR,3), new ItemStack(AEItems.CELL_COMPONENT_4K,2), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 50), new ItemStack(AEItems.CALCULATION_PROCESSOR,9), new ItemStack(AEItems.CELL_COMPONENT_16K,2), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 56), new ItemStack(AEItems.CALCULATION_PROCESSOR,16), new ItemStack(AEItems.CELL_COMPONENT_64K,2), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 56), new ItemStack(AEItems.CALCULATION_PROCESSOR,32), new ItemStack(AEItems.CELL_COMPONENT_256K,2), 10, 5, 0.05f)
                ),
                4, List.of(
                        new TradeEntry(new ItemStack(Items.EMERALD, 39), new ItemStack(AEItems.CELL_COMPONENT_1K), new ItemStack(AEItems.ITEM_CELL_1K,2), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 44), new ItemStack(AEItems.CELL_COMPONENT_4K), new ItemStack(AEItems.ITEM_CELL_4K,2), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 50), new ItemStack(AEItems.CELL_COMPONENT_16K), new ItemStack(AEItems.ITEM_CELL_16K,2), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 56), new ItemStack(AEItems.CELL_COMPONENT_64K), new ItemStack(AEItems.ITEM_CELL_64K,2), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 56), new ItemStack(AEItems.CELL_COMPONENT_256K), new ItemStack(AEItems.ITEM_CELL_256K,2), 10, 5, 0.05f)
                ),
                5, List.of(
                        new TradeEntry(new ItemStack(Items.EMERALD, 64), new ItemStack(AEBlocks.CRAFTING_UNIT), new ItemStack(AEBlocks.CRAFTING_STORAGE_1K,2), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 40), new ItemStack(AEItems.CELL_COMPONENT_1K,5), new ItemStack(AEBlocks.CRAFTING_STORAGE_4K,2), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 44), new ItemStack(AEItems.CELL_COMPONENT_4K,5), new ItemStack(AEBlocks.CRAFTING_STORAGE_16K,2), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 64), new ItemStack(AEItems.CELL_COMPONENT_16K,5), new ItemStack(AEBlocks.CRAFTING_STORAGE_64K,2), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 43), new ItemStack(AEItems.CELL_COMPONENT_64K,5), new ItemStack(AEBlocks.CRAFTING_STORAGE_256K,2), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 64), new ItemStack(AEBlocks.CRAFTING_UNIT), new ItemStack(AEBlocks.CRAFTING_STORAGE_1K,2), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 40), new ItemStack(AEItems.LOGIC_PROCESSOR), new ItemStack(AEItems.FLUID_CELL_1K,2), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 44), new ItemStack(AEItems.CELL_COMPONENT_1K,4), new ItemStack(AEItems.FLUID_CELL_4K,2), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 64), new ItemStack(AEItems.CELL_COMPONENT_4K,4), new ItemStack(AEItems.FLUID_CELL_16K,2), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 43), new ItemStack(AEItems.CELL_COMPONENT_16K,4), new ItemStack(AEItems.FLUID_CELL_64K,2), 10, 5, 0.05f),
                        new TradeEntry(new ItemStack(Items.EMERALD, 43), new ItemStack(AEItems.CELL_COMPONENT_64K,4), new ItemStack(AEItems.FLUID_CELL_256K,2), 10, 5, 0.05f)
                ));
    }
}
