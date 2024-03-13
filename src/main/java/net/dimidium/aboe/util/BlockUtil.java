package net.dimidium.aboe.util;

import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.AABB;

public class BlockUtil
{
    public static AABB expandAround(BlockPos pos, int x, int y, int z)
    {
        return new AABB(pos.getX(), pos.getY(), pos.getZ(), pos.getX() + x, pos.getY() + y, pos.getZ() + z);
    }

    public static AABB expandAround(BlockPos pos, double x, double y, double z)
    {
        return new AABB(pos.getX(), pos.getY(), pos.getZ(), pos.getX() + x, pos.getY() + y, pos.getZ() + z);
    }
}
