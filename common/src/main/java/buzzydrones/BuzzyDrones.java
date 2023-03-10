package buzzydrones;

import buzzydrones.content.event.RegistryEvents;
import buzzydrones.registry.*;

public class BuzzyDrones {
    public static final String ID = "buzzydrones";
    
    public static void init() {
        BuzzyDronesBlocks.REGISTER.register();
        BuzzyDronesItems.REGISTER.register();
        BuzzyDronesBlockEntities.REGISTER.register();
        BuzzyDronesContainers.REGISTER.register();
        BuzzyDronesEntities.REGISTER.register();
        RegistryEvents.registerAttributesEvent();
    }
}
