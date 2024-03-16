package net.dimidium.aboe.handler;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.config.ModConfigEvent;

public class ConfigurationHandler
{
    private static final String CATEGORY_RING = "Electric Rings";
    private static final String CATEGORY_ENERGIZED_AXE = "Energized Axes";
    private static final String CATEGORY_ENERGIZED_BOW = "Energized Bows";
    private static final String CATEGORY_ENERGIZED_HOE = "Energized Hoes";
    private static final String CATEGORY_ENERGIZED_PICKAXE = "Energized Pickaxes";
    private static final String CATEGORY_ENERGIZED_SHOVEL = "Energized Shovels";
    private static final String CATEGORY_ENERGIZED_SWORD = "Energized Swords";
    public static ForgeConfigSpec CLIENT_CONFIG;
    public static ForgeConfigSpec SERVER_CONFIG;

    public static ForgeConfigSpec.DoubleValue BEGINNER_ENERGIZED_AXE_CAPACITY;
    public static ForgeConfigSpec.DoubleValue BEGINNER_ENERGIZED_AXE_CHARGING_SPEED;
    public static ForgeConfigSpec.DoubleValue BEGINNER_ENERGIZED_AXE_DRAIN_SPEED;
    public static ForgeConfigSpec.DoubleValue INTERMEDIATE_ENERGIZED_AXE_CAPACITY;
    public static ForgeConfigSpec.DoubleValue INTERMEDIATE_ENERGIZED_AXE_CHARGING_SPEED;
    public static ForgeConfigSpec.DoubleValue INTERMEDIATE_ENERGIZED_AXE_DRAIN_SPEED;
    public static ForgeConfigSpec.DoubleValue ADVANCED_ENERGIZED_AXE_CAPACITY;
    public static ForgeConfigSpec.DoubleValue ADVANCED_ENERGIZED_AXE_CHARGING_SPEED;
    public static ForgeConfigSpec.DoubleValue ADVANCED_ENERGIZED_AXE_DRAIN_SPEED;
    public static ForgeConfigSpec.DoubleValue EXPERT_ENERGIZED_AXE_CAPACITY;
    public static ForgeConfigSpec.DoubleValue EXPERT_ENERGIZED_AXE_CHARGING_SPEED;
    public static ForgeConfigSpec.DoubleValue EXPERT_ENERGIZED_AXE_DRAIN_SPEED;

    public static ForgeConfigSpec.DoubleValue BEGINNER_ENERGIZED_BOW_CAPACITY;
    public static ForgeConfigSpec.DoubleValue BEGINNER_ENERGIZED_BOW_CHARGING_SPEED;
    public static ForgeConfigSpec.DoubleValue BEGINNER_ENERGIZED_BOW_DRAIN_SPEED;
    public static ForgeConfigSpec.DoubleValue INTERMEDIATE_ENERGIZED_BOW_CAPACITY;
    public static ForgeConfigSpec.DoubleValue INTERMEDIATE_ENERGIZED_BOW_CHARGING_SPEED;
    public static ForgeConfigSpec.DoubleValue INTERMEDIATE_ENERGIZED_BOW_DRAIN_SPEED;
    public static ForgeConfigSpec.DoubleValue ADVANCED_ENERGIZED_BOW_CAPACITY;
    public static ForgeConfigSpec.DoubleValue ADVANCED_ENERGIZED_BOW_CHARGING_SPEED;
    public static ForgeConfigSpec.DoubleValue ADVANCED_ENERGIZED_BOW_DRAIN_SPEED;
    public static ForgeConfigSpec.DoubleValue EXPERT_ENERGIZED_BOW_CAPACITY;
    public static ForgeConfigSpec.DoubleValue EXPERT_ENERGIZED_BOW_CHARGING_SPEED;
    public static ForgeConfigSpec.DoubleValue EXPERT_ENERGIZED_BOW_DRAIN_SPEED;

    public static ForgeConfigSpec.DoubleValue BEGINNER_ENERGIZED_HOE_CAPACITY;
    public static ForgeConfigSpec.DoubleValue BEGINNER_ENERGIZED_HOE_CHARGING_SPEED;
    public static ForgeConfigSpec.DoubleValue BEGINNER_ENERGIZED_HOE_DRAIN_SPEED;
    public static ForgeConfigSpec.DoubleValue INTERMEDIATE_ENERGIZED_HOE_CAPACITY;
    public static ForgeConfigSpec.DoubleValue INTERMEDIATE_ENERGIZED_HOE_CHARGING_SPEED;
    public static ForgeConfigSpec.DoubleValue INTERMEDIATE_ENERGIZED_HOE_DRAIN_SPEED;
    public static ForgeConfigSpec.DoubleValue ADVANCED_ENERGIZED_HOE_CAPACITY;
    public static ForgeConfigSpec.DoubleValue ADVANCED_ENERGIZED_HOE_CHARGING_SPEED;
    public static ForgeConfigSpec.DoubleValue ADVANCED_ENERGIZED_HOE_DRAIN_SPEED;
    public static ForgeConfigSpec.DoubleValue EXPERT_ENERGIZED_HOE_CAPACITY;
    public static ForgeConfigSpec.DoubleValue EXPERT_ENERGIZED_HOE_CHARGING_SPEED;
    public static ForgeConfigSpec.DoubleValue EXPERT_ENERGIZED_HOE_DRAIN_SPEED;

    public static ForgeConfigSpec.DoubleValue BEGINNER_ENERGIZED_PICKAXE_CAPACITY;
    public static ForgeConfigSpec.DoubleValue BEGINNER_ENERGIZED_PICKAXE_CHARGING_SPEED;
    public static ForgeConfigSpec.DoubleValue BEGINNER_ENERGIZED_PICKAXE_DRAIN_SPEED;
    public static ForgeConfigSpec.DoubleValue INTERMEDIATE_ENERGIZED_PICKAXE_CAPACITY;
    public static ForgeConfigSpec.DoubleValue INTERMEDIATE_ENERGIZED_PICKAXE_CHARGING_SPEED;
    public static ForgeConfigSpec.DoubleValue INTERMEDIATE_ENERGIZED_PICKAXE_DRAIN_SPEED;
    public static ForgeConfigSpec.DoubleValue ADVANCED_ENERGIZED_PICKAXE_CAPACITY;
    public static ForgeConfigSpec.DoubleValue ADVANCED_ENERGIZED_PICKAXE_CHARGING_SPEED;
    public static ForgeConfigSpec.DoubleValue ADVANCED_ENERGIZED_PICKAXE_DRAIN_SPEED;
    public static ForgeConfigSpec.DoubleValue EXPERT_ENERGIZED_PICKAXE_CAPACITY;
    public static ForgeConfigSpec.DoubleValue EXPERT_ENERGIZED_PICKAXE_CHARGING_SPEED;
    public static ForgeConfigSpec.DoubleValue EXPERT_ENERGIZED_PICKAXE_DRAIN_SPEED;

    public static ForgeConfigSpec.DoubleValue BEGINNER_ENERGIZED_SHOVEL_CAPACITY;
    public static ForgeConfigSpec.DoubleValue BEGINNER_ENERGIZED_SHOVEL_CHARGING_SPEED;
    public static ForgeConfigSpec.DoubleValue BEGINNER_ENERGIZED_SHOVEL_DRAIN_SPEED;
    public static ForgeConfigSpec.DoubleValue INTERMEDIATE_ENERGIZED_SHOVEL_CAPACITY;
    public static ForgeConfigSpec.DoubleValue INTERMEDIATE_ENERGIZED_SHOVEL_CHARGING_SPEED;
    public static ForgeConfigSpec.DoubleValue INTERMEDIATE_ENERGIZED_SHOVEL_DRAIN_SPEED;
    public static ForgeConfigSpec.DoubleValue ADVANCED_ENERGIZED_SHOVEL_CAPACITY;
    public static ForgeConfigSpec.DoubleValue ADVANCED_ENERGIZED_SHOVEL_CHARGING_SPEED;
    public static ForgeConfigSpec.DoubleValue ADVANCED_ENERGIZED_SHOVEL_DRAIN_SPEED;
    public static ForgeConfigSpec.DoubleValue EXPERT_ENERGIZED_SHOVEL_CAPACITY;
    public static ForgeConfigSpec.DoubleValue EXPERT_ENERGIZED_SHOVEL_CHARGING_SPEED;
    public static ForgeConfigSpec.DoubleValue EXPERT_ENERGIZED_SHOVEL_DRAIN_SPEED;

    public static ForgeConfigSpec.DoubleValue BEGINNER_ENERGIZED_SWORD_CAPACITY;
    public static ForgeConfigSpec.DoubleValue BEGINNER_ENERGIZED_SWORD_CHARGING_SPEED;
    public static ForgeConfigSpec.DoubleValue BEGINNER_ENERGIZED_SWORD_DRAIN_SPEED;
    public static ForgeConfigSpec.DoubleValue INTERMEDIATE_ENERGIZED_SWORD_CAPACITY;
    public static ForgeConfigSpec.DoubleValue INTERMEDIATE_ENERGIZED_SWORD_CHARGING_SPEED;
    public static ForgeConfigSpec.DoubleValue INTERMEDIATE_ENERGIZED_SWORD_DRAIN_SPEED;
    public static ForgeConfigSpec.DoubleValue ADVANCED_ENERGIZED_SWORD_CAPACITY;
    public static ForgeConfigSpec.DoubleValue ADVANCED_ENERGIZED_SWORD_CHARGING_SPEED;
    public static ForgeConfigSpec.DoubleValue ADVANCED_ENERGIZED_SWORD_DRAIN_SPEED;
    public static ForgeConfigSpec.DoubleValue EXPERT_ENERGIZED_SWORD_CAPACITY;
    public static ForgeConfigSpec.DoubleValue EXPERT_ENERGIZED_SWORD_CHARGING_SPEED;
    public static ForgeConfigSpec.DoubleValue EXPERT_ENERGIZED_SWORD_DRAIN_SPEED;
    
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

        setup(SERVER_BUILDER);

        SERVER_CONFIG = SERVER_BUILDER.build();
    }

    public static void setup(ForgeConfigSpec.Builder SERVER_BUILDER)
    {
        SERVER_BUILDER.comment("Energized Axe Settings").push(CATEGORY_ENERGIZED_AXE);
        BEGINNER_ENERGIZED_AXE_CAPACITY = SERVER_BUILDER.comment("How much energy should the beginner energized axe contain?").defineInRange("beginnerEnergizedAxeCapacity", 2500D, 0.5D, 50000D);
        BEGINNER_ENERGIZED_AXE_CHARGING_SPEED = SERVER_BUILDER.comment("How fast does the beginner energized axe charge?").defineInRange("beginnerEnergizedAxeChargingSpeed", 25D, 0.5D, 100D);
        BEGINNER_ENERGIZED_AXE_DRAIN_SPEED = SERVER_BUILDER.comment("How much energy should the beginner energized axe consume when used?").defineInRange("beginnerEnergizedAxeEnergyUse", 0.1D, 0D, 100D);
        INTERMEDIATE_ENERGIZED_AXE_CAPACITY = SERVER_BUILDER.comment("How much energy should the intermediate energized axe contain?").defineInRange("intermediateEnergizedAxeCapacity", 5000D, 0.5D, 5000D);
        INTERMEDIATE_ENERGIZED_AXE_CHARGING_SPEED = SERVER_BUILDER.comment("How fast does the intermediate energized axe charge?").defineInRange("intermediateEnergizedAxeChargingSpeed", 50D, 0.5D, 100D);
        INTERMEDIATE_ENERGIZED_AXE_DRAIN_SPEED = SERVER_BUILDER.comment("How much energy should the intermediate energized axe consume when used?").defineInRange("intermediateEnergizedAxeEnergyUse", 0.2D, 0D, 100D);
        ADVANCED_ENERGIZED_AXE_CAPACITY = SERVER_BUILDER.comment("How much energy should the advanced energized axe contain?").defineInRange("advancedEnergizedAxeCapacity", 10000D, 0.5D, 50000D);
        ADVANCED_ENERGIZED_AXE_CHARGING_SPEED = SERVER_BUILDER.comment("How fast does the advanced energized axe charge?").defineInRange("advancedEnergizedAxeChargingSpeed", 75D, 0.5D, 100D);
        ADVANCED_ENERGIZED_AXE_DRAIN_SPEED = SERVER_BUILDER.comment("How much energy should the advanced energized axe consume when used?").defineInRange("advancedEnergizedAxeEnergyUse", 0.3D, 0D, 100D);
        EXPERT_ENERGIZED_AXE_CAPACITY = SERVER_BUILDER.comment("How much energy should the expert energized axe contain?").defineInRange("expertEnergizedAxeCapacity", 20000D, 0D, 5000D);
        EXPERT_ENERGIZED_AXE_CHARGING_SPEED = SERVER_BUILDER.comment("How fast does the expert energized axe charge?").defineInRange("expertEnergizedAxeChargingSpeed", 100D, 0.5D, 100D);
        EXPERT_ENERGIZED_AXE_DRAIN_SPEED = SERVER_BUILDER.comment("How much energy should the expert energized axe consume when used?").defineInRange("expertEnergizedAxeEnergyUse", 0.4D, 0D, 100D);
        SERVER_BUILDER.pop();

        SERVER_BUILDER.comment("Energized Bow Settings").push(CATEGORY_ENERGIZED_BOW);
        BEGINNER_ENERGIZED_BOW_CAPACITY = SERVER_BUILDER.comment("How much energy should the beginner energized bow contain?").defineInRange("beginnerEnergizedBowCapacity", 2500D, 0.5D, 50000D);
        BEGINNER_ENERGIZED_BOW_CHARGING_SPEED = SERVER_BUILDER.comment("How fast does the beginner energized bow charge?").defineInRange("beginnerEnergizedBowChargingSpeed", 25D, 0.5D, 100D);
        BEGINNER_ENERGIZED_BOW_DRAIN_SPEED = SERVER_BUILDER.comment("How much energy should the beginner energized bow consume when used?").defineInRange("beginnerEnergizedBowEnergyUse", 0.1D, 0D, 100D);
        INTERMEDIATE_ENERGIZED_BOW_CAPACITY = SERVER_BUILDER.comment("How much energy should the intermediate energized bow contain?").defineInRange("intermediateEnergizedBowCapacity", 5000D, 0.5D, 5000D);
        INTERMEDIATE_ENERGIZED_BOW_CHARGING_SPEED = SERVER_BUILDER.comment("How fast does the intermediate energized bow charge?").defineInRange("intermediateEnergizedBowChargingSpeed", 50D, 0.5D, 100D);
        INTERMEDIATE_ENERGIZED_BOW_DRAIN_SPEED = SERVER_BUILDER.comment("How much energy should the intermediate energized bow consume when used?").defineInRange("intermediateEnergizedBowEnergyUse", 0.2D, 0D, 100D);
        ADVANCED_ENERGIZED_BOW_CAPACITY = SERVER_BUILDER.comment("How much energy should the advanced energized bow contain?").defineInRange("advancedEnergizedBowCapacity", 10000D, 0.5D, 50000D);
        ADVANCED_ENERGIZED_BOW_CHARGING_SPEED = SERVER_BUILDER.comment("How fast does the advanced energized bow charge?").defineInRange("advancedEnergizedBowChargingSpeed", 75D, 0.5D, 100D);
        ADVANCED_ENERGIZED_BOW_DRAIN_SPEED = SERVER_BUILDER.comment("How much energy should the advanced energized bow consume when used?").defineInRange("advancedEnergizedBowEnergyUse", 0.3D, 0D, 100D);
        EXPERT_ENERGIZED_BOW_CAPACITY = SERVER_BUILDER.comment("How much energy should the expert energized bow contain?").defineInRange("expertEnergizedBowCapacity", 20000D, 0D, 5000D);
        EXPERT_ENERGIZED_BOW_CHARGING_SPEED = SERVER_BUILDER.comment("How fast does the expert energized bow charge?").defineInRange("expertEnergizedBowChargingSpeed", 100D, 0.5D, 100D);
        EXPERT_ENERGIZED_BOW_DRAIN_SPEED = SERVER_BUILDER.comment("How much energy should the expert energized bow consume when used?").defineInRange("expertEnergizedBowEnergyUse", 0.4D, 0D, 100D);
        SERVER_BUILDER.pop();

        SERVER_BUILDER.comment("Energized Hoe Settings").push(CATEGORY_ENERGIZED_HOE);
        BEGINNER_ENERGIZED_HOE_CAPACITY = SERVER_BUILDER.comment("How much energy should the beginner energized hoe contain?").defineInRange("beginnerEnergizedHoeCapacity", 2500D, 0.5D, 50000D);
        BEGINNER_ENERGIZED_HOE_CHARGING_SPEED = SERVER_BUILDER.comment("How fast does the beginner energized hoe charge?").defineInRange("beginnerEnergizedHoeChargingSpeed", 25D, 0.5D, 100D);
        BEGINNER_ENERGIZED_HOE_DRAIN_SPEED = SERVER_BUILDER.comment("How much energy should the beginner energized hoe consume when used?").defineInRange("beginnerEnergizedHoeEnergyUse", 0.1D, 0D, 100D);
        INTERMEDIATE_ENERGIZED_HOE_CAPACITY = SERVER_BUILDER.comment("How much energy should the intermediate energized hoe contain?").defineInRange("intermediateEnergizedHoeCapacity", 5000D, 0.5D, 5000D);
        INTERMEDIATE_ENERGIZED_HOE_CHARGING_SPEED = SERVER_BUILDER.comment("How fast does the intermediate energized hoe charge?").defineInRange("intermediateEnergizedHoeChargingSpeed", 50D, 0.5D, 100D);
        INTERMEDIATE_ENERGIZED_HOE_DRAIN_SPEED = SERVER_BUILDER.comment("How much energy should the intermediate energized hoe consume when used?").defineInRange("intermediateEnergizedHoeEnergyUse", 0.2D, 0D, 100D);
        ADVANCED_ENERGIZED_HOE_CAPACITY = SERVER_BUILDER.comment("How much energy should the advanced energized hoe contain?").defineInRange("advancedEnergizedHoeCapacity", 10000D, 0.5D, 50000D);
        ADVANCED_ENERGIZED_HOE_CHARGING_SPEED = SERVER_BUILDER.comment("How fast does the advanced energized hoe charge?").defineInRange("advancedEnergizedHoeChargingSpeed", 75D, 0.5D, 100D);
        ADVANCED_ENERGIZED_HOE_DRAIN_SPEED = SERVER_BUILDER.comment("How much energy should the advanced energized hoe consume when used?").defineInRange("advancedEnergizedHoeEnergyUse", 0.3D, 0D, 100D);
        EXPERT_ENERGIZED_HOE_CAPACITY = SERVER_BUILDER.comment("How much energy should the expert energized hoe contain?").defineInRange("expertEnergizedHoeCapacity", 20000D, 0D, 5000D);
        EXPERT_ENERGIZED_HOE_CHARGING_SPEED = SERVER_BUILDER.comment("How fast does the expert energized hoe charge?").defineInRange("expertEnergizedHoeChargingSpeed", 100D, 0.5D, 100D);
        EXPERT_ENERGIZED_HOE_DRAIN_SPEED = SERVER_BUILDER.comment("How much energy should the expert energized hoe consume when used?").defineInRange("expertEnergizedHoeEnergyUse", 0.4D, 0D, 100D);
        SERVER_BUILDER.pop();

        SERVER_BUILDER.comment("Energized Pickaxe Settings").push(CATEGORY_ENERGIZED_PICKAXE);
        BEGINNER_ENERGIZED_PICKAXE_CAPACITY = SERVER_BUILDER.comment("How much energy should the beginner energized pickaxe contain?").defineInRange("beginnerEnergizedPickaxeCapacity", 2500D, 0.5D, 50000D);
        BEGINNER_ENERGIZED_PICKAXE_CHARGING_SPEED = SERVER_BUILDER.comment("How fast does the beginner energized pickaxe charge?").defineInRange("beginnerEnergizedPickaxeChargingSpeed", 25D, 0.5D, 100D);
        BEGINNER_ENERGIZED_PICKAXE_DRAIN_SPEED = SERVER_BUILDER.comment("How much energy should the beginner energized pickaxe consume when used?").defineInRange("beginnerEnergizedPickaxeEnergyUse", 0.1D, 0D, 100D);
        INTERMEDIATE_ENERGIZED_PICKAXE_CAPACITY = SERVER_BUILDER.comment("How much energy should the intermediate energized pickaxe contain?").defineInRange("intermediateEnergizedPickaxeCapacity", 5000D, 0.5D, 5000D);
        INTERMEDIATE_ENERGIZED_PICKAXE_CHARGING_SPEED = SERVER_BUILDER.comment("How fast does the intermediate energized pickaxe charge?").defineInRange("intermediateEnergizedPickaxeChargingSpeed", 50D, 0.5D, 100D);
        INTERMEDIATE_ENERGIZED_PICKAXE_DRAIN_SPEED = SERVER_BUILDER.comment("How much energy should the intermediate energized pickaxe consume when used?").defineInRange("intermediateEnergizedPickaxeEnergyUse", 0.2D, 0D, 100D);
        ADVANCED_ENERGIZED_PICKAXE_CAPACITY = SERVER_BUILDER.comment("How much energy should the advanced energized pickaxe contain?").defineInRange("advancedEnergizedPickaxeCapacity", 10000D, 0.5D, 50000D);
        ADVANCED_ENERGIZED_PICKAXE_CHARGING_SPEED = SERVER_BUILDER.comment("How fast does the advanced energized pickaxe charge?").defineInRange("advancedEnergizedPickaxeChargingSpeed", 75D, 0.5D, 100D);
        ADVANCED_ENERGIZED_PICKAXE_DRAIN_SPEED = SERVER_BUILDER.comment("How much energy should the advanced energized pickaxe consume when used?").defineInRange("advancedEnergizedPickaxeEnergyUse", 0.3D, 0D, 100D);
        EXPERT_ENERGIZED_PICKAXE_CAPACITY = SERVER_BUILDER.comment("How much energy should the expert energized pickaxe contain?").defineInRange("expertEnergizedPickaxeCapacity", 20000D, 0D, 5000D);
        EXPERT_ENERGIZED_PICKAXE_CHARGING_SPEED = SERVER_BUILDER.comment("How fast does the expert energized pickaxe charge?").defineInRange("expertEnergizedPickaxeChargingSpeed", 100D, 0.5D, 100D);
        EXPERT_ENERGIZED_PICKAXE_DRAIN_SPEED = SERVER_BUILDER.comment("How much energy should the expert energized pickaxe consume when used?").defineInRange("expertEnergizedPickaxeEnergyUse", 0.4D, 0D, 100D);
        SERVER_BUILDER.pop();

        SERVER_BUILDER.comment("Energized Shovel Settings").push(CATEGORY_ENERGIZED_SHOVEL);
        BEGINNER_ENERGIZED_SHOVEL_CAPACITY = SERVER_BUILDER.comment("How much energy should the beginner energized shovel contain?").defineInRange("beginnerEnergizedShovelCapacity", 2500D, 0.5D, 50000D);
        BEGINNER_ENERGIZED_SHOVEL_CHARGING_SPEED = SERVER_BUILDER.comment("How fast does the beginner energized shovel charge?").defineInRange("beginnerEnergizedShovelChargingSpeed", 25D, 0.5D, 100D);
        BEGINNER_ENERGIZED_SHOVEL_DRAIN_SPEED = SERVER_BUILDER.comment("How much energy should the beginner energized shovel consume when used?").defineInRange("beginnerEnergizedShovelEnergyUse", 0.1D, 0D, 100D);
        INTERMEDIATE_ENERGIZED_SHOVEL_CAPACITY = SERVER_BUILDER.comment("How much energy should the intermediate energized shovel contain?").defineInRange("intermediateEnergizedShovelCapacity", 5000D, 0.5D, 5000D);
        INTERMEDIATE_ENERGIZED_SHOVEL_CHARGING_SPEED = SERVER_BUILDER.comment("How fast does the intermediate energized shovel charge?").defineInRange("intermediateEnergizedShovelChargingSpeed", 50D, 0.5D, 100D);
        INTERMEDIATE_ENERGIZED_SHOVEL_DRAIN_SPEED = SERVER_BUILDER.comment("How much energy should the intermediate energized shovel consume when used?").defineInRange("intermediateEnergizedShovelEnergyUse", 0.2D, 0D, 100D);
        ADVANCED_ENERGIZED_SHOVEL_CAPACITY = SERVER_BUILDER.comment("How much energy should the advanced energized shovel contain?").defineInRange("advancedEnergizedShovelCapacity", 10000D, 0.5D, 50000D);
        ADVANCED_ENERGIZED_SHOVEL_CHARGING_SPEED = SERVER_BUILDER.comment("How fast does the advanced energized shovel charge?").defineInRange("advancedEnergizedShovelChargingSpeed", 75D, 0.5D, 100D);
        ADVANCED_ENERGIZED_SHOVEL_DRAIN_SPEED = SERVER_BUILDER.comment("How much energy should the advanced energized shovel consume when used?").defineInRange("advancedEnergizedShovelEnergyUse", 0.3D, 0D, 100D);
        EXPERT_ENERGIZED_SHOVEL_CAPACITY = SERVER_BUILDER.comment("How much energy should the expert energized shovel contain?").defineInRange("expertEnergizedShovelCapacity", 20000D, 0D, 5000D);
        EXPERT_ENERGIZED_SHOVEL_CHARGING_SPEED = SERVER_BUILDER.comment("How fast does the expert energized shovel charge?").defineInRange("expertEnergizedShovelChargingSpeed", 100D, 0.5D, 100D);
        EXPERT_ENERGIZED_SHOVEL_DRAIN_SPEED = SERVER_BUILDER.comment("How much energy should the expert energized shovel consume when used?").defineInRange("expertEnergizedShovelEnergyUse", 0.4D, 0D, 100D);
        SERVER_BUILDER.pop();

        SERVER_BUILDER.comment("Energized Sword Settings").push(CATEGORY_ENERGIZED_SWORD);
        BEGINNER_ENERGIZED_SWORD_CAPACITY = SERVER_BUILDER.comment("How much energy should the beginner energized sword contain?").defineInRange("beginnerEnergizedSwordCapacity", 2500D, 0.5D, 50000D);
        BEGINNER_ENERGIZED_SWORD_CHARGING_SPEED = SERVER_BUILDER.comment("How fast does the beginner energized sword charge?").defineInRange("beginnerEnergizedSwordChargingSpeed", 25D, 0.5D, 100D);
        BEGINNER_ENERGIZED_SWORD_DRAIN_SPEED = SERVER_BUILDER.comment("How much energy should the beginner energized sword consume when used?").defineInRange("beginnerEnergizedSwordEnergyUse", 0.1D, 0D, 100D);
        INTERMEDIATE_ENERGIZED_SWORD_CAPACITY = SERVER_BUILDER.comment("How much energy should the intermediate energized sword contain?").defineInRange("intermediateEnergizedSwordCapacity", 5000D, 0.5D, 5000D);
        INTERMEDIATE_ENERGIZED_SWORD_CHARGING_SPEED = SERVER_BUILDER.comment("How fast does the intermediate energized sword charge?").defineInRange("intermediateEnergizedSwordChargingSpeed", 50D, 0.5D, 100D);
        INTERMEDIATE_ENERGIZED_SWORD_DRAIN_SPEED = SERVER_BUILDER.comment("How much energy should the intermediate energized sword consume when used?").defineInRange("intermediateEnergizedSwordEnergyUse", 0.2D, 0D, 100D);
        ADVANCED_ENERGIZED_SWORD_CAPACITY = SERVER_BUILDER.comment("How much energy should the advanced energized sword contain?").defineInRange("advancedEnergizedSwordCapacity", 10000D, 0.5D, 50000D);
        ADVANCED_ENERGIZED_SWORD_CHARGING_SPEED = SERVER_BUILDER.comment("How fast does the advanced energized sword charge?").defineInRange("advancedEnergizedSwordChargingSpeed", 75D, 0.5D, 100D);
        ADVANCED_ENERGIZED_SWORD_DRAIN_SPEED = SERVER_BUILDER.comment("How much energy should the advanced energized sword consume when used?").defineInRange("advancedEnergizedSwordEnergyUse", 0.3D, 0D, 100D);
        EXPERT_ENERGIZED_SWORD_CAPACITY = SERVER_BUILDER.comment("How much energy should the expert energized sword contain?").defineInRange("expertEnergizedSwordCapacity", 20000D, 0D, 5000D);
        EXPERT_ENERGIZED_SWORD_CHARGING_SPEED = SERVER_BUILDER.comment("How fast does the expert energized sword charge?").defineInRange("expertEnergizedSwordChargingSpeed", 100D, 0.5D, 100D);
        EXPERT_ENERGIZED_SWORD_DRAIN_SPEED = SERVER_BUILDER.comment("How much energy should the expert energized sword consume when used?").defineInRange("expertEnergizedSwordEnergyUse", 0.4D, 0D, 100D);
        SERVER_BUILDER.pop();

        SERVER_BUILDER.comment("Electric Rings Settings").push(CATEGORY_RING);
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
