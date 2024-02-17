package net.biggerbetterbolderbosses.entity.golem.client;

import net.biggerbetterbolderbosses.BiggerBetterBolderBosses;
import net.biggerbetterbolderbosses.entity.golem.custom.GolemEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;

public class GolemModel extends GeoModel<GolemEntity> {
    @Override
    public ResourceLocation getModelResource(GolemEntity animatable) {
        return new ResourceLocation(BiggerBetterBolderBosses.MODID, "geo/golem.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GolemEntity animatable) {
        return new ResourceLocation(BiggerBetterBolderBosses.MODID, "textures/entity/golem.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GolemEntity animatable) {
        return new ResourceLocation(BiggerBetterBolderBosses.MODID, "animations/geometry.golem.animation.json");
    }

    @Override
    public void setCustomAnimations(GolemEntity animatable, long instanceId, AnimationState<GolemEntity> animationState) {
        super.setCustomAnimations(animatable, instanceId, animationState);
    }
}
