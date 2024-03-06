package net.dimidium.aboe.handler.registry;

import net.dimidium.aboe.blockentity.DisplayPedestalBlockEntity;
import net.dimidium.aboe.util.Constants;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockEntityRegistry 
{
    private static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Constants.MOD_ID);

    public static final RegistryObject<BlockEntityType<DisplayPedestalBlockEntity>> DISPLAY_PEDESTAL = BLOCK_ENTITIES.register("display_pedestal",
            () -> BlockEntityType.Builder.of(DisplayPedestalBlockEntity::new, BlockRegistry.DISPLAY_PEDESTAL.get()).build(null));

    public static void registerBlockEntities()
    {
        BLOCK_ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
