package net.dimidium.aboe.handler.registry;

import net.dimidium.aboe.block.*;
import net.dimidium.aboe.util.Constants;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistry
{
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Constants.MOD_ID);

    public static final RegistryObject<Block> ALUMINIUM_ORE = BLOCKS.register("aluminium_ore", () -> new Ore(3.0F, 3.0F, SoundType.STONE));
    public static final RegistryObject<Block> COPPER_ORE = BLOCKS.register("copper_ore",  () -> new Ore(3.0F, 3.0F, SoundType.STONE));
    public static final RegistryObject<Block> ENERGIZED_ORE = BLOCKS.register("energized_ore", () -> new Ore(3.0F, 3.0F, SoundType.STONE));
    public static final RegistryObject<Block> IRIDIUM_ORE = BLOCKS.register("iridium_ore", () -> new Ore(3.0F, 3.0F, SoundType.STONE));
    public static final RegistryObject<Block> LEAD_ORE = BLOCKS.register("lead_ore",   () -> new Ore(3.0F, 3.0F, SoundType.STONE));
    public static final RegistryObject<Block> NICKEL_ORE = BLOCKS.register("nickel_ore",  () -> new Ore(3.0F, 3.0F, SoundType.STONE));
    public static final RegistryObject<Block> PLATINUM_ORE = BLOCKS.register("platinum_ore",  () -> new Ore(3.0F, 3.0F, SoundType.STONE));
    public static final RegistryObject<Block> SILVER_ORE = BLOCKS.register("silver_ore",  () -> new Ore(3.0F, 3.0F, SoundType.STONE));
    public static final RegistryObject<Block> TIN_ORE = BLOCKS.register("tin_ore",  () -> new Ore(3.0F, 3.0F, SoundType.STONE));
    public static final RegistryObject<Block> URANIUM_ORE = BLOCKS.register("uranium_ore",  () -> new Ore(3.0F, 3.0F, SoundType.STONE));
    public static final RegistryObject<Block> DEEP_SLATE_ALUMINIUM_ORE = BLOCKS.register("deepslate_aluminium_ore",  () -> new Ore(4.0F, 3.0F, SoundType.STONE));
    public static final RegistryObject<Block> DEEP_SLATE_COPPER_ORE = BLOCKS.register("deepslate_copper_ore",  () -> new Ore(4.0F, 3.0F, SoundType.STONE));
    public static final RegistryObject<Block> DEEP_SLATE_ENERGIZED_ORE = BLOCKS.register("deepslate_energized_ore",  () -> new Ore(4.0F, 3.0F, SoundType.STONE));
    public static final RegistryObject<Block> DEEP_SLATE_IRIDIUM_ORE = BLOCKS.register("deepslate_iridium_ore",  () -> new Ore(4.0F, 3.0F, SoundType.DEEPSLATE));
    public static final RegistryObject<Block> DEEP_SLATE_LEAD_ORE = BLOCKS.register("deepslate_lead_ore",  () -> new Ore(4.0F, 3.0F, SoundType.DEEPSLATE));
    public static final RegistryObject<Block> DEEP_SLATE_NICKEL_ORE = BLOCKS.register("deepslate_nickel_ore",  () -> new Ore(4.0F, 3.0F, SoundType.DEEPSLATE));
    public static final RegistryObject<Block> DEEP_SLATE_PLATINUM_ORE = BLOCKS.register("deepslate_platinum_ore",  () -> new Ore(4.0F, 3.0F, SoundType.DEEPSLATE));
    public static final RegistryObject<Block> DEEP_SLATE_SILVER_ORE = BLOCKS.register("deepslate_silver_ore",  () -> new Ore(4.0F, 3.0F, SoundType.DEEPSLATE));
    public static final RegistryObject<Block> DEEP_SLATE_TIN_ORE = BLOCKS.register("deepslate_tin_ore",  () -> new Ore(4.0F, 3.0F, SoundType.DEEPSLATE));
    public static final RegistryObject<Block> DEEP_SLATE_URANIUM_ORE = BLOCKS.register("deepslate_uranium_ore",  () -> new Ore(4.0F, 3.0F, SoundType.DEEPSLATE));

    public static void registerBlocks()
    {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
