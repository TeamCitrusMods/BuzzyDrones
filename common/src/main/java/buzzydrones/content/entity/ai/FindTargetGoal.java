package buzzydrones.content.entity.ai;

import buzzydrones.content.blockentity.TargetStationBlockEntity;
import buzzydrones.content.entity.DroneEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.navigation.PathNavigation;

import java.util.Comparator;
import java.util.List;

public class FindTargetGoal extends Goal {
    private final DroneEntity droneEntity;

    public FindTargetGoal(DroneEntity droneEntity) {
        this.droneEntity = droneEntity;
    }

    @Override
    public boolean canUse() {
        return this.droneEntity.getNavigation().isDone() && this.droneEntity.isCarryingItems();
    }

    @Override
    public boolean canContinueToUse() {
        return false;
    }

    @Override
    public void start() {
        List<TargetStationBlockEntity> list = this.getNearbyTargets();
        if(!list.isEmpty()) {
            for(TargetStationBlockEntity blockEntity : list) {
                if(this.targetIsValid(blockEntity)) {
                    this.goTo(blockEntity.getBlockPos());
                    return;
                }
            }
            this.droneEntity.setStatus(DroneEntity.Status.WARNING);
        } else {
            this.droneEntity.setStatus(DroneEntity.Status.ERROR);
        }
    }

    private List<TargetStationBlockEntity> getNearbyTargets() {
        BlockPos dronePos = this.droneEntity.blockPosition();
        return BlockPos.betweenClosedStream(dronePos.offset(-15, -15, -15), dronePos.offset(15, 15, 15))
                .map(this.droneEntity.level::getBlockEntity)
                .filter(TargetStationBlockEntity.class::isInstance)
                .map(TargetStationBlockEntity.class::cast)
                .sorted(Comparator.comparingDouble(blockEntity -> blockEntity.getDistance(this.droneEntity.blockPosition())))
                .toList();
    }

    private boolean targetIsValid(TargetStationBlockEntity blockEntity) {
        return blockEntity.isFree() && !blockEntity.hasFilter() && blockEntity.hasRoomFor(this.droneEntity.getItemCarried());
    }

    private void goTo(BlockPos pos) {
        PathNavigation navigation = this.droneEntity.getNavigation();
        navigation.moveTo(navigation.createPath(pos, 1), 1.0);
        this.droneEntity.setStatus(DroneEntity.Status.WORKING);
    }
}
