package net.dimidium.aboe.util;

import com.mojang.serialization.Codec;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.network.codec.ByteBufCodecs;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Consumer;

public class ABOEComponents
{
    private static final DeferredRegister<DataComponentType<?>> DATA_COMPONENT_TYPES = DeferredRegister.createDataComponents(Constants.MOD_ID);

    public static final DataComponentType<Boolean> ACTIVATED = register("activated",
            builder -> builder.persistent(Codec.BOOL).networkSynchronized(ByteBufCodecs.BOOL));

    private static <T>DataComponentType<T> register(String componentName, Consumer<DataComponentType.Builder<T>> consumer)
    {
        var builder = DataComponentType.<T>builder();
        consumer.accept(builder);
        var component = builder.build();
        DATA_COMPONENT_TYPES.register(componentName, () -> component);
        return component;
    }
}
