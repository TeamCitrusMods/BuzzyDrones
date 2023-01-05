package buzzydrones.forge;

import dev.architectury.platform.forge.EventBuses;
import buzzydrones.BuzzyDrones;
import buzzydrones.BuzzyDronesClient;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BuzzyDrones.ID)
public class BuzzyDronesForge {
    public BuzzyDronesForge() {
        EventBuses.registerModEventBus(BuzzyDrones.ID, FMLJavaModLoadingContext.get().getModEventBus());
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.addListener(this::clientSetup);

        BuzzyDrones.init();
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        BuzzyDronesClient.init();
    }
}
