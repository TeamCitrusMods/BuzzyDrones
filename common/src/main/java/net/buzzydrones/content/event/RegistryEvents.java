package net.buzzydrones.content.event;

import dev.architectury.registry.level.entity.EntityAttributeRegistry;
import net.buzzydrones.content.entity.DroneEntity;
import net.buzzydrones.registry.BuzzyDronesEntities;

public class RegistryEvents {
    public static void registerAttributesEvent() {
        EntityAttributeRegistry.register(BuzzyDronesEntities.DRONE, DroneEntity::setAttributes);
    }
}
