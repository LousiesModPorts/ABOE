package net.dimidium.aboe.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.ChatFormatting;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.commands.arguments.DimensionArgument;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.portal.DimensionTransition;
import net.minecraft.world.phys.Vec3;

import java.util.function.Function;
public class DimensionCommand
{
    public static void register(CommandDispatcher<CommandSourceStack> dispatcher)
    {
        LiteralArgumentBuilder<CommandSourceStack> mbesayCommand
                = Commands.literal("dimension")
                .requires((commandSource) -> commandSource.hasPermission(2))
                .then(Commands.argument("dimensionName", DimensionArgument.dimension())
                        .executes(DimensionCommand::sendToDimension)
                );
        dispatcher.register(mbesayCommand);
    }

    static int sendToDimension(CommandContext<CommandSourceStack> commandContext) throws CommandSyntaxException
    {
        final ResourceKey<Level> dimension = DimensionArgument.getDimension(commandContext, "dimensionName").dimension();

        if(!commandContext.getSource().isPlayer())
        {
            return 0;
        }

        else
        {
            final ServerPlayer player = (ServerPlayer) commandContext.getSource().getEntity();
            final ServerLevel level = DimensionArgument.getDimension(commandContext, "dimensionName");

            if(player.level().dimension() == dimension)
            {
                player.sendSystemMessage(Component.literal("Already connected to this world!").withStyle(ChatFormatting.RED));
            }

            else
            {
                if(!player.level().isClientSide)
                {
                    teleport(player, level, new BlockPos((int) player.getX(), (int) player.getY(), (int) player.getZ()));
                    player.sendSystemMessage(Component.literal("Successfully teleported!").withStyle(ChatFormatting.GREEN));
                }
            }
        }

        return 1;
    }

    private static void teleport(ServerPlayer entity, ServerLevel destination, BlockPos pos)
    {
        entity.changeDimension(new DimensionTransition(destination, new Vec3(entity.getX(), entity.getY(), entity.getZ()), new Vec3(0,0,0), entity.getXRot(), entity.getYRot(), DimensionTransition.PLAY_PORTAL_SOUND));
    }
}