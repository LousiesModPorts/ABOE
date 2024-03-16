package net.dimidium.aboe.data;

import net.dimidium.aboe.handler.registry.BlockRegistry;
import net.dimidium.aboe.handler.registry.ItemRegistry;
import net.dimidium.aboe.util.Constants;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ABOEModels extends ItemModelProvider
{
    public ABOEModels(PackOutput output, ExistingFileHelper existingFileHelper)
    {
        super(output, Constants.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels()
    {
        withExistingParent(BlockRegistry.ALUMINIUM_ORE.getId().getPath(), modLoc("block/aluminium_ore"));
        withExistingParent(BlockRegistry.COPPER_ORE.getId().getPath(),  modLoc("block/copper_ore"));
        withExistingParent(BlockRegistry.ENERGIZED_ORE.getId().getPath(), modLoc("block/energized_ore"));
        withExistingParent(BlockRegistry.IRIDIUM_ORE.getId().getPath(), modLoc("block/iridium_ore"));
        withExistingParent(BlockRegistry.LEAD_ORE.getId().getPath(),   modLoc("block/lead_ore"));
        withExistingParent(BlockRegistry.NICKEL_ORE.getId().getPath(),  modLoc("block/nickel_ore"));
        withExistingParent(BlockRegistry.PLATINUM_ORE.getId().getPath(), modLoc("block/platinum_ore"));
        withExistingParent(BlockRegistry.SILVER_ORE.getId().getPath(),  modLoc("block/silver_ore"));
        withExistingParent(BlockRegistry.TIN_ORE.getId().getPath(),  modLoc("block/tin_ore"));
        withExistingParent(BlockRegistry.URANIUM_ORE.getId().getPath(),  modLoc("block/uranium_ore"));
        withExistingParent(BlockRegistry.DEEP_SLATE_ALUMINIUM_ORE.getId().getPath(),  modLoc("block/deepslate_aluminium_ore"));
        withExistingParent(BlockRegistry.DEEP_SLATE_COPPER_ORE.getId().getPath(), modLoc("block/deepslate_copper_ore"));
        withExistingParent(BlockRegistry.DEEP_SLATE_ENERGIZED_ORE.getId().getPath(), modLoc("block/deepslate_energized_ore"));
        withExistingParent(BlockRegistry.DEEP_SLATE_IRIDIUM_ORE.getId().getPath(), modLoc("block/deepslate_iridium_ore"));
        withExistingParent(BlockRegistry.DEEP_SLATE_LEAD_ORE.getId().getPath(), modLoc("block/deepslate_lead_ore"));
        withExistingParent(BlockRegistry.DEEP_SLATE_NICKEL_ORE.getId().getPath(), modLoc("block/deepslate_nickel_ore"));
        withExistingParent(BlockRegistry.DEEP_SLATE_PLATINUM_ORE.getId().getPath(), modLoc("block/deepslate_platinum_ore"));
        withExistingParent(BlockRegistry.DEEP_SLATE_SILVER_ORE.getId().getPath(), modLoc("block/deepslate_silver_ore"));
        withExistingParent(BlockRegistry.DEEP_SLATE_TIN_ORE.getId().getPath(), modLoc("block/deepslate_tin_ore"));
        withExistingParent(BlockRegistry.DEEP_SLATE_URANIUM_ORE.getId().getPath(), modLoc("block/deepslate_uranium_ore"));
        withExistingParent(BlockRegistry.ALUMINIUM_BLOCK.getId().getPath(), modLoc("block/aluminium_block"));
        withExistingParent(BlockRegistry.COPPER_BLOCK.getId().getPath(), modLoc("block/copper_block"));
        withExistingParent(BlockRegistry.ENERGIZED_BLOCK.getId().getPath(), modLoc("block/energized_block"));
        withExistingParent(BlockRegistry.IRIDIUM_BLOCK.getId().getPath(), modLoc("block/iridium_block"));
        withExistingParent(BlockRegistry.LEAD_BLOCK.getId().getPath(), modLoc("block/lead_block"));
        withExistingParent(BlockRegistry.NICKEL_BLOCK.getId().getPath(), modLoc("block/nickel_block"));
        withExistingParent(BlockRegistry.PLATINUM_BLOCK.getId().getPath(), modLoc("block/platinum_block"));
        withExistingParent(BlockRegistry.SILVER_BLOCK.getId().getPath(), modLoc("block/silver_block"));
        withExistingParent(BlockRegistry.TIN_BLOCK.getId().getPath(), modLoc("block/tin_block"));
        withExistingParent(BlockRegistry.URANIUM_BLOCK.getId().getPath(), modLoc("block/uranium_block"));
        withExistingParent(BlockRegistry.MINETOPIA_PORTAL_FRAME.getId().getPath(), modLoc("block/minetopia_portal_frame"));
        withExistingParent(BlockRegistry.VOID_PORTAL_FRAME.getId().getPath(), modLoc("block/void_portal_frame"));

        singleTexture(ItemRegistry.ALUMINIUM_GEAR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/aluminium_gear"));
        singleTexture(ItemRegistry.COPPER_GEAR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/copper_gear"));
        singleTexture(ItemRegistry.ENERGIZED_GEAR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/energized_gear"));
        singleTexture(ItemRegistry.IRIDIUM_GEAR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/iridium_gear"));
        singleTexture(ItemRegistry.LEAD_GEAR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/lead_gear"));
        singleTexture(ItemRegistry.NICKEL_GEAR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/nickel_gear"));
        singleTexture(ItemRegistry.PLATINUM_GEAR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/platinum_gear"));
        singleTexture(ItemRegistry.SILVER_GEAR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/silver_gear"));
        singleTexture(ItemRegistry.TIN_GEAR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/tin_gear"));
        singleTexture(ItemRegistry.URANIUM_GEAR.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/uranium_gear"));
        singleTexture(ItemRegistry.ALUMINIUM_INGOT.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/aluminium_ingot"));
        singleTexture(ItemRegistry.COPPER_INGOT.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/copper_ingot"));
        singleTexture(ItemRegistry.ENERGIZED_INGOT.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/energized_ingot"));
        singleTexture(ItemRegistry.IRIDIUM_INGOT.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/iridium_ingot"));
        singleTexture(ItemRegistry.LEAD_INGOT.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/lead_ingot"));
        singleTexture(ItemRegistry.NICKEL_INGOT.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/nickel_ingot"));
        singleTexture(ItemRegistry.PLATINUM_INGOT.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/platinum_ingot"));
        singleTexture(ItemRegistry.SILVER_INGOT.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/silver_ingot"));
        singleTexture(ItemRegistry.TIN_INGOT.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/tin_ingot"));
        singleTexture(ItemRegistry.URANIUM_INGOT.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/uranium_ingot"));
        singleTexture(ItemRegistry.ALUMINIUM_NUGGET.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/aluminium_nugget"));
        singleTexture(ItemRegistry.COPPER_NUGGET.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/copper_nugget"));
        singleTexture(ItemRegistry.ENERGIZED_NUGGET.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/energized_nugget"));
        singleTexture(ItemRegistry.IRIDIUM_NUGGET.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/iridium_nugget"));
        singleTexture(ItemRegistry.LEAD_NUGGET.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/lead_nugget"));
        singleTexture(ItemRegistry.NICKEL_NUGGET.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/nickel_nugget"));
        singleTexture(ItemRegistry.PLATINUM_NUGGET.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/platinum_nugget"));
        singleTexture(ItemRegistry.SILVER_NUGGET.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/silver_nugget"));
        singleTexture(ItemRegistry.TIN_NUGGET.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/tin_nugget"));
        singleTexture(ItemRegistry.URANIUM_NUGGET.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/uranium_nugget"));
        singleTexture(ItemRegistry.RAW_ALUMINIUM_CHUNK.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/raw_aluminium_chunk"));
        singleTexture(ItemRegistry.RAW_COPPER_CHUNK.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/raw_copper_chunk"));
        singleTexture(ItemRegistry.RAW_ENERGIZED_CHUNK.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/raw_energized_chunk"));
        singleTexture(ItemRegistry.RAW_IRIDIUM_CHUNK.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/raw_iridium_chunk"));
        singleTexture(ItemRegistry.RAW_LEAD_CHUNK.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/raw_lead_chunk"));
        singleTexture(ItemRegistry.RAW_NICKEL_CHUNK.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/raw_nickel_chunk"));
        singleTexture(ItemRegistry.RAW_PLATINUM_CHUNK.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/raw_platinum_chunk"));
        singleTexture(ItemRegistry.RAW_SILVER_CHUNK.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/raw_silver_chunk"));
        singleTexture(ItemRegistry.RAW_TIN_CHUNK.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/raw_tin_chunk"));
        singleTexture(ItemRegistry.RAW_URANIUM_CHUNK.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/raw_uranium_chunk"));
        singleTexture(ItemRegistry.RADIATION_SUIT_HELMET.getId().getPath(), mcLoc("item/generated"), "layer0", mcLoc("item/iron_helmet"));
        singleTexture(ItemRegistry.RADIATION_SUIT_CHESTPLATE.getId().getPath(), mcLoc("item/generated"), "layer0", mcLoc("item/iron_chestplate"));
        singleTexture(ItemRegistry.RADIATION_SUIT_LEGGINGS.getId().getPath(), mcLoc("item/generated"), "layer0", mcLoc("item/iron_leggings"));
        singleTexture(ItemRegistry.RADIATION_SUIT_BOOTS.getId().getPath(), mcLoc("item/generated"), "layer0", mcLoc("item/iron_boots"));
        singleTexture(ItemRegistry.RADIATION_SUIT_HELMET_BROKEN.getId().getPath(), mcLoc("item/generated"), "layer0", mcLoc("item/iron_helmet"));
        singleTexture(ItemRegistry.RADIATION_SUIT_CHESTPLATE_BROKEN.getId().getPath(), mcLoc("item/generated"), "layer0", mcLoc("item/iron_chestplate"));
        singleTexture(ItemRegistry.RADIATION_SUIT_LEGGINGS_BROKEN.getId().getPath(), mcLoc("item/generated"), "layer0", mcLoc("item/iron_leggings"));
        singleTexture(ItemRegistry.RADIATION_SUIT_BOOTS_BROKEN.getId().getPath(), mcLoc("item/generated"), "layer0", mcLoc("item/iron_boots"));singleTexture(ItemRegistry.MOLTEN_ALUMINIUM_BUCKET.getId().getPath(), mcLoc("item/generated"), "layer0", mcLoc("item/water_bucket"));
        singleTexture(ItemRegistry.MOLTEN_COPPER_BUCKET.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/water_bucket"));
        singleTexture(ItemRegistry.MOLTEN_ENERGIZED_BUCKET.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/water_bucket"));
        singleTexture(ItemRegistry.MOLTEN_IRIDIUM_BUCKET.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/water_bucket"));
        singleTexture(ItemRegistry.MOLTEN_LEAD_BUCKET.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/water_bucket"));
        singleTexture(ItemRegistry.MOLTEN_NICKEL_BUCKET.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/water_bucket"));
        singleTexture(ItemRegistry.MOLTEN_PLATINUM_BUCKET.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/water_bucket"));
        singleTexture(ItemRegistry.MOLTEN_SILVER_BUCKET.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/water_bucket"));
        singleTexture(ItemRegistry.MOLTEN_TIN_BUCKET.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/water_bucket"));
        singleTexture(ItemRegistry.MOLTEN_URANIUM_BUCKET.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/water_bucket"));
        singleTexture(ItemRegistry.LIQUID_EXPERIENCE_BUCKET.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/liquid_experience_bucket"));

        singleTexture(ItemRegistry.BEGINNER_ENERGIZED_AXE.getId().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/diamond_axe"));
        singleTexture(ItemRegistry.INTERMEDIATE_ENERGIZED_AXE.getId().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/diamond_axe"));
        singleTexture(ItemRegistry.ADVANCED_ENERGIZED_AXE.getId().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/diamond_axe"));
        singleTexture(ItemRegistry.EXPERT_ENERGIZED_AXE.getId().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/diamond_axe"));
        singleTexture(ItemRegistry.BEGINNER_ENERGIZED_HOE.getId().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/diamond_hoe"));
        singleTexture(ItemRegistry.INTERMEDIATE_ENERGIZED_HOE.getId().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/diamond_hoe"));
        singleTexture(ItemRegistry.ADVANCED_ENERGIZED_HOE.getId().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/diamond_hoe"));
        singleTexture(ItemRegistry.EXPERT_ENERGIZED_HOE.getId().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/diamond_hoe"));
        singleTexture(ItemRegistry.BEGINNER_ENERGIZED_PICKAXE.getId().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/diamond_pickaxe"));
        singleTexture(ItemRegistry.INTERMEDIATE_ENERGIZED_PICKAXE.getId().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/diamond_pickaxe"));
        singleTexture(ItemRegistry.ADVANCED_ENERGIZED_PICKAXE.getId().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/diamond_pickaxe"));
        singleTexture(ItemRegistry.EXPERT_ENERGIZED_PICKAXE.getId().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/diamond_pickaxe"));
        singleTexture(ItemRegistry.BEGINNER_ENERGIZED_SHOVEL.getId().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/diamond_shovel"));
        singleTexture(ItemRegistry.INTERMEDIATE_ENERGIZED_SHOVEL.getId().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/diamond_shovel"));
        singleTexture(ItemRegistry.ADVANCED_ENERGIZED_SHOVEL.getId().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/diamond_shovel"));
        singleTexture(ItemRegistry.EXPERT_ENERGIZED_SHOVEL.getId().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/diamond_shovel"));
        singleTexture(ItemRegistry.BEGINNER_ENERGIZED_SWORD.getId().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/diamond_sword"));
        singleTexture(ItemRegistry.INTERMEDIATE_ENERGIZED_SWORD.getId().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/diamond_sword"));
        singleTexture(ItemRegistry.ADVANCED_ENERGIZED_SWORD.getId().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/diamond_sword"));
        singleTexture(ItemRegistry.EXPERT_ENERGIZED_SWORD.getId().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/diamond_sword"));
    }
}
