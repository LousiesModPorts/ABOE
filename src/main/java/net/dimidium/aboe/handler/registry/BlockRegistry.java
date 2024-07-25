package net.dimidium.aboe.handler.registry;

import net.dimidium.aboe.block.*;
import net.dimidium.aboe.block.fluid.*;
import net.dimidium.aboe.block.portal.minetopia.*;
import net.dimidium.aboe.block.portal.thevoid.*;
import net.dimidium.aboe.util.Constants;
import net.dimidium.dimidiumcore.api.block.BlockBase;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;

public class BlockRegistry
{
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.Blocks.createBlocks(Constants.MOD_ID);
    public static final ArrayList<String> TROPHIES = new ArrayList<>();

    public static final DeferredBlock<Block> ALUMINIUM_ORE = BLOCKS.register("aluminium_ore", () -> new Ore(3.0F, 3.0F, SoundType.STONE));
    public static final DeferredBlock<Block> COPPER_ORE = BLOCKS.register("copper_ore",  () -> new Ore(3.0F, 3.0F, SoundType.STONE));
    public static final DeferredBlock<Block> ENERGIZED_ORE = BLOCKS.register("energized_ore", () -> new Ore(3.0F, 3.0F, SoundType.STONE));
    public static final DeferredBlock<Block> IRIDIUM_ORE = BLOCKS.register("iridium_ore", () -> new Ore(3.0F, 3.0F, SoundType.STONE));
    public static final DeferredBlock<Block> LEAD_ORE = BLOCKS.register("lead_ore",   () -> new Ore(3.0F, 3.0F, SoundType.STONE));
    public static final DeferredBlock<Block> NICKEL_ORE = BLOCKS.register("nickel_ore",  () -> new Ore(3.0F, 3.0F, SoundType.STONE));
    public static final DeferredBlock<Block> PLATINUM_ORE = BLOCKS.register("platinum_ore",  () -> new Ore(3.0F, 3.0F, SoundType.STONE));
    public static final DeferredBlock<Block> SILVER_ORE = BLOCKS.register("silver_ore",  () -> new Ore(3.0F, 3.0F, SoundType.STONE));
    public static final DeferredBlock<Block> TIN_ORE = BLOCKS.register("tin_ore",  () -> new Ore(3.0F, 3.0F, SoundType.STONE));
    public static final DeferredBlock<Block> URANIUM_ORE = BLOCKS.register("uranium_ore",  () -> new Ore(3.0F, 3.0F, SoundType.STONE));
    public static final DeferredBlock<Block> DEEP_SLATE_ALUMINIUM_ORE = BLOCKS.register("deepslate_aluminium_ore",  () -> new Ore(4.0F, 3.0F, SoundType.STONE));
    public static final DeferredBlock<Block> DEEP_SLATE_COPPER_ORE = BLOCKS.register("deepslate_copper_ore",  () -> new Ore(4.0F, 3.0F, SoundType.STONE));
    public static final DeferredBlock<Block> DEEP_SLATE_ENERGIZED_ORE = BLOCKS.register("deepslate_energized_ore",  () -> new Ore(4.0F, 3.0F, SoundType.STONE));
    public static final DeferredBlock<Block> DEEP_SLATE_IRIDIUM_ORE = BLOCKS.register("deepslate_iridium_ore",  () -> new Ore(4.0F, 3.0F, SoundType.DEEPSLATE));
    public static final DeferredBlock<Block> DEEP_SLATE_LEAD_ORE = BLOCKS.register("deepslate_lead_ore",  () -> new Ore(4.0F, 3.0F, SoundType.DEEPSLATE));
    public static final DeferredBlock<Block> DEEP_SLATE_NICKEL_ORE = BLOCKS.register("deepslate_nickel_ore",  () -> new Ore(4.0F, 3.0F, SoundType.DEEPSLATE));
    public static final DeferredBlock<Block> DEEP_SLATE_PLATINUM_ORE = BLOCKS.register("deepslate_platinum_ore",  () -> new Ore(4.0F, 3.0F, SoundType.DEEPSLATE));
    public static final DeferredBlock<Block> DEEP_SLATE_SILVER_ORE = BLOCKS.register("deepslate_silver_ore",  () -> new Ore(4.0F, 3.0F, SoundType.DEEPSLATE));
    public static final DeferredBlock<Block> DEEP_SLATE_TIN_ORE = BLOCKS.register("deepslate_tin_ore",  () -> new Ore(4.0F, 3.0F, SoundType.DEEPSLATE));
    public static final DeferredBlock<Block> DEEP_SLATE_URANIUM_ORE = BLOCKS.register("deepslate_uranium_ore",  () -> new Ore(4.0F, 3.0F, SoundType.DEEPSLATE));

    public static final DeferredBlock<Block> ALUMINIUM_BLOCK = BLOCKS.register("aluminium_block", () -> new IngotBlock(5.0F, 6.0F, SoundType.METAL));
    public static final DeferredBlock<Block> COPPER_BLOCK = BLOCKS.register("copper_block", () -> new IngotBlock(5.0F, 6.0F, SoundType.METAL));
    public static final DeferredBlock<Block> ENERGIZED_BLOCK = BLOCKS.register("energized_block", () -> new IngotBlock(5.0F, 6.0F, SoundType.METAL));
    public static final DeferredBlock<Block> IRIDIUM_BLOCK = BLOCKS.register("iridium_block", () -> new IngotBlock(5.0F, 6.0F, SoundType.METAL));
    public static final DeferredBlock<Block> LEAD_BLOCK = BLOCKS.register("lead_block",  () -> new IngotBlock(5.0F, 6.0F, SoundType.METAL));
    public static final DeferredBlock<Block> NICKEL_BLOCK = BLOCKS.register("nickel_block", () -> new IngotBlock(5.0F, 6.0F, SoundType.METAL));
    public static final DeferredBlock<Block> PLATINUM_BLOCK = BLOCKS.register("platinum_block", () -> new IngotBlock(5.0F, 6.0F, SoundType.METAL));
    public static final DeferredBlock<Block> SILVER_BLOCK = BLOCKS.register("silver_block", () -> new IngotBlock(5.0F, 6.0F, SoundType.METAL));
    public static final DeferredBlock<Block> TIN_BLOCK = BLOCKS.register("tin_block", () -> new IngotBlock(5.0F, 6.0F, SoundType.METAL));
    public static final DeferredBlock<Block> URANIUM_BLOCK = BLOCKS.register("uranium_block", () -> new IngotBlock(5.0F, 6.0F, SoundType.METAL));
    public static final DeferredBlock<Block> DISPLAY_PEDESTAL = BLOCKS.register("display_pedestal", DisplayPedestalBlock::new);

    //todo below

    /*public static final DeferredBlock<LiquidBlock> LIQUID_EXPERIENCE_BLOCK = BLOCKS.register("liquid_experience_block",
            () -> new LiquidExperienceFluid(FluidRegistry.SOURCE_LIQUID_EXPERIENCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));

    public static final DeferredBlock<LiquidBlock> MOLTEN_ALUMINIUM_BLOCK = BLOCKS.register("molten_aluminium_block",
            () -> new MoltenFluid(FluidRegistry.SOURCE_MOLTEN_ALUMINIUM.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.LAVA)));

    public static final DeferredBlock<LiquidBlock> MOLTEN_COPPER_BLOCK = BLOCKS.register("molten_copper_block",
            () -> new MoltenFluid(FluidRegistry.SOURCE_MOLTEN_COPPER.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.LAVA)));

    public static final DeferredBlock<LiquidBlock> MOLTEN_ENERGIZED_BLOCK = BLOCKS.register("molten_energized_block",
            () -> new MoltenFluid(FluidRegistry.SOURCE_MOLTEN_ENERGIZED.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.LAVA)));

    public static final DeferredBlock<LiquidBlock> MOLTEN_IRIDIUM_BLOCK = BLOCKS.register("molten_iridium_block",
            () -> new MoltenFluid(FluidRegistry.SOURCE_MOLTEN_IRIDIUM.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.LAVA)));

    public static final DeferredBlock<LiquidBlock> MOLTEN_LEAD_BLOCK = BLOCKS.register("molten_lead_block",
            () -> new MoltenFluid(FluidRegistry.SOURCE_MOLTEN_LEAD.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.LAVA)));

    public static final DeferredBlock<LiquidBlock> MOLTEN_NICKEL_BLOCK = BLOCKS.register("molten_nickel_block",
            () -> new MoltenFluid(FluidRegistry.SOURCE_MOLTEN_NICKEL.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.LAVA)));

    public static final DeferredBlock<LiquidBlock> MOLTEN_PLATINUM_BLOCK = BLOCKS.register("molten_platinum_block",
            () -> new MoltenFluid(FluidRegistry.SOURCE_MOLTEN_PLATINUM.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.LAVA)));

    public static final DeferredBlock<LiquidBlock> MOLTEN_SILVER_BLOCK = BLOCKS.register("molten_silver_block",
            () -> new MoltenFluid(FluidRegistry.SOURCE_MOLTEN_SILVER.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.LAVA)));

    public static final DeferredBlock<LiquidBlock> MOLTEN_TIN_BLOCK = BLOCKS.register("molten_tin_block",
            () -> new MoltenFluid(FluidRegistry.SOURCE_MOLTEN_TIN.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.LAVA)));

    public static final DeferredBlock<LiquidBlock> MOLTEN_URANIUM_BLOCK = BLOCKS.register("molten_uranium_block",
            () -> new MoltenFluid(FluidRegistry.SOURCE_MOLTEN_URANIUM.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.LAVA)));*/

    public static final DeferredBlock<Block> MINETOPIA_PORTAL = BLOCKS.register("minetopia_portal", MinetopiaPortal::new);
    public static final DeferredBlock<Block> MINETOPIA_PORTAL_FRAME = BLOCKS.register("minetopia_portal_frame", MinetopiaPortalFrame::new);
    public static final DeferredBlock<Block> VOID_PORTAL = BLOCKS.register("void_portal", VoidPortal::new);
    public static final DeferredBlock<Block> VOID_PORTAL_FRAME = BLOCKS.register("void_portal_frame", VoidPortalFrame::new);

    public static final DeferredBlock<Block> RUBBER = BLOCKS.register("rubber", Rubber::new);
    public static final DeferredBlock<Block> RUBBER_LOG = BLOCKS.register("rubber_log", () -> new RubberWood(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG).strength(3F)));
    public static final DeferredBlock<Block> RUBBER_WOOD = BLOCKS.register("rubber_wood", () -> new RubberWood(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD).strength(3F)));
    public static final DeferredBlock<Block> STRIPPED_RUBBER_LOG = BLOCKS.register("stripped_rubber_log", () -> new RubberWood(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> STRIPPED_RUBBER_WOOD = BLOCKS.register("stripped_rubber_wood", () -> new RubberWood(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredBlock<Block> RUBBER_PLANKS = BLOCKS.register("rubber_planks", () -> new BlockBase(5f, 5f, SoundType.WOOD));
    public static final DeferredBlock<Block> RUBBER_LEAVES = BLOCKS.register("rubber_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    //public static final DeferredBlock<Block> RUBBER_SAPLING = BLOCKS.register("rubber_sapling", () -> new SaplingBlock(new Grwo(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    //public static final DeferredBlock<Block> RUBBER_SIGN = BLOCKS.register("rubber_log", RotatedBlock::new);
    //public static final DeferredBlock<Block> STRIPPED_WALL_SIGN = BLOCKS.register("rubber_log", RotatedBlock::new);
    ////public static final DeferredBlock<Block> RUBBER_HANGING_SIGN = BLOCKS.register("rubber_log", RotatedBlock::new);
    //public static final DeferredBlock<Block> RUBBER_WALL_HANGING_SIGN = BLOCKS.register("rubber_wall_hanging_sign");

/*
    public static final DeferredBlock<Block> BEGINNER_BATTERY_CASING = BLOCKS.register("beginner_battery_casing", () -> new BeginnerBatteryBlock(25.0f, 25.0f, SoundType.METAL));
    public static final DeferredBlock<Block> BEGINNER_BTERY_CONTROLLER = BLOCKS.register("beginner_battery_controller", () -> new BeginnerBatteryBlock(25.0f, 25.0f, SoundType.METAL));
    public static final DeferredBlock<Block> BEGINNER_BATTERY_UPGRA_CONSOLE = BLOCKS.register("beginner_battery_upgrade_console", () -> new BeginnerBatteryBlock(25.0f, 25.0f, SoundType.METAL));
*/

    public static void registerBlocks(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }
}
