package net.dimidium.aboe.data;

import net.dimidium.aboe.handler.registry.BlockRegistry;
import net.dimidium.aboe.handler.registry.ItemRegistry;
import net.dimidium.aboe.util.Constants;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ABOELanguage extends LanguageProvider
{
    public ABOELanguage(PackOutput output, String locale)
    {
        super(output, Constants.MOD_ID, locale);
    }

    @Override
    protected void addTranslations()
    {
        add("enchantment." + Constants.MOD_ID + ".soulbound", "Soulbound");
        add("enchantment." + Constants.MOD_ID + ".soulbound.desc", "This enchantment will allow the item to be restored to your inventory upon death.");
        add("itemGroup." + Constants.MOD_ID + ".blocks", "ABOE: Blocks");
        add("itemGroup." + Constants.MOD_ID + ".items", "ABOE: Items");

        add(BlockRegistry.ALUMINIUM_ORE.get(), "Aluminium Ore");
        add(BlockRegistry.COPPER_ORE.get(), "Copper Ore");
        add(BlockRegistry.ENERGIZED_ORE.get(), "Energized Ore");
        add(BlockRegistry.IRIDIUM_ORE.get(), "Iridium Ore");
        add(BlockRegistry.LEAD_ORE.get(), "Lead Ore");
        add(BlockRegistry.NICKEL_ORE.get(), "Nickel Ore");
        add(BlockRegistry.PLATINUM_ORE.get(),"Platinum Ore");
        add(BlockRegistry.SILVER_ORE.get(),"Silver Ore");
        add(BlockRegistry.TIN_ORE.get(),"Tin Ore");
        add(BlockRegistry.URANIUM_ORE.get(),"Uranium Ore");
        add(BlockRegistry.DEEP_SLATE_ALUMINIUM_ORE.get(), "Deepslate Aluminium Ore"); 
        add(BlockRegistry.DEEP_SLATE_COPPER_ORE.get(),"Deepslate Copper Ore");
        add(BlockRegistry.DEEP_SLATE_ENERGIZED_ORE.get(),"Deepslate Energized Ore");
        add(BlockRegistry.DEEP_SLATE_IRIDIUM_ORE.get(),"Deepslate Iridium Ore");
        add(BlockRegistry.DEEP_SLATE_LEAD_ORE.get(),"Deepslate Lead Ore");
        add(BlockRegistry.DEEP_SLATE_NICKEL_ORE.get(),"Deepslate Nickel Ore");
        add(BlockRegistry.DEEP_SLATE_PLATINUM_ORE.get(),"Deepslate Platinum Ore");
        add(BlockRegistry.DEEP_SLATE_SILVER_ORE.get(),"Deepslate Silver Ore");
        add(BlockRegistry.DEEP_SLATE_TIN_ORE.get(),"Deepslate Tin Ore");
        add(BlockRegistry.DEEP_SLATE_URANIUM_ORE.get(),"Deepslate Uranium Ore");
        add(BlockRegistry.ALUMINIUM_BLOCK.get(), "Block of Aluminium");
        add(BlockRegistry.COPPER_BLOCK.get(), "Block Of Copper");
        add(BlockRegistry.ENERGIZED_BLOCK.get(), "Block Of Energized");
        add(BlockRegistry.IRIDIUM_BLOCK.get(), "Block Of Iridium");
        add(BlockRegistry.LEAD_BLOCK.get(), "Block Of Lead");
        add(BlockRegistry.NICKEL_BLOCK.get(), "Block Of Nickel");
        add(BlockRegistry.PLATINUM_BLOCK.get(), "Block Of Platinum");
        add(BlockRegistry.SILVER_BLOCK.get(), "Block Of Silver");
        add(BlockRegistry.TIN_BLOCK.get(), "Block Of Tin");
        add(BlockRegistry.URANIUM_BLOCK.get(), "Uranium Block");
        add(ItemRegistry.ALUMINIUM_GEAR.get(), "Aluminium Gear");
        add(ItemRegistry.COPPER_GEAR.get(), "Copper Gear");
        add(ItemRegistry.IRIDIUM_GEAR.get(), "Iridium Gear");
        add(ItemRegistry.LEAD_GEAR.get(), "Lead Gear");
        add(ItemRegistry.NICKEL_GEAR.get(), "Nickel Gear");
        add(ItemRegistry.PLATINUM_GEAR.get(), "Platinum Gear");
        add(ItemRegistry.SILVER_GEAR.get(), "Silver Gear");
        add(ItemRegistry.TIN_GEAR.get(), "Tin Gear");
        add(ItemRegistry.URANIUM_GEAR.get(), "Uranium Gear");

        add(ItemRegistry.ALUMINIUM_INGOT.get(), "Aluminium Ingot");
        add(ItemRegistry.COPPER_INGOT.get(), "Copper Ingot");
        add(ItemRegistry.IRIDIUM_INGOT.get(), "Iridium Ingot");
        add(ItemRegistry.LEAD_INGOT.get(), "Lead Ingot");
        add(ItemRegistry.NICKEL_INGOT.get(), "Nickel Ingot");
        add(ItemRegistry.PLATINUM_INGOT.get(), "Platinum Ingot");
        add(ItemRegistry.SILVER_INGOT.get(), "Silver Ingot");
        add(ItemRegistry.TIN_INGOT.get(), "Tin Ingot");
        add(ItemRegistry.URANIUM_INGOT.get(), "Uranium Ingot");

        add(ItemRegistry.ALUMINIUM_NUGGET.get(), "Aluminium Nugget");
        add(ItemRegistry.COPPER_NUGGET.get(), "Copper Nugget");
        add(ItemRegistry.IRIDIUM_NUGGET.get(), "Iridium Nugget");
        add(ItemRegistry.LEAD_NUGGET.get(), "Lead Nugget");
        add(ItemRegistry.NICKEL_NUGGET.get(), "Nickel Nugget");
        add(ItemRegistry.PLATINUM_NUGGET.get(), "Platinum Nugget");
        add(ItemRegistry.SILVER_NUGGET.get(), "Silver Nugget");
        add(ItemRegistry.TIN_NUGGET.get(), "Tin Nugget");
        add(ItemRegistry.URANIUM_NUGGET.get(), "Uranium Nugget");
        
        add(ItemRegistry.RAW_ALUMINIUM_CHUNK.get(), "Raw Aluminium Chunk");
        add(ItemRegistry.RAW_COPPER_CHUNK.get(), "Raw Copper Chunk");
        add(ItemRegistry.RAW_ENERGIZED_CHUNK.get(), "Raw Energized Chunk");
        add(ItemRegistry.RAW_IRIDIUM_CHUNK.get(), "Raw Iridium Chunk");
        add(ItemRegistry.RAW_LEAD_CHUNK.get(), "Raw Lead Chunk");
        add(ItemRegistry.RAW_NICKEL_CHUNK.get(), "Raw Nickel Chunk");
        add(ItemRegistry.RAW_PLATINUM_CHUNK.get(), "Raw Platinum Chunk");
        add(ItemRegistry.RAW_SILVER_CHUNK.get(), "Raw Silver Chunk");
        add(ItemRegistry.RAW_TIN_CHUNK.get(), "Raw Tin Chunk");
        add(ItemRegistry.RAW_URANIUM_CHUNK.get(), "Raw Uranium Chunk");

        add(ItemRegistry.RADIATION_SUIT_HELMET.get(), "Radiation Suit Helmet");
        add(ItemRegistry.RADIATION_SUIT_CHESTPLATE.get(), "Radiation Suit Chestplate");
        add(ItemRegistry.RADIATION_SUIT_LEGGINGS.get(), "Radiation Suit Leggings");
        add(ItemRegistry.RADIATION_SUIT_BOOTS.get(), "Radiation Suit Boots");
        add(ItemRegistry.RADIATION_SUIT_HELMET_BROKEN.get(), "Broken Radiation Suit Helmet");
        add(ItemRegistry.RADIATION_SUIT_CHESTPLATE_BROKEN.get(), "Broken Radiation Suit Chestplate");
        add(ItemRegistry.RADIATION_SUIT_LEGGINGS_BROKEN.get(), "Broken Radiation Suit Leggings");
        add(ItemRegistry.RADIATION_SUIT_BOOTS_BROKEN.get(), "Broken Radiation Suit Boots");

        add(ItemRegistry.LIQUID_EXPERIENCE_BUCKET.get(), "Liquid Experience Bucket");
        add(ItemRegistry.MOLTEN_ALUMINIUM_BUCKET.get(), "Molten Aluminium Bucket");
        add(ItemRegistry.MOLTEN_COPPER_BUCKET.get(), "Molten Copper Bucket");
        add(ItemRegistry.MOLTEN_ENERGIZED_BUCKET.get(), "Molten Energized Bucket");
        add(ItemRegistry.MOLTEN_IRIDIUM_BUCKET.get(), "Molten Iridium Bucket");
        add(ItemRegistry.MOLTEN_LEAD_BUCKET.get(), "Molten Lead Bucket");
        add(ItemRegistry.MOLTEN_NICKEL_BUCKET.get(), "Molten Nickel Bucket");
        add(ItemRegistry.MOLTEN_SILVER_BUCKET.get(), "Molten Silver Bucket");
        add(ItemRegistry.MOLTEN_TIN_BUCKET.get(), "Molten Tin Bucket");
        add(ItemRegistry.MOLTEN_URANIUM_BUCKET.get(), "Molten Uranium Bucket");
    }
}
