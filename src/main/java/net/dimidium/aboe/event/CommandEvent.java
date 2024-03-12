package net.dimidium.aboe.event;

import com.mojang.brigadier.CommandDispatcher;
import net.dimidium.aboe.command.DimensionCommand;
import net.minecraft.commands.CommandSourceStack;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class CommandEvent
{
    @SubscribeEvent
    public static void onRegisterCommandEvent(RegisterCommandsEvent event)
    {
        CommandDispatcher<CommandSourceStack> commandDispatcher = event.getDispatcher();
        DimensionCommand.register(commandDispatcher);
    }
}
