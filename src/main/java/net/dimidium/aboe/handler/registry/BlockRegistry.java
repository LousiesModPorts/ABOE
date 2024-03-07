package net.dimidium.aboe.handler.registry;

import net.dimidium.aboe.block.*;
import net.dimidium.aboe.block.fluid.LiquidExperienceFluid;
import net.dimidium.aboe.block.fluid.MoltenFluid;
import net.dimidium.aboe.util.Constants;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistry
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Constants.MOD_ID);

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

    public static final RegistryObject<Block> ALUMINIUM_BLOCK = BLOCKS.register("aluminium_block", () -> new IngotBlock(5.0F, 6.0F, SoundType.METAL));
    public static final RegistryObject<Block> COPPER_BLOCK = BLOCKS.register("copper_block", () -> new IngotBlock(5.0F, 6.0F, SoundType.METAL));
    public static final RegistryObject<Block> ENERGIZED_BLOCK = BLOCKS.register("energized_block", () -> new IngotBlock(5.0F, 6.0F, SoundType.METAL));
    public static final RegistryObject<Block> IRIDIUM_BLOCK = BLOCKS.register("iridium_block", () -> new IngotBlock(5.0F, 6.0F, SoundType.METAL));
    public static final RegistryObject<Block> LEAD_BLOCK = BLOCKS.register("lead_block",  () -> new IngotBlock(5.0F, 6.0F, SoundType.METAL));
    public static final RegistryObject<Block> NICKEL_BLOCK = BLOCKS.register("nickel_block", () -> new IngotBlock(5.0F, 6.0F, SoundType.METAL));
    public static final RegistryObject<Block> PLATINUM_BLOCK = BLOCKS.register("platinum_block", () -> new IngotBlock(5.0F, 6.0F, SoundType.METAL));
    public static final RegistryObject<Block> SILVER_BLOCK = BLOCKS.register("silver_block", () -> new IngotBlock(5.0F, 6.0F, SoundType.METAL));
    public static final RegistryObject<Block> TIN_BLOCK = BLOCKS.register("tin_block", () -> new IngotBlock(5.0F, 6.0F, SoundType.METAL));
    public static final RegistryObject<Block> URANIUM_BLOCK = BLOCKS.register("uranium_block", () -> new IngotBlock(5.0F, 6.0F, SoundType.METAL));
    public static final RegistryObject<Block> DISPLAY_PEDESTAL = BLOCKS.register("display_pedestal", DisplayPedestalBlock::new);

    public static final RegistryObject<LiquidBlock> LIQUID_EXPERIENCE_BLOCK = BLOCKS.register("liquid_experience_block",
            () -> new LiquidExperienceFluid(FluidRegistry.SOURCE_LIQUID_EXPERIENCE.get(), BlockBehaviour.Properties.copy(Blocks.WATER)));

    public static final RegistryObject<LiquidBlock> MOLTEN_ALUMINIUM_BLOCK = BLOCKS.register("molten_aluminium_block",
            () -> new MoltenFluid(FluidRegistry.SOURCE_MOLTEN_ALUMINIUM.get(), BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_COPPER_BLOCK = BLOCKS.register("molten_copper_block",
            () -> new MoltenFluid(FluidRegistry.SOURCE_MOLTEN_COPPER.get(), BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_ENERGIZED_BLOCK = BLOCKS.register("molten_energized_block",
            () -> new MoltenFluid(FluidRegistry.SOURCE_MOLTEN_ENERGIZED.get(), BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_IRIDIUM_BLOCK = BLOCKS.register("molten_iridium_block",
            () -> new MoltenFluid(FluidRegistry.SOURCE_MOLTEN_IRIDIUM.get(), BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_LEAD_BLOCK = BLOCKS.register("molten_lead_block",
            () -> new MoltenFluid(FluidRegistry.SOURCE_MOLTEN_LEAD.get(), BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_NICKEL_BLOCK = BLOCKS.register("molten_nickel_block",
            () -> new MoltenFluid(FluidRegistry.SOURCE_MOLTEN_NICKEL.get(), BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_PLATINUM_BLOCK = BLOCKS.register("molten_platinum_block",
            () -> new MoltenFluid(FluidRegistry.SOURCE_MOLTEN_PLATINUM.get(), BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_SILVER_BLOCK = BLOCKS.register("molten_silver_block",
            () -> new MoltenFluid(FluidRegistry.SOURCE_MOLTEN_SILVER.get(), BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_TIN_BLOCK = BLOCKS.register("molten_tin_block",
            () -> new MoltenFluid(FluidRegistry.SOURCE_MOLTEN_TIN.get(), BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_URANIUM_BLOCK = BLOCKS.register("molten_uranium_block",
            () -> new MoltenFluid(FluidRegistry.SOURCE_MOLTEN_URANIUM.get(), BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static void registerBlocks()
    {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
