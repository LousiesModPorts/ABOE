package net.dimidium.aboe.item;

import net.dimidium.aboe.handler.registry.EffectRegistry;
import net.dimidium.aboe.handler.registry.ItemRegistry;
import net.dimidium.dimidiumcore.api.helper.KeyboardHelper;
import net.dimidium.dimidiumcore.api.item.ItemBase;
import net.dimidium.dimidiumcore.api.util.IItemTab;
import net.minecraft.ChatFormatting;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Module extends ItemBase implements IItemTab
{

    public Module(int stackSize, boolean canEnchant, boolean canEnchantTable, boolean canBookEnchant, boolean isVisible)
    {
        super(stackSize, canEnchant, canEnchantTable, canBookEnchant, isVisible);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flag)
    {
        /*if(stack.is(ItemRegistry.SPEED_MODULE.get()))
        {
            tooltip.add(Component.translatable("item.speed_module_desc").withStyle(ChatFormatting.DARK_AQUA));
            tooltip.add(Component.literal(""));
        }

        else if(stack.is(ItemRegistry.JUMP_MODULE.get()))
        {
            tooltip.add(Component.translatable("item.jump_module_desc").withStyle(ChatFormatting.DARK_AQUA));
        }

        else if(stack.is(ItemRegistry.STEP_MODULE.get()))
        {
            tooltip.add(Component.translatable("item.step_module_desc").withStyle(ChatFormatting.DARK_AQUA));
        }

        else if(stack.is(ItemRegistry.FEED_MODULE.get()))
        {
            tooltip.add(Component.translatable("item.feed_module_desc").withStyle(ChatFormatting.DARK_AQUA));
        }*/
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand)
    {
        ItemStack item = player.getItemInHand(hand);
        CompoundTag tag = item.getOrCreateTag();

        if(!level.isClientSide && KeyboardHelper.isSneaking())
        {
            if(tag.getBoolean("enabled"))
            {
                tag.putBoolean("enabled", false);

            /*    if(item.is(ItemRegistry.SPEED_MODULE.get()))
                {
                    player.sendSystemMessage(Component.literal("Speed Module disabled!").withStyle(ChatFormatting.RED));
                }

                else if(item.is(ItemRegistry.JUMP_MODULE.get()))
                {
                    player.sendSystemMessage(Component.literal("Jump Module disabled!").withStyle(ChatFormatting.RED));
                }

                else if(item.is(ItemRegistry.STEP_MODULE.get()))
                {
                    player.sendSystemMessage(Component.literal("Step Module disabled!").withStyle(ChatFormatting.RED));
                }

                else if(item.is(ItemRegistry.FEED_MODULE.get()))
                {
                    player.sendSystemMessage(Component.literal("Feed Module disabled!").withStyle(ChatFormatting.RED));
                }*/
            }

            else
            {
                tag.putBoolean("enabled", true);

                /*if(item.is(ItemRegistry.SPEED_MODULE.get()))
                {
                    player.sendSystemMessage(Component.literal("Speed Module enabled!").withStyle(ChatFormatting.GREEN));
                }

                else if(item.is(ItemRegistry.JUMP_MODULE.get()))
                {
                    player.sendSystemMessage(Component.literal("Jump Module enabled!").withStyle(ChatFormatting.GREEN));
                }

                else if(item.is(ItemRegistry.STEP_MODULE.get()))
                {
                    player.sendSystemMessage(Component.literal("Step Module enabled!").withStyle(ChatFormatting.GREEN));
                }

                else if(item.is(ItemRegistry.FEED_MODULE.get()))
                {
                    player.sendSystemMessage(Component.literal("Feed Module enabled!").withStyle(ChatFormatting.GREEN));
                }*/
            }
        }

        return super.use(level, player, hand);
    }

    //todo move this to armor module activation & keybinds to enable/disable all modules & open module gui

    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean bool)
    {
        CompoundTag tag = stack.getOrCreateTag();

        if(entity instanceof final Player player)
        {
            //todo drain energy from armor on use tick, per second
            /*if(stack.is(ItemRegistry.SPEED_MODULE.get()) && tag.getBoolean("enabled"))
            {
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED));
            }

            if(stack.is(ItemRegistry.JUMP_MODULE.get()) && tag.getBoolean("enabled"))
            {
                player.addEffect(new MobEffectInstance(MobEffects.JUMP));
            }

            if(stack.is(ItemRegistry.STEP_MODULE.get()) && tag.getBoolean("enabled"))
            {
                player.addEffect(new MobEffectInstance(EffectRegistry.STEP_ASSIST.get()));
            }

            if(stack.is(ItemRegistry.FEED_MODULE.get()) && tag.getBoolean("enabled"))
            {
                //todo consume foo
                if(player.getFoodData().getFoodLevel() < 5)
                {
                    player.getFoodData().setFoodLevel(20);
                }

                if(player.getFoodData().getSaturationLevel() < 5)
                {
                    player.getFoodData().setSaturation(20);
                }
            }*/
        }
    }
}
