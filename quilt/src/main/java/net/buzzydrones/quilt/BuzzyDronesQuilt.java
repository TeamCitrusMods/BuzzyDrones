package net.buzzydrones.quilt;

import net.buzzydrones.fabriclike.BuzzyDronesFabricLike;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class BuzzyDronesQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        BuzzyDronesFabricLike.init();
    }
}
