package net.dimidium.aboe.util;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.component.Tool;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

public interface ABOETier extends Tier
{
    default int getUses()
    {
        return 0;
    }

    default float getSpeed()
    {
        return 0;
    }

    default float getAttackDamageBonus()
    {
        return 0;
    }

    default int getEnchantmentValue()
    {
        return 0;
    }

    default Ingredient getRepairIngredient()
    {
        return null;
    }

    default Tool createToolProperties(TagKey<Block> block)
    {
        return Tier.super.createToolProperties(block);
    }
}
