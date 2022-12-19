package net.buzzydrones;

import net.buzzydrones.content.event.ClientRegistryEvents;

public class BuzzyDronesClient {
    public static void init() {
        ClientRegistryEvents.registerGuis();
        ClientRegistryEvents.registerEntityRenders();
        ClientRegistryEvents.registerEntityLayers();
    }
}
