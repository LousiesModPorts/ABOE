package net.dimidium.aboe;

import net.dimidium.aboe.client.render.DisplayPedestalRenderer;
import net.dimidium.aboe.client.screen.DisplayPedestalScreen;
import net.dimidium.aboe.handler.registry.*;
import net.dimidium.aboe.util.Constants;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
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

        MinecraftForge.EVENT_BUS.register(this);
        eventBus.addListener(this::addCreative);
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS)
        {
            event.accept(BlockRegistry.ALUMINIUM_BLOCK.get());
            event.accept(BlockRegistry.COPPER_BLOCK.get());
            event.accept(BlockRegistry.ENERGIZED_BLOCK.get());
            event.accept(BlockRegistry.IRIDIUM_BLOCK.get());
            event.accept(BlockRegistry.LEAD_BLOCK.get());
            event.accept(BlockRegistry.NICKEL_BLOCK.get());
            event.accept(BlockRegistry.PLATINUM_BLOCK.get());
            event.accept(BlockRegistry.SILVER_BLOCK.get());
            event.accept(BlockRegistry.TIN_BLOCK.get());
            event.accept(BlockRegistry.URANIUM_BLOCK.get());
        }

        if(event.getTabKey() == CreativeModeTabs.COMBAT)
        {
            event.accept(ItemRegistry.RADIATION_SUIT_HELMET.get());
            event.accept(ItemRegistry.RADIATION_SUIT_CHESTPLATE.get());
            event.accept(ItemRegistry.RADIATION_SUIT_LEGGINGS.get());
            event.accept(ItemRegistry.RADIATION_SUIT_BOOTS.get());
            event.accept(ItemRegistry.RADIATION_SUIT_HELMET_BROKEN.get());
            event.accept(ItemRegistry.RADIATION_SUIT_CHESTPLATE_BROKEN.get());
            event.accept(ItemRegistry.RADIATION_SUIT_LEGGINGS_BROKEN.get());
            event.accept(ItemRegistry.RADIATION_SUIT_BOOTS_BROKEN.get());
        }

        if(event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS)
        {
            event.accept(BlockRegistry.DISPLAY_PEDESTAL.get());
        }

        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS)
        {
            event.accept(ItemRegistry.ALUMINIUM_GEAR.get());
            event.accept(ItemRegistry.COPPER_GEAR.get());
            event.accept(ItemRegistry.ENERGIZED_GEAR.get());
            event.accept(ItemRegistry.IRIDIUM_GEAR.get());
            event.accept(ItemRegistry.LEAD_GEAR.get());
            event.accept(ItemRegistry.NICKEL_GEAR.get());
            event.accept(ItemRegistry.PLATINUM_GEAR.get());
            event.accept(ItemRegistry.SILVER_GEAR.get());
            event.accept(ItemRegistry.TIN_GEAR.get());
            event.accept(ItemRegistry.URANIUM_GEAR.get());
            event.accept(ItemRegistry.ALUMINIUM_INGOT.get());
            event.accept(ItemRegistry.COPPER_INGOT.get());
            event.accept(ItemRegistry.ENERGIZED_INGOT.get());
            event.accept(ItemRegistry.IRIDIUM_INGOT.get());
            event.accept(ItemRegistry.LEAD_INGOT.get());
            event.accept(ItemRegistry.NICKEL_INGOT.get());
            event.accept(ItemRegistry.PLATINUM_INGOT.get());
            event.accept(ItemRegistry.SILVER_INGOT.get());
            event.accept(ItemRegistry.TIN_INGOT.get());
            event.accept(ItemRegistry.URANIUM_INGOT.get());
            event.accept(ItemRegistry.ALUMINIUM_NUGGET.get());
            event.accept(ItemRegistry.COPPER_NUGGET.get());
            event.accept(ItemRegistry.ENERGIZED_NUGGET.get());
            event.accept(ItemRegistry.IRIDIUM_NUGGET.get());
            event.accept(ItemRegistry.LEAD_NUGGET.get());
            event.accept(ItemRegistry.NICKEL_NUGGET.get());
            event.accept(ItemRegistry.PLATINUM_NUGGET.get());
            event.accept(ItemRegistry.SILVER_NUGGET.get());
            event.accept(ItemRegistry.TIN_NUGGET.get());
            event.accept(ItemRegistry.URANIUM_NUGGET.get());
            event.accept(ItemRegistry.RAW_ALUMINIUM_CHUNK.get());
            event.accept(ItemRegistry.RAW_COPPER_CHUNK.get());
            event.accept(ItemRegistry.RAW_ENERGIZED_CHUNK.get());
            event.accept(ItemRegistry.RAW_IRIDIUM_CHUNK.get());
            event.accept(ItemRegistry.RAW_LEAD_CHUNK.get());
            event.accept(ItemRegistry.RAW_NICKEL_CHUNK.get());
            event.accept(ItemRegistry.RAW_PLATINUM_CHUNK.get());
            event.accept(ItemRegistry.RAW_SILVER_CHUNK.get());
            event.accept(ItemRegistry.RAW_TIN_CHUNK.get());
            event.accept(ItemRegistry.RAW_URANIUM_CHUNK.get());
        }

        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS)
        {
            event.accept(BlockRegistry.ALUMINIUM_ORE.get());
            event.accept(BlockRegistry.COPPER_ORE.get());
            event.accept(BlockRegistry.ENERGIZED_ORE.get());
            event.accept(BlockRegistry.IRIDIUM_ORE.get());
            event.accept(BlockRegistry.LEAD_ORE.get());
            event.accept(BlockRegistry.NICKEL_ORE.get());
            event.accept(BlockRegistry.PLATINUM_ORE.get());
            event.accept(BlockRegistry.SILVER_ORE.get());
            event.accept(BlockRegistry.TIN_ORE.get());
            event.accept(BlockRegistry.URANIUM_ORE.get());
            event.accept(BlockRegistry.DEEP_SLATE_ALUMINIUM_ORE.get());
            event.accept(BlockRegistry.DEEP_SLATE_COPPER_ORE.get());
            event.accept(BlockRegistry.DEEP_SLATE_ENERGIZED_ORE.get());
            event.accept(BlockRegistry.DEEP_SLATE_IRIDIUM_ORE.get());
            event.accept(BlockRegistry.DEEP_SLATE_LEAD_ORE.get());
            event.accept(BlockRegistry.DEEP_SLATE_NICKEL_ORE.get());
            event.accept(BlockRegistry.DEEP_SLATE_PLATINUM_ORE.get());
            event.accept(BlockRegistry.DEEP_SLATE_SILVER_ORE.get());
            event.accept(BlockRegistry.DEEP_SLATE_TIN_ORE.get());
            event.accept(BlockRegistry.DEEP_SLATE_URANIUM_ORE.get());
        }
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