package buzzydrones.content.event;

import buzzydrones.registry.BuzzyDronesEntities;
import dev.architectury.registry.level.entity.EntityAttributeRegistry;
import buzzydrones.content.entity.DroneEntity;

public class RegistryEvents {
    public static void registerAttributesEvent() {
        EntityAttributeRegistry.register(BuzzyDronesEntities.DRONE, DroneEntity::setAttributes);
    }
}
