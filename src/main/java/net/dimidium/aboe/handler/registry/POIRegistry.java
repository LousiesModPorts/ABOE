package net.dimidium.aboe.handler.registry;

import com.google.common.collect.ImmutableSet;
import net.dimidium.aboe.util.Constants;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class POIRegistry
{
    public static final DeferredRegister<PoiType> POI = DeferredRegister.create(Registries.POINT_OF_INTEREST_TYPE, Constants.MOD_ID);

    public static final DeferredHolder<PoiType, PoiType> MINETOPIA_PORTAL = POI.register("minetopia_portal", () -> new PoiType(ImmutableSet.copyOf(BlockRegistry.MINETOPIA_PORTAL.get().getStateDefinition().getPossibleStates()), 0, 1));
    public static final DeferredHolder<PoiType, PoiType> VOID_PORTAL = POI.register("void_portal", () -> new PoiType(ImmutableSet.copyOf(BlockRegistry.VOID_PORTAL.get().getStateDefinition().getPossibleStates()), 0, 1));


    public static void registerPOIs(IEventBus eventBus)
    {
        POI.register(eventBus);
    }
}
