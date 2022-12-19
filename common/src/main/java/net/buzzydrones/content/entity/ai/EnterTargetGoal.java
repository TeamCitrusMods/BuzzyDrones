package net.buzzydrones.content.entity.ai;

import net.buzzydrones.content.blockentity.TargetStationBlockEntity;
import net.buzzydrones.content.entity.DroneEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.level.block.entity.BlockEntity;

public class EnterTargetGoal extends Goal {
    private final DroneEntity droneEntity;

    public EnterTargetGoal(DroneEntity droneEntity) {
        this.droneEntity = droneEntity;
    }

    @Override
    public boolean canUse() {
        return this.droneEntity.getNavigation().isInProgress() && this.droneEntity.isCarryingItems();
    }

    @Override
    public boolean canContinueToUse() {
        return false;
    }

    @Override
    public void start() {
        BlockPos pos = this.droneEntity.getNavigation().getTargetPos();
        BlockEntity blockEntity = this.droneEntity.level.getBlockEntity(pos);
        if(blockEntity instanceof TargetStationBlockEntity targetStationBlockEntity) {
            if(this.targetIsWithinDistance(pos)) {
                this.droneEntity.getNavigation().stop();
                targetStationBlockEntity.droneEnter(this.droneEntity);
            }
        }
    }

    private boolean targetIsWithinDistance(BlockPos pos) {
        return pos.closerThan(this.droneEntity.blockPosition(), 1.5);
    }
}
