package net.dimidium.aboe.handler.registry;

import net.dimidium.aboe.inventory.menu.DisplayPedestalMenu;
import net.dimidium.aboe.util.Constants;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ContainerRegistry 
{
    private static final DeferredRegister<MenuType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.MENU_TYPES, Constants.MOD_ID);

    public static final RegistryObject<MenuType<DisplayPedestalMenu>> DISPLAY_PEDESTAL = CONTAINERS.register("display_pedestal", () -> IForgeMenuType.create((windowId, inv, data) -> new DisplayPedestalMenu(windowId, inv.player.getInventory(), data.readBlockPos())));

    public static void registerContainers()
    {
        CONTAINERS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
