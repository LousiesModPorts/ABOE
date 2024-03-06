package net.dimidium.aboe.handler.registry;

import net.dimidium.aboe.item.*;
import net.dimidium.aboe.item.armor.material.ABOEArmorMaterials;
import net.dimidium.aboe.item.armor.radsuit.RadiationSuitBase;
import net.dimidium.aboe.util.Constants;
import net.dimidium.dimidiumcore.api.item.ItemBase;
import net.minecraft.world.item.*;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry 
{
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Constants.MOD_ID);

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

    /* Blocks */

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

    public static final RegistryObject<Item> RADIATION_SUIT_HELMET = ITEMS.register("radiation_suit_helmet", () -> new RadiationSuitBase(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, 10D));
    public static final RegistryObject<Item> RADIATION_SUIT_CHESTPLATE = ITEMS.register("radiation_suit_chestplate", () -> new RadiationSuitBase(ArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE, 10D));
    public static final RegistryObject<Item> RADIATION_SUIT_LEGGINGS = ITEMS.register("radiation_suit_leggings", () -> new RadiationSuitBase(ArmorMaterials.LEATHER, ArmorItem.Type.LEGGINGS, 10D));
    public static final RegistryObject<Item> RADIATION_SUIT_BOOTS = ITEMS.register("radiation_suit_boots", () -> new RadiationSuitBase(ArmorMaterials.LEATHER, ArmorItem.Type.BOOTS, 10D));

    public static final RegistryObject<Item> RADIATION_SUIT_HELMET_BROKEN = ITEMS.register("radiation_suit_helmet_broken", () -> new ArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1).setNoRepair()));
    public static final RegistryObject<Item> RADIATION_SUIT_CHESTPLATE_BROKEN = ITEMS.register("radiation_suit_chestplate_broken", () -> new ArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE, new Item.Properties().stacksTo(1).setNoRepair()));
    public static final RegistryObject<Item> RADIATION_SUIT_LEGGINGS_BROKEN = ITEMS.register("radiation_suit_leggings_broken", () -> new ArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.LEGGINGS, new Item.Properties().stacksTo(1).setNoRepair()));
    public static final RegistryObject<Item> RADIATION_SUIT_BOOTS_BROKEN = ITEMS.register("radiation_suit_boots_broken", () -> new ArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.BOOTS, new Item.Properties().stacksTo(1).setNoRepair()));

    public static void registerItems()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
