package net.buzzydrones.content.gui.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.buzzydrones.BuzzyDrones;
import net.buzzydrones.content.container.TargetStationContainer;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class TargetGuiScreen extends AbstractContainerScreen<TargetStationContainer> {
    private static final ResourceLocation GUI_TEXTURE = new ResourceLocation(BuzzyDrones.ID, "textures/gui/target.png");

    public TargetGuiScreen(TargetStationContainer container, Inventory playerInventory, Component title) {
        super(container, playerInventory, title);
        this.passEvents = false;
        this.imageHeight = 133;
        this.inventoryLabelY = this.imageHeight - 94;
    }

    @Override
    public void render(PoseStack poseStack, int mouseX, int mouseY, float partialTicks) {
        this.renderBackground(poseStack);
        super.render(poseStack, mouseX, mouseY, partialTicks);
        this.renderTooltip(poseStack, mouseX, mouseY);
        if(this.hoveredSlot != null && this.hoveredSlot.index == 5 && this.hoveredSlot.getItem().isEmpty() && this.isHovering(0, 0, 176, 45, mouseX, mouseY))
            this.renderTooltip(poseStack, Component.translatable("inventory.buzzydrones.filter"), mouseX, mouseY);
    }

    @Override
    protected void renderBg(PoseStack poseStack, float partialTicks, int x, int y) {
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, GUI_TEXTURE);
        int i = (this.width - this.imageWidth) / 2;
        int j = (this.height - this.imageHeight) / 2;
        this.blit(poseStack, i, j, 0, 0, this.imageWidth, this.imageHeight);
    }
}
