package net.dimidium.aboe.data;

import net.dimidium.aboe.handler.registry.DamageTypeRegistry;
import net.dimidium.aboe.worldgen.ABOEBiomeModifiers;
import net.dimidium.aboe.worldgen.ABOEConfiguredFeatures;
import net.dimidium.aboe.worldgen.ABOEPlacedFeatures;
import net.dimidium.aboe.util.Constants;
import net.dimidium.aboe.worldgen.biome.ABOEBiomes;
import net.dimidium.aboe.worldgen.dimension.ABOEDimensions;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ABOEWorldGen extends DatapackBuiltinEntriesProvider
{
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.NOISE_SETTINGS, ABOEDimensions::bootstrapNoise)
            .add(Registries.DIMENSION_TYPE, ABOEDimensions::bootstrapType)
            .add(Registries.CONFIGURED_FEATURE, ABOEConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, ABOEPlacedFeatures::bootstrap)
            .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ABOEBiomeModifiers::bootstrap)
            .add(Registries.BIOME, ABOEBiomes::bootstrap)
            .add(Registries.LEVEL_STEM, ABOEDimensions::bootstrapStem)
            .add(Registries.DAMAGE_TYPE, DamageTypeRegistry::bootstrap);

    public ABOEWorldGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries, BUILDER, Set.of(Constants.MOD_ID));
    }
}
