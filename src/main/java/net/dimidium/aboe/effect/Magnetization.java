package net.dimidium.aboe.effect;

import net.dimidium.aboe.util.BlockUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;

import java.util.List;

public class Magnetization extends MobEffect
{
    public Magnetization()
    {
        super(MobEffectCategory.NEUTRAL, 0x98D982);
    }

    @Override
    public int getColor()
    {
        return Mth.hsvToRgb(0, 0,0);
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier)
    {
        if(!entity.level().isClientSide)
        {
            if(entity instanceof Player)
            {
                final Player player = (Player) entity;

                List<ItemEntity> ENTITIES = player.level().getEntitiesOfClass(ItemEntity.class, BlockUtil.expandAround(new BlockPos((int) player.getX(), (int) player.getY(), (int) player.getZ()), 15, 15, 15));

                for(ItemEntity itemEntity : ENTITIES)
                {
                    itemEntity.teleportTo(
                            player.getX(),
                            player.getY(),
                            player.getZ()
                    );
                    itemEntity.setDefaultPickUpDelay();
                }
            }
        }
    }

    @Override
    public boolean isDurationEffectTick(int p_19455_, int p_19456_)
    {
        return true;
    }
}
