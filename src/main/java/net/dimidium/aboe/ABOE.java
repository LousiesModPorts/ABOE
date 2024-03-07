package net.dimidium.aboe;

import net.dimidium.aboe.client.render.DisplayPedestalRenderer;
import net.dimidium.aboe.client.screen.DisplayPedestalScreen;
import net.dimidium.aboe.handler.registry.*;
import net.dimidium.aboe.util.Constants;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class ABOE
{
    public ABOE()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BlockRegistry.registerBlocks();
        ItemRegistry.registerItems();
        BlockEntityRegistry.registerBlockEntities();
        ContainerRegistry.registerContainers();
        EffectRegistry.registerEffects();
        FluidRegistry.registerFluids();
        FluidTypeRegistry.registerFluidTypes();
        CreativeRegistry.registerTabs();

        MinecraftForge.EVENT_BUS.register(this);
    }

    @Mod.EventBusSubscriber(modid = Constants.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event)
        {
            event.registerBlockEntityRenderer(BlockEntityRegistry.DISPLAY_PEDESTAL.get(), DisplayPedestalRenderer::new);
        }

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            event.enqueueWork(() -> {
                MenuScreens.register(ContainerRegistry.DISPLAY_PEDESTAL.get(), DisplayPedestalScreen::new);
            });
        }
    }
}