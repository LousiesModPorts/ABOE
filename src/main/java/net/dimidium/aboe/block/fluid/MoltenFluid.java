package net.dimidium.aboe.block.fluid;

import net.dimidium.aboe.handler.registry.DamageTypeRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FlowingFluid;

import java.util.function.Supplier;

public class MoltenFluid extends LiquidBlock
{
    public MoltenFluid(FlowingFluid flowingFluid, Properties properties)
    {
        super(flowingFluid, properties);
    }

    //TODO Damage mobs maybe?

    @Override
    public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity)
    {
        if(entity instanceof final Player player)
        {
            player.hurt(level.damageSources().source(DamageTypeRegistry.MOLTEN, player), 0.5F);
            player.setRemainingFireTicks(1);
        }
    }

    @Override
    public void entityInside(BlockState state, Level level, BlockPos pos, Entity entity)
    {
        if(entity instanceof final Player player)
        {
            player.hurt(level.damageSources().source(DamageTypeRegistry.MOLTEN, player), 0.5F);
            player.setRemainingFireTicks(1);
        }
    }
}