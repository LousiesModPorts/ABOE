package net.dimidium.aboe.block;

import net.dimidium.aboe.handler.registry.ItemRegistry;
import net.dimidium.dimidiumcore.api.block.BlockBase;
import net.dimidium.dimidiumcore.api.util.IBlockTab;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.block.SoundType;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

import java.util.List;

public class IngotBlock extends BlockBase implements IBlockTab
{
    public IngotBlock(float hardness, float resistance, SoundType soundType)
    {
        super(hardness, resistance, soundType);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack item, Item.TooltipContext tooltipContext, List<Component> tooltip, TooltipFlag flag)
    {
        if(item.is(ItemRegistry.URANIUM_BLOCK.get()))
        {
            //TODO Add this to translation maybe?

            tooltip.add(Component.literal("WARNING: HOLDING THIS BLOCK WITHOUT RADIATION PROTECTION WILL CAUSE RADIATION SICKNESS! ")
                    .withStyle(ChatFormatting.RED)
                    .append(Component.literal("(Configurable) (NYI)")
                            .withStyle(ChatFormatting.DARK_AQUA))
            );
        }
    }
}
