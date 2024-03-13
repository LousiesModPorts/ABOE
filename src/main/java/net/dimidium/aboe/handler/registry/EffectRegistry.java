package net.dimidium.aboe.handler.registry;

import net.dimidium.aboe.effect.*;
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
    public static final RegistryObject<MobEffect> BREEDING = EFFECTS.register("breeding", Breeding::new);
    public static final RegistryObject<MobEffect> ENTITY_PULLER = EFFECTS.register("entity_puller", EntityPuller::new);
    public static final RegistryObject<MobEffect> FLIGHT = EFFECTS.register("flight", Flight::new);
    public static final RegistryObject<MobEffect> FREEZE = EFFECTS.register("freeze", Freeze::new);
    public static final RegistryObject<MobEffect> GREEN_THUMB = EFFECTS.register("green_thumb", GreenThumb::new);
    public static final RegistryObject<MobEffect> MAGNETIZATION = EFFECTS.register("magnetization", Magnetization::new);
    public static final RegistryObject<MobEffect> STEP_ASSIST = EFFECTS.register("step_assist", StepAssist::new);

    public static void registerEffects()
    {
        EFFECTS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
