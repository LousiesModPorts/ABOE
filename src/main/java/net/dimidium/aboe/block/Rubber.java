package net.dimidium.aboe.block;

import net.dimidium.dimidiumcore.api.block.BlockBase;
import net.dimidium.dimidiumcore.api.util.IBlockTab;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class Rubber extends BlockBase implements IBlockTab
{
    private static final VoxelShape SHAPE = BlockBase.box(0.2, 0.2, 0.2, 0.2, 0.2D, 0.2);

    public Rubber()
    {
        super(5f, 5f, SoundType.WOOD);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context)
    {
        return SHAPE;
    }
}
