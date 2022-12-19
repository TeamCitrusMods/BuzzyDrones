package net.buzzydrones.fabric;

import net.buzzydrones.fabriclike.BuzzyDronesFabricLikeClient;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class BuzzyDronesFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BuzzyDronesFabricLikeClient.init();
    }
}
