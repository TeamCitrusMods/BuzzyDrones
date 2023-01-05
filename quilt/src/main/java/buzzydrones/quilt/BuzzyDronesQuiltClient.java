package buzzydrones.quilt;

import buzzydrones.fabriclike.BuzzyDronesFabricLikeClient;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;

@Environment(EnvType.CLIENT)
public class BuzzyDronesQuiltClient implements ClientModInitializer {
    @Override
    public void onInitializeClient(ModContainer mod) {
        BuzzyDronesFabricLikeClient.init();
    }
}
