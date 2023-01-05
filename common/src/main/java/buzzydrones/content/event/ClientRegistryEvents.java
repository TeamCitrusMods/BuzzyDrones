package buzzydrones.content.event;

import buzzydrones.BuzzyDrones;
import buzzydrones.content.renderer.DroneModel;
import buzzydrones.content.renderer.DroneRenderer;
import buzzydrones.registry.BuzzyDronesContainers;
import buzzydrones.registry.BuzzyDronesEntities;
import dev.architectury.registry.client.level.entity.EntityModelLayerRegistry;
import dev.architectury.registry.menu.MenuRegistry;
import buzzydrones.content.gui.screen.SourceGuiScreen;
import buzzydrones.content.gui.screen.TargetGuiScreen;
import buzzydrones.platform.ClientPlatformHelper;
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
