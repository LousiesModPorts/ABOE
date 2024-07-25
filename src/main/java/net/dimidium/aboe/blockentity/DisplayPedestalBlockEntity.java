/*
package net.dimidium.aboe.blockentity;

import net.dimidium.aboe.handler.registry.BlockEntityRegistry;
import net.dimidium.aboe.inventory.menu.DisplayPedestalMenu;
import net.dimidium.aboe.util.Constants;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

public class DisplayPedestalBlockEntity extends BlockEntity implements MenuProvider
{
    private static final Component TITLE =
            Component.translatable("container." + Constants.MOD_ID + ".example_ber_block");

    private final ItemStackHandler inventory = new ItemStackHandler(1)
    {
        @Override
        protected void onContentsChanged(int slot)
        {
            super.onContentsChanged(slot);
            DisplayPedestalBlockEntity.this.setChanged();
            if (level != null)
            {
                level.sendBlockUpdated(getBlockPos(), getBlockState(), getBlockState(), Block.UPDATE_ALL);
            }
        }
    };

    private final LazyOptional<ItemStackHandler> optional = LazyOptional.of(() -> this.inventory);

    public DisplayPedestalBlockEntity(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.DISPLAY_PEDESTAL.get(), pos, state);
    }

    @Override
    public void load(@NotNull CompoundTag nbt)
    {
        super.load(nbt);
        CompoundTag tutorialmodData = nbt.getCompound(Constants.MOD_ID);
        this.inventory.deserializeNBT(tutorialmodData.getCompound("Inventory"));
    }

    @Override
    protected void saveAdditional(@NotNull CompoundTag nbt)
    {
        super.saveAdditional(nbt);
        var tutorialmodData = new CompoundTag();
        tutorialmodData.put("Inventory", this.inventory.serializeNBT());
        nbt.put(Constants.MOD_ID, tutorialmodData);
    }

    @Override
    public @NotNull <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap)
    {
        return cap == ForgeCapabilities.ITEM_HANDLER ? this.optional.cast() : super.getCapability(cap);
    }

    @Override
    public void invalidateCaps()
    {
        super.invalidateCaps();
        this.optional.invalidate();
    }

    public ItemStackHandler getInventory() {
        return this.inventory;
    }

    public LazyOptional<ItemStackHandler> getOptional()
    {
        return this.optional;
    }

    @Override
    public @NotNull Component getDisplayName()
    {
        return TITLE;
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerId, @NotNull Inventory pPlayerInventory, @NotNull Player pPlayer)
    {
        return new DisplayPedestalMenu(pContainerId, pPlayerInventory, this);
    }

    @Override
    public @NotNull CompoundTag getUpdateTag()
    {
        return saveWithoutMetadata();
    }

    @Nullable
    @Override
    public Packet<ClientGamePacketListener> getUpdatePacket()
    {
        return ClientboundBlockEntityDataPacket.create(this);
    }
}*/
