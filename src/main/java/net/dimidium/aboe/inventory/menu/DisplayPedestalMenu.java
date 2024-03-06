package net.dimidium.aboe.inventory.menu;

import net.dimidium.aboe.blockentity.DisplayPedestalBlockEntity;
import net.dimidium.aboe.handler.registry.BlockRegistry;
import net.dimidium.aboe.handler.registry.ContainerRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.items.SlotItemHandler;
import org.jetbrains.annotations.NotNull;

public class DisplayPedestalMenu extends AbstractContainerMenu
{
    private final DisplayPedestalBlockEntity blockEntity;
    private final ContainerLevelAccess levelAccess;

    public DisplayPedestalMenu(int containerId, Inventory playerInv, BlockPos blockPos)
    {
        this(containerId, playerInv, playerInv.player.level().getBlockEntity(blockPos));
    }

    public DisplayPedestalMenu(int containerId, Inventory playerInv, BlockEntity blockEntity)
    {
        super(ContainerRegistry.DISPLAY_PEDESTAL.get(), containerId);

        if(blockEntity instanceof DisplayPedestalBlockEntity be)
        {
            this.blockEntity = be;
        }

        else
        {
            throw new IllegalStateException("Incorrect block entity class (%s) passed into ExampleMenu!"
                    .formatted(blockEntity.getClass().getCanonicalName()));
        }

        this.levelAccess = ContainerLevelAccess.create(blockEntity.getLevel(), blockEntity.getBlockPos());

        createPlayerHotbar(playerInv);
        createPlayerInventory(playerInv);
        createBlockEntityInventory(be);
    }

    private void createBlockEntityInventory(DisplayPedestalBlockEntity be)
    {
        be.getOptional().ifPresent(inventory -> {
            addSlot(new SlotItemHandler(inventory, 0, 80, 36));
        });
    }

    private void createPlayerInventory(Inventory playerInv)
    {
        for (int row = 0; row < 3; row++)
        {
            for (int column = 0; column < 9; column++)
            {
                addSlot(new Slot(playerInv,
                        9 + column + (row * 9),
                        8 + (column * 18),
                        84 + (row * 18)));
            }
        }
    }

    private void createPlayerHotbar(Inventory playerInv)
    {
        for (int column = 0; column < 9; column++)
        {
            addSlot(new Slot(playerInv,
                    column,
                    8 + (column * 18),
                    142));
        }
    }

    @Override
    public @NotNull ItemStack quickMoveStack(@NotNull Player pPlayer, int pIndex)
    {
        Slot fromSlot = getSlot(pIndex);
        ItemStack fromStack = fromSlot.getItem();

        if(fromStack.getCount() <= 0)
        {
            fromSlot.set(ItemStack.EMPTY);
        }

        if(!fromSlot.hasItem())
        {
            return ItemStack.EMPTY;
        }

        ItemStack copyFromStack = fromStack.copy();

        if(pIndex < 36)
        {
            // We are inside of the player's inventory
            if(!moveItemStackTo(fromStack, 36, 37, false))
                return ItemStack.EMPTY;
        }

        else if (pIndex < 37)
        {
            // We are inside of the block entity inventory
            if(!moveItemStackTo(fromStack, 0, 36, false))
            {
                return ItemStack.EMPTY;
            }
        }

        else
        {
            System.err.println("Invalid slot index: " + pIndex);
            return ItemStack.EMPTY;
        }

        fromSlot.setChanged();
        fromSlot.onTake(pPlayer, fromStack);

        return copyFromStack;
    }

    @Override
    public boolean stillValid(@NotNull Player pPlayer)
    {
        return stillValid(this.levelAccess, pPlayer, BlockRegistry.DISPLAY_PEDESTAL.get());
    }

    public DisplayPedestalBlockEntity getBlockEntity()
    {
        return this.blockEntity;
    }
}
