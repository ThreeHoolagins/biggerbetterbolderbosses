package net.biggerbetterbolderbosses.entity.golem.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.biggerbetterbolderbosses.BiggerBetterBolderBosses;
import net.biggerbetterbolderbosses.entity.golem.custom.GolemEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class GolemRenderer extends GeoEntityRenderer<GolemEntity> {
    public GolemRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new GolemModel());
    }

    @Override
    public ResourceLocation getTextureLocation(GolemEntity animatable) {
        return new ResourceLocation(BiggerBetterBolderBosses.MODID, "textures/entity/golem.png");
    }

    @Override
    public void render(GolemEntity entity, float entityYaw, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight) {
        if (entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
