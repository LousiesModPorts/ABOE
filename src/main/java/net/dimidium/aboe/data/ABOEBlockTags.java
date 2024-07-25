package net.dimidium.aboe.data;

import net.dimidium.aboe.handler.registry.BlockRegistry;
import net.dimidium.aboe.util.Constants;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

public class ABOEBlockTags extends BlockTagsProvider
{
    public ABOEBlockTags(PackOutput output, CompletableFuture<HolderLookup.Provider> provider, ExistingFileHelper helper)
    {
        super(output, provider, Constants.MOD_ID, helper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider)
    {
        tag(Tags.Blocks.ORES)
                .add(BlockRegistry.ALUMINIUM_ORE.get())
                .add(BlockRegistry.COPPER_ORE.get())
                .add(BlockRegistry.ENERGIZED_ORE.get())
                .add(BlockRegistry.IRIDIUM_ORE.get())
                .add(BlockRegistry.LEAD_ORE.get())
                .add(BlockRegistry.NICKEL_ORE.get())
                .add(BlockRegistry.PLATINUM_ORE.get())
                .add(BlockRegistry.SILVER_ORE.get())
                .add(BlockRegistry.TIN_ORE.get())
                .add(BlockRegistry.URANIUM_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_ALUMINIUM_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_COPPER_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_ENERGIZED_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_IRIDIUM_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_LEAD_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_NICKEL_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_PLATINUM_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_SILVER_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_TIN_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_URANIUM_ORE.get());

        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(BlockRegistry.RUBBER_LOG.get())
                .add(BlockRegistry.RUBBER_WOOD.get())
                .add(BlockRegistry.RUBBER_PLANKS.get())
                .add(BlockRegistry.STRIPPED_RUBBER_LOG.get())
                .add(BlockRegistry.STRIPPED_RUBBER_WOOD.get());

        tag(BlockTags.MINEABLE_WITH_HOE)
                .add(BlockRegistry.RUBBER_LEAVES.get());

        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(BlockRegistry.ALUMINIUM_BLOCK.get())
                .add(BlockRegistry.COPPER_BLOCK.get())
                .add(BlockRegistry.ENERGIZED_BLOCK.get())
                .add(BlockRegistry.IRIDIUM_BLOCK.get())
                .add(BlockRegistry.LEAD_BLOCK.get())
                .add(BlockRegistry.NICKEL_BLOCK.get())
                .add(BlockRegistry.PLATINUM_BLOCK.get())
                .add(BlockRegistry.SILVER_BLOCK.get())
                .add(BlockRegistry.TIN_BLOCK.get())
                .add(BlockRegistry.URANIUM_BLOCK.get())
                .add(BlockRegistry.ALUMINIUM_ORE.get())
                .add(BlockRegistry.COPPER_ORE.get())
                .add(BlockRegistry.ENERGIZED_ORE.get())
                .add(BlockRegistry.IRIDIUM_ORE.get())
                .add(BlockRegistry.LEAD_ORE.get())
                .add(BlockRegistry.NICKEL_ORE.get())
                .add(BlockRegistry.PLATINUM_ORE.get())
                .add(BlockRegistry.SILVER_ORE.get())
                .add(BlockRegistry.TIN_ORE.get())
                .add(BlockRegistry.URANIUM_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_ALUMINIUM_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_COPPER_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_ENERGIZED_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_IRIDIUM_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_LEAD_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_NICKEL_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_PLATINUM_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_SILVER_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_TIN_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_URANIUM_ORE.get());

        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(BlockRegistry.RUBBER_LOG.get())
                .add(BlockRegistry.RUBBER_WOOD.get())
                .add(BlockRegistry.RUBBER_PLANKS.get())
                .add(BlockRegistry.RUBBER_LEAVES.get())
                .add(BlockRegistry.STRIPPED_RUBBER_LOG.get())
                .add(BlockRegistry.STRIPPED_RUBBER_WOOD.get())
                .add(BlockRegistry.ALUMINIUM_BLOCK.get())
                .add(BlockRegistry.COPPER_BLOCK.get())
                .add(BlockRegistry.ALUMINIUM_ORE.get())
                .add(BlockRegistry.COPPER_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_ALUMINIUM_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_COPPER_ORE.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(BlockRegistry.ENERGIZED_BLOCK.get())
                .add(BlockRegistry.LEAD_BLOCK.get())
                .add(BlockRegistry.NICKEL_BLOCK.get())
                .add(BlockRegistry.SILVER_BLOCK.get())
                .add(BlockRegistry.TIN_BLOCK.get())
                .add(BlockRegistry.ENERGIZED_ORE.get())
                .add(BlockRegistry.LEAD_ORE.get())
                .add(BlockRegistry.NICKEL_ORE.get())
                .add(BlockRegistry.SILVER_ORE.get())
                .add(BlockRegistry.TIN_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_ENERGIZED_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_LEAD_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_NICKEL_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_SILVER_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_TIN_ORE.get());

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(BlockRegistry.IRIDIUM_BLOCK.get())
                .add(BlockRegistry.PLATINUM_BLOCK.get())
                .add(BlockRegistry.URANIUM_BLOCK.get())
                .add(BlockRegistry.IRIDIUM_ORE.get())
                .add(BlockRegistry.PLATINUM_ORE.get())
                .add(BlockRegistry.URANIUM_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_IRIDIUM_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_PLATINUM_ORE.get())
                .add(BlockRegistry.DEEP_SLATE_URANIUM_ORE.get());

    }
}
