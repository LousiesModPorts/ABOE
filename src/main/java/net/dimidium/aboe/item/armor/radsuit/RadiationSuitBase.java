package net.dimidium.aboe.item.armor.radsuit;

import net.dimidium.aboe.handler.registry.EffectRegistry;
import net.dimidium.aboe.handler.registry.ItemRegistry;
import net.dimidium.aboe.item.armor.PoweredArmor;
import net.dimidium.aboe.util.Constants;
import net.dimidium.dimidiumcore.api.energy.EnergyAction;
import net.dimidium.dimidiumcore.api.util.IItemTab;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.List;

public class RadiationSuitBase extends PoweredArmor implements IItemTab
{
    private final double maxInput;
    public RadiationSuitBase(DeferredHolder<ArmorMaterial, ArmorMaterial> armorMaterial, Type equipmentSlot, double maxInput)
    {
        super(armorMaterial, equipmentSlot, 5000, maxInput);
        this.maxInput = maxInput;
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
    public void inventoryTick(ItemStack itemStack, Level level, Entity entity, int i, boolean bl)
    {
        if(entity instanceof final Player player && !level.isClientSide)
        {
            /* 0 is boots, 1 is leggings, 2 is chestplate and 3 is helmet */


            ItemStack helmet = player.getInventory().armor.get(0);
            ItemStack chestplate = player.getInventory().armor.get(1);
            ItemStack leggings = player.getInventory().armor.get(2);
            ItemStack boots = player.getInventory().armor.get(3);


            if(boots.getItem().equals(ItemRegistry.RADIATION_SUIT_BOOTS.get()) && leggings.getItem().equals(ItemRegistry.RADIATION_SUIT_LEGGINGS.get()) && chestplate.getItem().equals(ItemRegistry.RADIATION_SUIT_CHESTPLATE.get()) && helmet.getItem().equals(ItemRegistry.RADIATION_SUIT_HELMET.get()))
            {
                if(player.hasEffect(EffectRegistry.ANTI_RADIATION))
                {
                    return;
                }

                //TODO Config option for checking capacity

                if(this.getCurrentFE(player.getInventory().armor.get(0)) >= 10D && this.getCurrentFE(player.getInventory().armor.get(1)) >= 10D && this.getCurrentFE(player.getInventory().armor.get(2)) >= 10D && this.getCurrentFE(player.getInventory().armor.get(3)) > 10D)
                {
                    player.addEffect(new MobEffectInstance(EffectRegistry.ANTI_RADIATION, Integer.MAX_VALUE, 0));
                    extractFE(boots, 10D, EnergyAction.EXECUTE);
                    extractFE(leggings, 10D, EnergyAction.EXECUTE);
                    extractFE(chestplate, 10D, EnergyAction.EXECUTE);
                    extractFE(helmet, 10D, EnergyAction.EXECUTE);
                }
            }
        }
    }

    @Override
    public boolean isBarVisible(ItemStack itemStack)
    {
        return true;
    }

    @Override
    public double getMaxInput(ItemStack itemStack)
    {
        return maxInput;
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext tooltipContext, List<Component> tooltip, TooltipFlag options)
    {
        tooltip.add(Component.translatable("messages." + Constants.MOD_ID + ".radiation_suit")
                .withStyle(ChatFormatting.AQUA));
    }
}

