package net.buzzydrones;

import net.buzzydrones.content.event.RegistryEvents;
import net.buzzydrones.registry.BuzzyDronesContainers;

public class BuzzyDronesClient {
    public static void init() {
        BuzzyDronesContainers.registerGuis();
        RegistryEvents.registerEntityRenders();
        RegistryEvents.registerEntityLayers();
    }
}
