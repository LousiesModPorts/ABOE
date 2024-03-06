package net.dimidium.aboe.item;

import net.dimidium.aboe.handler.registry.ItemRegistry;
import net.dimidium.dimidiumcore.api.item.ItemBase;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Ingot extends ItemBase
{
    public Ingot()
    {
        super(64, false, false, false, false);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack item, @Nullable Level level, List<Component> tooltip, TooltipFlag flag)
    {
        if(item.is(ItemRegistry.URANIUM_INGOT.get()))
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
