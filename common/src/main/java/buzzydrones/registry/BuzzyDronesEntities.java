package buzzydrones.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import buzzydrones.BuzzyDrones;
import buzzydrones.content.entity.DroneEntity;
import net.minecraft.core.Registry;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class BuzzyDronesEntities {
    public static final DeferredRegister<EntityType<?>> REGISTER = DeferredRegister.create(BuzzyDrones.ID, Registry.ENTITY_TYPE_REGISTRY);

    public static final RegistrySupplier<EntityType<DroneEntity>> DRONE = REGISTER.register("drone", () -> EntityType.Builder.<DroneEntity>of(DroneEntity::new, MobCategory.MISC).sized(0.7f, 0.6f).clientTrackingRange(8).build("drone"));
}
