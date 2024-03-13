package net.dimidium.aboe.item;

import net.dimidium.aboe.handler.registry.EffectRegistry;
import net.dimidium.aboe.util.Constants;
import net.dimidium.aboe.util.IRingItem;
import net.dimidium.dimidiumcore.api.energy.EnergyAction;
import net.dimidium.dimidiumcore.api.item.EnergyItemBase;
import net.dimidium.dimidiumcore.api.util.IItemTab;
import net.minecraft.ChatFormatting;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.List;

public class Ring extends EnergyItemBase implements IRingItem, IItemTab
{
    //todo maxInput
    private final double capacity;
    private final double maxInput;
    private final MobEffect mobEffect;
    private final int strength;
    private final int duration;
    private final Double useCost;
    private final Boolean activated = true;

    public Ring(double feCapacity, double maxInput, MobEffect mobEffect, int strength, int duration, double useCost, int stackSize)
    {
        super(feCapacity, stackSize);
        this.capacity = feCapacity;
        this.maxInput = maxInput;
        this.mobEffect = mobEffect;
        this.strength = strength;
        this.duration = duration;
        this.useCost = useCost;
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

        lines.add(Component.translatable("item.ring_desc").withStyle(ChatFormatting.DARK_AQUA));
        lines.add(Component.empty());
        lines.add(Component.literal(currentFE + "/" + maxFE + "FE").withStyle(ChatFormatting.DARK_AQUA));
    }

    @Override
    public double getMaxInput(ItemStack itemStack)
    {
        //TODO Change thi baaed on tier
        return 10D;
    }

    @Override
    public Double getCapacity(double feCapacity)
    {
        return capacity;
    }

    @Override
    public Double getUse(double feUse)
    {
        return useCost;
    }

    @Override
    public MobEffectInstance applyEffect(MobEffect effect, int strength, int duration)
    {
        return new MobEffectInstance(effect, strength, duration);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand)
    {
        if(!(level.isClientSide))
        {
            if(player.isShiftKeyDown())
            {
                final ItemStack item = player.getItemInHand(hand);

                if(!item.getOrCreateTag().getBoolean("activated"))
                {
                    item.getOrCreateTag().putBoolean("activated", true);
                    player.sendSystemMessage(Component.translatable("messages." + Constants.MOD_ID + ".item.ring.activated").withStyle(ChatFormatting.GREEN));
                }

                else
                {
                    item.getOrCreateTag().putBoolean("activated", false);
                    player.sendSystemMessage(Component.translatable("messages." + Constants.MOD_ID + ".item.ring.deactivated").withStyle(ChatFormatting.RED));
                }
            }
        }

        return super.use(level, player, hand);
    }

    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean bool)
    {
        if(entity instanceof final Player player)
        {
            switch (stack.getItem().toString())
            {
                case "basic_absorption_ring", "intermediate_absorption_ring", "advanced_absorption_ring", "ultimate_absorption_ring" ->
                {
                    if (getCurrentFE(stack) >= useCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(MobEffects.ABSORPTION, strength, duration));

                        if(!player.isCreative())
                        {
                            extractFE(stack, useCost, EnergyAction.EXECUTE);
                        }
                    }
                }

                case "basic_breeding_ring", "intermediate_breeding_ring", "advanced_breeding_ring", "ultimate_breeding_ring" ->
                {
                    if (getCurrentFE(stack) >= useCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(EffectRegistry.BREEDING.get(), strength, duration));

                        if(!player.isCreative())
                        {
                            extractFE(stack, useCost, EnergyAction.EXECUTE);
                        }
                    }
                }

                case "basic_entity_puller_ring", "intermediate_entity_puller_ring", "advanced_entity_puller_ring", "ultimate_entity_puller_ring" ->
                {
                    if (getCurrentFE(stack) >= useCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(EffectRegistry.ENTITY_PULLER.get(), strength, duration));

                        if(!player.isCreative())
                        {
                            extractFE(stack, useCost, EnergyAction.EXECUTE);
                        }
                    }
                }

                case "basic_fire_ring", "intermediate_fire_ring", "advanced_fire_ring", "ultimate_fire_ring" ->
                {
                    if (getCurrentFE(stack) >= useCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(MobEffects.FIRE_RESISTANCE, strength, duration));

                        if(!player.isCreative())
                        {
                            extractFE(stack, useCost, EnergyAction.EXECUTE);
                        }
                    }
                }

                case "basic_flight_ring", "intermediate_flight_ring", "advanced_flight_ring", "ultimate_flight_ring" ->
                {
                    if (getCurrentFE(stack) >= useCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(EffectRegistry.FLIGHT.get(), strength, duration));

                        if(!player.isCreative())
                        {
                            extractFE(stack, useCost, EnergyAction.EXECUTE);
                        }
                    }
                }

                case "basic_freeze_ring", "intermediate_freeze_ring", "advanced_freeze_ring", "ultimate_freeze_ring" ->
                {
                    if (getCurrentFE(stack) >= useCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(EffectRegistry.FREEZE.get(), strength, duration));

                        if(!player.isCreative())
                        {
                            extractFE(stack, useCost, EnergyAction.EXECUTE);
                        }
                    }
                }

                case "basic_green_thumb_ring", "intermediate_green_thumb_ring", "advanced_green_thumb_ring", "ultimate_thumb_ring" ->
                {
                    if (getCurrentFE(stack) >= useCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(EffectRegistry.GREEN_THUMB.get(), strength, duration));

                        if(!player.isCreative())
                        {
                            extractFE(stack, useCost, EnergyAction.EXECUTE);
                        }
                    }
                }

                case "basic_haste_ring", "intermediate_haste_ring", "advanced_haste_ring", "ultimate_haste_ring" ->
                {
                    if (getCurrentFE(stack) >= useCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(MobEffects.DIG_SPEED, strength, duration));

                        if(!player.isCreative())
                        {
                            extractFE(stack, useCost, EnergyAction.EXECUTE);
                        }
                    }
                }

                case "basic_health_ring", "intermediate_health_ring", "advanced_health_ring", "ultimate_health_ring" ->
                {
                    if (getCurrentFE(stack) >= useCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(MobEffects.HEALTH_BOOST, strength, duration));

                        if(!player.isCreative())
                        {
                            extractFE(stack, useCost, EnergyAction.EXECUTE);
                        }
                    }
                }

                case "basic_magnetization_ring", "intermediate_magnetization_ring", "advanced_magnetization_ring", "ultimate_magnetization_ring" ->
                {
                    if (getCurrentFE(stack) >= useCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(EffectRegistry.MAGNETIZATION.get(), strength, duration));

                        if(!player.isCreative())
                        {
                            extractFE(stack, useCost, EnergyAction.EXECUTE);
                        }
                    }
                }

                case "basic_regeneration_ring", "intermediate_regeneration_ring", "advanced_regeneration_ring", "ultimate_regeneration_ring" ->
                {
                    if (getCurrentFE(stack) >= useCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(MobEffects.REGENERATION, strength, duration));

                        if(!player.isCreative())
                        {
                            extractFE(stack, useCost, EnergyAction.EXECUTE);
                        }
                    }
                }

                case "basic_resistance_ring", "intermediate_resistance_ring", "advanced_resistance_ring", "ultimate_resistance_ring" ->
                {
                    if (getCurrentFE(stack) >= useCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(MobEffects.DAMAGE_RESISTANCE, strength, duration));

                        if(!player.isCreative())
                        {
                            extractFE(stack, useCost, EnergyAction.EXECUTE);
                        }
                    }
                }

                case "basic_saturation_ring", "intermediate_saturation_ring", "advanced_saturation_ring", "ultimate_saturation_ring" ->
                {
                    if (getCurrentFE(stack) >= useCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(MobEffects.SATURATION, strength, duration));

                        if(!player.isCreative())
                        {
                            extractFE(stack, useCost, EnergyAction.EXECUTE);
                        }
                    }
                }

                case "basic_step_assist_ring", "intermediate_step_assist_ring", "advanced_step_assist_ring", "ultimate_step_assist_ring" ->
                {
                    if (getCurrentFE(stack) >= useCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(EffectRegistry.STEP_ASSIST.get(), strength, duration));

                        if(!player.isCreative())
                        {
                            extractFE(stack, useCost, EnergyAction.EXECUTE);
                        }
                    }
                }


                case "basic_strength_ring", "intermediate_strength_ring", "advanced_strength_ring", "ultimate_strength_ring" ->
                {
                    if (getCurrentFE(stack) >= useCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(MobEffects.DAMAGE_BOOST, strength, duration));

                        if(!player.isCreative())
                        {
                            extractFE(stack, useCost, EnergyAction.EXECUTE);
                        }
                    }
                }
            }
        }
/*
       if(entity instanceof final Player player)
        {
            player.maxUpStep = 0.5F;
        }
*/

        //super.inventoryTick(stack, level, entity, slot, bool);
    }
}
