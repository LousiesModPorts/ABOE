package net.dimidium.aboe.handler.registry;

import net.dimidium.aboe.util.Constants;
import net.dimidium.dimidiumcore.api.util.IBlockTab;
import net.dimidium.dimidiumcore.api.util.IItemTab;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CreativeRegistry
{
    private static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Constants.MOD_ID);

    private static final DeferredHolder<CreativeModeTab, CreativeModeTab> BLOCKS = CREATIVE_MODE_TABS.register("blocks", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
            .title(Component.translatable("itemGroup." + Constants.MOD_ID + ".blocks"))
            .icon(BlockRegistry.ALUMINIUM_ORE.get().asItem()::getDefaultInstance)
            .displayItems((parameters, output) -> {
                for(DeferredHolder<Block, ? extends Block> block : BlockRegistry.BLOCKS.getEntries())
                {
                    if(block.get() instanceof IBlockTab)
                    {
                        output.accept(block.get().asItem().getDefaultInstance());
                    }
                }
            }).build());

    private static final DeferredHolder<CreativeModeTab, CreativeModeTab> ITEMS = CREATIVE_MODE_TABS.register("items", () -> CreativeModeTab.builder()
            .withTabsBefore(BLOCKS.getKey())
            .title(Component.translatable("itemGroup." + Constants.MOD_ID + ".items"))
            .icon(() -> ItemRegistry.ALUMINIUM_GEAR.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                for(DeferredHolder<Item, ? extends Item> item : ItemRegistry.ITEMS.getEntries())
                {
                    if(item.get() instanceof IItemTab)
                    {
                        output.accept(item.get().getDefaultInstance());
                    }
                }

            }).build());

    public static void registerTabs(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}