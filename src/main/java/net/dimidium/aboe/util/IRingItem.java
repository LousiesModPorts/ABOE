package net.dimidium.aboe.util;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;

public interface IRingItem
{
    Double getCapacity(double feCapacity);

    Double getUse (double feUse);

    MobEffectInstance applyEffect(MobEffect effect, int strength, int duration);
}
