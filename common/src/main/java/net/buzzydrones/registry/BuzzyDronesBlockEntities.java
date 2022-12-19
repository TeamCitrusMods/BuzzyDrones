package net.buzzydrones.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.buzzydrones.BuzzyDrones;
import net.buzzydrones.content.blockentity.IdleStationBlockEntity;
import net.buzzydrones.content.blockentity.SourceStationBlockEntity;
import net.buzzydrones.content.blockentity.TargetStationBlockEntity;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class BuzzyDronesBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> REGISTER = DeferredRegister.create(BuzzyDrones.ID, Registry.BLOCK_ENTITY_TYPE_REGISTRY);

    public static final RegistrySupplier<BlockEntityType<SourceStationBlockEntity>> SOURCE_STATION = REGISTER.register("source_station", () -> BlockEntityType.Builder.of(SourceStationBlockEntity::new, BuzzyDronesBlocks.SOURCE_STATION.get()).build(null));
    public static final RegistrySupplier<BlockEntityType<TargetStationBlockEntity>> TARGET_STATION = REGISTER.register("target_station", () -> BlockEntityType.Builder.of(TargetStationBlockEntity::new, BuzzyDronesBlocks.TARGET_STATION.get()).build(null));
    public static final RegistrySupplier<BlockEntityType<IdleStationBlockEntity>> IDLE_STATION = REGISTER.register("idle_station", () -> BlockEntityType.Builder.of(IdleStationBlockEntity::new, BuzzyDronesBlocks.IDLE_STATION.get()).build(null));
}
