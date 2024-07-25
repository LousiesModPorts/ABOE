package net.dimidium.aboe.data;

import net.dimidium.aboe.handler.registry.BlockRegistry;
import net.dimidium.aboe.util.Constants;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ABOEBlockStates extends BlockStateProvider
{
    public ABOEBlockStates(PackOutput output, ExistingFileHelper helper)
    {
        super(output, Constants.MOD_ID, helper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        simpleBlock(BlockRegistry.ALUMINIUM_ORE.get());
        simpleBlock(BlockRegistry.COPPER_ORE.get());
        simpleBlock(BlockRegistry.ENERGIZED_ORE.get());
        simpleBlock(BlockRegistry.IRIDIUM_ORE.get());
        simpleBlock(BlockRegistry.LEAD_ORE.get());
        simpleBlock(BlockRegistry.NICKEL_ORE.get());
        simpleBlock(BlockRegistry.PLATINUM_ORE.get());
        simpleBlock(BlockRegistry.SILVER_ORE.get());
        simpleBlock(BlockRegistry.TIN_ORE.get());
        simpleBlock(BlockRegistry.URANIUM_ORE.get());
        simpleBlock(BlockRegistry.DEEP_SLATE_ALUMINIUM_ORE.get());
        simpleBlock(BlockRegistry.DEEP_SLATE_COPPER_ORE.get());
        simpleBlock(BlockRegistry.DEEP_SLATE_ENERGIZED_ORE.get());
        simpleBlock(BlockRegistry.DEEP_SLATE_IRIDIUM_ORE.get());
        simpleBlock(BlockRegistry.DEEP_SLATE_LEAD_ORE.get());
        simpleBlock(BlockRegistry.DEEP_SLATE_NICKEL_ORE.get());
        simpleBlock(BlockRegistry.DEEP_SLATE_PLATINUM_ORE.get());
        simpleBlock(BlockRegistry.DEEP_SLATE_SILVER_ORE.get());
        simpleBlock(BlockRegistry.DEEP_SLATE_TIN_ORE.get());
        simpleBlock(BlockRegistry.DEEP_SLATE_URANIUM_ORE.get());
        simpleBlock(BlockRegistry.ALUMINIUM_BLOCK.get());
        simpleBlock(BlockRegistry.COPPER_BLOCK.get());
        simpleBlock(BlockRegistry.ENERGIZED_BLOCK.get());
        simpleBlock(BlockRegistry.IRIDIUM_BLOCK.get());
        simpleBlock(BlockRegistry.LEAD_BLOCK.get());
        simpleBlock(BlockRegistry.NICKEL_BLOCK.get());
        simpleBlock(BlockRegistry.PLATINUM_BLOCK.get());
        simpleBlock(BlockRegistry.SILVER_BLOCK.get());
        simpleBlock(BlockRegistry.TIN_BLOCK.get());
        simpleBlock(BlockRegistry.URANIUM_BLOCK.get());
        simpleBlock(BlockRegistry.MINETOPIA_PORTAL_FRAME.get());
        simpleBlock(BlockRegistry.VOID_PORTAL_FRAME.get());
    }
}
