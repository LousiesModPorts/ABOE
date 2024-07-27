package net.dimidium.aboe.util;

import net.dimidium.aboe.handler.registry.ItemRegistry;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;

public class ABOETiers
{
    public static final ABOETier BEGINNER = new ABOETier()
    {
        @Override
        public int getUses()
        {
            return 2500;
        }

        @Override
        public float getSpeed()
        {
            return 1.5f;
        }

        @Override
        public float getAttackDamageBonus()
        {
            return 2f;
        }

        @Override
        public int getEnchantmentValue()
        {
            return 15;
        }

        @Override
        public TagKey<Block> getIncorrectBlocksForDrops()
        {
            //todo fix this
            return Tags.Blocks.NEEDS_NETHERITE_TOOL;
        }

        @Override
        public Ingredient getRepairIngredient()
        {
            return Ingredient.of(ItemRegistry.ENERGIZED_INGOT.get());
        }
    };

    public static final ABOETier INTERMEDIATE = new ABOETier()
    {
        @Override
        public int getUses()
        {
            return 5000;
        }

        @Override
        public float getSpeed()
        {
            return 3f;
        }

        @Override
        public float getAttackDamageBonus()
        {
            return 2f;
        }

        @Override
        public int getEnchantmentValue()
        {
            return 15;
        }

        @Override
        public TagKey<Block> getIncorrectBlocksForDrops()
        {
            //todo fix this
            return Tags.Blocks.NEEDS_NETHERITE_TOOL;
        }

        @Override
        public Ingredient getRepairIngredient()
        {
            return Ingredient.of(ItemRegistry.ENERGIZED_INGOT.get());
        }
    };

    public static final ABOETier ADVANCED = new ABOETier()
    {
        @Override
        public int getUses()
        {
            return 10000;
        }

        @Override
        public float getSpeed()
        {
            return 6f;
        }

        @Override
        public float getAttackDamageBonus()
        {
            return 2f;
        }

        @Override
        public int getEnchantmentValue()
        {
            return 15;
        }

        @Override
        public TagKey<Block> getIncorrectBlocksForDrops()
        {
            //todo fix this
            return Tags.Blocks.NEEDS_NETHERITE_TOOL;
        }

        @Override
        public Ingredient getRepairIngredient()
        {
            return Ingredient.of(ItemRegistry.ENERGIZED_INGOT.get());
        }
    };

    public static final ABOETier EXPERT = new ABOETier()
    {
        @Override
        public int getUses()
        {
            return 20000;
        }

        @Override
        public float getSpeed()
        {
            return 12f;
        }

        @Override
        public float getAttackDamageBonus()
        {
            return 2f;
        }

        @Override
        public int getEnchantmentValue()
        {
            return 15;
        }

        @Override
        public TagKey<Block> getIncorrectBlocksForDrops()
        {
            //todo fix this
            return Tags.Blocks.NEEDS_NETHERITE_TOOL;
        }

        @Override
        public Ingredient getRepairIngredient()
        {
            return Ingredient.of(ItemRegistry.ENERGIZED_INGOT.get());
        }
    };
}
