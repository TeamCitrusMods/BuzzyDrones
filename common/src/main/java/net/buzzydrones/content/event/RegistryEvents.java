package net.buzzydrones.content.event;

import dev.architectury.registry.client.level.entity.EntityModelLayerRegistry;
import dev.architectury.registry.client.level.entity.EntityRendererRegistry;
import dev.architectury.registry.level.entity.EntityAttributeRegistry;
import net.buzzydrones.BuzzyDrones;
import net.buzzydrones.content.entity.DroneEntity;
import net.buzzydrones.content.renderer.DroneModel;
import net.buzzydrones.content.renderer.DroneRenderer;
import net.buzzydrones.registry.BuzzyDronesEntities;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class RegistryEvents {
    public static void registerAttributesEvent() {
        EntityAttributeRegistry.register(BuzzyDronesEntities.DRONE, DroneEntity::setAttributes);
    }

    public static void registerEntityLayers() {
        EntityModelLayerRegistry.register(new ModelLayerLocation(new ResourceLocation(BuzzyDrones.ID, "drone"), "main"), DroneModel::createBodyLayer);
    }

    public static void registerEntityRenders() {
        EntityRendererRegistry.register(BuzzyDronesEntities.DRONE, DroneRenderer::new);
    }
}
