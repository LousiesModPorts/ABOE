package net.dimidium.aboe.item.tool.weapon;

import net.dimidium.aboe.handler.ConfigurationHandler;
import net.dimidium.aboe.handler.registry.ItemRegistry;
import net.dimidium.dimidiumcore.api.energy.EnergyAction;
import net.dimidium.dimidiumcore.api.energy.item.EnergyItemCapability;
import net.dimidium.dimidiumcore.api.energy.item.IItemFEStorage;
import net.dimidium.dimidiumcore.api.util.IItemTab;
import net.minecraft.ChatFormatting;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.capabilities.ICapabilityProvider;

import java.util.List;

public class EnergizedSword extends SwordItem implements IItemFEStorage, IItemTab
{
    public EnergizedSword(Tier tier, int attackDamage, float attackSpeed, Properties properties)
    {
        super(tier, attackDamage, attackSpeed, properties);
    }

    @Override
    public boolean isBarVisible(ItemStack stack)
    {
        return true;
    }

    @Override
    public boolean hurtEnemy(ItemStack item, LivingEntity p_43279_, LivingEntity p_43280_)
    {
        if(item.is(ItemRegistry.BEGINNER_ENERGIZED_SWORD.get()))
        {
            this.extractFE(item, ConfigurationHandler.BEGINNER_ENERGIZED_SWORD_DRAIN_SPEED.get(), EnergyAction.EXECUTE);
            return true;
        }

        else if(item.is(ItemRegistry.INTERMEDIATE_ENERGIZED_SWORD.get()))
        {
            this.extractFE(item, ConfigurationHandler.INTERMEDIATE_ENERGIZED_SWORD_DRAIN_SPEED.get(), EnergyAction.EXECUTE);
            return true;
        }

        else if(item.is(ItemRegistry.ADVANCED_ENERGIZED_SWORD.get()))
        {
            this.extractFE(item, ConfigurationHandler.ADVANCED_ENERGIZED_SWORD_DRAIN_SPEED.get(), EnergyAction.EXECUTE);
            return true;
        }

        else if(item.is(ItemRegistry.EXPERT_ENERGIZED_SWORD.get()))
        {
            this.extractFE(item, ConfigurationHandler.EXPERT_ENERGIZED_SWORD_DRAIN_SPEED.get(), EnergyAction.EXECUTE);
            return true;
        }

        return false;

    }

    @Override
    public boolean isCorrectToolForDrops(ItemStack stack, BlockState state)
    {
        if(stack.is(ItemRegistry.BEGINNER_ENERGIZED_SWORD.get()))
        {
            return this.getCurrentFE(stack) >= ConfigurationHandler.BEGINNER_ENERGIZED_SWORD_DRAIN_SPEED.get();
        }

        else if(stack.is(ItemRegistry.INTERMEDIATE_ENERGIZED_SWORD.get()))
        {
            return this.getCurrentFE(stack) >= ConfigurationHandler.INTERMEDIATE_ENERGIZED_SWORD_DRAIN_SPEED.get();
        }

        else if(stack.is(ItemRegistry.ADVANCED_ENERGIZED_SWORD.get()))
        {
            return this.getCurrentFE(stack) >= ConfigurationHandler.ADVANCED_ENERGIZED_SWORD_DRAIN_SPEED.get();
        }

        else if(stack.is(ItemRegistry.EXPERT_ENERGIZED_SWORD.get()))
        {
            return this.getCurrentFE(stack) >= ConfigurationHandler.EXPERT_ENERGIZED_SWORD_DRAIN_SPEED.get();
        }

        return false;
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

        lines.add(Component.translatable("item.energetic_sword.desc").withStyle(ChatFormatting.DARK_AQUA));
        lines.add(Component.empty());
        lines.add(Component.literal(currentFE + "/" + maxFE + "FE").withStyle(ChatFormatting.DARK_AQUA));
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

        if(stack.is(ItemRegistry.BEGINNER_ENERGIZED_SWORD.get()))
        {
            return tag != null && tag.contains("maxFE", 6) ? tag.getDouble("maxFE") : ConfigurationHandler.BEGINNER_ENERGIZED_SWORD_CAPACITY.get();
        }

        else if(stack.is(ItemRegistry.INTERMEDIATE_ENERGIZED_SWORD.get()))
        {
            return tag != null && tag.contains("maxFE", 6) ? tag.getDouble("maxFE") : ConfigurationHandler.INTERMEDIATE_ENERGIZED_SWORD_CAPACITY.get();
        }

        else if(stack.is(ItemRegistry.ADVANCED_ENERGIZED_SWORD.get()))
        {
            return tag != null && tag.contains("maxFE", 6) ? tag.getDouble("maxFE") : ConfigurationHandler.ADVANCED_ENERGIZED_SWORD_CAPACITY.get();
        }

        else if(stack.is(ItemRegistry.EXPERT_ENERGIZED_SWORD.get()))
        {
            return tag != null && tag.contains("maxFE", 6) ? tag.getDouble("maxFE") : ConfigurationHandler.EXPERT_ENERGIZED_SWORD_CAPACITY.get();
        }

        return tag != null && tag.contains("maxFE", 6) ? tag.getDouble("maxFE") : 2500;
    }

    protected final void setMaxFE(ItemStack stack, double maxPower)
    {
        double defaultCapacity = 2500;

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
    public double getMaxInput(ItemStack item)
    {
        if(item.is(ItemRegistry.BEGINNER_ENERGIZED_SWORD.get()))
        {
            return ConfigurationHandler.BEGINNER_ENERGIZED_SWORD_CHARGING_SPEED.get();
        }

        else if(item.is(ItemRegistry.INTERMEDIATE_ENERGIZED_SWORD.get()))
        {
            return ConfigurationHandler.INTERMEDIATE_ENERGIZED_SWORD_CHARGING_SPEED.get();
        }

        else if(item.is(ItemRegistry.ADVANCED_ENERGIZED_SWORD.get()))
        {
            return ConfigurationHandler.ADVANCED_ENERGIZED_SWORD_CHARGING_SPEED.get();
        }

        else if(item.is(ItemRegistry.EXPERT_ENERGIZED_SWORD.get()))
        {
            return ConfigurationHandler.EXPERT_ENERGIZED_SWORD_CHARGING_SPEED.get();
        }

        return 10D;
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
