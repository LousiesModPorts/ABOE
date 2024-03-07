package net.dimidium.aboe.block;

import net.dimidium.aboe.handler.registry.BlockRegistry;
import net.dimidium.aboe.handler.registry.ItemRegistry;
import net.dimidium.dimidiumcore.api.block.BlockBase;
import net.dimidium.dimidiumcore.api.util.IBlockTab;
import net.dimidium.dimidiumcore.api.util.ParticleUtil;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.DustParticleOptions;
import net.minecraft.network.chat.Component;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector3f;

import java.util.List;

public class Ore extends BlockBase implements IBlockTab
{
    static Vector3f energized = Vec3.fromRGB24((int) ParticleUtil.MakeRgb((byte) 255, (byte) 255, (byte) 0)).toVector3f();
    static Vector3f uranium = Vec3.fromRGB24((int) ParticleUtil.MakeRgb((byte) 18, (byte) 77, (byte) 22)).toVector3f();

    public Ore(float hardness, float resistance, SoundType soundType)
    {
        super(hardness, resistance, soundType);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack item, @Nullable BlockGetter blockGetter, List<Component> tooltip, TooltipFlag flag)
    {
        if(item.is(ItemRegistry.URANIUM_ORE.get()) || item.is(ItemRegistry.DEEP_SLATE_URANIUM_ORE.get()))
        {
            //TODO Add this to translation maybe?

            tooltip.add(Component.literal("WARNING: HOLDING THIS BLOCK WITHOUT RADIATION PROTECTION WILL CAUSE RADIATION SICKNESS! ")
                    .withStyle(ChatFormatting.RED)
                    .append(Component.literal("(Configurable) (NYI)")
                            .withStyle(ChatFormatting.DARK_AQUA))
            );
        }
    }

    @Override
    public boolean isRandomlyTicking(BlockState state)
    {
        return state.getBlock().equals(BlockRegistry.ENERGIZED_ORE.get()) || state.getBlock().equals(BlockRegistry.URANIUM_ORE.get()) || state.getBlock().equals(BlockRegistry.DEEP_SLATE_ENERGIZED_ORE.get()) || state.getBlock().equals(BlockRegistry.DEEP_SLATE_URANIUM_ORE.get());
    }

    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random)
    {
        if(state.getBlock().equals(BlockRegistry.ENERGIZED_ORE.get()) || state.getBlock().equals(BlockRegistry.DEEP_SLATE_ENERGIZED_ORE.get()))
        {
            spawnParticles(level, pos, energized);
        }

        else if(state.getBlock().equals(BlockRegistry.URANIUM_ORE.get()) || state.getBlock().equals(BlockRegistry.DEEP_SLATE_URANIUM_ORE.get()))
        {
            spawnParticles(level, pos, uranium);
        }
    }

    @Override
    public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos)
    {
        if(state.getBlock().equals(BlockRegistry.ENERGIZED_ORE.get()) || state.getBlock().equals(BlockRegistry.DEEP_SLATE_ENERGIZED_ORE.get()) || state.getBlock().equals(BlockRegistry.URANIUM_ORE.get()) || state.getBlock().equals(BlockRegistry.DEEP_SLATE_URANIUM_ORE.get()))
        {
            return 9;
        }

        return super.getLightEmission(state, level, pos);
    }

    private static void spawnParticles(Level level, BlockPos pos, Vector3f color)
    {
        double d0 = 0.5625;
        RandomSource randomsource = level.random;
        Direction[] directions = Direction.values();
        int directionCount = directions.length;

        for(int i = 0; i < directionCount; ++i)
        {
            Direction direction = directions[i];
            BlockPos blockpos = pos.relative(direction);

            if (!level.getBlockState(blockpos).isSolidRender(level, blockpos))
            {
                Direction.Axis direction$axis = direction.getAxis();
                double d1 = direction$axis == Direction.Axis.X ? 0.5 + 0.5625 * (double)direction.getStepX() : (double)randomsource.nextFloat();
                double d2 = direction$axis == Direction.Axis.Y ? 0.5 + 0.5625 * (double)direction.getStepY() : (double)randomsource.nextFloat();
                double d3 = direction$axis == Direction.Axis.Z ? 0.5 + 0.5625 * (double)direction.getStepZ() : (double)randomsource.nextFloat();
                level.addParticle(new DustParticleOptions(color, 1.0F), (double)pos.getX() + d1, (double)pos.getY() + d2, (double)pos.getZ() + d3, 0.0, 0.0, 0.0);
            }
        }
    }
}
