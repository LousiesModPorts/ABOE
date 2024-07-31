package net.dimidium.aboe.item.armor;


import net.dimidium.dimidiumcore.api.energy.EnergyAction;
import net.dimidium.dimidiumcore.api.energy.item.IItemFEStorage;
import net.dimidium.dimidiumcore.api.util.ComponentUtil;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.util.Mth;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.List;

public class PoweredArmor extends ArmorItem implements IItemFEStorage
{
    private static final double MIN_FE = 1.0E-4D;
    private static final String CURRENT_FE_KEY = "currentFE";
    private static final String MAX_FE_KEY = "maxFE";
    private final double feCapacity;
    private final double maxInput;

    public PoweredArmor(DeferredHolder<ArmorMaterial, ArmorMaterial> material, Type equipmentSlot, double feCapacity, double maxInput)
    {
        super(material, equipmentSlot, new Properties().stacksTo(1).setNoRepair());
        this.feCapacity = feCapacity;
        this.maxInput = maxInput;
    }

    @Override
    public boolean isBarVisible(ItemStack stack)
    {
        return true;
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public void appendHoverText(ItemStack stack, TooltipContext tooltipContext, List<Component> lines, TooltipFlag advancedTooltips)
    {
        double currentFE = getCurrentFE(stack);
        double maxFE = getMaxFE(stack);

        lines.add(Component.literal(currentFE + "/" + maxFE + "FE").withStyle(ChatFormatting.AQUA).withStyle(ChatFormatting.BOLD));
    }

    @Override
    public int getBarWidth(ItemStack stack)
    {
        double filled = this.getCurrentFE(stack) / this.getMaxFE(stack);
        return Mth.clamp((int)(filled * 13.0D), 0, 13);
    }

    @Override
    public int getBarColor(ItemStack stack)
    {
        return Mth.hsvToRgb(0.33333334F, 1.0F, 1.0F);
    }

    @Override
    public double inputFE(ItemStack stack, double amount, EnergyAction mode)
    {
        double maxStorage = this.getMaxFE(stack);
        double currentStorage = this.getCurrentFE(stack);
        double required = maxStorage - currentStorage;
        double overflow = Math.max(0.0D, Math.min(amount - required, amount));

        if (mode == EnergyAction.EXECUTE)
        {
            double toAdd = Math.min(amount, required);
            this.setCurrentFE(stack, currentStorage + toAdd);
        }

        return overflow;
    }

    @Override
    public double extractFE(ItemStack stack, double amount, EnergyAction mode)
    {
        double currentStorage = this.getCurrentFE(stack);
        double fulfillable = Math.min(amount, currentStorage);

        if (mode == EnergyAction.EXECUTE)
        {
            this.setCurrentFE(stack, currentStorage - fulfillable);
        }

        return fulfillable;
    }

    @Override
    public double getMaxFE(ItemStack stack)
    {
        //TODO Configuration values for this
        return this.feCapacity;
    }

    protected final void setMaxFE(ItemStack stack, double maxPower)
    {
        double defaultCapacity = 2500;

        if (Math.abs(maxPower - defaultCapacity) < 1.0E-4D)
        {
            stack.remove(ComponentUtil.ENERGY_CAPACITY);
        }

        else
        {
            stack.set(ComponentUtil.ENERGY_CAPACITY, maxPower);
        }

        double currentPower = this.getCurrentFE(stack);

        if (currentPower > maxPower)
        {
            this.setCurrentFE(stack, maxPower);
        }
    }

    @Override
    public double getCurrentFE(ItemStack is)
    {
        return is.getOrDefault(ComponentUtil.STORED_ENERGY, 0.0);
    }

    @Override
    public double getMaxInput(ItemStack itemStack)
    {
        return maxInput;
    }

    protected final void setCurrentFE(ItemStack stack, double power)
    {
        if (power < 1.0E-4D)
        {
            stack.remove(ComponentUtil.STORED_ENERGY);
        }

        else
        {
            stack.set(ComponentUtil.STORED_ENERGY, power);
        }

    }
}