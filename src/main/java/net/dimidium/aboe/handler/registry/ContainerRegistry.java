package net.dimidium.aboe.handler.registry;

import net.dimidium.aboe.util.Constants;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ContainerRegistry 
{
    private static final DeferredRegister<MenuType<?>> CONTAINERS = DeferredRegister.create(Registries.MENU, Constants.MOD_ID);

    //todo public static final DeferredHolder<MenuType<DisplayPedestalMenu>, MenuType<DisplayPedestalMenu>> DISPLAY_PEDESTAL = CONTAINERS.register("display_pedestal", () -> IForgeMenuType.create((windowId, inv, data) -> new DisplayPedestalMenu(windowId, inv.player.getInventory(), data.readBlockPos())));

    public static void registerContainers(IEventBus eventBus)
    {
        CONTAINERS.register(eventBus);
    }
}
