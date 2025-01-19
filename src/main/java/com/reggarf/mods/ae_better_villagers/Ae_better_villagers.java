package com.reggarf.mods.ae_better_villagers;

import com.reggarf.mods.ae_better_villagers.util.ModCustomTrades;
import com.reggarf.mods.ae_better_villagers.villager.ModVillagers;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Ae_better_villagers implements ModInitializer {
    public static final String MOD_ID = "ae_better_villagers";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModCustomTrades.registerCustomTrades();

        ModVillagers.registerVillagers();
    }
}
