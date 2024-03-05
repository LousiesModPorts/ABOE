package net.dimidium.aboe.handler.registry;

import net.dimidium.aboe.util.Constants;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
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

    public static void registerItems()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
