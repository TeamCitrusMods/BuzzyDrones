package net.buzzydrones.registry;

import dev.architectury.registry.menu.MenuRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.buzzydrones.BuzzyDrones;
import net.buzzydrones.content.container.SourceStationContainer;
import net.buzzydrones.content.container.TargetStationContainer;
import net.buzzydrones.content.gui.screen.SourceGuiScreen;
import net.buzzydrones.content.gui.screen.TargetGuiScreen;
import net.minecraft.core.Registry;
import net.minecraft.world.inventory.MenuType;

public class BuzzyDronesContainers {
    public static final DeferredRegister<MenuType<?>> REGISTER = DeferredRegister.create(BuzzyDrones.ID, Registry.MENU_REGISTRY);

    public static void registerGuis() {
        MenuRegistry.registerScreenFactory(SOURCE_STATION.get(), SourceGuiScreen::new);
        MenuRegistry.registerScreenFactory(TARGET_STATION.get(), TargetGuiScreen::new);
    }

    public static final RegistrySupplier<MenuType<SourceStationContainer>> SOURCE_STATION = REGISTER.register("source_station", () -> new MenuType<>(SourceStationContainer::new));
    public static final RegistrySupplier<MenuType<TargetStationContainer>> TARGET_STATION = REGISTER.register("target_station", () -> new MenuType<>(TargetStationContainer::new));
}
