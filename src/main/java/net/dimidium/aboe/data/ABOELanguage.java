package net.dimidium.aboe.data;

import net.dimidium.aboe.handler.registry.BlockRegistry;
import net.dimidium.aboe.handler.registry.ItemRegistry;
import net.dimidium.aboe.util.Constants;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

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
        add(BlockRegistry.DISPLAY_PEDESTAL.get(), "Display Pedestal");
        add(BlockRegistry.MINETOPIA_PORTAL.get(), "Minetopia Portal");
        add(BlockRegistry.MINETOPIA_PORTAL_FRAME.get(), "Minetopia Portal Frame");
        add(BlockRegistry.VOID_PORTAL.get(), "Void Portal");
        add(BlockRegistry.VOID_PORTAL_FRAME.get(), "Void Portal Frame");

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

       /* add(ItemRegistry.RADIATION_SUIT_HELMET.get(), "Radiation Suit Helmet");
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
        //add(ItemRegistry.VOID_KEY.get(), "Void Key");
        //add(ItemRegistry.MINETOPIA_KEY.get(), "Minetopia Key");*/
        add(ItemRegistry.BEGINNER_ENERGIZED_AXE.get(), "Beginner Energized Axe");
        add(ItemRegistry.INTERMEDIATE_ENERGIZED_AXE.get(), "Intermediate Energized Axe");
        add(ItemRegistry.ADVANCED_ENERGIZED_AXE.get(), "Advanced Energized Axe");
        add(ItemRegistry.EXPERT_ENERGIZED_AXE.get(), "Expert Energized Axe");
        add(ItemRegistry.BEGINNER_ENERGIZED_BOW.get(), "Beginner Energized Bow");
        add(ItemRegistry.INTERMEDIATE_ENERGIZED_BOW.get(), "Intermediate Energized Bow");
        add(ItemRegistry.ADVANCED_ENERGIZED_BOW.get(), "Advanced Energized Bow");
        add(ItemRegistry.EXPERT_ENERGIZED_BOW.get(), "Expert Energized Bow");
        add(ItemRegistry.BEGINNER_ENERGIZED_HOE.get(), "Beginner Energized Hoe");
        add(ItemRegistry.INTERMEDIATE_ENERGIZED_HOE.get(), "Intermediate Energized Hoe");
        add(ItemRegistry.ADVANCED_ENERGIZED_HOE.get(), "Advanced Energized Hoe");
        add(ItemRegistry.EXPERT_ENERGIZED_HOE.get(), "Expert Energized Hoe");
        //add(ItemRegistry.BEGINNER_ENERGIZED_MULTITOOL.get(), "Beginner Energized Multi-Tool");
        //add(ItemRegistry.INTERMEDIATE_ENERGIZED_MULTITOOL.get(), "Intermediate Energized Multi-Tool");
        //add(ItemRegistry.ADVANCED_ENERGIZED_MULTITOOL.get(), "Advanced Energized Multi-Tool");
        //add(ItemRegistry.EXPERT_ENERGIZED_MULTITOOL.get(), "Expert Energized Multi-Tool");
        add(ItemRegistry.BEGINNER_ENERGIZED_PICKAXE.get(), "Beginner Energized Pickaxe");
        add(ItemRegistry.INTERMEDIATE_ENERGIZED_PICKAXE.get(), "Intermediate Energized Pickaxe");
        add(ItemRegistry.ADVANCED_ENERGIZED_PICKAXE.get(), "Advanced Energized Pickaxe");
        add(ItemRegistry.EXPERT_ENERGIZED_PICKAXE.get(), "Expert Energized Pickaxe");
        add(ItemRegistry.BEGINNER_ENERGIZED_SHOVEL.get(), "Beginner Energized Pickaxe");
        add(ItemRegistry.INTERMEDIATE_ENERGIZED_SHOVEL.get(), "Intermediate Energized Shovel");
        add(ItemRegistry.ADVANCED_ENERGIZED_SHOVEL.get(), "Advanced Energized Shovel");
        add(ItemRegistry.EXPERT_ENERGIZED_SHOVEL.get(), "Expert Energized Shovel");
        add(ItemRegistry.BEGINNER_ENERGIZED_SWORD.get(), "Beginner Energized Sword");
        add(ItemRegistry.INTERMEDIATE_ENERGIZED_SWORD.get(), "Intermediate Energized Sword");
        add(ItemRegistry.ADVANCED_ENERGIZED_SWORD.get(), "Advanced Energized Sword");
        add(ItemRegistry.EXPERT_ENERGIZED_SWORD.get(), "Expert Energized Sword");
        /*add(ItemRegistry.BEGINNER_ENERGIZED_DRILL.get(), "Beginner Energized Drill");
        add(ItemRegistry.INTERMEDIATE_ENERGIZED_DRILL.get(), "Intermediate Energized Drill");
        add(ItemRegistry.ADVANCED_ENERGIZED_DRILL.get(), "Advanced Energized Drill");
        add(ItemRegistry.EXPERT_ENERGIZED_DRILL.get(), "Expert Energized Drill");
        add(ItemRegistry.BEGINNER_ENERGY_SHIELD.get(), "Beginner Energy Shield");
        add(ItemRegistry.INTERMEDIATE_ENERGY_SHIELD.get(), "Intermediate Energy Shield");
        add(ItemRegistry.ADVANCED_ENERGY_SHIELD.get(), "Advanced Energy Shield");
        add(ItemRegistry.EXPERT_ENERGY_SHIELD.get(), "Expert Energy Shield");
        add(ItemRegistry.BEGINNER_HEALTH_BOOSTER.get(), "Beginner Health Booster");
        add(ItemRegistry.INTERMEDIATE_HEALTH_BOOSTER.get(), "Intermediate Health Booster");
        add(ItemRegistry.ADVANCED_HEALTH_BOOSTER.get(), "Advanced Health Booster");
        add(ItemRegistry.EXPERT_HEALTH_BOOSTER.get(), "Expert Health Booster");
        add(ItemRegistry.BEGINNER_ENERGIZED_WRENCH.get(), "Beginner Energized Wrench");
        add(ItemRegistry.INTERMEDIATE_ENERGIZED_WRENCH.get(), "Intermediate Energized Wrench");
        add(ItemRegistry.ADVANCED_ENERGIZED_WRENCH.get(), "Advanced Energized Wrench");
        add(ItemRegistry.EXPERT_ENERGIZED_WRENCH.get(), "Expert Energized Wrench");
        add(ItemRegistry.BEGINNER_ENERGIZED_HELMET.get(), "Beginner Energized Helmet");
        add(ItemRegistry.INTERMEDIATE_ENERGIZED_HELMET.get(), "Intermediate Energized Helmet");
        add(ItemRegistry.ADVANCED_ENERGIZED_HELMET.get(), "Advanced Energized Helmet");
        add(ItemRegistry.EXPERT_ENERGIZED_HELMET.get(), "Expert Energized Helmet");
        add(ItemRegistry.BEGINNER_ENERGIZED_CHESTPLATE.get(), "Beginner Energized Chestplate");
        add(ItemRegistry.INTERMEDIATE_ENERGIZED_CHESTPLATE.get(), "Intermediate Energized Chestplate");
        add(ItemRegistry.ADVANCED_ENERGIZED_CHESTPLATE.get(), "Advanced Energized Chestplate");
        add(ItemRegistry.EXPERT_ENERGIZED_CHESTPLATE.get(), "Expert Energized Chestplate");
        add(ItemRegistry.BEGINNER_ENERGIZED_LEGGINGS.get(), "Beginner Energized Leggings");
        add(ItemRegistry.INTERMEDIATE_ENERGIZED_LEGGINGS.get(), "Intermediate Energized Leggings");
        add(ItemRegistry.ADVANCED_ENERGIZED_LEGGINGS.get(), "Advanced Energized Leggings");
        add(ItemRegistry.EXPERT_ENERGIZED_LEGGINGS.get(), "Expert Energized Leggings");
        add(ItemRegistry.BEGINNER_ENERGIZED_BOOTS.get(), "Beginner Energized Boots");
        add(ItemRegistry.INTERMEDIATE_ENERGIZED_BOOTS.get(), "Intermediate Energized Boots");
        add(ItemRegistry.ADVANCED_ENERGIZED_BOOTS.get(), "Advanced Energized Boots");
        add(ItemRegistry.EXPERT_ENERGIZED_BOOTS.get(), "Expert Energized Boots");
        add(ItemRegistry.ANTI_RAD.get(), "Anti Rad");
        //todo heal module
        add(ItemRegistry.SPEED_MODULE.get(), "Speed Module");
        add(ItemRegistry.JUMP_MODULE.get(), "Jump Module");
        add(ItemRegistry.STEP_MODULE.get(), "Step Module");
        add(ItemRegistry.FEED_MODULE.get(), "Feed Module");
        add(ItemRegistry.RUBBER.get(), "Rubber");*/

        //todo below

        /*add(ItemRegistry.BEGINNER_ABSORPTION_RING.get(), "Beginner Absorption Ring");
        add(ItemRegistry.INTERMEDIATE_ABSORPTION_RING.get(), "Intermediate Absorption Ring");
        add(ItemRegistry.ADVANCED_ABSORPTION_RING.get(), "Advanced Absorption Ring");
        add(ItemRegistry.EXPERT_ABSORPTION_RING.get(), "Expert Absorption Ring");
        add(ItemRegistry.BEGINNER_BREEDING_RING.get(), "Beginner Breeding Ring");
        add(ItemRegistry.INTERMEDIATE_BREEDING_RING.get(), "Intermediate Breeding Ring");
        add(ItemRegistry.ADVANCED_BREEDING_RING.get(), "Advanced Breeding Ring");
        add(ItemRegistry.EXPERT_BREEDING_RING.get(), "Expert Breeding Ring");
        add(ItemRegistry.BEGINNER_ENTITY_PULLER_RING.get(), "Beginner Entity Puller Ring");
        add(ItemRegistry.INTERMEDIATE_ENTITY_PULLER_RING.get(), "Advanced Entity Puller Ring");
        add(ItemRegistry.ADVANCED_ENTITY_PULLER_RING.get(), "Advanced Entity Puller Ring");
        add(ItemRegistry.EXPERT_ENTITY_PULLER_RING.get(), "Expert Entity Puller Ring");
        add(ItemRegistry.BEGINNER_FIRE_RING.get(), "Beginner Fire Ring");
        add(ItemRegistry.INTERMEDIATE_FIRE_RING.get(), "Intermediate Fire Ring");
        add(ItemRegistry.ADVANCED_FIRE_RING.get(), "Advanced Fire Ring");
        add(ItemRegistry.EXPERT_FIRE_RING.get(), "Expert Fire Ring");
        add(ItemRegistry.BEGINNER_FLIGHT_RING.get(), "Beginner Flight Ring");
        add(ItemRegistry.INTERMEDIATE_FLIGHT_RING.get(), "Intermediate Flight Ring");
        add(ItemRegistry.ADVANCED_FLIGHT_RING.get(), "Advanced Flight Ring");
        add(ItemRegistry.EXPERT_FLIGHT_RING.get(), "Expert Flight Ring");
        add(ItemRegistry.BEGINNER_FREEZE_RING.get(), "Beginner Freeze Ring");
        add(ItemRegistry.INTERMEDIATE_FREEZE_RING.get(), "Intermediate Freeze Ring");
        add(ItemRegistry.ADVANCED_FREEZE_RING.get(), "Intermediate Freeze Ring");
        add(ItemRegistry.EXPERT_FREEZE_RING.get(), "Expert Freeze Ring");
        add(ItemRegistry.BEGINNER_GREEN_THUMB_RING.get(), "Beginner Green Thumb Ring");
        add(ItemRegistry.INTERMEDIATE_GREEN_THUMB_RING.get(), "Intermediate Green Thumb Ring");
        add(ItemRegistry.ADVANCED_GREEN_THUMB_RING.get(), "Advanced Green Thumb Ring");
        add(ItemRegistry.EXPERT_GREEN_THUMB_RING.get(), "Expert Green Thumb Ring");
        add(ItemRegistry.BEGINNER_HASTE_RING.get(), "Beginner Haste Ring");
        add(ItemRegistry.INTERMEDIATE_HASTE_RING.get(), "Intermediate Haste Ring");
        add(ItemRegistry.ADVANCED_HASTE_RING.get(), "Advanced Haste Ring");
        add(ItemRegistry.EXPERT_HASTE_RING.get(), "Expert Haste Ring");
        add(ItemRegistry.BEGINNER_HEALTH_RING.get(), "Beginner Health Ring");
        add(ItemRegistry.INTERMEDIATE_HEALTH_RING.get(), "Intermediate Health Ring");
        add(ItemRegistry.ADVANCED_HEALTH_RING.get(), "Advanced Health Ring");
        add(ItemRegistry.EXPERT_HEALTH_RING.get(), "Expert Health Ring");
        add(ItemRegistry.BEGINNER_MAGNETIZATION_RING.get(), "Beginner Magnetization Ring");
        add(ItemRegistry.INTERMEDIATE_MAGNETIZATION_RING.get(), "Intermediate Magnetization Ring");
        add(ItemRegistry.ADVANCED_MAGNETIZATION_RING.get(), "Advanced Magnetization Ring");
        add(ItemRegistry.EXPERT_MAGNETIZATION_RING.get(), "Expert Magnetization Ring");
        add(ItemRegistry.BEGINNER_REGENERATION_RING.get(), "Beginner Regeneration Ring");
        add(ItemRegistry.INTERMEDIATE_REGENERATION_RING.get(), "Intermediate Regeneration Ring");
        add(ItemRegistry.ADVANCED_REGENERATION_RING.get(), "Advanced Regeneration Ring");
        add(ItemRegistry.EXPERT_REGENERATION_RING.get(), "Expert Regeneration Ring");
        add(ItemRegistry.BEGINNER_RESISTANCE_RING.get(), "Beginner Resistance Ring");
        add(ItemRegistry.INTERMEDIATE_RESISTANCE_RING.get(), "Intermediate Resistance Ring");
        add(ItemRegistry.ADVANCED_RESISTANCE_RING.get(), "Advanced Resistance Ring");
        add(ItemRegistry.EXPERT_RESISTANCE_RING.get(), "Expert Resistance Ring");
        add(ItemRegistry.BEGINNER_SATURATION_RING.get(), "Beginner Saturation Ring");
        add(ItemRegistry.INTERMEDIATE_SATURATION_RING.get(), "Intermediate Saturation Ring");
        add(ItemRegistry.ADVANCED_SATURATION_RING.get(), "Advanced Saturation Ring");
        add(ItemRegistry.EXPERT_SATURATION_RING.get(), "Expert Saturation Ring");
        add(ItemRegistry.BEGINNER_STEP_ASSIST_RING.get(), "Beginner Step Assist Ring");
        add(ItemRegistry.INTERMEDIATE_STEP_ASSIST_RING.get(), "Intermediate Step Assist Ring");
        add(ItemRegistry.ADVANCED_STEP_ASSIST_RING.get(), "Advanced Step Assist Ring");
        add(ItemRegistry.EXPERT_STEP_ASSIST_RING.get(), "Expert Step Assist Ring");
        add(ItemRegistry.BEGINNER_STRENGTH_RING.get(), "Beginner Strength Ring");
        add(ItemRegistry.INTERMEDIATE_STRENGTH_RING.get(), "Intermediate Strength Ring");
        add(ItemRegistry.ADVANCED_STRENGTH_RING.get(), "Advanced Strength Ring");
        add(ItemRegistry.EXPERT_STRENGTH_RING.get(), "Expert Strength Ring");*/

        add("item.speed_module_desc", "When activated and in a valid armor piece, it will give you a speed boost!");
        add("item.jump_module_desc", "When activated and in a valid armor piece, it will give you a jump boost!");
        add("item.step_module_desc", "When activated and in a valid armor piece, it will give you a step boost!");
        add("item.feed_module_desc", "When activated and in a valid armor piece, it will automatically fill your hunger and saturation!");
    }
}
