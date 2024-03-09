package net.dimidium.aboe.handler.registry;

import com.google.common.collect.ImmutableSet;
import net.dimidium.aboe.util.Constants;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class POIRegistry
{
    public static final DeferredRegister<PoiType> POI = DeferredRegister.create(ForgeRegistries.POI_TYPES, Constants.MOD_ID);

    public static final RegistryObject<PoiType> MINETOPIA_PORTAL = POI.register("minetopia_portal", () -> new PoiType(ImmutableSet.copyOf(BlockRegistry.MINETOPIA_PORTAL.get().getStateDefinition().getPossibleStates()), 0, 1));
    public static final RegistryObject<PoiType> VOID_PORTAL = POI.register("void_portal", () -> new PoiType(ImmutableSet.copyOf(BlockRegistry.VOID_PORTAL.get().getStateDefinition().getPossibleStates()), 0, 1));


    public static void registerPOIs()
    {
        POI.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
