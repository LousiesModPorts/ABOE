package net.dimidium.aboe.worldgen;

import net.dimidium.aboe.util.Constants;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class ABOEBiomeModifiers
{
    public static final ResourceKey<BiomeModifier> ADD_ALUMINIUM_ORE = registerKey("add_aluminium_ore");
    private static final ResourceKey<BiomeModifier> ADD_COPPER_ORE = registerKey("add_copper_ore");
    private static final ResourceKey<BiomeModifier> ADD_ENERGIZED_ORE = registerKey("add_energized_ore");
    private static final ResourceKey<BiomeModifier> ADD_IRIDIUM_ORE = registerKey("add_iridium_ore");
    private static final ResourceKey<BiomeModifier> ADD_LEAD_ORE = registerKey("add_lead_ore");
    private static final ResourceKey<BiomeModifier> ADD_NICKEL_ORE = registerKey("add_nickel_ore");
    private static final ResourceKey<BiomeModifier> ADD_PLATINUM_ORE = registerKey("add_platinum_ore");
    private static final ResourceKey<BiomeModifier> ADD_SILVER_ORE = registerKey("add_silver_ore");
    private static final ResourceKey<BiomeModifier> ADD_TIN_ORE = registerKey("add_tin_ore");
    private static final ResourceKey<BiomeModifier> ADD_URANIUM_ORE = registerKey("add_uranium_ore");
    public static final ResourceKey<BiomeModifier> ADD_RUBBER_TREE = registerKey("add_rubber_tree");

    public static void bootstrap(BootstapContext<BiomeModifier> context)
    {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_ALUMINIUM_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ABOEPlacedFeatures.ALUMINIUM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_COPPER_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ABOEPlacedFeatures.COPPER_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_ENERGIZED_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ABOEPlacedFeatures.ENERGIZED_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_IRIDIUM_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ABOEPlacedFeatures.IRIDIUM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_LEAD_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ABOEPlacedFeatures.LEAD_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_NICKEL_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ABOEPlacedFeatures.NICKEL_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_PLATINUM_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ABOEPlacedFeatures.PLATINUM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_SILVER_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ABOEPlacedFeatures.SILVER_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_TIN_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ABOEPlacedFeatures.TIN_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_URANIUM_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ABOEPlacedFeatures.URANIUM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_RUBBER_TREE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_CONIFEROUS),
                HolderSet.direct(placedFeatures.getOrThrow(ABOEPlacedFeatures.RUBBER_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
    }

    private static ResourceKey<BiomeModifier> registerKey(String name)
    {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(Constants.MOD_ID, name));
    }
}
