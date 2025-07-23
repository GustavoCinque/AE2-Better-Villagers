package com.reggarf.mods.aebettervillagers.init;

import java.util.List;
import java.util.Map;

public interface TradeStrategy {
    Map<Integer, List<TradeEntry>> getTrades();

}
