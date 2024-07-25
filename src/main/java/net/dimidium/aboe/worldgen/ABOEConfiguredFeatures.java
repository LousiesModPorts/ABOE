package net.dimidium.aboe.worldgen;

import net.dimidium.aboe.handler.registry.BlockRegistry;
import net.dimidium.aboe.util.Constants;
import net.dimidium.aboe.worldgen.tree.RubberTrunkPlacer;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ABOEConfiguredFeatures
{
    public static final ResourceKey<ConfiguredFeature<?, ?>> ALUMINIUM_ORE_KEY = registerKey("aluminium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> COPPER_ORE_KEY = registerKey("copper_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ENERGIZED_ORE_KEY = registerKey("energized_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> IRIDIUM_ORE_KEY = registerKey("iridium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LEAD_ORE_KEY = registerKey("lead_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NICKEL_ORE_KEY = registerKey("nickel_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PLATINUM_ORE_KEY = registerKey("platinum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SILVER_ORE_KEY = registerKey("silver_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TIN_ORE_KEY = registerKey("tin_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> URANIUM_ORE_KEY = registerKey("uranium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RUBBER_KEY = registerKey("rubber");


    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context)
    {
        RuleTest STONE_ORE_REPLACEABLES = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest DEEPSLATE_ORE_REPLACEABLES = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest NETHER_REPLACEABLES = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest END_REPLACEABLES = new BlockMatchTest(Blocks.END_STONE);

        List<OreConfiguration.TargetBlockState> ALUMINIUM_ORE_CONFIGURATION = List.of(OreConfiguration
                        .target(STONE_ORE_REPLACEABLES,
                                BlockRegistry.ALUMINIUM_ORE.get().defaultBlockState()),
                OreConfiguration
                        .target(DEEPSLATE_ORE_REPLACEABLES, BlockRegistry.DEEP_SLATE_ALUMINIUM_ORE.get().defaultBlockState())
        );

       List<OreConfiguration.TargetBlockState> COPPER_ORE_CONFIGURATION = List.of(
               OreConfiguration
                       .target(STONE_ORE_REPLACEABLES,
                               BlockRegistry.COPPER_ORE.get().defaultBlockState()),
               OreConfiguration
                       .target(DEEPSLATE_ORE_REPLACEABLES,
                               BlockRegistry.DEEP_SLATE_COPPER_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> ENERGIZED_ORE_CONFIGURATION = List.of(
                OreConfiguration
                        .target(STONE_ORE_REPLACEABLES,
                                BlockRegistry.ENERGIZED_ORE.get().defaultBlockState()),
                OreConfiguration
                        .target(DEEPSLATE_ORE_REPLACEABLES,
                                BlockRegistry.DEEP_SLATE_ENERGIZED_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> IRIDIUM_ORE_CONFIGURATION = List.of(
                OreConfiguration
                        .target(STONE_ORE_REPLACEABLES, BlockRegistry.IRIDIUM_ORE.get().defaultBlockState()),
                OreConfiguration
                        .target(DEEPSLATE_ORE_REPLACEABLES, BlockRegistry.DEEP_SLATE_IRIDIUM_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> LEAD_ORE_CONFIGURATION = List.of(
                OreConfiguration
                        .target(STONE_ORE_REPLACEABLES, BlockRegistry.LEAD_ORE.get().defaultBlockState()),
                OreConfiguration.target(DEEPSLATE_ORE_REPLACEABLES, BlockRegistry.DEEP_SLATE_LEAD_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> NICKEL_ORE_CONFIGURATION = List.of(
                OreConfiguration.
                        target(STONE_ORE_REPLACEABLES, BlockRegistry.NICKEL_ORE.get().defaultBlockState()),
                OreConfiguration
                        .target(DEEPSLATE_ORE_REPLACEABLES, BlockRegistry.DEEP_SLATE_LEAD_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> PLATINUM_ORE_CONFIGURATION = List.of(
                OreConfiguration
                        .target(STONE_ORE_REPLACEABLES, BlockRegistry.PLATINUM_ORE.get().defaultBlockState()),
                OreConfiguration
                        .target(DEEPSLATE_ORE_REPLACEABLES, BlockRegistry.DEEP_SLATE_PLATINUM_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> SILVER_ORE_CONFIGURATION = List.of(
                OreConfiguration
                        .target(STONE_ORE_REPLACEABLES, BlockRegistry.SILVER_ORE.get().defaultBlockState()),
                OreConfiguration.target(DEEPSLATE_ORE_REPLACEABLES, BlockRegistry.DEEP_SLATE_SILVER_ORE.get().defaultBlockState())
        );


        List<OreConfiguration.TargetBlockState> TIN_ORE_CONFIGURATION = List.of(
                OreConfiguration
                        .target(STONE_ORE_REPLACEABLES, BlockRegistry.TIN_ORE.get().defaultBlockState()),
                OreConfiguration
                        .target(DEEPSLATE_ORE_REPLACEABLES, BlockRegistry.DEEP_SLATE_TIN_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> URANIUM_ORE_CONFIGURATION = List.of(
                OreConfiguration
                        .target(STONE_ORE_REPLACEABLES, BlockRegistry.URANIUM_ORE.get().defaultBlockState()),
                OreConfiguration
                        .target(DEEPSLATE_ORE_REPLACEABLES, BlockRegistry.DEEP_SLATE_URANIUM_ORE.get().defaultBlockState())
        );

        register(context, ALUMINIUM_ORE_KEY, Feature.ORE, new OreConfiguration(ALUMINIUM_ORE_CONFIGURATION, 6));
        register(context, COPPER_ORE_KEY, Feature.ORE, new  OreConfiguration(COPPER_ORE_CONFIGURATION, 8));
        register(context, ENERGIZED_ORE_KEY, Feature.ORE, new OreConfiguration(ENERGIZED_ORE_CONFIGURATION, 4));
        register(context, IRIDIUM_ORE_KEY, Feature.ORE, new OreConfiguration(IRIDIUM_ORE_CONFIGURATION, 2));
        register(context,LEAD_ORE_KEY, Feature.ORE, new OreConfiguration(LEAD_ORE_CONFIGURATION, 8));
        register(context, NICKEL_ORE_KEY, Feature.ORE, new OreConfiguration(NICKEL_ORE_CONFIGURATION, 4));
        register(context, PLATINUM_ORE_KEY, Feature.ORE, new OreConfiguration(PLATINUM_ORE_CONFIGURATION, 3));
        register(context, SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(SILVER_ORE_CONFIGURATION, 4));
        register(context, TIN_ORE_KEY, Feature.ORE, new OreConfiguration(TIN_ORE_CONFIGURATION, 8));
        register(context, URANIUM_ORE_KEY, Feature.ORE, new OreConfiguration(URANIUM_ORE_CONFIGURATION, 2));

        register(context, RUBBER_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(BlockRegistry.RUBBER_LOG.get()),
                new RubberTrunkPlacer(5, 4, 3),

                BlockStateProvider.simple(BlockRegistry.RUBBER_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),

                new TwoLayersFeatureSize(1, 0, 2)).build());

    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration)
    {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name)
    {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, name));
    }
}
