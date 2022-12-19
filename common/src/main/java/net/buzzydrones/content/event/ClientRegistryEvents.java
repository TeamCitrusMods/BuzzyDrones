package net.buzzydrones.content.event;

import dev.architectury.registry.client.level.entity.EntityModelLayerRegistry;
import dev.architectury.registry.menu.MenuRegistry;
import net.buzzydrones.BuzzyDrones;
import net.buzzydrones.content.gui.screen.SourceGuiScreen;
import net.buzzydrones.content.gui.screen.TargetGuiScreen;
import net.buzzydrones.content.renderer.DroneModel;
import net.buzzydrones.content.renderer.DroneRenderer;
import net.buzzydrones.platform.ClientPlatformHelper;
import net.buzzydrones.registry.BuzzyDronesContainers;
import net.buzzydrones.registry.BuzzyDronesEntities;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class ClientRegistryEvents {
    public static void registerEntityLayers() {
        EntityModelLayerRegistry.register(new ModelLayerLocation(new ResourceLocation(BuzzyDrones.ID, "drone"), "main"), DroneModel::createBodyLayer);
    }

    public static void registerEntityRenders() {
        ClientPlatformHelper.registerEntityRenderers(BuzzyDronesEntities.DRONE, DroneRenderer::new);
    }

    public static void registerGuis() {
        MenuRegistry.registerScreenFactory(BuzzyDronesContainers.SOURCE_STATION.get(), SourceGuiScreen::new);
        MenuRegistry.registerScreenFactory(BuzzyDronesContainers.TARGET_STATION.get(), TargetGuiScreen::new);
    }
}
