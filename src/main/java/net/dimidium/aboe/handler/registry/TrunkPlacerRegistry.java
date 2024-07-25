package net.dimidium.aboe.handler.registry;

import net.dimidium.aboe.util.Constants;
import net.dimidium.aboe.worldgen.tree.RubberTrunkPlacer;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class TrunkPlacerRegistry
{
    private static final DeferredRegister<TrunkPlacerType<?>> TRUNK_PLACERS = DeferredRegister.create(Registries.TRUNK_PLACER_TYPE, Constants.MOD_ID);

    //todo public static final DeferredHolder<TrunkPlacerType<RubberTrunkPlacer>, TrunkPlacerType<RubberTrunkPlacer>> RUBBER = TRUNK_PLACERS.register("rubber_trunk_placer", () -> new TrunkPlacerType<>(RubberTrunkPlacer.CODEC));

    public static void register(IEventBus eventBus)
    {
        TRUNK_PLACERS.register(eventBus);
    }
}
