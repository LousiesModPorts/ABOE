package net.dimidium.aboe.item.armor.material;

import net.dimidium.aboe.handler.registry.ItemRegistry;
import net.dimidium.aboe.util.Constants;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public class ABOEArmorMaterials
{
    public enum PlasticArmorMaterial implements ArmorMaterial
    {
        PLASTIC("plastic", 1500, new int[] { 2, 2, 2, 2 }, 0, SoundEvents.ARMOR_EQUIP_LEATHER, 3f, 0.1f, () -> Ingredient.of(ItemRegistry.PLASTIC.get()));

        private final int[] MAX_DAMAGE_ARRAY = new int[] { 13, 15, 16, 11 };
        private final String name;
        private final int durability;
        private final int[] damageReductionAmountArray;
        private final int enchantability;
        private final SoundEvent soundOnEquip;
        private final float toughness;
        private final float knockbackResistance;
        private final Supplier<Ingredient> repairMaterial;

        PlasticArmorMaterial(String nameIn, int durabilityIn, int[] damageReductionAmountArrayIn, int enchantabilityIn, SoundEvent soundOnEquip, float toughnessIn, float knockbackResistanceIn, Supplier<Ingredient> repairMaterialIn)
        {
            this.name = Constants.MOD_ID + ":" + nameIn;
            this.durability = durabilityIn;
            this.damageReductionAmountArray = damageReductionAmountArrayIn;
            this.enchantability = enchantabilityIn;
            this.soundOnEquip = soundOnEquip;
            this.toughness = toughnessIn;
            this.knockbackResistance = knockbackResistanceIn;
            this.repairMaterial = repairMaterialIn;
        }

        @OnlyIn(Dist.CLIENT)
        public String getName()
        {
            return this.name;
        }

        @Override
        public int getDurabilityForType(ArmorItem.Type type)
        {
            return this.MAX_DAMAGE_ARRAY[type.getSlot().ordinal()] * this.durability;
        }

        @Override
        public int getDefenseForType(ArmorItem.Type type)
        {
            return this.damageReductionAmountArray[type.getSlot().ordinal()];
        }


        @Override
        public int getEnchantmentValue()
        {
            return this.enchantability;
        }

        @Override
        public SoundEvent getEquipSound()
        {
            return this.soundOnEquip;
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

        @Override
        public Ingredient getRepairIngredient()
        {
            return this.repairMaterial.get();
        }
    }

    public enum BrokenPlasticArmorMaterial implements ArmorMaterial
    {
        BROKEN_PLASTIC("broken_plastic", 0, new int[] {0,0,0,0}, 0, SoundEvents.ARMOR_EQUIP_LEATHER, 0F, 0.0F, () -> Ingredient.of(ItemRegistry.PLASTIC.get()));

        private final int[] MAX_DAMAGE_ARRAY = new int[] { 13, 15, 16, 11 };
        private final String name;
        private final int durability;
        private final int[] damageReductionAmountArray;
        private final int enchantability;
        private final SoundEvent soundOnEquip;
        private final float toughness;
        private final float knockbackResistance;
        private final Supplier<Ingredient> repairMaterial;

        BrokenPlasticArmorMaterial(String nameIn, int durabilityIn, int[] damageReductionAmountArrayIn, int enchantabilityIn, SoundEvent soundOnEquip, float toughnessIn, float knockbackResistanceIn, Supplier<Ingredient> repairMaterialIn)
        {
            this.name = Constants.MOD_ID + ":" + nameIn;
            this.durability = durabilityIn;
            this.damageReductionAmountArray = damageReductionAmountArrayIn;
            this.enchantability = enchantabilityIn;
            this.soundOnEquip = soundOnEquip;
            this.toughness = toughnessIn;
            this.knockbackResistance = knockbackResistanceIn;
            this.repairMaterial = repairMaterialIn;
        }

        @OnlyIn(Dist.CLIENT)
        public String getName()
        {
            return this.name;
        }

        @Override
        public int getDurabilityForType(ArmorItem.Type slotIn)
        {
            return MAX_DAMAGE_ARRAY[slotIn.getSlot().ordinal()] * this.durability;
        }

        @Override
        public int getDefenseForType(ArmorItem.Type slotIn)
        {
            return this.damageReductionAmountArray[slotIn.getSlot().ordinal()];
        }

        @Override
        public int getEnchantmentValue()
        {
            return this.enchantability;
        }

        @Override
        public SoundEvent getEquipSound()
        {
            return this.soundOnEquip;
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

        @Override
        public Ingredient getRepairIngredient()
        {
            return this.repairMaterial.get();
        }
    }
}
