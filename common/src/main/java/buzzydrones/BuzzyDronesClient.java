package buzzydrones;

import buzzydrones.content.event.ClientRegistryEvents;

public class BuzzyDronesClient {
    public static void init() {
        ClientRegistryEvents.registerGuis();
        ClientRegistryEvents.registerEntityRenders();
        ClientRegistryEvents.registerEntityLayers();
    }
}
