package buzzydrones.registry;

import buzzydrones.content.item.DroneItem;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import buzzydrones.BuzzyDrones;
import buzzydrones.content.entity.DroneEntity;
import net.minecraft.core.Registry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class BuzzyDronesItems {
    public static final DeferredRegister<Item> REGISTER = DeferredRegister.create(BuzzyDrones.ID, Registry.ITEM_REGISTRY);

    public static final RegistrySupplier<DroneItem> DRONE = REGISTER.register("drone_basic", () -> new DroneItem(DroneEntity.BASIC));
    public static final RegistrySupplier<DroneItem> DRONE_PICK_UP = REGISTER.register("drone_pick_up", () -> new DroneItem(DroneEntity.PICK_UP));

    public static final RegistrySupplier<BlockItem> SOURCE_STATION = REGISTER.register("source_station", () -> new BlockItem(BuzzyDronesBlocks.SOURCE_STATION.get(), new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistrySupplier<BlockItem> TARGET_STATION = REGISTER.register("target_station", () -> new BlockItem(BuzzyDronesBlocks.TARGET_STATION.get(), new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistrySupplier<BlockItem> IDLE_STATION = REGISTER.register("idle_station", () -> new BlockItem(BuzzyDronesBlocks.IDLE_STATION.get(), new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
