package net.dimidium.aboe.handler.registry;

import net.dimidium.aboe.util.Constants;
import net.dimidium.dimidiumcore.api.helper.StringHelper;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.damagesource.DamageType;

public class DamageTypeRegistry
{
    public static final ResourceKey<DamageType> MOLTEN = register("molten");

    private static ResourceKey<DamageType> register(String name)
    {
        return ResourceKey.create(Registries.DAMAGE_TYPE, StringHelper.modLocation(Constants.MOD_ID, name));
    }

    public static void bootstrap(BootstrapContext<DamageType> context)
    {
        context.register(MOLTEN, new DamageType("molten", 0.5F));
    }
}
