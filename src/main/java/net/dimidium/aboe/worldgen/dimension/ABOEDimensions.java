package net.dimidium.aboe.worldgen.dimension;

import com.mojang.datafixers.util.Pair;
import net.dimidium.aboe.util.Constants;
import net.dimidium.aboe.worldgen.biome.ABOEBiomes;
import net.dimidium.dimidiumcore.api.helper.StringHelper;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.dimension.BuiltinDimensionTypes;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.levelgen.*;

import java.util.List;
import java.util.OptionalLong;

public class ABOEDimensions
{
    //TODO mob spawn settings for void world
    public static final ResourceKey<LevelStem> MINETOPIA_KEY = ResourceKey.create(Registries.LEVEL_STEM, StringHelper.modLocation(Constants.MOD_ID, "minetopia"));
    public static final ResourceKey<Level> MINETOPIA_LEVEL_KEY = ResourceKey.create(Registries.DIMENSION, StringHelper.modLocation(Constants.MOD_ID, "minetopia"));
    public static final ResourceKey<DimensionType> MINETOPIA_TYPE = ResourceKey.create(Registries.DIMENSION_TYPE, StringHelper.modLocation(Constants.MOD_ID, "minetopia"));

    public static final ResourceKey<LevelStem> NIGHTMARE_KEY = ResourceKey.create(Registries.LEVEL_STEM, StringHelper.modLocation(Constants.MOD_ID, "nightmare"));
    public static final ResourceKey<Level> NIGHTMARE_LEVEL_KEY = ResourceKey.create(Registries.DIMENSION, StringHelper.modLocation(Constants.MOD_ID, "nightmare"));
    public static final ResourceKey<DimensionType> NIGHTMARE_TYPE = ResourceKey.create(Registries.DIMENSION_TYPE, StringHelper.modLocation(Constants.MOD_ID, "nightmare"));

    public static final ResourceKey<LevelStem> SPIRIT_KEY = ResourceKey.create(Registries.LEVEL_STEM, StringHelper.modLocation(Constants.MOD_ID, "spirit"));
    public static final ResourceKey<Level> SPIRIT_LEVEL_KEY = ResourceKey.create(Registries.DIMENSION, StringHelper.modLocation(Constants.MOD_ID, "spirit"));
    public static final ResourceKey<DimensionType> SPIRIT_TYPE = ResourceKey.create(Registries.DIMENSION_TYPE, StringHelper.modLocation(Constants.MOD_ID, "spirit"));

    public static final ResourceKey<LevelStem> THE_VOID_KEY = ResourceKey.create(Registries.LEVEL_STEM, StringHelper.modLocation(Constants.MOD_ID, "the_void"));
    public static final ResourceKey<Level> THE_VOID_LEVEL_KEY = ResourceKey.create(Registries.DIMENSION, StringHelper.modLocation(Constants.MOD_ID, "the_void"));
    public static final ResourceKey<DimensionType> THE_VOID_TYPE = ResourceKey.create(Registries.DIMENSION_TYPE, StringHelper.modLocation(Constants.MOD_ID, "the_void"));
    public static final ResourceKey<NoiseGeneratorSettings> THE_VOID_NOISE_GEN = ResourceKey.create(Registries.NOISE_SETTINGS, StringHelper.modLocation(Constants.MOD_ID, "the_void"));

    public static void bootstrapType(BootstrapContext<DimensionType> context)
    {
        context.register(MINETOPIA_TYPE, new DimensionType(
                OptionalLong.of(12000),
                true,
                false,
                false,
                true,
                1.0D,
                true,
                true,
                -32,
                384,
                384,
                BlockTags.INFINIBURN_OVERWORLD,
                BuiltinDimensionTypes.OVERWORLD_EFFECTS,
                1.0F,
                new DimensionType.MonsterSettings(false, false, UniformInt.of(0,0) ,0)
        ));

        context.register(NIGHTMARE_TYPE, new DimensionType(
                OptionalLong.of(18000),
                false,
                false,
                false,
                true,
                1.0D,
                true,
                true,
                -32,
                384,
                384,
                BlockTags.INFINIBURN_OVERWORLD,
                BuiltinDimensionTypes.OVERWORLD_EFFECTS,
                1.0F,
                new DimensionType.MonsterSettings(false, false, UniformInt.of(0,0) ,0)
        ));

        context.register(SPIRIT_TYPE, new DimensionType(
                OptionalLong.of(18000),
                true,
                false,
                true,
                true,
                1.0D,
                false,
                false,
                -32,
                384,
                384,
                BlockTags.INFINIBURN_OVERWORLD,
                BuiltinDimensionTypes.OVERWORLD_EFFECTS,
                0.0F,
                new DimensionType.MonsterSettings(false, false, UniformInt.of(0, 0), 0)
        ));

        context.register(THE_VOID_TYPE, new DimensionType(
                OptionalLong.of(12000),
                true,
                false,
                true,
                true,
                1.0D,
                false,
                false,
                -32,
                384,
                384,
                BlockTags.INFINIBURN_NETHER,
                BuiltinDimensionTypes.NETHER_EFFECTS,
                1.0F,
                new DimensionType.MonsterSettings(false, false, UniformInt.of(0,0) ,0)
        ));
    }

    public static NoiseGeneratorSettings makeNoiseSettings(BootstrapContext<NoiseGeneratorSettings> context, boolean skylight)
    {
        NoiseSettings voidNoise = NoiseSettings.create(
                -32,
                256,
                2,
                2
        );

        return new NoiseGeneratorSettings(
                voidNoise,
                Blocks.STONE.defaultBlockState(),
                skylight ? Blocks.AIR.defaultBlockState() : Blocks.WATER.defaultBlockState(),
                new NoiseRouter(
                        DensityFunctions.zero(),
                        DensityFunctions.zero(),
                        DensityFunctions.zero(),
                        DensityFunctions.zero(),
                        DensityFunctions.zero(),
                        DensityFunctions.zero(),
                        DensityFunctions.zero(),
                        DensityFunctions.zero(),
                        DensityFunctions.zero(),
                        DensityFunctions.zero(),
                        DensityFunctions.zero(),
                        DensityFunctions.zero(),
                        DensityFunctions.zero(),
                        DensityFunctions.zero(),
                        DensityFunctions.zero()
                ),
                SurfaceRules.state(Blocks.AIR.defaultBlockState()),
                List.of(),
                0,
                true,
                false,
                false,
                false
        );
    }

    public static void bootstrapNoise(BootstrapContext<NoiseGeneratorSettings> context)
    {
        context.register(THE_VOID_NOISE_GEN, makeNoiseSettings(context, true));
    }

    public static void bootstrapStem(BootstrapContext<LevelStem> context)
    {
        HolderGetter<Biome> biomeRegistry = context.lookup(Registries.BIOME);
        HolderGetter<MultiNoiseBiomeSourceParameterList> biomeSources = context.lookup(Registries.MULTI_NOISE_BIOME_SOURCE_PARAMETER_LIST);
        HolderGetter<DimensionType> dimTypes = context.lookup(Registries.DIMENSION_TYPE);
        HolderGetter<NoiseGeneratorSettings> noiseGenSettings = context.lookup(Registries.NOISE_SETTINGS);

        NoiseBasedChunkGenerator noiseBasedChunkGenerator= new NoiseBasedChunkGenerator(
                MultiNoiseBiomeSource.createFromPreset(biomeSources.getOrThrow(MultiNoiseBiomeSourceParameterLists.OVERWORLD)), noiseGenSettings.getOrThrow(NoiseGeneratorSettings.CAVES));

        NoiseBasedChunkGenerator nightmareChunkGenerator = new NoiseBasedChunkGenerator(
                MultiNoiseBiomeSource.createFromPreset(biomeSources.getOrThrow(MultiNoiseBiomeSourceParameterLists.OVERWORLD)), noiseGenSettings.getOrThrow(NoiseGeneratorSettings.OVERWORLD));

        NoiseBasedChunkGenerator spiritChunkGenerator = new NoiseBasedChunkGenerator(
                MultiNoiseBiomeSource.createFromPreset(biomeSources.getOrThrow(MultiNoiseBiomeSourceParameterLists.OVERWORLD)),noiseGenSettings.getOrThrow(NoiseGeneratorSettings.OVERWORLD));

        NoiseBasedChunkGenerator wrappedChunkGenerator = new NoiseBasedChunkGenerator(
                new FixedBiomeSource(biomeRegistry.getOrThrow(ABOEBiomes.THE_VOID)), noiseGenSettings.getOrThrow(THE_VOID_NOISE_GEN));

        LevelStem minetopiaStem = new LevelStem(dimTypes.getOrThrow(MINETOPIA_TYPE), noiseBasedChunkGenerator);
        LevelStem nightmareStem = new LevelStem(dimTypes.getOrThrow(NIGHTMARE_TYPE), nightmareChunkGenerator);
        LevelStem spiritStem = new LevelStem(dimTypes.getOrThrow(SPIRIT_TYPE), spiritChunkGenerator);
        LevelStem voidStem = new LevelStem(dimTypes.getOrThrow(THE_VOID_TYPE), wrappedChunkGenerator);

        context.register(MINETOPIA_KEY, minetopiaStem);
        context.register(NIGHTMARE_KEY, nightmareStem);
        context.register(SPIRIT_KEY, spiritStem);
        context.register(THE_VOID_KEY, voidStem);
    }
}
