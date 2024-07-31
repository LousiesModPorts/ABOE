package net.dimidium.aboe.data;

import net.dimidium.aboe.handler.registry.ItemRegistry;
import net.dimidium.aboe.util.Constants;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

public class ABOEItemTags extends ItemTagsProvider
{
    public ABOEItemTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookup, BlockTagsProvider blockTags, ExistingFileHelper helper)
    {
        super(output, lookup, blockTags.contentsGetter(), Constants.MOD_ID, helper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider)
    {
        tag(Tags.Items.ARMORS)
                .add(ItemRegistry.RADIATION_SUIT_HELMET.get())
                .add(ItemRegistry.RADIATION_SUIT_HELMET_BROKEN.get())
                .add(ItemRegistry.RADIATION_SUIT_CHESTPLATE.get())
                .add(ItemRegistry.RADIATION_SUIT_CHESTPLATE_BROKEN.get())
                .add(ItemRegistry.RADIATION_SUIT_LEGGINGS.get())
                .add(ItemRegistry.RADIATION_SUIT_LEGGINGS_BROKEN.get())
                .add(ItemRegistry.RADIATION_SUIT_BOOTS.get())
                .add(ItemRegistry.RADIATION_SUIT_BOOTS_BROKEN.get());

        tag(Tags.Items.RAW_MATERIALS)
                .add(ItemRegistry.RAW_ALUMINIUM_CHUNK.get())
                .add(ItemRegistry.RAW_COPPER_CHUNK.get())
                .add(ItemRegistry.RAW_ENERGIZED_CHUNK.get())
                .add(ItemRegistry.RAW_IRIDIUM_CHUNK.get())
                .add(ItemRegistry.RAW_LEAD_CHUNK.get())
                .add(ItemRegistry.RAW_NICKEL_CHUNK.get())
                .add(ItemRegistry.RAW_PLATINUM_CHUNK.get())
                .add(ItemRegistry.RAW_SILVER_CHUNK.get())
                .add(ItemRegistry.RAW_TIN_CHUNK.get())
                .add(ItemRegistry.RAW_URANIUM_CHUNK.get());

        tag(Tags.Items.INGOTS)
                .add(ItemRegistry.ALUMINIUM_INGOT.get())
                .add(ItemRegistry.COPPER_INGOT.get())
                .add(ItemRegistry.ENERGIZED_INGOT.get())
                .add(ItemRegistry.IRIDIUM_INGOT.get())
                .add(ItemRegistry.LEAD_INGOT.get())
                .add(ItemRegistry.NICKEL_INGOT.get())
                .add(ItemRegistry.PLATINUM_INGOT.get())
                .add(ItemRegistry.SILVER_INGOT.get())
                .add(ItemRegistry.TIN_INGOT.get())
                .add(ItemRegistry.URANIUM_INGOT.get());

        tag(Tags.Items.ORES)
                .add(ItemRegistry.ALUMINIUM_ORE.get())
                .add(ItemRegistry.COPPER_ORE.get())
                .add(ItemRegistry.ENERGIZED_ORE.get())
                .add(ItemRegistry.IRIDIUM_ORE.get())
                .add(ItemRegistry.LEAD_ORE.get())
                .add(ItemRegistry.NICKEL_ORE.get())
                .add(ItemRegistry.PLATINUM_ORE.get())
                .add(ItemRegistry.SILVER_ORE.get())
                .add(ItemRegistry.TIN_ORE.get())
                .add(ItemRegistry.URANIUM_ORE.get())
                .add(ItemRegistry.DEEP_SLATE_ALUMINIUM_ORE.get())
                .add(ItemRegistry.DEEP_SLATE_COPPER_ORE.get())
                .add(ItemRegistry.DEEP_SLATE_ENERGIZED_ORE.get())
                .add(ItemRegistry.DEEP_SLATE_IRIDIUM_ORE.get())
                .add(ItemRegistry.DEEP_SLATE_LEAD_ORE.get())
                .add(ItemRegistry.DEEP_SLATE_NICKEL_ORE.get())
                .add(ItemRegistry.DEEP_SLATE_PLATINUM_ORE.get())
                .add(ItemRegistry.DEEP_SLATE_SILVER_ORE.get())
                .add(ItemRegistry.DEEP_SLATE_TIN_ORE.get())
                .add(ItemRegistry.DEEP_SLATE_URANIUM_ORE.get());

        tag(Tags.Items.NUGGETS)
                .add(ItemRegistry.ALUMINIUM_NUGGET.get())
                .add(ItemRegistry.COPPER_NUGGET.get())
                .add(ItemRegistry.ENERGIZED_NUGGET.get())
                .add(ItemRegistry.IRIDIUM_NUGGET.get())
                .add(ItemRegistry.LEAD_NUGGET.get())
                .add(ItemRegistry.NICKEL_NUGGET.get())
                .add(ItemRegistry.PLATINUM_NUGGET.get())
                .add(ItemRegistry.SILVER_NUGGET.get())
                .add(ItemRegistry.TIN_NUGGET.get())
                .add(ItemRegistry.URANIUM_NUGGET.get());
    }
}
