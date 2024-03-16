package net.dimidium.aboe.util;

import net.dimidium.aboe.handler.registry.ItemRegistry;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;

public class ABOETiers
{
    //TODO custom harvest level? + Alloys for higher repair tiers
    public static final ForgeTier BEGINNER = new ForgeTier(
            2,
            2500,
            1.5f,
            2,
            15,
            Tags.Blocks.NEEDS_NETHERITE_TOOL,
            () -> Ingredient.of(ItemRegistry.ENERGIZED_INGOT::get)
    );

    public static final ForgeTier INTERMEDIATE = new ForgeTier(
            3,
            5000,
            3f,
            2,
            15,
            Tags.Blocks.NEEDS_NETHERITE_TOOL,
            () -> Ingredient.of(ItemRegistry.ENERGIZED_INGOT::get)
    );

    public static final ForgeTier ADVANCED = new ForgeTier(
            4,
            10000,
            6f,
            2,
            15,
            Tags.Blocks.NEEDS_NETHERITE_TOOL,
            () -> Ingredient.of(ItemRegistry.ENERGIZED_INGOT::get)
    );

    public static final ForgeTier EXPERT = new ForgeTier(
            5,
            20000,
            12f,
            2,
            15,
            Tags.Blocks.NEEDS_NETHERITE_TOOL,
            () -> Ingredient.of(ItemRegistry.ENERGIZED_INGOT::get)
    );
}
