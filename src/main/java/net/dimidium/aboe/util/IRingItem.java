package net.dimidium.aboe.util;

import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;

public interface IRingItem
{
    Double getCapacity(double feCapacity);

    Double getUse (double feUse);

    MobEffectInstance applyEffect(Holder<MobEffect> effect, int strength, int duration);
}
