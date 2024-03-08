package net.dimidium.aboe.worldgen.biome;

import net.dimidium.aboe.util.Constants;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.*;

public class ABOEBiomes
{
    public static final ResourceKey<Biome> THE_VOID = ResourceKey.create(Registries.BIOME, new ResourceLocation(Constants.MOD_ID, "the_void"));

    public static void bootstrap(BootstapContext<Biome> context)
    {
        context.register(THE_VOID, voidBiome(context));
    }

    public static void globalOverworldGeneration(BiomeGenerationSettings.Builder builder)
    {

    }

    public static Biome voidBiome(BootstapContext<Biome> context)
    {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 5, 4, 4));
        BiomeDefaultFeatures.commonSpawns(spawnBuilder);

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(Registries.PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));
        globalOverworldGeneration(biomeBuilder);

        return new Biome.BiomeBuilder()
                .temperature(1F)
                .downfall(0.0F)
                .hasPrecipitation(false)
                .temperatureAdjustment(Biome.TemperatureModifier.NONE)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects(new BiomeSpecialEffects.Builder()
                        .skyColor(8103167)
                        .fogColor(12638463)
                        .waterColor(4445678)
                        .waterFogColor(270131)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .build())
                .build();
    }
}
