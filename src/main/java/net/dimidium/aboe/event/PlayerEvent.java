/*
package net.dimidium.aboe.event;

import net.dimidium.aboe.ABOE;
import net.dimidium.aboe.handler.registry.EffectRegistry;
import net.dimidium.aboe.handler.registry.ItemRegistry;
import net.dimidium.dimidiumcore.api.energy.EnergyAction;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingDamageEvent;
import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;
import net.neoforged.neoforge.event.entity.living.LivingEquipmentChangeEvent;
import net.neoforged.neoforge.event.entity.player.AttackEntityEvent;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;

import java.util.UUID;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.GAME)
public class PlayerEvent
{
    private static final double MIN_FE = 0.0001;
    private static final String CURRENT_FE_KEY = "currentFE";
    private static final UUID HEALTH_UUID = UUID.fromString("74d0fa62-2a28-4828-8679-9239ba160ae1");

    @SubscribeEvent
    public static void onLeftClick(PlayerInteractEvent.LeftClickBlock event)
    {
        final Player player = event.getEntity();
        final ItemStack usedItem = player.getItemInHand(player.getUsedItemHand());
        final Level level = player.level();

        if (!(event.getEntity().level().isClientSide))
        {
            if (!player.isCreative())
            {
                if (player.isShiftKeyDown() && usedItem != ItemStack.EMPTY && usedItem.getCount() == usedItem.getMaxStackSize())
                {
                    player.getInventory().removeItem(usedItem);
                }

                usedItem.shrink(1);
            }
        }
    }

    @SubscribeEvent
    public static void onRightClick(PlayerInteractEvent.RightClickBlock event)
    {
        ABOE.LOGGER.debug(event.getEntity().getItemInHand(event.getEntity().getUsedItemHand()).getItem().toString());
    }

    */
/*@SubscribeEvent
    public static void tickEvent(LivingEvent.LivingTickEvent event)
    {
        //TODO consume "soul essence" when these are active and you take damage etc, once I implement the soul essence system

        ItemStack healthBoosts = new ItemStack(ItemRegistry.BASIC_HEALTH_BOOSTER.get());

        if(event.getEntity() instanceof final Player player)
        {
            AttributeInstance MAX_HEALTH = player.getAttribute(Attributes.MAX_HEALTH);
            AttributeModifier MAX_HEALTH_MODIFIER = MAX_HEALTH.getModifier(HEALTH_UUID);

            if(!player.getInventory().contains(healthBoosts))
            {
                MAX_HEALTH.removeModifier(MAX_HEALTH_MODIFIER);
            }

            if(player.getInventory().contains(healthBoosts) && MAX_HEALTH_MODIFIER == null)
            {
                switch(healthBoosts.getCount())
                {
                    case 1:
                        MAX_HEALTH.addPermanentModifier(new AttributeModifier(HEALTH_UUID, Constants.MOD_ID + ":health_boost", 2, AttributeModifier.Operation.ADDITION));
                    break;

                    default:break;
                }
            }
        }*//*

    //}

    @SubscribeEvent
    public static void onArmorChange(LivingEquipmentChangeEvent event)
    {
        if(event.getEntity() instanceof final Player player)
        {
            if(!(player.getInventory().armor.get(0).is(ItemRegistry.RADIATION_SUIT_BOOTS.get()) && player.getInventory().armor.get(1).is(ItemRegistry.RADIATION_SUIT_LEGGINGS.get()) && player.getInventory().armor.get(2).is(ItemRegistry.RADIATION_SUIT_CHESTPLATE.get()) && player.getInventory().armor.get(3).is(ItemRegistry.RADIATION_SUIT_HELMET.get())))
            {
                player.removeEffect(EffectRegistry.ANTI_RADIATION.get());
            }
        }
    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void onAttack(AttackEntityEvent event)
    {
        if(event.getTarget() instanceof final Player player)
        {
            */
/* 0 is boots, 1 is leggings, 2 is chestplate and 3 is helmet *//*


            if(!(player.level().isClientSide))
            {
                if(player.getInventory().armor.get(0).getItem().equals(ItemRegistry.RADIATION_SUIT_BOOTS.get()))
                {
                    ItemStack item = player.getInventory().armor.get(0);

                    extractFE(item, 10D, EnergyAction.EXECUTE);

                    if(item.getTag().getDouble(CURRENT_FE_KEY) < 10D)
                    {
                        player.setItemSlot(EquipmentSlot.FEET, new ItemStack(ItemRegistry.RADIATION_SUIT_BOOTS_BROKEN.get()));
                    }
                }

                else if(player.getInventory().armor.get(1).getItem().equals(ItemRegistry.RADIATION_SUIT_LEGGINGS.get()))
                {
                    ItemStack item = player.getInventory().armor.get(1);

                    extractFE(item, 10D, EnergyAction.EXECUTE);

                    if(item.getTag().getDouble(CURRENT_FE_KEY) < 10D)
                    {
                        player.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ItemRegistry.RADIATION_SUIT_LEGGINGS_BROKEN.get()));
                    }
                }

                else if(player.getInventory().armor.get(2).getItem().equals(ItemRegistry.RADIATION_SUIT_CHESTPLATE.get()))
                {
                    ItemStack item = player.getInventory().armor.get(2);
                    extractFE(item, 10D, EnergyAction.EXECUTE);

                    if(item.getTag().getDouble(CURRENT_FE_KEY) < 10D)
                    {
                        player.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ItemRegistry.RADIATION_SUIT_CHESTPLATE_BROKEN.get()));
                    }
                }

                else if(player.getInventory().armor.get(3).getItem().equals(ItemRegistry.RADIATION_SUIT_HELMET.get()))
                {
                    ItemStack item = player.getInventory().armor.get(3);
                    extractFE(item, 10D, EnergyAction.EXECUTE);

                    if(item.getTag().getDouble(CURRENT_FE_KEY) < 10D)
                    {
                        player.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ItemRegistry.RADIATION_SUIT_HELMET_BROKEN.get()));
                    }
                }
            }
        }
    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void onAttack(AttackEntityEvent event)
    {
        if(event.getEntity() instanceof final Player player)
        {
            */
/* 0 is boots, 1 is leggings, 2 is chestplate and 3 is helmet *//*


            if(!(player.level().isClientSide))
            {
                if(player.getInventory().armor.get(0).getItem().equals(ItemRegistry.RADIATION_SUIT_BOOTS.get()))
                {
                    ItemStack item = player.getInventory().armor.get(0);

                    extractFE(item, 10D, EnergyAction.EXECUTE);

                    //toso below

                    */
/*if(item.getTag().getDouble(CURRENT_FE_KEY) < 10D)
                    {
                        player.setItemSlot(EquipmentSlot.FEET, new ItemStack(ItemRegistry.RADIATION_SUIT_BOOTS_BROKEN.get()));
                    }*//*

                }

                else if(player.getInventory().armor.get(1).getItem().equals(ItemRegistry.RADIATION_SUIT_LEGGINGS.get()))
                {
                    ItemStack item = player.getInventory().armor.get(1);

                    extractFE(item, 10D, EnergyAction.EXECUTE);

                    if(item.getTag().getDouble(CURRENT_FE_KEY) < 10D)
                    {
                        player.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ItemRegistry.RADIATION_SUIT_LEGGINGS_BROKEN.get()));
                    }
                }

                else if(player.getInventory().armor.get(2).getItem().equals(ItemRegistry.RADIATION_SUIT_CHESTPLATE.get()))
                {
                    ItemStack item = player.getInventory().armor.get(2);
                    extractFE(item, 10D, EnergyAction.EXECUTE);

                    if(item.getTag().getDouble(CURRENT_FE_KEY) < 10D)
                    {
                        player.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ItemRegistry.RADIATION_SUIT_CHESTPLATE_BROKEN.get()));
                    }
                }

                else if(player.getInventory().armor.get(3).getItem().equals(ItemRegistry.RADIATION_SUIT_HELMET.get()))
                {
                    ItemStack item = player.getInventory().armor.get(3);
                    extractFE(item, 10D, EnergyAction.EXECUTE);

                    if(item.getTag().getDouble(CURRENT_FE_KEY) < 10D)
                    {
                        player.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ItemRegistry.RADIATION_SUIT_HELMET_BROKEN.get()));
                    }
                }
            }
        }
    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void onDamage(LivingDamageEvent event)
    {
        if(event.getEntity() instanceof final Player player)
        {
            */
/* 0 is boots, 1 is leggings, 2 is chestplate and 3 is helmet *//*


            if(!(player.level().isClientSide))
            {
                if(player.getInventory().armor.get(0).getItem().equals(ItemRegistry.RADIATION_SUIT_BOOTS.get()))
                {
                    ItemStack item = player.getInventory().armor.get(0);

                    extractFE(item, 10D, EnergyAction.EXECUTE);

                    if(item.getTag().getDouble(CURRENT_FE_KEY) < 10D)
                    {
                        player.setItemSlot(EquipmentSlot.FEET, new ItemStack(ItemRegistry.RADIATION_SUIT_BOOTS_BROKEN.get()));
                    }
                }

                else if(player.getInventory().armor.get(1).getItem().equals(ItemRegistry.RADIATION_SUIT_LEGGINGS.get()))
                {
                    ItemStack item = player.getInventory().armor.get(1);

                    extractFE(item, 10D, EnergyAction.EXECUTE);

                    if(item.getTag().getDouble(CURRENT_FE_KEY) < 10D)
                    {
                        player.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ItemRegistry.RADIATION_SUIT_LEGGINGS_BROKEN.get()));
                    }
                }

                else if(player.getInventory().armor.get(2).getItem().equals(ItemRegistry.RADIATION_SUIT_CHESTPLATE.get()))
                {
                    ItemStack item = player.getInventory().armor.get(2);
                    extractFE(item, 10D, EnergyAction.EXECUTE);

                    if(item.getTag().getDouble(CURRENT_FE_KEY) < 10D)
                    {
                        player.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ItemRegistry.RADIATION_SUIT_CHESTPLATE_BROKEN.get()));
                    }
                }

                else if(player.getInventory().armor.get(3).getItem().equals(ItemRegistry.RADIATION_SUIT_HELMET.get()))
                {
                    ItemStack item = player.getInventory().armor.get(3);
                    extractFE(item, 10D, EnergyAction.EXECUTE);

                    if(item.getTag().getDouble(CURRENT_FE_KEY) < 10D)
                    {
                        player.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ItemRegistry.RADIATION_SUIT_HELMET_BROKEN.get()));
                    }
                }
            }
        }
    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void onDeath(LivingDeathEvent event)
    {
        if(event.getEntity() instanceof final Player player)
        {
            */
/* 0 is boots, 1 is leggings, 2 is chestplate and 3 is helmet *//*


            if(!(player.level().isClientSide))
            {
                if(player.getInventory().armor.get(0).getItem().equals(ItemRegistry.RADIATION_SUIT_BOOTS.get()))
                {
                    ItemStack item = player.getInventory().armor.get(0);

                    extractFE(item, 10D, EnergyAction.EXECUTE);

                    if(item.getTag().getDouble(CURRENT_FE_KEY) < 10D)
                    {
                        player.setItemSlot(EquipmentSlot.FEET, new ItemStack(ItemRegistry.RADIATION_SUIT_BOOTS_BROKEN.get()));
                    }
                }

                else if(player.getInventory().armor.get(1).getItem().equals(ItemRegistry.RADIATION_SUIT_LEGGINGS.get()))
                {
                    ItemStack item = player.getInventory().armor.get(1);

                    extractFE(item, 10D, EnergyAction.EXECUTE);

                    if(item.getTag().getDouble(CURRENT_FE_KEY) < 10D)
                    {
                        player.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ItemRegistry.RADIATION_SUIT_LEGGINGS_BROKEN.get()));
                    }
                }

                else if(player.getInventory().armor.get(2).getItem().equals(ItemRegistry.RADIATION_SUIT_CHESTPLATE.get()))
                {

                    //TODO configuration option
                    ItemStack item = player.getInventory().armor.get(2);
                    extractFE(item, 10D, EnergyAction.EXECUTE);

                    if(item.getTag().getDouble(CURRENT_FE_KEY) < 10D)
                    {
                        player.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ItemRegistry.RADIATION_SUIT_CHESTPLATE_BROKEN.get()));
                    }
                }

                else if(player.getInventory().armor.get(3).getItem().equals(ItemRegistry.RADIATION_SUIT_HELMET.get()))
                {
                    ItemStack item = player.getInventory().armor.get(3);
                    extractFE(item, 10D, EnergyAction.EXECUTE);

                    if(item.getTag().getDouble(CURRENT_FE_KEY) < 10D)
                    {
                        player.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ItemRegistry.RADIATION_SUIT_HELMET_BROKEN.get()));
                    }
                }
            }
        }
    }

    private static double extractFE(ItemStack stack, double amount, EnergyAction mode)
    {
        final double currentStorage = getCurrentFE(stack);
        final double fulfillable = Math.min(amount, currentStorage);

        if (mode == EnergyAction.EXECUTE)
        {
            setCurrentFE(stack, currentStorage - fulfillable);
        }

        return fulfillable;
    }

    protected static final void setCurrentFE(ItemStack stack, double power)
    {
        if (power < MIN_FE)
        {
            stack.removeTagKey(CURRENT_FE_KEY);
        }

        else
        {
            stack.getOrCreateTag().putDouble(CURRENT_FE_KEY, power);
        }
    }

    private static double getCurrentFE(ItemStack is)
    {
        var tag = is.getTag();

        if (tag != null)
        {
            return tag.getDouble(CURRENT_FE_KEY);
        }

        else
        {
            return 0;
        }
    }
}
*/
