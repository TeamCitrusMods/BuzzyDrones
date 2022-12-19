package net.buzzydrones.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.buzzydrones.BuzzyDrones;
import net.buzzydrones.content.block.IdleStationBlock;
import net.buzzydrones.content.block.SourceStationBlock;
import net.buzzydrones.content.block.TargetStationBlock;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.Block;

public class BuzzyDronesBlocks {
    public static final DeferredRegister<Block> REGISTER = DeferredRegister.create(BuzzyDrones.ID, Registry.BLOCK_REGISTRY);

    public static final RegistrySupplier<SourceStationBlock> SOURCE_STATION = REGISTER.register("source_station", SourceStationBlock::new);
    public static final RegistrySupplier<TargetStationBlock> TARGET_STATION = REGISTER.register("target_station", TargetStationBlock::new);
    public static final RegistrySupplier<IdleStationBlock> IDLE_STATION = REGISTER.register("idle_station", IdleStationBlock::new);
}
