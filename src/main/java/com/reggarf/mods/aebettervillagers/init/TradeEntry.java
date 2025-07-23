package com.reggarf.mods.aebettervillagers.init;

import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.BasicItemListing;

public class TradeEntry {
    public final ItemStack input1;
    public final ItemStack input2;
    public final ItemStack result;
    public final int maxUses;
    public final int xp;
    public final float priceMultiplier;

    public TradeEntry(ItemStack input1, ItemStack input2, ItemStack result, int maxUses, int xp, float priceMultiplier) {
        this.input1 = input1;
        this.input2 = input2;
        this.result = result;
        this.maxUses = maxUses;
        this.xp = xp;
        this.priceMultiplier = priceMultiplier;
    }

    public BasicItemListing toListing() {
        return new BasicItemListing(input1, input2, result, maxUses, xp, priceMultiplier);
    }
}
