package net.dimidium.aboe.worldgen.tree;

import net.dimidium.aboe.worldgen.ABOEConfiguredFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

import javax.annotation.Nullable;

public class RubberTreeGrower   extends AbstractTreeGrower
{
    @Nullable
    @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource pRandom, boolean pHasFlowers)
    {
        return ABOEConfiguredFeatures.RUBBER_KEY;
    }
}
