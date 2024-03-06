package net.dimidium.aboe.handler.registry;

import net.dimidium.aboe.effect.AntiRadiation;
import net.dimidium.aboe.util.Constants;
import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EffectRegistry
{
    private static final DeferredRegister<MobEffect> EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, Constants.MOD_ID);

    public static final RegistryObject<MobEffect> ANTI_RADIATION = EFFECTS.register("anti_radiation", AntiRadiation::new);

    public static void registerEffects()
    {
        EFFECTS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
