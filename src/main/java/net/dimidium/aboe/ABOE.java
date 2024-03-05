package net.dimidium.aboe;

import net.dimidium.aboe.handler.registry.*;
import net.dimidium.aboe.util.Constants;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class ABOE
{
    public ABOE()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BlockRegistry.registerBlocks();
        ItemRegistry.registerItems();

        MinecraftForge.EVENT_BUS.register(this);
        eventBus.addListener(this::addCreative);
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
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
}