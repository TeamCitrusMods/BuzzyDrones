package net.buzzydrones.fabric;

import net.buzzydrones.fabriclike.BuzzyDronesFabricLike;
import net.fabricmc.api.ModInitializer;

public class BuzzyDronesFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        BuzzyDronesFabricLike.init();
    }
}
