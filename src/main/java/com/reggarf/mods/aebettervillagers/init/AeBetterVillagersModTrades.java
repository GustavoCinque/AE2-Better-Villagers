
package com.reggarf.mods.aebettervillagers.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;
import appeng.core.definitions.AEBlocks;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class AeBetterVillagersModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == AeBetterVillagersModVillagerProfessions.AE_TOOLSMITH.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.DEEPSLATE_BRICKS), new ItemStack(Blocks.BLACKSTONE), new ItemStack(Blocks.MUD_BRICK_STAIRS), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Blocks.COBBLED_DEEPSLATE_WALL), new ItemStack(Blocks.SPRUCE_PLANKS), new ItemStack(Blocks.POLISHED_BLACKSTONE_STAIRS), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Blocks.POLISHED_ANDESITE), new ItemStack(Blocks.OXIDIZED_COPPER), new ItemStack(Blocks.MUDDY_MANGROVE_ROOTS), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Blocks.SAND), new ItemStack(Blocks.POLISHED_DEEPSLATE_WALL), new ItemStack(Blocks.SLIME_BLOCK), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Blocks.COBBLED_DEEPSLATE), new ItemStack(Blocks.ANDESITE), new ItemStack(Blocks.DIAMOND_BLOCK), 10, 5, 0.05f));
		}
		if (event.getType() == AeBetterVillagersModVillagerProfessions.AE_ENGINEER.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.DEEPSLATE_BRICKS), new ItemStack(Blocks.SPRUCE_PLANKS), new ItemStack(Blocks.OXIDIZED_CUT_COPPER_SLAB), 10, 5, 0.05f));
		}
		if (event.getType() == AeBetterVillagersModVillagerProfessions.AE_SPECIALIST.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.MUD_BRICKS), new ItemStack(Blocks.NETHER_GOLD_ORE), new ItemStack(Blocks.BAMBOO_BLOCK), 10, 5, 0.05f));
		}
		if (event.getType() == AeBetterVillagersModVillagerProfessions.AE_CRYSTAL_HARVESTER.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.DEEPSLATE_BRICKS), new ItemStack(Blocks.WAXED_WEATHERED_CUT_COPPER), new ItemStack(Blocks.BAMBOO_BLOCK), 10, 5, 0.05f));
		}
	}
}
