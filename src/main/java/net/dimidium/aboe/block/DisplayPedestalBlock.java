package net.dimidium.aboe.block;

import net.dimidium.aboe.blockentity.DisplayPedestalBlockEntity;
import net.dimidium.aboe.handler.registry.BlockEntityRegistry;
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
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

public class DisplayPedestalBlock extends Block implements EntityBlock, IBlockTab
{
    public DisplayPedestalBlock()
    {
        super(BlockBehaviour.Properties.of() .strength(30.0F, 1000.0F).sound(SoundType.ANVIL));
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(@NotNull BlockPos pos, @NotNull BlockState state)
    {
        return BlockEntityRegistry.DISPLAY_PEDESTAL.get().create(pos, state);
    }

    @SuppressWarnings("deprecation")
    @Override
    public @NotNull InteractionResult use(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, @NotNull Player player, @NotNull InteractionHand hand, @NotNull BlockHitResult hitResult)
    {
        BlockEntity be = level.getBlockEntity(pos);

        if (!(be instanceof DisplayPedestalBlockEntity blockEntity))
        {
            return InteractionResult.PASS;
        }

        if (level.isClientSide())
        {
            return InteractionResult.SUCCESS;
        }

        if (player instanceof ServerPlayer sPlayer)
        {
            sPlayer.openMenu(blockEntity);
        }

        return InteractionResult.CONSUME;
    }

    @SuppressWarnings("deprecation")
    @Override
    public void onRemove(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, @NotNull BlockState newState, boolean isMoving)
    {
        BlockEntity be = level.getBlockEntity(pos);
        if (be instanceof DisplayPedestalBlockEntity blockEntity)
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