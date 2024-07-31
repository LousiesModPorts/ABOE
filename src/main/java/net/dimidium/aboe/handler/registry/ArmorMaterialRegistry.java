package net.dimidium.aboe.handler.registry;

import net.dimidium.aboe.util.Constants;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;
import java.util.Map;

public class ArmorMaterialRegistry
{
    private static final DeferredRegister<ArmorMaterial> ARMOR_MATERIALS = DeferredRegister.create(Registries.ARMOR_MATERIAL, Constants.MOD_ID);


    public static final DeferredHolder<ArmorMaterial,ArmorMaterial> PLASTIC = ARMOR_MATERIALS.register("plastic", () ->
            new ArmorMaterial(Map.of(ArmorItem.Type.HELMET, 13,
            ArmorItem.Type.CHESTPLATE, 15,
            ArmorItem.Type.LEGGINGS, 16,
            ArmorItem.Type.BOOTS,  11),
            0,
            SoundEvents.ARMOR_EQUIP_LEATHER,
            () -> Ingredient.of(ItemRegistry.PLASTIC.get()),
            List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(
                    Constants.MOD_ID, "plastic"), "", false)),3f,0.1f)
    );

    public static final DeferredHolder<ArmorMaterial,ArmorMaterial> BROKEN_PLASTIC = ARMOR_MATERIALS.register("broken_plastic", () -> new ArmorMaterial(Map.of(
            ArmorItem.Type.HELMET, 0,
            ArmorItem.Type.CHESTPLATE, 0,
            ArmorItem.Type.LEGGINGS, 0,
            ArmorItem.Type.BOOTS,  0),
            0,
            SoundEvents.ARMOR_EQUIP_LEATHER,
            () -> Ingredient.of(ItemRegistry.PLASTIC.get()),
            List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(
                    Constants.MOD_ID, "broken_plastic"), "", false)),0f,0f)
    );


    //TODO Repair Materials and different defense etc per tier

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> BASIC_ALLOY = ARMOR_MATERIALS.register("basic_alloy", () -> new ArmorMaterial(
            Map.of(
                    ArmorItem.Type.HELMET, 16,
                    ArmorItem.Type.CHESTPLATE, 16,
                    ArmorItem.Type.LEGGINGS, 16,
                    ArmorItem.Type.BOOTS, 16),
            0,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.of(Items.NETHERITE_INGOT),
            List.of(new ArmorMaterial.Layer(
                    ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "basic_alloy"), "", false)),
            10.0F,
            0.1F)
    );

    public static DeferredHolder<ArmorMaterial,ArmorMaterial> ADVANCED_ALLOY = ARMOR_MATERIALS.register("advanced_alloy", () -> new ArmorMaterial(
            Map.of(
                    ArmorItem.Type.HELMET, 16,
                    ArmorItem.Type.CHESTPLATE, 16,
                    ArmorItem.Type.LEGGINGS, 16,
                    ArmorItem.Type.BOOTS, 16),
            0,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.of(Items.NETHERITE_INGOT),
            List.of(new ArmorMaterial.Layer(
                    ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "basic_alloy"), "", false)),
            10.0F,
            0.1F)
    );

    public static DeferredHolder<ArmorMaterial,ArmorMaterial> ELITE_ALLOY = ARMOR_MATERIALS.register("elite_alloy", () -> new ArmorMaterial(
            Map.of(
                    ArmorItem.Type.HELMET, 16,
                    ArmorItem.Type.CHESTPLATE, 16,
                    ArmorItem.Type.LEGGINGS, 16,
                    ArmorItem.Type.BOOTS, 16),
            0,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.of(Items.NETHERITE_INGOT),
            List.of(new ArmorMaterial.Layer(
                    ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "basic_alloy"), "", false)),
            10.0F,
            0.1F)
    );

    public static DeferredHolder<ArmorMaterial,ArmorMaterial> ULTIMATE_ALLOY = ARMOR_MATERIALS.register("ultimate_alloy", () -> new ArmorMaterial(
            Map.of(
                    ArmorItem.Type.HELMET, 16,
                    ArmorItem.Type.CHESTPLATE, 16,
                    ArmorItem.Type.LEGGINGS, 16,
                    ArmorItem.Type.BOOTS, 16),
            0,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.of(Items.NETHERITE_INGOT),
            List.of(new ArmorMaterial.Layer(
                    ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "basic_alloy"), "", false)),
            10.0F,
            0.1F)
    );

    public static void registerArmorMaterials(IEventBus eventBus)
    {
        ARMOR_MATERIALS.register(eventBus);
    }
}
