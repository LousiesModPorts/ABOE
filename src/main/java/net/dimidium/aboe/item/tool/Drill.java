package net.dimidium.aboe.item.tool;

import net.dimidium.aboe.handler.registry.ItemRegistry;
import net.dimidium.aboe.util.AOEUtil;
import net.dimidium.dimidiumcore.api.energy.EnergyAction;
import net.dimidium.dimidiumcore.api.energy.item.IItemFEStorage;
import net.dimidium.dimidiumcore.api.item.EnergyItemBase;
import net.dimidium.dimidiumcore.api.util.IItemTab;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.List;

public class Drill extends EnergyItemBase implements IItemFEStorage, IItemTab
{
    //todo maxInput
    private final double capacity;
    private final double maxInput;
    private static Double useCost;

    //todo Increase max usage per use, configure AOE settings

    public Drill(double feCapacity, double maxInput, double useCost, int stackSize)
    {
        super(feCapacity, stackSize);
        this.capacity = feCapacity;
        this.maxInput = maxInput;
        Drill.useCost = useCost;
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public void appendHoverText(ItemStack stack, Level level, List<Component> lines, TooltipFlag advancedTooltips)
    {
        CompoundTag tag = stack.getTag();
        double currentFE = 0.0D;
        double maxFE = this.getMaxFE(stack);

        if (tag != null)
        {
            currentFE = tag.getDouble("currentFE");
        }

        lines.add(Component.translatable("item.drill_desc").withStyle(ChatFormatting.DARK_AQUA));
        lines.add(Component.empty());
        lines.add(Component.literal(currentFE + "/" + maxFE + "FE").withStyle(ChatFormatting.DARK_AQUA));
    }

    @Override
    public double getMaxInput(ItemStack itemStack)
    {
        return maxInput;
    }

    @Override
    public boolean onBlockStartBreak(ItemStack itemStack, BlockPos pos, Player player)
    {
        if(!player.level().isClientSide && !player.isCreative())
        {
            if(itemStack.is(ItemRegistry.BEGINNER_ENERGIZED_DRILL.get()))
            {
                if(getCurrentFE(itemStack) >= useCost)
                {
                    if(AOEUtil.mineMultipleBlocks(pos.getX() - 1, pos.getZ() - 1, pos.getX() + 1, pos.getZ() + 1, player, pos, BlockTags.MINEABLE_WITH_PICKAXE))
                    {
                        extractFE(itemStack, useCost, EnergyAction.EXECUTE);
                        return true;
                    }

                    return false;
                }

                return false;
            }

            else if(itemStack.is(ItemRegistry.INTERMEDIATE_ENERGIZED_DRILL.get()))
            {
                if(getCurrentFE(itemStack) >= useCost)
                {
                    if (AOEUtil.mineMultipleBlocks(pos.getX() - 2, pos.getZ() - 2, pos.getX() + 2, pos.getZ() + 2, player, pos, BlockTags.MINEABLE_WITH_PICKAXE))
                    {
                        extractFE(itemStack, useCost, EnergyAction.EXECUTE);
                        return true;
                    }

                    return false;
                }

                return false;

            }

            else if(itemStack.is(ItemRegistry.ADVANCED_ENERGIZED_DRILL.get()))
            {
                if(getCurrentFE(itemStack) >= useCost)
                {
                    if(AOEUtil.mineMultipleBlocks(pos.getX() - 3, pos.getZ() - 3, pos.getX() + 3, pos.getZ() + 3, player, pos, BlockTags.MINEABLE_WITH_PICKAXE))
                    {
                        extractFE(itemStack, useCost, EnergyAction.EXECUTE);
                        return true;
                    }

                    return false;
                }

                return false;
            }
        }

        else if(itemStack.is(ItemRegistry.EXPERT_ENERGIZED_DRILL.get()))
        {
            if(getCurrentFE(itemStack) >= useCost)
            {
                if(AOEUtil.mineMultipleBlocks(pos.getX() - 4,pos.getZ() - 4, pos.getX() + 4,pos.getZ() + 4, player, pos, BlockTags.MINEABLE_WITH_PICKAXE))
                {
                    extractFE(itemStack, useCost, EnergyAction.EXECUTE);
                    return true;
                }

                return false;
            }

            return false;
        }

        return false;
    }

    public static Double getUseCost()
    {
        return useCost;
    }
}