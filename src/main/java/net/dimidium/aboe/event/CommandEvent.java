package net.dimidium.aboe.event;

import com.mojang.brigadier.CommandDispatcher;
import net.dimidium.aboe.command.DimensionCommand;
import net.minecraft.commands.CommandSourceStack;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.RegisterCommandsEvent;

public class CommandEvent
{
    @SubscribeEvent
    public static void onRegisterCommandEvent(RegisterCommandsEvent event)
    {
        CommandDispatcher<CommandSourceStack> commandDispatcher = event.getDispatcher();
        DimensionCommand.register(commandDispatcher);
    }
}
