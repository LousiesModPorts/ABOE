package net.dimidium.aboe.item;

import net.dimidium.aboe.handler.registry.ItemRegistry;
import net.dimidium.dimidiumcore.api.item.ItemBase;
import net.dimidium.dimidiumcore.api.util.IItemTab;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

import java.util.List;

public class Nugget extends ItemBase implements IItemTab
{
    public Nugget()
    {
        super(64, false, false, false, false);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack item, TooltipContext tooltipContext, List<Component> tooltip, TooltipFlag flag)
    {
        if(item.is(ItemRegistry.URANIUM_NUGGET.get()))
        {
            //TODO Add this to translation maybe?

            tooltip.add(Component.literal("WARNING: HOLDING THIS ITEM WITHOUT RADIATION PROTECTION WILL CAUSE RADIATION SICKNESS! ")
                    .withStyle(ChatFormatting.RED)
                    .append(Component.literal("(Configurable) (NYI)")
                            .withStyle(ChatFormatting.DARK_AQUA))
            );
        }
    }
}
