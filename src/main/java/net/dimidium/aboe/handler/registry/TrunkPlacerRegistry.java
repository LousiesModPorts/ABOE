package net.dimidium.aboe.handler.registry;

import net.dimidium.aboe.util.Constants;
import net.dimidium.aboe.worldgen.tree.RubberTrunkPlacer;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class TrunkPlacerRegistry
{
    private static final DeferredRegister<TrunkPlacerType<?>> TRUNK_PLACERS = DeferredRegister.create(Registries.TRUNK_PLACER_TYPE, Constants.MOD_ID);

    public static final RegistryObject<TrunkPlacerType<RubberTrunkPlacer>> RUBBER = TRUNK_PLACERS.register("rubber_trunk_placer", () -> new TrunkPlacerType<>(RubberTrunkPlacer.CODEC));

    public static void register()
    {
        TRUNK_PLACERS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
