package buzzydrones.registry;

import buzzydrones.BuzzyDrones;
import buzzydrones.content.block.IdleStationBlock;
import buzzydrones.content.block.SourceStationBlock;
import buzzydrones.content.block.TargetStationBlock;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.Block;

public class BuzzyDronesBlocks {
    public static final DeferredRegister<Block> REGISTER = DeferredRegister.create(BuzzyDrones.ID, Registry.BLOCK_REGISTRY);

    public static final RegistrySupplier<SourceStationBlock> SOURCE_STATION = REGISTER.register("source_station", SourceStationBlock::new);
    public static final RegistrySupplier<TargetStationBlock> TARGET_STATION = REGISTER.register("target_station", TargetStationBlock::new);
    public static final RegistrySupplier<IdleStationBlock> IDLE_STATION = REGISTER.register("idle_station", IdleStationBlock::new);
}
