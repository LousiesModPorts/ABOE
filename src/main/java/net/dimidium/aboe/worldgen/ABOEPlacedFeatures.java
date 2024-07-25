package net.dimidium.aboe.worldgen;

import net.dimidium.aboe.util.Constants;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ABOEPlacedFeatures
{
    public static final ResourceKey<PlacedFeature> ALUMINIUM_ORE_PLACED_KEY = registerKey("aluminium_ore_placed");
    public static final ResourceKey<PlacedFeature> COPPER_ORE_PLACED_KEY = registerKey("copper_ore_placed");
    public static final ResourceKey<PlacedFeature> ENERGIZED_ORE_PLACED_KEY = registerKey("energized_ore_placed");
    public static final ResourceKey<PlacedFeature> IRIDIUM_ORE_PLACED_KEY = registerKey("iridium_ore_placed");
    public static final ResourceKey<PlacedFeature> LEAD_ORE_PLACED_KEY = registerKey("lead_ore_placed");
    public static final ResourceKey<PlacedFeature> NICKEL_ORE_PLACED_KEY = registerKey("nickel_ore_placed");
    public static final ResourceKey<PlacedFeature> PLATINUM_ORE_PLACED_KEY = registerKey("platinum_ore_placed");
    public static final ResourceKey<PlacedFeature> SILVER_ORE_PLACED_KEY = registerKey("silver_ore_placed");
    public static final ResourceKey<PlacedFeature> TIN_ORE_PLACED_KEY = registerKey("tin_ore_placed");
    public static final ResourceKey<PlacedFeature> URANIUM_ORE_PLACED_KEY = registerKey("uranium_ore_placed");

    //public static final ResourceKey<PlacedFeature> RUBBER_PLACED_KEY = registerKey("rubber_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context)
    {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);
        register(context, ALUMINIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ABOEConfiguredFeatures.ALUMINIUM_ORE_KEY),
                commonOrePlacement(10, 
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(40), VerticalAnchor.belowTop(75))
                )
        );

        register(context, COPPER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ABOEConfiguredFeatures.COPPER_ORE_KEY),
            commonOrePlacement(10,
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(40), VerticalAnchor.belowTop(75))
            )
        );

        register(context, ENERGIZED_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ABOEConfiguredFeatures.ENERGIZED_ORE_KEY),
                commonOrePlacement(10,
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(40), VerticalAnchor.belowTop(75))
                )
        );

        register(context, IRIDIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ABOEConfiguredFeatures.IRIDIUM_ORE_KEY),
                rareOrePlacement(1,
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(5), VerticalAnchor.belowTop(30))
                )
        );


        register(context, LEAD_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ABOEConfiguredFeatures.LEAD_ORE_KEY),
                commonOrePlacement(8,
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop( 35))
                )
        );


        register(context, NICKEL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ABOEConfiguredFeatures.NICKEL_ORE_KEY),
                commonOrePlacement(3,
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(5),  VerticalAnchor.belowTop(20))
                )
        );


        register(context, PLATINUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ABOEConfiguredFeatures.PLATINUM_ORE_KEY),
                rareOrePlacement(1,
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(5), VerticalAnchor.belowTop(30))
                )
        );

        register(context, SILVER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ABOEConfiguredFeatures.SILVER_ORE_KEY),
                commonOrePlacement(6,
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(5),  VerticalAnchor.belowTop(30))
                )
        );

        register(context, TIN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ABOEConfiguredFeatures.TIN_ORE_KEY),
                commonOrePlacement(8,
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(20), VerticalAnchor.belowTop(55))
                )

        );


        register(context, URANIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ABOEConfiguredFeatures.URANIUM_ORE_KEY),
                commonOrePlacement(2, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(5), VerticalAnchor.belowTop(30))
                )
        );

       /* register(context, RUBBER_PLACED_KEY, configuredFeatures.getOrThrow(ABOEConfiguredFeatures.RUBBER_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2), BlockRegistry.RUBBER_SAPLING.get()));*/
    }

    private static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_)
    {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    private static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_)
    {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    private static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_)
    {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }

    private static ResourceKey<PlacedFeature> registerKey(String name)
    {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, name));
    }

        private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
            List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
