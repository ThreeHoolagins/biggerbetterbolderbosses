package net.biggerbetterbolderbosses.entity.golem;

import net.biggerbetterbolderbosses.BiggerBetterBolderBosses;
import net.biggerbetterbolderbosses.entity.golem.client.GolemRenderer;
import net.biggerbetterbolderbosses.entity.golem.custom.GolemEntity;
import net.minecraft.ResourceLocationException;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;



public class ModEntities {
    private static final String GOLEM_NAME = "golem";
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, BiggerBetterBolderBosses.MODID);

    public static final RegistryObject<EntityType<GolemEntity>> GOLEM =
            ENTITY_TYPES.register(GOLEM_NAME,
                    () -> EntityType.Builder.of(GolemEntity::new, MobCategory.CREATURE)
                            .sized(3f, 4f)
                            .build(GOLEM_NAME));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }

    @Mod.EventBusSubscriber(modid = BiggerBetterBolderBosses.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            EntityRenderers.register(ModEntities.GOLEM.get(), GolemRenderer::new);
        }
    }

}
