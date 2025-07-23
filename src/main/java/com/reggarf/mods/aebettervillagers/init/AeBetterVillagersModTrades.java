
package com.reggarf.mods.aebettervillagers.init;

import appeng.core.definitions.AEItems;
import appeng.core.definitions.AEParts;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;
import appeng.core.definitions.AEBlocks;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.Map;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class AeBetterVillagersModTrades {

	private static final Map<RegistryObject<VillagerProfession>, TradeStrategy> STRATEGIES = Map.of(
			AeBetterVillagersModVillagerProfessions.AE_TOOLSMITH, new AeToolsmithTradeStrategy(),
			AeBetterVillagersModVillagerProfessions.AE_ENGINEER, new AeEngineerTradeStrategy(),
			AeBetterVillagersModVillagerProfessions.AE_SPECIALIST, new AeSpecialistTradeStrategy()
	);

	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		STRATEGIES.forEach((profession, strategy) -> {
			if (event.getType() == profession.get()) {
				Map<Integer, List<TradeEntry>> trades = strategy.getTrades();
				trades.forEach((level, entries) -> {
					List<VillagerTrades.ItemListing> listings = event.getTrades().get(level);
					entries.stream().map(TradeEntry::toListing).forEach(listings::add);
				});
			}
		});
	}
}
