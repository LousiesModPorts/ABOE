package net.dimidium.aboe.effect;
import net.dimidium.aboe.util.BlockUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.player.Player;

import java.util.List;

public class EntityPuller extends MobEffect
{
    public EntityPuller()
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

                List<LivingEntity> ENTITIES = player.level().getEntitiesOfClass(LivingEntity.class, BlockUtil.expandAround(new BlockPos((int) player.getX(), (int) player.getY(), (int) player.getZ()), 15, 15, 15));

                for(LivingEntity livingEntity : ENTITIES)
                {

                    if(livingEntity instanceof Creeper creeper)
                    {
                        creeper.setNoAi(true);
                        creeper.teleportTo(player.getOnPos().offset(2,2,2).getX(),
                                player.getOnPos().offset(2, 2, 2).getY(),
                                player.getOnPos().offset(2,2,2).getZ());
                        creeper.lerpMotion(0,0,0);
                    }

                    else
                    {
                        if(!(livingEntity instanceof Player))
                        {
                            livingEntity.teleportTo(
                                    player.getOnPos().offset(2,2,2).getX(),
                                    player.getOnPos().offset(2, 2, 2).getY(),
                                    player.getOnPos().offset(2,2,2).getZ());
                            livingEntity.lerpMotion(0,0,0);
                        }

                    }
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
