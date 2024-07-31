package net.dimidium.aboe.item.armor.radsuit;

import net.dimidium.aboe.handler.registry.EffectRegistry;
import net.dimidium.aboe.handler.registry.ItemRegistry;
import net.dimidium.aboe.util.Constants;
import net.dimidium.dimidiumcore.api.energy.EnergyAction;
import net.dimidium.dimidiumcore.api.util.IItemTab;
import net.minecraft.ChatFormatting;
import net.minecraft.core.Holder;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class BrokenRadiationSuit extends ArmorItem implements IItemTab
{
    public BrokenRadiationSuit(Holder<ArmorMaterial> armorMaterial, Type equipmentSlot, Properties properties)
    {
        super(armorMaterial, equipmentSlot, properties);
    }

    @Override
    public int getEnchantmentValue()
    {
        return 0;
    }

    @Override
    public boolean isValidRepairItem(ItemStack itemStack, ItemStack itemStack2)
    {
        return false;
    }

    @Override
    public boolean isBarVisible(ItemStack itemStack)
    {
        return false;
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext tooltipContext, List<Component> tooltip, TooltipFlag options)
    {
        tooltip.add(Component.translatable("messages." + Constants.MOD_ID + ".radiation_suit_broken")
                .withStyle(ChatFormatting.AQUA));
    }
}
