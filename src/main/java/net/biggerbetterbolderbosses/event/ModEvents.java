package net.biggerbetterbolderbosses.event;

import net.biggerbetterbolderbosses.BiggerBetterBolderBosses;
import net.biggerbetterbolderbosses.entity.golem.ModEntities;
import net.biggerbetterbolderbosses.entity.golem.custom.GolemEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BiggerBetterBolderBosses.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntities.GOLEM.get(), GolemEntity.createAttributes().build());
    }
}
