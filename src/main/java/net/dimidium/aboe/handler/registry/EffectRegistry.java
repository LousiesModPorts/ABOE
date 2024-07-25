package net.dimidium.aboe.handler.registry;

import net.dimidium.aboe.effect.*;
import net.dimidium.aboe.util.Constants;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffect;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class EffectRegistry
{
    private static final DeferredRegister<MobEffect> EFFECTS = DeferredRegister.create(Registries.MOB_EFFECT, Constants.MOD_ID);

    public static final DeferredHolder<MobEffect,MobEffect> ANTI_RADIATION = EFFECTS.register("anti_radiation", AntiRadiation::new);
    public static final DeferredHolder<MobEffect,MobEffect> BREEDING = EFFECTS.register("breeding", Breeding::new);
    public static final DeferredHolder<MobEffect,MobEffect> ENTITY_PULLER = EFFECTS.register("entity_puller", EntityPuller::new);
    public static final DeferredHolder<MobEffect,MobEffect> FLIGHT = EFFECTS.register("flight", Flight::new);
    public static final DeferredHolder<MobEffect,MobEffect> FREEZE = EFFECTS.register("freeze", Freeze::new);
    public static final DeferredHolder<MobEffect,MobEffect> GREEN_THUMB = EFFECTS.register("green_thumb", GreenThumb::new);
    public static final DeferredHolder<MobEffect,MobEffect> MAGNETIZATION = EFFECTS.register("magnetization", Magnetization::new);
    public static final DeferredHolder<MobEffect,MobEffect> STEP_ASSIST = EFFECTS.register("step_assist", StepAssist::new);

    public static void registerEffects(IEventBus eventBus)
    {
        EFFECTS.register(eventBus);
    }
}
