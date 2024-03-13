package net.dimidium.aboe.item.armor.material;

import net.dimidium.aboe.handler.registry.ItemRegistry;
import net.dimidium.aboe.util.Constants;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public class ABOEArmorMaterials implements ArmorMaterial
{
    private final int[] durabilityForType;
    private final int[] defenseForType;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final Supplier<Ingredient> repairMaterial;
    private final String name;
    private final float toughness;
    private final float knockbackResistance;

    public ABOEArmorMaterials(int[] durabilityForType, int[] defenseForType, int enchantability, SoundEvent equipSound, Supplier<Ingredient> repairMaterial, String name, float toughness, float knockbackResistance) {
        this.durabilityForType = durabilityForType;
        this.defenseForType = defenseForType;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.repairMaterial = repairMaterial;
        this.name = name;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type type)
    {
        return this.durabilityForType[type.ordinal()];
    }

    @Override
    public int getDefenseForType(ArmorItem.Type type)
    {
        return this.defenseForType[type.ordinal()];
    }

    @Override
    public int getEnchantmentValue()
    {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound()
    {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return this.repairMaterial.get();
    }

    @Override
    public String getName()
    {
        return Constants.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness()
    {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance()
    {
        return this.knockbackResistance;
    }

    public static final ABOEArmorMaterials PLASTIC = new ABOEArmorMaterials(
           new int[] { 1500, 1500, 1500, 1500 }, new int[] { 13, 15, 16, 11 },
           0,
           SoundEvents.ARMOR_EQUIP_LEATHER,
           () -> Ingredient.of(ItemRegistry.PLASTIC.get()),
           "plastic",
           3f,
           0.1f
    );

    public static final ABOEArmorMaterials BROKEN_PLASTIC = new ABOEArmorMaterials(
            new int[] { 0, 0, 0, 0}, new int[] { 0, 0, 0, 0},
            0,
            SoundEvents.ARMOR_EQUIP_LEATHER,
            () -> Ingredient.of(ItemRegistry.PLASTIC.get()),
            "broken_plastic",
            0f,
            0.1f
    );
}
