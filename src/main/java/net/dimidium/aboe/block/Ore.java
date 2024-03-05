package net.dimidium.aboe.block;

import net.dimidium.aboe.handler.registry.ItemRegistry;
import net.dimidium.dimidiumcore.api.block.BlockBase;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.SoundType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Ore extends BlockBase
{
    public Ore(float hardness, float resistance, SoundType soundType)
    {
        super(hardness, resistance, soundType);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack item, @Nullable BlockGetter blockGetter, List<Component> tooltip, TooltipFlag flag)
    {
        if(item.is(ItemRegistry.URANIUM_ORE.get()) || item.is(ItemRegistry.DEEP_SLATE_URANIUM_ORE.get()))
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
