package net.dimidium.aboe.handler.registry;

import net.dimidium.aboe.block.*;
import net.dimidium.aboe.block.fluid.*;
import net.dimidium.aboe.block.portal.minetopia.*;
import net.dimidium.aboe.block.portal.thevoid.*;
import net.dimidium.aboe.util.Constants;
import net.dimidium.aboe.worldgen.tree.RubberTreeGrower;
import net.dimidium.dimidiumcore.api.block.BlockBase;
import net.minecraft.world.item.ChorusFruitItem;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;

public class BlockRegistry
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Constants.MOD_ID);
    public static final ArrayList<String> TROPHIES = new ArrayList<>();

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

    public static final RegistryObject<Block> MINETOPIA_PORTAL = BLOCKS.register("minetopia_portal", MinetopiaPortal::new);
    public static final RegistryObject<Block> MINETOPIA_PORTAL_FRAME = BLOCKS.register("minetopia_portal_frame", MinetopiaPortalFrame::new);
    public static final RegistryObject<Block> VOID_PORTAL = BLOCKS.register("void_portal", VoidPortal::new);
    public static final RegistryObject<Block> VOID_PORTAL_FRAME = BLOCKS.register("void_portal_frame", VoidPortalFrame::new);

    public static final RegistryObject<Block> RUBBER = BLOCKS.register("rubber", Rubber::new);
    public static final RegistryObject<Block> RUBBER_LOG = BLOCKS.register("rubber_log", () -> new RubberWood(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3F)));
    public static final RegistryObject<Block> RUBBER_WOOD = BLOCKS.register("rubber_wood", () -> new RubberWood(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3F)));
    public static final RegistryObject<Block> STRIPPED_RUBBER_LOG = BLOCKS.register("stripped_rubber_log", () -> new RubberWood(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_RUBBER_WOOD = BLOCKS.register("stripped_rubber_wood", () -> new RubberWood(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> RUBBER_PLANKS = BLOCKS.register("rubber_planks", () -> new BlockBase(5f, 5f, SoundType.WOOD));
    public static final RegistryObject<Block> RUBBER_LEAVES = BLOCKS.register("rubber_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> RUBBER_SAPLING = BLOCKS.register("rubber_sapling", () -> new SaplingBlock(new RubberTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    //public static final RegistryObject<Block> RUBBER_SIGN = BLOCKS.register("rubber_log", RotatedBlock::new);
    //public static final RegistryObject<Block> STRIPPED_WALL_SIGN = BLOCKS.register("rubber_log", RotatedBlock::new);
    ////public static final RegistryObject<Block> RUBBER_HANGING_SIGN = BLOCKS.register("rubber_log", RotatedBlock::new);
    //public static final RegistryObject<Block> RUBBER_WALL_HANGING_SIGN = BLOCKS.register("rubber_wall_hanging_sign");

    public static void registerBlocks()
    {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
