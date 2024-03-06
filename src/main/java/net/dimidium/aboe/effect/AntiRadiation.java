package net.dimidium.aboe.effect;

import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;

public class AntiRadiation extends MobEffect
{
    public AntiRadiation()
    {
        super(MobEffectCategory.BENEFICIAL, 0x98D982);
    }

    @Override
    public int getColor()
    {
        return Mth.hsvToRgb(0, 0,0);
    }

}
