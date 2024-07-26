package net.dimidium.aboe;

import com.mojang.logging.LogUtils;
import net.dimidium.aboe.client.screen.WarningScreen;
import net.dimidium.aboe.handler.ConfigurationHandler;
import net.dimidium.aboe.handler.registry.*;
import net.dimidium.aboe.event.CommandEvent;
import net.dimidium.aboe.util.Constants;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.event.ScreenEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

@Mod(Constants.MOD_ID)
public class ABOE
{
    public static final Logger LOGGER = LogUtils.getLogger();

    public ABOE(IEventBus eventBus)
    {
        BlockRegistry.registerBlocks(eventBus);
        ItemRegistry.registerItems(eventBus);
        BlockEntityRegistry.registerBlockEntities(eventBus);
        ContainerRegistry.registerContainers(eventBus);
        EffectRegistry.registerEffects(eventBus);
        FluidRegistry.registerFluids(eventBus);
        FluidTypeRegistry.registerFluidTypes(eventBus);
        CreativeRegistry.registerTabs(eventBus);
        POIRegistry.registerPOIs(eventBus);
        TrunkPlacerRegistry.register(eventBus);

        eventBus.addListener(this::commonSetup);
        NeoForge.EVENT_BUS.register(this);
        ModLoadingContext.get().getActiveContainer().registerConfig(ModConfig.Type.COMMON, ConfigurationHandler.SERVER_CONFIG);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        NeoForge.EVENT_BUS.register(CommandEvent.class);
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    @EventBusSubscriber(modid = Constants.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event)
        {
            //todo event.registerBlockEntityRenderer(BlockEntityRegistry.DISPLAY_PEDESTAL.get(), DisplayPedestalRenderer::new);
        }

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            event.enqueueWork(() -> {
                //todo ItemBlockRenderTypes.setRenderLayer(FluidRegistry.SOURCE_LIQUID_EXPERIENCE.get(), RenderType.translucent());
                //todo ItemBlockRenderTypes.setRenderLayer(FluidRegistry.FLOWING_LIQUID_EXPERIENCE.get(), RenderType.translucent());
                //todo MenuScreens.register(ContainerRegistry.DISPLAY_PEDESTAL.get(), DisplayPedestalScreen::new);
            });
        }
    }

    @EventBusSubscriber(value = Dist.CLIENT, bus = EventBusSubscriber.Bus.GAME, modid = Constants.MOD_ID)
    public static class ForgeEvents
    {
        private static boolean firstTitleScreenShown = false;

        @SubscribeEvent
        public static void showPreAlphaScreen(ScreenEvent.Init.Post event)
        {
            if (firstTitleScreenShown || !(event.getScreen() instanceof TitleScreen))
            {
                return;
            }

            Minecraft.getInstance().setScreen(new WarningScreen(event.getScreen()));
            firstTitleScreenShown = true;
        }
    }
}