package net.dimidium.aboe.item;

import net.dimidium.aboe.handler.ConfigurationHandler;
import net.dimidium.aboe.handler.registry.EffectRegistry;
import net.dimidium.aboe.util.Constants;
import net.dimidium.aboe.util.IRingItem;
import net.dimidium.dimidiumcore.api.energy.EnergyAction;
import net.dimidium.dimidiumcore.api.helper.KeyboardHelper;
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
    private final int duration = Integer.MAX_VALUE;

    public Ring()
    {
        super(2500, 1);
    }

    @Override
    public double getMaxFE(ItemStack stack)
    {
        if(stack.getItem().toString().contains("beginner"))
        {
            return ConfigurationHandler.BEGINNER_RING_CAPACITY.get();
        }

        else if(stack.getItem().toString().contains("intermediate"))
        {
           return ConfigurationHandler.INTERMEDIATE_RING_CAPACITY.get();
        }

        else if(stack.getItem().toString().contains("advanced"))
        {
            return ConfigurationHandler.ADVANCED_RING_CAPACITY.get();
        }

        else if(stack.getItem().toString().contains("expert"))
        {
            return ConfigurationHandler.EXPERT_RING_CAPACITY.get();
        }

        return 2500;
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public void appendHoverText(ItemStack stack, Level level, List<Component> lines, TooltipFlag advancedTooltips)
    {
        CompoundTag tag = stack.getTag();
        double currentFE = 0.0D;
        double maxFE = getMaxFE(stack);

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
        return feCapacity;
    }

    @Override
    public Double getUse(double feUse)
    {
        return feUse;
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
            if(KeyboardHelper.isSneaking())
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
        final Double beginnerUseCost = ConfigurationHandler.BEGINNER_RING_DRAIN_SPEED.get();
        final Double intermediateUseCost = ConfigurationHandler.INTERMEDIATE_RING_DRAIN_SPEED.get();
        final Double advancedUseCost = ConfigurationHandler.ADVANCED_RING_DRAIN_SPEED.get();
        final Double expertUseCost = ConfigurationHandler.EXPERT_RING_DRAIN_SPEED.get();

        if(entity instanceof final Player player)
        {
            switch (stack.getItem().toString())
            {
                case "beginner_absorption_ring" ->
                {
                    if (getCurrentFE(stack) >= beginnerUseCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(MobEffects.ABSORPTION, 0, Integer.MAX_VALUE));

                        if(!player.isCreative() && level.getGameTime() % 20 == 0)
                        {
                            extractFE(stack, beginnerUseCost, EnergyAction.EXECUTE);
                        }
                    }
                }

                case "intermediate_absorption_ring" ->
                {
                    if (getCurrentFE(stack) >= intermediateUseCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(MobEffects.ABSORPTION, 1, Integer.MAX_VALUE));

                        if(!player.isCreative() && level.getGameTime() % 20 == 0)
                        {
                            extractFE(stack, intermediateUseCost, EnergyAction.EXECUTE);
                        }
                    }
                }

                case "advanced_absorption_ring" ->
                {
                    if (getCurrentFE(stack) >= advancedUseCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(MobEffects.ABSORPTION, 2, Integer.MAX_VALUE));

                        if (!player.isCreative() && level.getGameTime() % 20 == 0)
                        {
                            extractFE(stack, advancedUseCost, EnergyAction.EXECUTE);
                        }
                    }
                }

                case "expert_absorption_ring" ->
                {
                    if (getCurrentFE(stack) >= expertUseCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(MobEffects.ABSORPTION, 3, Integer.MAX_VALUE));

                        if(!player.isCreative() && level.getGameTime() % 20 == 0)
                        {
                            extractFE(stack, expertUseCost, EnergyAction.EXECUTE);
                        }
                    }
                }

                case "beginner_breeding_ring" ->
                {
                    if (getCurrentFE(stack) >= beginnerUseCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(EffectRegistry.BREEDING.get(), 0, duration));

                        if(!player.isCreative() && level.getGameTime() % 20 == 0)
                        {
                            extractFE(stack, beginnerUseCost, EnergyAction.EXECUTE);
                        }
                    }
                }

                case "intermediate_breeding_ring" ->
                {
                    if (getCurrentFE(stack) >= intermediateUseCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(EffectRegistry.BREEDING.get(), 1, duration));

                        if(!player.isCreative() && level.getGameTime() % 20 == 0)
                        {
                            extractFE(stack, intermediateUseCost, EnergyAction.EXECUTE);
                        }
                    }
                }

                case "advanced_breeding_ring" ->
                {
                    if (getCurrentFE(stack) >= advancedUseCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(EffectRegistry.BREEDING.get(), 2, duration));

                        if(!player.isCreative() && level.getGameTime() % 20 == 0)
                        {
                            extractFE(stack, advancedUseCost, EnergyAction.EXECUTE);
                        }
                    }
                }

                case "expert_breeding_ring"->
                {
                    if (getCurrentFE(stack) >= beginnerUseCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(EffectRegistry.BREEDING.get(), 3, duration));

                        if(!player.isCreative() && level.getGameTime() % 20 == 0)
                        {
                            extractFE(stack, beginnerUseCost, EnergyAction.EXECUTE);
                        }
                    }
                }

                case "beginner_entity_puller_ring" ->
                {
                    if (getCurrentFE(stack) >= beginnerUseCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(EffectRegistry.ENTITY_PULLER.get(), 0, duration));

                        if (!player.isCreative() && level.getGameTime() % 20 == 0)
                        {
                            extractFE(stack, beginnerUseCost, EnergyAction.EXECUTE);
                        }
                    }
                }

                case "intermediate_entity_puller_ring" ->
                {
                    if (getCurrentFE(stack) >= intermediateUseCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(EffectRegistry.ENTITY_PULLER.get(), 1, duration));

                        if(!player.isCreative() && level.getGameTime() % 20 == 0)
                        {
                            extractFE(stack, intermediateUseCost, EnergyAction.EXECUTE);
                        }
                    }
                }

                case "advanced_entity_puller_ring" ->
                {
                    if (getCurrentFE(stack) >= advancedUseCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(EffectRegistry.ENTITY_PULLER.get(), 2, duration));

                        if(!player.isCreative() && level.getGameTime() % 20 == 0)
                        {
                            extractFE(stack, advancedUseCost, EnergyAction.EXECUTE);
                        }
                    }
                }

                case "expert_entity_puller_ring" ->
                {
                    if (getCurrentFE(stack) >= expertUseCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(EffectRegistry.ENTITY_PULLER.get(), 3, duration));

                        if(!player.isCreative() && level.getGameTime() % 20 == 0)
                        {
                            extractFE(stack, expertUseCost, EnergyAction.EXECUTE);
                        }
                    }
                }

                case "beginner_fire_ring" ->
                {
                    if (getCurrentFE(stack) >= beginnerUseCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(MobEffects.FIRE_RESISTANCE, 0, duration));

                        if(!player.isCreative() && level.getGameTime() % 20 == 0)
                        {
                            extractFE(stack, beginnerUseCost, EnergyAction.EXECUTE);
                        }
                    }
                }

                case "intermediate_fire_ring" ->
                {
                    if (getCurrentFE(stack) >= intermediateUseCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(MobEffects.FIRE_RESISTANCE, 1, duration));

                        if(!player.isCreative() && level.getGameTime() % 20 == 0)
                        {
                            extractFE(stack, intermediateUseCost, EnergyAction.EXECUTE);
                        }
                    }
                }

                case "advanced_fire_ring" ->
                {
                    if (getCurrentFE(stack) >= advancedUseCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(MobEffects.FIRE_RESISTANCE, 2, duration));

                        if(!player.isCreative() && level.getGameTime() % 20 == 0)
                        {
                            extractFE(stack, advancedUseCost, EnergyAction.EXECUTE);
                        }
                    }
                }

                case "expert_fire_ring" ->
                {
                    if (getCurrentFE(stack) >= expertUseCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(MobEffects.FIRE_RESISTANCE, 3, duration));

                        if(!player.isCreative() && level.getGameTime() % 20 == 0)
                        {
                            extractFE(stack, expertUseCost, EnergyAction.EXECUTE);
                        }
                    }
                }

                case "beginner_flight_ring" ->
                {
                    if (getCurrentFE(stack) >= beginnerUseCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(EffectRegistry.FLIGHT.get(), 0, duration));

                        if(!player.isCreative() && level.getGameTime() % 20 == 0)
                        {
                            extractFE(stack, beginnerUseCost, EnergyAction.EXECUTE);
                        }
                    }
                }

                case "intermediate_flight_ring" ->
                {
                    if (getCurrentFE(stack) >= intermediateUseCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(EffectRegistry.FLIGHT.get(), 0, duration));

                        if(!player.isCreative() && level.getGameTime() % 20 == 0)
                        {
                            extractFE(stack, intermediateUseCost, EnergyAction.EXECUTE);
                        }
                    }
                }

                case "advanced_flight_ring" ->
                {
                    if (getCurrentFE(stack) >= advancedUseCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(EffectRegistry.FLIGHT.get(),  0, duration));

                        if(!player.isCreative() && level.getGameTime() % 20 == 0)
                        {
                            extractFE(stack, advancedUseCost, EnergyAction.EXECUTE);
                        }
                    }
                }

                case "expert_flight_ring" ->
                {
                    if (getCurrentFE(stack) >= expertUseCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(EffectRegistry.FLIGHT.get(), 0, duration));

                        if(!player.isCreative() && level.getGameTime() % 20 == 0)
                        {
                            extractFE(stack, expertUseCost, EnergyAction.EXECUTE);
                        }
                    }
                }

                case "beginner_freeze_ring" ->
                {
                    if (getCurrentFE(stack) >= beginnerUseCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(EffectRegistry.FREEZE.get(), 0, duration));

                        if(!player.isCreative() && level.getGameTime() % 20 == 0)
                        {
                            extractFE(stack, beginnerUseCost, EnergyAction.EXECUTE);
                        }
                    }
                }

                case "intermediate_freeze_ring" ->
                {
                    if (getCurrentFE(stack) >= intermediateUseCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(EffectRegistry.FREEZE.get(), 0, duration));

                        if(!player.isCreative() && level.getGameTime() % 20 == 0)
                        {
                            extractFE(stack, intermediateUseCost, EnergyAction.EXECUTE);
                        }
                    }
                }

                case "advanced_freeze_ring" ->
                {
                    if (getCurrentFE(stack) >= advancedUseCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(EffectRegistry.FREEZE.get(), 0, duration));

                        if(!player.isCreative() && level.getGameTime() % 20 == 0)
                        {
                            extractFE(stack, advancedUseCost, EnergyAction.EXECUTE);
                        }
                    }
                }

                case "expert_freeze_ring" ->
                {
                    if (getCurrentFE(stack) >= expertUseCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(EffectRegistry.FREEZE.get(), 0, duration));

                        if(!player.isCreative() && level.getGameTime() % 20 == 0)
                        {
                            extractFE(stack, expertUseCost, EnergyAction.EXECUTE);
                        }
                    }
                }

                case "beginner_green_thumb_ring" ->
                {
                    if (getCurrentFE(stack) >= beginnerUseCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(EffectRegistry.GREEN_THUMB.get(), 0, duration));

                        if(!player.isCreative() && level.getGameTime() % 20 == 0)
                        {
                            extractFE(stack, beginnerUseCost, EnergyAction.EXECUTE);
                        }
                    }
                }

                case "intermediate_green_thumb_ring" ->
                {
                    if (getCurrentFE(stack) >= intermediateUseCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(EffectRegistry.GREEN_THUMB.get(), 1, duration));

                        if(!player.isCreative() && level.getGameTime() % 20 == 0)
                        {
                            extractFE(stack, intermediateUseCost, EnergyAction.EXECUTE);
                        }
                    }
                }

                case "advanced_green_thumb_ring" ->
                {
                    if (getCurrentFE(stack) >= advancedUseCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(EffectRegistry.GREEN_THUMB.get(), 2, duration));

                        if(!player.isCreative() && level.getGameTime() % 20 == 0)
                        {
                            extractFE(stack, advancedUseCost, EnergyAction.EXECUTE);
                        }
                    }
                }

                case "expert_thumb_ring" ->
                {
                    if (getCurrentFE(stack) >= expertUseCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(EffectRegistry.GREEN_THUMB.get(), 3, duration));

                        if(!player.isCreative() && level.getGameTime() % 20 == 0)
                        {
                            extractFE(stack, expertUseCost, EnergyAction.EXECUTE);
                        }
                    }
                }

                case "beginner_haste_ring" ->
                {
                    if (getCurrentFE(stack) >= beginnerUseCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(MobEffects.DIG_SPEED, 0, duration));

                        if(!player.isCreative() && level.getGameTime() % 20 == 0)
                        {
                            extractFE(stack, beginnerUseCost, EnergyAction.EXECUTE);
                        }
                    }
                }

                case "intermediate_haste_ring" ->
                {
                    if (getCurrentFE(stack) >= intermediateUseCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(MobEffects.DIG_SPEED, 1, duration));

                        if(!player.isCreative() && level.getGameTime() % 20 == 0)
                        {
                            extractFE(stack, intermediateUseCost, EnergyAction.EXECUTE);
                        }
                    }
                }

                case "advanced_haste_ring" ->
                {
                    if (getCurrentFE(stack) >= advancedUseCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(MobEffects.DIG_SPEED, 2, duration));

                        if(!player.isCreative() && level.getGameTime() % 20 == 0)
                        {
                            extractFE(stack, advancedUseCost, EnergyAction.EXECUTE);
                        }
                    }
                }

                case "expert_haste_ring" ->
                {
                    if (getCurrentFE(stack) >= expertUseCost && stack.getOrCreateTag().getBoolean("activated"))
                    {
                        player.addEffect(applyEffect(MobEffects.DIG_SPEED, 3, duration));

                        if(!player.isCreative() && level.getGameTime() % 20 == 0)
                        {
                            extractFE(stack, expertUseCost, EnergyAction.EXECUTE);
                        }
                    }
                }

            case "beginner_health_ring" ->
            {
                if (getCurrentFE(stack) >= beginnerUseCost && stack.getOrCreateTag().getBoolean("activated"))
                {
                    player.addEffect(applyEffect(MobEffects.HEALTH_BOOST, 0, duration));

                    if(!player.isCreative() && level.getGameTime() % 20 == 0)
                    {
                        extractFE(stack, beginnerUseCost, EnergyAction.EXECUTE);
                    }
                }
            }

            case "intermediate_health_ring" ->
            {
                if (getCurrentFE(stack) >= intermediateUseCost && stack.getOrCreateTag().getBoolean("activated"))
                {
                    player.addEffect(applyEffect(MobEffects.HEALTH_BOOST, 1, duration));

                    if(!player.isCreative() && level.getGameTime() % 20 == 0)
                    {
                        extractFE(stack, intermediateUseCost, EnergyAction.EXECUTE);
                    }
                }
            }

            case "advanced_health_ring" ->
            {
                if (getCurrentFE(stack) >= advancedUseCost && stack.getOrCreateTag().getBoolean("activated"))
                {
                    player.addEffect(applyEffect(MobEffects.HEALTH_BOOST, 2, duration));

                    if(!player.isCreative() && level.getGameTime() % 20 == 0)
                    {
                        extractFE(stack, advancedUseCost, EnergyAction.EXECUTE);
                    }
                }
            }

            case "expert_health_ring" ->
            {
                if (getCurrentFE(stack) >= expertUseCost && stack.getOrCreateTag().getBoolean("activated"))
                {
                    player.addEffect(applyEffect(MobEffects.HEALTH_BOOST, 3, duration));

                    if(!player.isCreative() && level.getGameTime() % 20 == 0)
                    {
                        extractFE(stack, expertUseCost, EnergyAction.EXECUTE);
                    }
                }
            }

            case "beginner_magnetization_ring" ->
            {
                if (getCurrentFE(stack) >= beginnerUseCost && stack.getOrCreateTag().getBoolean("activated"))
                {
                    player.addEffect(applyEffect(EffectRegistry.MAGNETIZATION.get(), 0, duration));

                    if(!player.isCreative() && level.getGameTime() % 20 == 0)
                    {
                        extractFE(stack, beginnerUseCost, EnergyAction.EXECUTE);
                    }
                }
            }

            case "intermediate_magnetization_ring" ->
            {
                if (getCurrentFE(stack) >= intermediateUseCost && stack.getOrCreateTag().getBoolean("activated"))
                {
                    player.addEffect(applyEffect(EffectRegistry.MAGNETIZATION.get(), 1, duration));

                    if(!player.isCreative() && level.getGameTime() % 20 == 0)
                    {
                        extractFE(stack, intermediateUseCost, EnergyAction.EXECUTE);
                    }
                }
            }

            case "advanced_magnetization_ring" ->
            {
                if (getCurrentFE(stack) >= advancedUseCost && stack.getOrCreateTag().getBoolean("activated"))
                {
                    player.addEffect(applyEffect(EffectRegistry.MAGNETIZATION.get(), 2, duration));

                    if (!player.isCreative() && level.getGameTime() % 20 == 0)
                    {
                        extractFE(stack, advancedUseCost, EnergyAction.EXECUTE);
                    }
                }
            }

            case "expert_magnetization_ring" ->
            {
                if (getCurrentFE(stack) >= expertUseCost && stack.getOrCreateTag().getBoolean("activated"))
                {
                    player.addEffect(applyEffect(EffectRegistry.MAGNETIZATION.get(), 3, duration));

                    if(!player.isCreative() && level.getGameTime() % 20 == 0)
                    {
                        extractFE(stack, expertUseCost, EnergyAction.EXECUTE);
                    }
                }
            }

            case "beginner_regeneration_ring" ->
            {
                if (getCurrentFE(stack) >= beginnerUseCost && stack.getOrCreateTag().getBoolean("activated"))
                {
                    player.addEffect(applyEffect(MobEffects.REGENERATION, 0, duration));

                    if(!player.isCreative() && level.getGameTime() % 20 == 0)
                    {
                        extractFE(stack, beginnerUseCost, EnergyAction.EXECUTE);
                    }
                }
            }

            case "intermediate_regeneration_ring" ->
            {
                if (getCurrentFE(stack) >= intermediateUseCost && stack.getOrCreateTag().getBoolean("activated"))
                {
                    player.addEffect(applyEffect(MobEffects.REGENERATION, 1, duration));

                    if(!player.isCreative() && level.getGameTime() % 20 == 0)
                    {
                        extractFE(stack, intermediateUseCost, EnergyAction.EXECUTE);
                    }
                }
            }

            case "advanced_regeneration_ring" ->
            {
                if (getCurrentFE(stack) >= advancedUseCost && stack.getOrCreateTag().getBoolean("activated"))
                {
                    player.addEffect(applyEffect(MobEffects.REGENERATION, 2, duration));

                    if(!player.isCreative() && level.getGameTime() % 20 == 0)
                    {
                        extractFE(stack, advancedUseCost, EnergyAction.EXECUTE);
                    }
                }
            }

            case "expert_regeneration_ring" ->
            {
                if (getCurrentFE(stack) >= expertUseCost && stack.getOrCreateTag().getBoolean("activated"))
                {
                    player.addEffect(applyEffect(MobEffects.REGENERATION, 3, duration));

                    if(!player.isCreative() && level.getGameTime() % 20 == 0)
                    {
                        extractFE(stack, expertUseCost, EnergyAction.EXECUTE);
                    }
                }
            }

            case "beginner_resistance_ring" ->
            {
                if (getCurrentFE(stack) >= beginnerUseCost && stack.getOrCreateTag().getBoolean("activated"))
                {
                    player.addEffect(applyEffect(MobEffects.DAMAGE_RESISTANCE, 0, duration));

                    if(!player.isCreative() && level.getGameTime() % 20 == 0)
                    {
                        extractFE(stack, beginnerUseCost, EnergyAction.EXECUTE);
                    }
                }
            }

            case "intermediate_resistance_ring" ->
            {
                if (getCurrentFE(stack) >= intermediateUseCost && stack.getOrCreateTag().getBoolean("activated"))
                {
                    player.addEffect(applyEffect(MobEffects.DAMAGE_RESISTANCE, 1, duration));

                    if(!player.isCreative() && level.getGameTime() % 20 == 0)
                    {
                        extractFE(stack, intermediateUseCost, EnergyAction.EXECUTE);
                    }
                }
            }

            case "advanced_resistance_ring" ->
            {
                if (getCurrentFE(stack) >= advancedUseCost && stack.getOrCreateTag().getBoolean("activated"))
                {
                    player.addEffect(applyEffect(MobEffects.DAMAGE_RESISTANCE, 2, duration));

                    if(!player.isCreative() && level.getGameTime() % 20 == 0)
                    {
                        extractFE(stack, advancedUseCost, EnergyAction.EXECUTE);
                    }
                }
            }

            case "expert_resistance_ring" ->
            {
                if (getCurrentFE(stack) >= expertUseCost && stack.getOrCreateTag().getBoolean("activated"))
                {
                    player.addEffect(applyEffect(MobEffects.DAMAGE_RESISTANCE, 3, duration));
                }

                if(!player.isCreative() && level.getGameTime() % 20 == 0)
                {
                    extractFE(stack, expertUseCost, EnergyAction.EXECUTE);
                }
            }


            case "beginner_saturation_ring" ->
            {
                if (getCurrentFE(stack) >= beginnerUseCost && stack.getOrCreateTag().getBoolean("activated"))
                {
                    player.addEffect(applyEffect(MobEffects.SATURATION, 0, duration));

                    if(!player.isCreative() && level.getGameTime() % 20 == 0)
                    {
                        extractFE(stack, beginnerUseCost, EnergyAction.EXECUTE);
                    }
                }
            }

            case "intermediate_saturation_ring" ->
            {
                if (getCurrentFE(stack) >= intermediateUseCost && stack.getOrCreateTag().getBoolean("activated"))
                {
                    player.addEffect(applyEffect(MobEffects.SATURATION, 1, duration));

                    if(!player.isCreative() && level.getGameTime() % 20 == 0)
                    {
                        extractFE(stack, intermediateUseCost, EnergyAction.EXECUTE);
                    }
                }
            }

            case "advanced_saturation_ring" ->
            {
                if (getCurrentFE(stack) >= advancedUseCost && stack.getOrCreateTag().getBoolean("activated"))
                {
                    player.addEffect(applyEffect(MobEffects.SATURATION, 2, duration));

                    if(!player.isCreative() && level.getGameTime() % 20 == 0)
                    {
                        extractFE(stack, advancedUseCost, EnergyAction.EXECUTE);
                    }
                }
            }

            case "expert_saturation_ring" ->
            {
                if (getCurrentFE(stack) >= expertUseCost && stack.getOrCreateTag().getBoolean("activated"))
                {
                    player.addEffect(applyEffect(MobEffects.SATURATION, 3, duration));

                    if(!player.isCreative() && level.getGameTime() % 20 == 0)
                    {
                        extractFE(stack, expertUseCost, EnergyAction.EXECUTE);
                    }
                }
            }

            case "beginner_step_assist_ring" ->
            {
                if (getCurrentFE(stack) >= beginnerUseCost && stack.getOrCreateTag().getBoolean("activated"))
                {
                    player.addEffect(applyEffect(EffectRegistry.STEP_ASSIST.get(), 0, duration));

                    if(!player.isCreative() && level.getGameTime() % 20 == 0)
                    {
                        extractFE(stack, beginnerUseCost, EnergyAction.EXECUTE);
                    }
                }
            }

            case "intermediate_step_assist_ring" ->
            {
                if (getCurrentFE(stack) >= intermediateUseCost && stack.getOrCreateTag().getBoolean("activated"))
                {
                    player.addEffect(applyEffect(EffectRegistry.STEP_ASSIST.get(), 1, duration));

                    if(!player.isCreative() && level.getGameTime() % 20 == 0)
                    {
                        extractFE(stack, intermediateUseCost, EnergyAction.EXECUTE);
                    }
                }
            }

            case "advanced_step_assist_ring" ->
            {
                if (getCurrentFE(stack) >= advancedUseCost && stack.getOrCreateTag().getBoolean("activated"))
                {
                    player.addEffect(applyEffect(EffectRegistry.STEP_ASSIST.get(), 2, duration));

                    if (!player.isCreative() && level.getGameTime() % 20 == 0)
                    {
                        extractFE(stack, advancedUseCost, EnergyAction.EXECUTE);
                    }
                }
            }

            case "expert_step_assist_ring" ->
            {
                if (getCurrentFE(stack) >= expertUseCost && stack.getOrCreateTag().getBoolean("activated"))
                {
                    player.addEffect(applyEffect(EffectRegistry.STEP_ASSIST.get(), 3, duration));

                    if(!player.isCreative() && level.getGameTime() % 20 == 0)
                    {
                        extractFE(stack, expertUseCost, EnergyAction.EXECUTE);
                    }
                }
            }

            case "beginner_strength_ring"->
            {
                if (getCurrentFE(stack) >= beginnerUseCost && stack.getOrCreateTag().getBoolean("activated"))
                {
                    player.addEffect(applyEffect(MobEffects.DAMAGE_BOOST, 0, duration));

                    if(!player.isCreative() && level.getGameTime() % 20 == 0)
                    {
                        extractFE(stack, beginnerUseCost, EnergyAction.EXECUTE);
                    }
                }
            }

            case "intermediate_strength_ring" ->
            {
                if (getCurrentFE(stack) >= intermediateUseCost && stack.getOrCreateTag().getBoolean("activated"))
                {
                    player.addEffect(applyEffect(MobEffects.DAMAGE_BOOST, 1, duration));

                    if (!player.isCreative() && level.getGameTime() % 20 == 0)
                    {
                        extractFE(stack, advancedUseCost, EnergyAction.EXECUTE);
                    }
                }
            }

            case "advanced_strength_ring" ->
            {
                if (getCurrentFE(stack) >= advancedUseCost && stack.getOrCreateTag().getBoolean("activated"))
                {
                    player.addEffect(applyEffect(MobEffects.DAMAGE_BOOST, 2, duration));

                    if(!player.isCreative() && level.getGameTime() % 20 == 0)
                    {
                        extractFE(stack, advancedUseCost, EnergyAction.EXECUTE);
                    }
                }
            }

            case "expert_strength_ring" ->
            {
                if (getCurrentFE(stack) >= expertUseCost && stack.getOrCreateTag().getBoolean("activated"))
                {
                    player.addEffect(applyEffect(MobEffects.DAMAGE_BOOST, 3, duration));

                    if(!player.isCreative() && level.getGameTime() % 20 == 0)
                    {
                        extractFE(stack, expertUseCost, EnergyAction.EXECUTE);
                    }
                }
            }
            }
        }
    }
}
