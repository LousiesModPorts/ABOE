package net.dimidium.aboe;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.logging.LogUtils;
import net.dimidium.aboe.client.render.DisplayPedestalRenderer;
import net.dimidium.aboe.client.screen.DisplayPedestalScreen;
import net.dimidium.aboe.command.DimensionCommand;
import net.dimidium.aboe.handler.registry.*;
import net.dimidium.aboe.event.CommandEvent;
import net.dimidium.aboe.util.Constants;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.commands.CommandSourceStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(Constants.MOD_ID)
public class ABOE
{
    public static final Logger LOGGER = LogUtils.getLogger();

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
        POIRegistry.registerPOIs();

        eventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(FMLCommonSetupEvent event)
    {
        MinecraftForge.EVENT_BUS.register(CommandEvent.class);
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
                ItemBlockRenderTypes.setRenderLayer(FluidRegistry.SOURCE_LIQUID_EXPERIENCE.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(FluidRegistry.FLOWING_LIQUID_EXPERIENCE.get(), RenderType.translucent());
                MenuScreens.register(ContainerRegistry.DISPLAY_PEDESTAL.get(), DisplayPedestalScreen::new);
            });
        }
    }
}