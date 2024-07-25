package net.dimidium.aboe.handler.registry;

import net.dimidium.aboe.fluid.*;
import net.dimidium.aboe.util.Constants;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.SoundActions;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import org.joml.Vector3f;

public class FluidTypeRegistry
{
    private static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(NeoForgeRegistries.Keys.FLUID_TYPES, Constants.MOD_ID);

    public static final ResourceLocation EXPERIENCE_STILL = ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "block/fluid/liquid_experience_still");
    public static final ResourceLocation EXPERIENCE_FLOWING = ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "block/fluid/liquid_experience_flowing");

    public static final ResourceLocation WATER_STILL = ResourceLocation.parse("block/water_still");
    public static final ResourceLocation WATER_FLOWING = ResourceLocation.parse("block/water_flow");

    public static final DeferredHolder<FluidType, FluidType> LIQUID_EXPERIENCE  = registerLiquid("liquid_experience_fluid",
            FluidType.Properties.create()
                    .lightLevel(2)
                    .density(15)
                    .viscosity(5)
                    .canPushEntity(false)
                    .canDrown(true)
                    .canSwim(false)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.PLAYER_LEVELUP)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.PLAYER_LEVELUP)
    );

    public static final DeferredHolder<FluidType, FluidType> MOLTEN_ALUMINIUM  = registerMolten("molten_aluminium_fluid",
            FluidType.Properties.create()
                    .lightLevel(2)
                    .density(15)
                    .viscosity(5)
                    .canPushEntity(false)
                    .canDrown(true)
                    .canSwim(false)
                    .temperature(1000)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA)
    );

    public static final DeferredHolder<FluidType, FluidType> MOLTEN_COPPER  = registerMolten("molten_copper_fluid",
            FluidType.Properties.create()
                    .lightLevel(2)
                    .density(15)
                    .viscosity(5)
                    .canPushEntity(false)
                    .canDrown(true)
                    .canSwim(false)
                    .temperature(1000)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA)
    );

    public static final DeferredHolder<FluidType, FluidType> MOLTEN_ENERGIZED  = registerMolten("molten_energized_fluid",
            FluidType.Properties.create()
                    .lightLevel(2)
                    .density(15)
                    .viscosity(5)
                    .canPushEntity(false)
                    .canDrown(true)
                    .canSwim(false)
                    .temperature(1000)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA)
    );

    public static final DeferredHolder<FluidType, FluidType> MOLTEN_IRIDIUM  = registerMolten("molten_iridium_fluid",
            FluidType.Properties.create()
                    .lightLevel(2)
                    .density(15)
                    .viscosity(5)
                    .canPushEntity(false)
                    .canDrown(true)
                    .canSwim(false)
                    .temperature(1000)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA)
    );

    public static final DeferredHolder<FluidType, FluidType> MOLTEN_LEAD  = registerMolten("molten_lead_fluid",
            FluidType.Properties.create()
                    .lightLevel(2)
                    .density(15)
                    .viscosity(5)
                    .canPushEntity(false)
                    .canDrown(true)
                    .canSwim(false)
                    .temperature(1000)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA)
    );

    public static final DeferredHolder<FluidType, FluidType> MOLTEN_NICKEL  = registerMolten("molten_nickel_fluid",
            FluidType.Properties.create()
                    .lightLevel(2)
                    .density(15)
                    .viscosity(5)
                    .canPushEntity(false)
                    .canDrown(true)
                    .canSwim(false)
                    .temperature(1000)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA)
    );

    public static final DeferredHolder<FluidType, FluidType> MOLTEN_PLATINUM  = registerMolten("molten_platinum_fluid",
            FluidType.Properties.create()
                    .lightLevel(2)
                    .density(15)
                    .viscosity(5)
                    .canPushEntity(false)
                    .canDrown(true)
                    .canSwim(false)
                    .temperature(1000)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA)
    );

    public static final DeferredHolder<FluidType, FluidType> MOLTEN_SILVER  = registerMolten("molten_silver_fluid",
            FluidType.Properties.create()
                    .lightLevel(2)
                    .density(15)
                    .viscosity(5)
                    .canPushEntity(false)
                    .canDrown(true)
                    .canSwim(false)
                    .temperature(1000)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA)
    );

    public static final DeferredHolder<FluidType, FluidType> MOLTEN_TIN  = registerMolten("molten_tin_fluid",
            FluidType.Properties.create()
                    .lightLevel(2)
                    .density(15)
                    .viscosity(5)
                    .canPushEntity(false)
                    .canDrown(true)
                    .canSwim(false)
                    .temperature(1000)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA)
    );

    public static final DeferredHolder<FluidType, FluidType> MOLTEN_URANIUM  = registerMolten("molten_uranium_fluid",
            FluidType.Properties.create()
                    .lightLevel(2)
                    .density(15)
                    .viscosity(5)
                    .canPushEntity(false)
                    .canDrown(true)
                    .canSwim(false)
                    .temperature(1000)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA)
    );

    private static DeferredHolder<FluidType, FluidType> registerLiquid(String name, FluidType.Properties properties)
    {
        return FLUID_TYPES.register(name, () -> new LiquidExperienceType(EXPERIENCE_STILL, EXPERIENCE_FLOWING, null,
                new Vector3f(0, 0, 0), properties));
    }

    private static DeferredHolder<FluidType, FluidType> registerMolten(String name, FluidType.Properties properties)
    {
        return FLUID_TYPES.register(name, () -> new MoltenFluidType(WATER_STILL, WATER_FLOWING, null,
                0xFF, new Vector3f(0,0,0), properties));
    }

    public static void registerFluidTypes(IEventBus eventBus)
    {
        FLUID_TYPES.register(eventBus);
    }
}
