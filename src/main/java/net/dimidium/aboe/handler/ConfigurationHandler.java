package net.dimidium.aboe.handler;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.config.ModConfigEvent;

public class ConfigurationHandler
{
    private static final String CATEGORY_RING = "Electric Rings";
    public static ForgeConfigSpec CLIENT_CONFIG;
    public static ForgeConfigSpec SERVER_CONFIG;

    public static ForgeConfigSpec.DoubleValue BEGINNER_RING_CAPACITY;
    public static ForgeConfigSpec.DoubleValue BEGINNER_RING_CHARGING_SPEED;
    public static ForgeConfigSpec.DoubleValue BEGINNER_RING_DRAIN_SPEED;
    public static ForgeConfigSpec.DoubleValue INTERMEDIATE_RING_CAPACITY;
    public static ForgeConfigSpec.DoubleValue INTERMEDIATE_RING_CHARGING_SPEED;
    public static ForgeConfigSpec.DoubleValue INTERMEDIATE_RING_DRAIN_SPEED;
    public static ForgeConfigSpec.DoubleValue ADVANCED_RING_CAPACITY;
    public static ForgeConfigSpec.DoubleValue ADVANCED_RING_CHARGING_SPEED;
    public static ForgeConfigSpec.DoubleValue ADVANCED_RING_DRAIN_SPEED;
    public static ForgeConfigSpec.DoubleValue EXPERT_RING_CAPACITY;
    public static ForgeConfigSpec.DoubleValue EXPERT_RING_CHARGING_SPEED;
    public static ForgeConfigSpec.DoubleValue EXPERT_RING_DRAIN_SPEED;

    static
    {
        ForgeConfigSpec.Builder SERVER_BUILDER = new ForgeConfigSpec.Builder();

        SERVER_BUILDER.comment("Electric Rings Settings").push(CATEGORY_RING);

        setup(SERVER_BUILDER);

        SERVER_CONFIG = SERVER_BUILDER.build();
    }

    public static void setup(ForgeConfigSpec.Builder SERVER_BUILDER)
    {
        BEGINNER_RING_CAPACITY = SERVER_BUILDER.comment("How much energy should the beginner ring contain?").defineInRange("beginnerRingCapacity", 2500D, 0.5D, 50000D);
        BEGINNER_RING_CHARGING_SPEED = SERVER_BUILDER.comment("How fast does the beginner ring charge?").defineInRange("beginnerChargingSpeed", 25D, 0.5D, 100D);
        BEGINNER_RING_DRAIN_SPEED = SERVER_BUILDER.comment("How much energy should the beginner ring consume when used?").defineInRange("beginnerEnergyUse", 0.1D, 0D, 100D);
        INTERMEDIATE_RING_CAPACITY = SERVER_BUILDER.comment("How much energy should the intermediate ring contain?").defineInRange("intermediateRingCapacity", 5000D, 0.5D, 5000D);
        INTERMEDIATE_RING_CHARGING_SPEED = SERVER_BUILDER.comment("How fast does the intermediate ring charge?").defineInRange("intermediateChargingSpeed", 50D, 0.5D, 100D);
        INTERMEDIATE_RING_DRAIN_SPEED = SERVER_BUILDER.comment("How much energy should the intermediate ring consume when used?").defineInRange("intermediateEnergyUse", 0.2D, 0D, 100D);
        ADVANCED_RING_CAPACITY = SERVER_BUILDER.comment("How much energy should the advanced ring contain?").defineInRange("advancedRingCapacity", 10000D, 0.5D, 50000D);
        ADVANCED_RING_CHARGING_SPEED = SERVER_BUILDER.comment("How fast does the advanced ring charge?").defineInRange("advancedChargingSpeed", 75D, 0.5D, 100D);
        ADVANCED_RING_DRAIN_SPEED = SERVER_BUILDER.comment("How much energy should the advanced ring consume when used?").defineInRange("advancedEnergyUse", 0.3D, 0D, 100D);
        EXPERT_RING_CAPACITY = SERVER_BUILDER.comment("How much energy should the expert ring contain?").defineInRange("expertRingCapacity", 20000D, 0D, 5000D);
        EXPERT_RING_CHARGING_SPEED = SERVER_BUILDER.comment("How fast does the expert ring charge?").defineInRange("expertChargingSpeed", 100D, 0.5D, 100D);
        EXPERT_RING_DRAIN_SPEED = SERVER_BUILDER.comment("How much energy should the expert ring consume when used?").defineInRange("expertEnergyUse", 0.4D, 0D, 100D);
        SERVER_BUILDER.pop();
    }

    @SubscribeEvent
    public static void onLoad(final ModConfigEvent.Loading event)
    {

    }

    @SubscribeEvent
    public static void onReload(final ModConfigEvent.Reloading event)
    {

    }
}
