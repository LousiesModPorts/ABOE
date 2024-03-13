package net.dimidium.aboe.handler.registry;

import net.dimidium.aboe.item.*;
import net.dimidium.aboe.item.armor.material.ABOEArmorMaterials;
import net.dimidium.aboe.item.armor.radsuit.BrokenRadiationSuit;
import net.dimidium.aboe.item.armor.radsuit.RadiationSuitBase;
import net.dimidium.aboe.util.Constants;
import net.dimidium.dimidiumcore.api.item.ItemBase;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry 
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Constants.MOD_ID);

    public static final RegistryObject<Item> ALUMINIUM_ORE = ITEMS.register("aluminium_ore", () -> new BlockItem(BlockRegistry.ALUMINIUM_ORE.get(), new Item.Properties()));
    public static final RegistryObject<Item> COPPER_ORE = ITEMS.register("copper_ore", () -> new BlockItem(BlockRegistry.COPPER_ORE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ENERGIZED_ORE = ITEMS.register("energized_ore", () -> new BlockItem(BlockRegistry.ENERGIZED_ORE.get(), new Item.Properties()));
    public static final RegistryObject<Item> IRIDIUM_ORE = ITEMS.register("iridium_ore", () -> new BlockItem(BlockRegistry.IRIDIUM_ORE.get(), new Item.Properties()));
    public static final RegistryObject<Item> LEAD_ORE = ITEMS.register("lead_ore", () -> new BlockItem(BlockRegistry.LEAD_ORE.get(), new Item.Properties()));
    public static final RegistryObject<Item> NICKEL_ORE = ITEMS.register("nickel_ore", () -> new BlockItem(BlockRegistry.NICKEL_ORE.get(), new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_ORE = ITEMS.register("platinum_ore", () -> new BlockItem(BlockRegistry.PLATINUM_ORE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILVER_ORE = ITEMS.register("silver_ore", () -> new BlockItem(BlockRegistry.SILVER_ORE.get(), new Item.Properties()));
    public static final RegistryObject<Item> TIN_ORE = ITEMS.register("tin_ore", () -> new BlockItem(BlockRegistry.TIN_ORE.get(), new Item.Properties()));

    //TODO Block item Uranium
    public static final RegistryObject<Item> URANIUM_ORE = ITEMS.register("uranium_ore", () -> new BlockItem(BlockRegistry.URANIUM_ORE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEEP_SLATE_ALUMINIUM_ORE = ITEMS.register("deepslate_aluminium_ore", () -> new BlockItem(BlockRegistry.DEEP_SLATE_ALUMINIUM_ORE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEEP_SLATE_COPPER_ORE = ITEMS.register("deepslate_copper_ore", () -> new BlockItem(BlockRegistry.DEEP_SLATE_COPPER_ORE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEEP_SLATE_ENERGIZED_ORE = ITEMS.register("deepslate_energized_ore", () -> new BlockItem(BlockRegistry.DEEP_SLATE_ENERGIZED_ORE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEEP_SLATE_IRIDIUM_ORE = ITEMS.register("deepslate_iridium_ore", () -> new BlockItem(BlockRegistry.DEEP_SLATE_IRIDIUM_ORE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEEP_SLATE_LEAD_ORE = ITEMS.register("deepslate_lead_ore", () -> new BlockItem(BlockRegistry.DEEP_SLATE_LEAD_ORE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEEP_SLATE_NICKEL_ORE = ITEMS.register("deepslate_nickel_ore", () -> new BlockItem(BlockRegistry.DEEP_SLATE_NICKEL_ORE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEEP_SLATE_PLATINUM_ORE = ITEMS.register("deepslate_platinum_ore", () -> new BlockItem(BlockRegistry.DEEP_SLATE_PLATINUM_ORE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEEP_SLATE_SILVER_ORE = ITEMS.register("deepslate_silver_ore", () -> new BlockItem(BlockRegistry.DEEP_SLATE_SILVER_ORE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEEP_SLATE_TIN_ORE = ITEMS.register("deepslate_tin_ore", () -> new BlockItem(BlockRegistry.DEEP_SLATE_TIN_ORE.get(), new Item.Properties()));

    //TODO Block item Uranium
    public static final RegistryObject<Item> DEEP_SLATE_URANIUM_ORE = ITEMS.register("deepslate_uranium_ore", () -> new BlockItem(BlockRegistry.DEEP_SLATE_URANIUM_ORE.get(), new Item.Properties()));

    /* ITEMS */

    public static final RegistryObject<Item> ALUMINIUM_BLOCK = ITEMS.register("aluminium_block", () -> new BlockItem(BlockRegistry.ALUMINIUM_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> COPPER_BLOCK = ITEMS.register("copper_block", () -> new BlockItem(BlockRegistry.COPPER_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> ENERGIZED_BLOCK = ITEMS.register("energized_block", () -> new BlockItem(BlockRegistry.ENERGIZED_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> IRIDIUM_BLOCK = ITEMS.register("iridium_block", () -> new BlockItem(BlockRegistry.IRIDIUM_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> LEAD_BLOCK = ITEMS.register("lead_block", () -> new BlockItem(BlockRegistry.LEAD_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> NICKEL_BLOCK = ITEMS.register("nickel_block", () -> new BlockItem(BlockRegistry.NICKEL_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_BLOCK = ITEMS.register("platinum_block", () -> new BlockItem(BlockRegistry.PLATINUM_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILVER_BLOCK = ITEMS.register("silver_block", () -> new BlockItem(BlockRegistry.SILVER_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> TIN_BLOCK = ITEMS.register("tin_block", () -> new BlockItem(BlockRegistry.TIN_BLOCK.get(), new Item.Properties()));
    //TODO Block item Uranium
    public static final RegistryObject<Item> URANIUM_BLOCK = ITEMS.register("uranium_block", () -> new BlockItem(BlockRegistry.URANIUM_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> DISPLAY_PEDESTAL = ITEMS.register("display_pedestal", () -> new BlockItem(BlockRegistry.DISPLAY_PEDESTAL.get(), new Item.Properties()));

    /* Gears */

    public static final RegistryObject<Item> ALUMINIUM_GEAR = ITEMS.register("aluminium_gear", Gear::new);
    public static final RegistryObject<Item> COPPER_GEAR = ITEMS.register("copper_gear", Gear::new);
    public static final RegistryObject<Item> ENERGIZED_GEAR = ITEMS.register("energized_gear", Gear::new);
    public static final RegistryObject<Item> IRIDIUM_GEAR = ITEMS.register("iridium_gear", Gear::new);
    public static final RegistryObject<Item> LEAD_GEAR = ITEMS.register("lead_gear", Gear::new);
    public static final RegistryObject<Item> NICKEL_GEAR = ITEMS.register("nickel_gear", Gear::new);
    public static final RegistryObject<Item> PLATINUM_GEAR = ITEMS.register("platinum_gear", Gear::new);
    public static final RegistryObject<Item> SILVER_GEAR = ITEMS.register("silver_gear", Gear::new);
    public static final RegistryObject<Item> TIN_GEAR = ITEMS.register("tin_gear", Gear::new);
    public static final RegistryObject<Item> URANIUM_GEAR = ITEMS.register("uranium_gear", Gear::new);

    /* Ingots */

    public static final RegistryObject<Item> ALUMINIUM_INGOT = ITEMS.register("aluminium_ingot", Ingot::new);
    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", Ingot::new);
    public static final RegistryObject<Item> ENERGIZED_INGOT = ITEMS.register("energized_ingot", Ingot::new);
    public static final RegistryObject<Item> IRIDIUM_INGOT = ITEMS.register("iridium_ingot", Ingot::new);
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot", Ingot::new);
    public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot", Ingot::new);
    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot", Ingot::new);
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", Ingot::new);
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", Ingot::new);
    public static final RegistryObject<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot", Ingot::new);

    /* Nuggets */

    public static final RegistryObject<Item> ALUMINIUM_NUGGET = ITEMS.register("aluminium_nugget", Nugget::new);
    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", Nugget::new);
    public static final RegistryObject<Item> ENERGIZED_NUGGET = ITEMS.register("energized_nugget", Nugget::new);
    public static final RegistryObject<Item> IRIDIUM_NUGGET = ITEMS.register("iridium_nugget", Nugget::new);
    public static final RegistryObject<Item> LEAD_NUGGET = ITEMS.register("lead_nugget", Nugget::new);
    public static final RegistryObject<Item> NICKEL_NUGGET = ITEMS.register("nickel_nugget", Nugget::new);
    public static final RegistryObject<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget", Nugget::new);
    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget", Nugget::new);
    public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget", Nugget::new);
    public static final RegistryObject<Item> URANIUM_NUGGET = ITEMS.register("uranium_nugget", Nugget::new);

    /* Chunks */

    public static final RegistryObject<Item> RAW_ALUMINIUM_CHUNK = ITEMS.register("raw_aluminium_chunk", Chunk::new);
    public static final RegistryObject<Item> RAW_COPPER_CHUNK = ITEMS.register("raw_copper_chunk", Chunk::new);
    public static final RegistryObject<Item> RAW_ENERGIZED_CHUNK = ITEMS.register("raw_energized_chunk", Chunk::new);
    public static final RegistryObject<Item> RAW_IRIDIUM_CHUNK = ITEMS.register("raw_iridium_chunk", Chunk::new);
    public static final RegistryObject<Item> RAW_LEAD_CHUNK = ITEMS.register("raw_lead_chunk", Chunk::new);
    public static final RegistryObject<Item> RAW_NICKEL_CHUNK = ITEMS.register("raw_nickel_chunk", Chunk::new);
    public static final RegistryObject<Item> RAW_PLATINUM_CHUNK = ITEMS.register("raw_platinum_chunk", Chunk::new);
    public static final RegistryObject<Item> RAW_SILVER_CHUNK = ITEMS.register("raw_silver_chunk", Chunk::new);
    public static final RegistryObject<Item> RAW_TIN_CHUNK = ITEMS.register("raw_tin_chunk", Chunk::new);
    public static final RegistryObject<Item> RAW_URANIUM_CHUNK = ITEMS.register("raw_uranium_chunk", Chunk::new);

    public static final RegistryObject<Item> PLASTIC = ITEMS.register("plastic", () -> new ItemBase(64, false, false, false, false));

    public static final RegistryObject<Item> RADIATION_SUIT_HELMET = ITEMS.register("radiation_suit_helmet", () -> new RadiationSuitBase(ABOEArmorMaterials.PLASTIC, ArmorItem.Type.HELMET, 10D));
    public static final RegistryObject<Item> RADIATION_SUIT_CHESTPLATE = ITEMS.register("radiation_suit_chestplate", () -> new RadiationSuitBase(ABOEArmorMaterials.PLASTIC, ArmorItem.Type.CHESTPLATE, 10D));
    public static final RegistryObject<Item> RADIATION_SUIT_LEGGINGS = ITEMS.register("radiation_suit_leggings", () -> new RadiationSuitBase(ABOEArmorMaterials.PLASTIC, ArmorItem.Type.LEGGINGS, 10D));
    public static final RegistryObject<Item> RADIATION_SUIT_BOOTS = ITEMS.register("radiation_suit_boots", () -> new RadiationSuitBase(ABOEArmorMaterials.PLASTIC, ArmorItem.Type.BOOTS, 10D));

    public static final RegistryObject<Item> RADIATION_SUIT_HELMET_BROKEN = ITEMS.register("radiation_suit_helmet_broken", () -> new BrokenRadiationSuit(ABOEArmorMaterials.BROKEN_PLASTIC, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1).setNoRepair()));
    public static final RegistryObject<Item> RADIATION_SUIT_CHESTPLATE_BROKEN = ITEMS.register("radiation_suit_chestplate_broken", () -> new BrokenRadiationSuit(ABOEArmorMaterials.BROKEN_PLASTIC, ArmorItem.Type.CHESTPLATE, new Item.Properties().stacksTo(1).setNoRepair()));
    public static final RegistryObject<Item> RADIATION_SUIT_LEGGINGS_BROKEN = ITEMS.register("radiation_suit_leggings_broken", () -> new BrokenRadiationSuit(ABOEArmorMaterials.BROKEN_PLASTIC, ArmorItem.Type.LEGGINGS, new Item.Properties().stacksTo(1).setNoRepair()));
    public static final RegistryObject<Item> RADIATION_SUIT_BOOTS_BROKEN = ITEMS.register("radiation_suit_boots_broken", () -> new BrokenRadiationSuit(ABOEArmorMaterials.BROKEN_PLASTIC, ArmorItem.Type.BOOTS, new Item.Properties().stacksTo(1).setNoRepair()));

    public static final RegistryObject<Item> LIQUID_EXPERIENCE_BUCKET = ITEMS.register("liquid_experience_bucket",
            () -> new BucketItem(FluidRegistry.SOURCE_LIQUID_EXPERIENCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> MOLTEN_ALUMINIUM_BUCKET = ITEMS.register("molten_aluminium_bucket",
            () -> new MoltenBucket(FluidRegistry.SOURCE_MOLTEN_ALUMINIUM.get(),
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> MOLTEN_COPPER_BUCKET = ITEMS.register("molten_copper_bucket",
            () -> new MoltenBucket(FluidRegistry.SOURCE_MOLTEN_COPPER.get(),
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> MOLTEN_ENERGIZED_BUCKET = ITEMS.register("molten_energized_bucket",
            () -> new MoltenBucket(FluidRegistry.SOURCE_MOLTEN_ENERGIZED.get(),
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> MOLTEN_IRIDIUM_BUCKET = ITEMS.register("molten_iridium_bucket",
            () -> new MoltenBucket(FluidRegistry.SOURCE_MOLTEN_IRIDIUM.get(),
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> MOLTEN_LEAD_BUCKET = ITEMS.register("molten_lead_bucket",
            () -> new MoltenBucket(FluidRegistry.SOURCE_MOLTEN_LEAD.get(),
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> MOLTEN_NICKEL_BUCKET = ITEMS.register("molten_nickel_bucket",
            () -> new MoltenBucket(FluidRegistry.SOURCE_MOLTEN_NICKEL.get(),
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> MOLTEN_PLATINUM_BUCKET = ITEMS.register("molten_platinum_bucket",
            () -> new MoltenBucket(FluidRegistry.SOURCE_MOLTEN_PLATINUM.get(),
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> MOLTEN_SILVER_BUCKET = ITEMS.register("molten_silver_bucket",
            () -> new MoltenBucket(FluidRegistry.SOURCE_MOLTEN_SILVER.get(),
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> MOLTEN_TIN_BUCKET = ITEMS.register("molten_tin_bucket",
            () -> new MoltenBucket(FluidRegistry.SOURCE_MOLTEN_TIN.get(),
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> MOLTEN_URANIUM_BUCKET = ITEMS.register("molten_uranium_bucket",
            () -> new MoltenBucket(FluidRegistry.SOURCE_MOLTEN_URANIUM.get(),
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> BASIC_ABSORPTION_RING = ITEMS.register("basic_absorption_ring", () -> new Ring(2500, 30D, MobEffects.ABSORPTION, 1, Integer.MAX_VALUE, 2.5D, 1));
    public static final RegistryObject<Item> INTERMEDIATE_ABSORPTION_RING = ITEMS.register("intermediate_absorption_ring", () -> new Ring(5000, 30D, MobEffects.ABSORPTION, 1, Integer.MAX_VALUE, 5.0D, 1));
    public static final RegistryObject<Item> ADVANCED_ABSORPTION_RING = ITEMS.register("advanced_absorption_ring", () -> new Ring(15000, 30D, MobEffects.ABSORPTION, 1, Integer.MAX_VALUE, 10.0D,1));
    public static final RegistryObject<Item> ULTIMATE_ABSORPTION_RING = ITEMS.register("ultimate_absorption_ring", () -> new Ring(25000, 30D, MobEffects.ABSORPTION, 1, Integer.MAX_VALUE, 20.D,1));
    public static final RegistryObject<Item> BASIC_BREEDING_RING = ITEMS.register("basic_breeding_ring", () -> new Ring(2500, 30D, EffectRegistry.BREEDING.get(), 1, Integer.MAX_VALUE, 2.5D, 1));
    public static final RegistryObject<Item> INTERMEDIATE_BREEDING_RING = ITEMS.register("intermediate_breeding_ring", () -> new Ring(5000, 30D, EffectRegistry.BREEDING.get(), 1, Integer.MAX_VALUE, 5.0D, 1));
    public static final RegistryObject<Item> ADVANCED_BREEDING_RING = ITEMS.register("advanced_breeding_ring", () -> new Ring(15000, 30D, EffectRegistry.BREEDING.get(), 2, Integer.MAX_VALUE, 10.0D, 1));
    public static final RegistryObject<Item> ULTIMATE_BREEDING_RING = ITEMS.register("ultimate_breeding_ring", () -> new Ring(25000, 30D, EffectRegistry.BREEDING.get(), 3, Integer.MAX_VALUE, 20.0D, 1));
    public static final RegistryObject<Item> BASIC_ENTITY_PULLER_RING = ITEMS.register("basic_entity_puller_ring", () -> new Ring(2500, 30D, EffectRegistry.ENTITY_PULLER.get(), 0, Integer.MAX_VALUE, 2.5D, 1));
    public static final RegistryObject<Item> INTERMEDIATE_ENTITY_PULLER_RING = ITEMS.register("intermediate_entity_puller_ring", () -> new Ring(5000, 30D, EffectRegistry.ENTITY_PULLER.get(), 1, Integer.MAX_VALUE, 5.0D, 1));
    public static final RegistryObject<Item> ADVANCED_ENTITY_PULLER_RING = ITEMS.register("advanced_entity_puller_ring", () -> new Ring(15000, 30D, EffectRegistry.ENTITY_PULLER.get(), 2, Integer.MAX_VALUE, 10.0D, 1));
    public static final RegistryObject<Item> ULTIMATE_ENTITY_PULLER_RING = ITEMS.register("ultimate_entity_puller_ring", () -> new Ring(25000, 30D, EffectRegistry.ENTITY_PULLER.get(), 3, Integer.MAX_VALUE, 20.0D, 1));
    public static final RegistryObject<Item> BASIC_FIRE_RING = ITEMS.register("basic_fire_ring", () -> new Ring(2500, 30D, MobEffects.ABSORPTION, 0, Integer.MAX_VALUE, 2.5D, 1));
    public static final RegistryObject<Item> INTERMEDIATE_FIRE_RING = ITEMS.register("intermediate_fire_ring", () -> new Ring(5000, 30D, MobEffects.ABSORPTION, 1, Integer.MAX_VALUE, 5.0D, 1));
    public static final RegistryObject<Item> ADVANCED_FIRE_RING = ITEMS.register("advanced_fire_ring", () -> new Ring(15000, 30D, MobEffects.ABSORPTION, 2, Integer.MAX_VALUE, 10.0D, 1));
    public static final RegistryObject<Item> ULTIMATE_FIRE_RING = ITEMS.register("ultimate_fire_ring", () -> new Ring(25000, 30D, MobEffects.ABSORPTION, 3, Integer.MAX_VALUE, 20.0D, 1));
    public static final RegistryObject<Item> BASIC_FLIGHT_RING = ITEMS.register("basic_flight_ring", () -> new Ring(2500, 30D, EffectRegistry.FLIGHT.get(), 0, Integer.MAX_VALUE, 2.5D, 1));
    public static final RegistryObject<Item> INTERMEDIATE_FLIGHT_RING = ITEMS.register("intermediate_flight_ring", () -> new Ring(5000, 30D, EffectRegistry.FLIGHT.get(), 1, Integer.MAX_VALUE, 5.0D, 1));
    public static final RegistryObject<Item> ADVANCED_FLIGHT_RING = ITEMS.register("advanced_flight_ring", () -> new Ring(15000, 30D, EffectRegistry.FLIGHT.get(), 2, Integer.MAX_VALUE, 10.0D, 1));
    public static final RegistryObject<Item> ULTIMATE_FLIGHT_RING = ITEMS.register("ultimate_flight_ring", () -> new Ring(25000, 30D, EffectRegistry.FLIGHT.get(), 3, Integer.MAX_VALUE, 20.0D, 1));
    public static final RegistryObject<Item> BASIC_FREEZE_RING = ITEMS.register("basic_freeze_ring", () -> new Ring(2500, 30D, EffectRegistry.FREEZE.get(), 0, Integer.MAX_VALUE, 2.5D, 1));
    public static final RegistryObject<Item> INTERMEDIATE_FREEZE_RING = ITEMS.register("intermediate_freeze_ring", () -> new Ring(5000, 30D, EffectRegistry.FREEZE.get(), 1, Integer.MAX_VALUE, 5.0D, 1));
    public static final RegistryObject<Item> ADVANCED_FREEZE_RING = ITEMS.register("advanced_freeze_ring", () -> new Ring(15000, 30D, EffectRegistry.FREEZE.get(), 2, Integer.MAX_VALUE, 10.0D, 1));
    public static final RegistryObject<Item> ULTIMATE_FREEZE_RING = ITEMS.register("ultimate_freeze_ring", () -> new Ring(25000, 30D, EffectRegistry.FREEZE.get(), 3, Integer.MAX_VALUE, 20.0D, 1));
    public static final RegistryObject<Item> BASIC_GREEN_THUMB_RING = ITEMS.register("basic_green_thumb_ring", () -> new Ring(2500, 30D, EffectRegistry.GREEN_THUMB.get(), 0, Integer.MAX_VALUE, 2.5D, 1));
    public static final RegistryObject<Item> INTERMEDIATE_GREEN_THUMB_RING = ITEMS.register("intermediate_green_thumb_ring", () -> new Ring(5000, 30D, EffectRegistry.GREEN_THUMB.get(), 1, Integer.MAX_VALUE, 5.0D, 1));
    public static final RegistryObject<Item> ADVANCED_GREEN_THUMB_RING = ITEMS.register("advanced_green_thumb_ring", () -> new Ring(15000, 30D, EffectRegistry.GREEN_THUMB.get(), 2, Integer.MAX_VALUE, 10.0D, 1));
    public static final RegistryObject<Item> ULTIMATE_GREEN_THUMB_RING = ITEMS.register("ultimate_green_thumb_ring", () -> new Ring(25000, 30D, EffectRegistry.GREEN_THUMB.get(), 3, Integer.MAX_VALUE, 20.0D, 1));
    public static final RegistryObject<Item> BASIC_HASTE_RING = ITEMS.register("basic_haste_ring", () -> new Ring(2500, 30D, MobEffects.DIG_SPEED, 0, Integer.MAX_VALUE, 2.5D, 1));
    public static final RegistryObject<Item> INTERMEDIATE_HASTE_RING = ITEMS.register("intermediate_haste_ring", () -> new Ring(5000, 30D, MobEffects.DIG_SPEED, 1, Integer.MAX_VALUE, 5.0D, 1));
    public static final RegistryObject<Item> ADVANCED_HASTE_RING = ITEMS.register("advanced_haste_ring", () -> new Ring(15000, 30D, MobEffects.DIG_SPEED, 2, Integer.MAX_VALUE, 10.0D, 1));
    public static final RegistryObject<Item> ULTIMATE_HASTE_RING = ITEMS.register("ultimate_haste_ring", () -> new Ring(25000, 30D, MobEffects.DIG_SPEED, 3, Integer.MAX_VALUE, 20.0D, 1));
    public static final RegistryObject<Item> BASIC_HEALTH_RING = ITEMS.register("basic_health_ring", () -> new Ring(2500, 30D, MobEffects.HEALTH_BOOST, 0, Integer.MAX_VALUE, 2.5D, 1));
    public static final RegistryObject<Item> INTERMEDIATE_HEALTH_RING = ITEMS.register("intermediate_health_ring", () -> new Ring(5000, 30D, MobEffects.HEALTH_BOOST, 1, Integer.MAX_VALUE, 5.0D, 1));
    public static final RegistryObject<Item> ADVANCED_HEALTH_RING = ITEMS.register("advanced_health_ring", () -> new Ring(15000, 30D, MobEffects.HEALTH_BOOST, 2, Integer.MAX_VALUE, 10.0D, 1));
    public static final RegistryObject<Item> ULTIMATE_HEALTH_RING = ITEMS.register("ultimate_health_ring", () -> new Ring(25000, 30D, MobEffects.HEALTH_BOOST, 3, Integer.MAX_VALUE, 20.0D, 1));
    public static final RegistryObject<Item> BASIC_MAGNETIZATION_RING = ITEMS.register("basic_magnetization_ring", () -> new Ring(2500, 30D, EffectRegistry.MAGNETIZATION.get(), 0, Integer.MAX_VALUE, 2.5D, 1));
    public static final RegistryObject<Item> INTERMEDIATE_MAGNETIZATION_RING = ITEMS.register("intermediate_magnetization_ring", () -> new Ring(5000, 30D, EffectRegistry.MAGNETIZATION.get(), 1, Integer.MAX_VALUE, 5.0D, 1));
    public static final RegistryObject<Item> ADVANCED_MAGNETIZATION_RING = ITEMS.register("advanced_magnetization_ring", () -> new Ring(15000, 30D, EffectRegistry.MAGNETIZATION.get(), 2, Integer.MAX_VALUE, 10.0D, 1));
    public static final RegistryObject<Item> ULTIMATE_MAGNETIZATION_RING = ITEMS.register("ultimate_magnetization_ring", () -> new Ring(25000, 30D, EffectRegistry.MAGNETIZATION.get(), 3, Integer.MAX_VALUE, 20.0D, 1));
    public static final RegistryObject<Item> BASIC_REGENERATION_RING = ITEMS.register("basic_regeneration_ring", () -> new Ring(25000, 30D, EffectRegistry.MAGNETIZATION.get(), 3, Integer.MAX_VALUE, 20.0D, 1));
    public static final RegistryObject<Item> INTERMEDIATE_REGENERATION_RING = ITEMS.register("intermediate_regeneration_ring", () -> new Ring(25000, 30D, EffectRegistry.MAGNETIZATION.get(), 3, Integer.MAX_VALUE, 20.0D, 1));
    public static final RegistryObject<Item> ADVANCED_REGENERATION_RING = ITEMS.register("advanced_regeneration_ring", () -> new Ring(25000, 30D, EffectRegistry.MAGNETIZATION.get(), 3, Integer.MAX_VALUE, 20.0D, 1));
    public static final RegistryObject<Item> ULTIMATE_REGENERATION_RING = ITEMS.register("ultimate_regeneration_ring", () -> new Ring(25000, 30D, EffectRegistry.MAGNETIZATION.get(), 3, Integer.MAX_VALUE, 20.0D, 1));
    public static final RegistryObject<Item> BASIC_RESISTANCE_RING = ITEMS.register("basic_resistance_ring", () -> new Ring(2500, 30D, MobEffects.DAMAGE_RESISTANCE, 0, Integer.MAX_VALUE, 2.5D, 1));
    public static final RegistryObject<Item> INTERMEDIATE_RESISTANCE_RING = ITEMS.register("intermediate_resistance_ring", () -> new Ring(5000, 30D, MobEffects.DAMAGE_RESISTANCE, 1, Integer.MAX_VALUE, 5.0D, 1));
    public static final RegistryObject<Item> ADVANCED_RESISTANCE_RING = ITEMS.register("advanced_resistance_ring", () -> new Ring(15000, 30D, MobEffects.DAMAGE_RESISTANCE, 2, Integer.MAX_VALUE, 10.0D, 1));
    public static final RegistryObject<Item> ULTIMATE_RESISTANCE_RING = ITEMS.register("ultimate_resistance_ring", () -> new Ring(25000, 30D, MobEffects.DAMAGE_RESISTANCE, 3, Integer.MAX_VALUE, 20.0D, 1));
    public static final RegistryObject<Item> BASIC_SATURATION_RING = ITEMS.register("basic_saturation_ring", () -> new Ring(2500, 30D, MobEffects.DAMAGE_BOOST, 0, Integer.MAX_VALUE, 2.5D, 1));
    public static final RegistryObject<Item> INTERMEDIATE_SATURATION_RING = ITEMS.register("intermediate_saturation_ring", () -> new Ring(2500, 30D, MobEffects.DAMAGE_BOOST, 0, Integer.MAX_VALUE, 2.5D, 1));
    public static final RegistryObject<Item> ADVANCED_SATURATION_RING = ITEMS.register("advanced_saturation_ring", () -> new Ring(2500, 30D, MobEffects.DAMAGE_BOOST, 0, Integer.MAX_VALUE, 2.5D, 1));
    public static final RegistryObject<Item> ULTIMATE_SATURATION_RING = ITEMS.register("ultimate_saturation_ring", () -> new Ring(2500, 30D, MobEffects.DAMAGE_BOOST, 0, Integer.MAX_VALUE, 2.5D, 1));
    public static final RegistryObject<Item> BASIC_STEP_ASSIST_RING = ITEMS.register("basic_step_assist_ring", () -> new Ring(2500, 30D, EffectRegistry.STEP_ASSIST.get(), 0, Integer.MAX_VALUE, 2.5D, 1));
    public static final RegistryObject<Item> INTERMEDIATE_STEP_ASSIST_RING = ITEMS.register("intermediate_step_assist_ring", () -> new Ring(5000, 30D, EffectRegistry.STEP_ASSIST.get(), 1, Integer.MAX_VALUE, 5.0D, 1));
    public static final RegistryObject<Item> ADVANCED_STEP_ASSIST_RING = ITEMS.register("advanced_step_assist_ring", () -> new Ring(15000, 30D, EffectRegistry.STEP_ASSIST.get(), 2, Integer.MAX_VALUE, 10.0D, 1));
    public static final RegistryObject<Item> ULTIMATE_STEP_ASSIST_RING = ITEMS.register("ultimate_step_assist_ring", () -> new Ring(25000, 30D, EffectRegistry.STEP_ASSIST.get(), 3, Integer.MAX_VALUE, 20.0D, 1));
    public static final RegistryObject<Item> BASIC_STRENGTH_RING = ITEMS.register("basic_strength_ring", () -> new Ring(2500, 30D, MobEffects.DAMAGE_BOOST, 0, Integer.MAX_VALUE, 2.5D, 1));
    public static final RegistryObject<Item> INTERMEDIATE_STRENGTH_RING = ITEMS.register("intermediate_strength_ring", () -> new Ring(5000, 30D, MobEffects.DAMAGE_BOOST, 1, Integer.MAX_VALUE, 5.0D, 1));
    public static final RegistryObject<Item> ADVANCED_STRENGTH_RING = ITEMS.register("advanced_strength_ring", () -> new Ring(15000, 30D, MobEffects.DAMAGE_BOOST, 2, Integer.MAX_VALUE, 10.0D, 1));
    public static final RegistryObject<Item> ULTIMATE_STRENGTH_RING = ITEMS.register("ultimate_strength_ring", () -> new Ring(25000, 30D, MobEffects.DAMAGE_BOOST, 3, Integer.MAX_VALUE, 20.0D, 1));

    public static void registerItems()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
