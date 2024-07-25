/*
package net.dimidium.aboe.block.tank.portable;

import net.dimidium.aboe.blockentity.DisplayPedestalBlockEntity;
import net.dimidium.aboe.handler.registry.BlockEntityRegistry;
import net.dimidium.dimidiumcore.api.block.BlockBase;
import net.dimidium.dimidiumcore.api.util.IBlockTab;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.fluids.capability.templates.FluidTank;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

//TODO cleanup this, one class for each kind of potable fluid tank
public class BasicPFTBlock extends BlockBase implements EntityBlock, IBlockTab
{
    public BasicPFTBlock()
    {
        super(45.0F, 250.0F, SoundType.GLASS);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(@NotNull BlockPos pos, @NotNull BlockState state)
    {
        return BlockEntityRegistry.PORTABLE_FLUI_TANK.get().create(pos, state);
    }

    @org.jetbrains.annotations.Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level p_153212_, BlockState p_153213_, BlockEntityType<T> p_153214_)
    {
        return EntityBlock.super.getTicker(p_153212_, p_153213_, p_153214_);
    }

    @SuppressWarnings("deprecation")
    @Override
    public @NotNull InteractionResult use(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, @NotNull Player player, @NotNull InteractionHand hand, @NotNull BlockHitResult hitResult)
    {
        BlockEntity be = pLevel.getBlockEntity(pPos);
        if (!(be instanceof ExampleFluidBlockEntity blockEntity))
            return InteractionResult.PASS;

        if (pLevel.isClientSide())
            return InteractionResult.SUCCESS;

        // open screen
        if(pPlayer instanceof ServerPlayer sPlayer) {
            sPlayer.openMenu(blockEntity, pPos);
        }

        return InteractionResult.CONSUME;
    }

    @Override
    public void onRemove(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, @NotNull BlockState newState, boolean isMoving)
    {
        BlockEntity be = level.getBlockEntity(pos);

        if (be instanceof PFTBlockEntity blockEntity)
        {
            blockEntity.getOptional().ifPresent(handler ->
            {
                for (int i = 0; i < handler.getSlots(); i++)
                {
                    Block.popResource(level, pos, handler.getStackInSlot(i));
                }
            });
        }
    }
}
*/
