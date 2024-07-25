package net.dimidium.aboe.handler.registry;

import net.dimidium.aboe.util.Constants;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BlockEntityRegistry 
{
    private static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, Constants.MOD_ID);

    //todo public static final DeferredHolder<BlockEntityType<DisplayPedestalBlockEntity>, BlockEntityType<DisplayPedestalBlockEntity>> DISPLAY_PEDESTAL = BLOCK_ENTITIES.register("display_pedestal",
            //todo () -> BlockEntityType.Builder.of(DisplayPedestalBlockEntity::new, BlockRegistry.DISPLAY_PEDESTAL.get()).build(null));

    public static void registerBlockEntities(IEventBus eventBus)
    {
        BLOCK_ENTITIES.register(eventBus);
    }
}
