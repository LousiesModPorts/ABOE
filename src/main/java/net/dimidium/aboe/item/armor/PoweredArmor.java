/*
package net.dimidium.aboe.item.armor;


import net.dimidium.dimidiumcore.api.energy.EnergyAction;
import net.dimidium.dimidiumcore.api.energy.item.EnergyItemCapability;
import net.dimidium.dimidiumcore.api.energy.item.IItemFEStorage;
import net.minecraft.ChatFormatting;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.util.Mth;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;

public class PoweredArmor extends ArmorItem implements IItemFEStorage
{
    private static final double MIN_FE = 1.0E-4D;
    private static final String CURRENT_FE_KEY = "currentFE";
    private static final String MAX_FE_KEY = "maxFE";
    private final double feCapacity;
    private final double maxInput;

    public PoweredArmor(ArmorMaterial material, ArmorItem.Type equipmentSlot, double feCapacity, double maxInput)
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
    public void appendHoverText(ItemStack stack, Level level, List<Component> lines, TooltipFlag advancedTooltips)
    {
        CompoundTag tag = stack.getTag();
        double currentFE = 0.0D;
        double maxFE = this.getMaxFE(stack);

        if (tag != null)
        {
            currentFE = tag.getDouble("currentFE");
        }

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
        CompoundTag tag = stack.getTag();
        return tag != null && tag.contains("maxFE", 6) ? tag.getDouble("maxFE") : this.feCapacity;
    }

    protected final void setMaxFE(ItemStack stack, double maxPower)
    {
        double defaultCapacity = this.feCapacity;

        if (Math.abs(maxPower - defaultCapacity) < 1.0E-4D)
        {
            stack.removeTagKey("maxFE");
            maxPower = defaultCapacity;
        }

        else
        {
            stack.getOrCreateTag().putDouble("maxFE", maxPower);
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
        CompoundTag tag = is.getTag();
        return tag != null ? tag.getDouble("currentFE") : 0.0D;
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
            stack.removeTagKey("currentFE");
        }

        else
        {
            stack.getOrCreateTag().putDouble("currentFE", power);
        }

    }

    @Override
    public ICapabilityProvider initCapabilities(ItemStack stack, CompoundTag nbt)
    {
        return new EnergyItemCapability(stack, this);
    }
}
*/
