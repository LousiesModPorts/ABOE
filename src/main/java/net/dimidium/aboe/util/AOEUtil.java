package net.dimidium.aboe.util;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class AOEUtil
{
    public static boolean isBlockEntity(Level level, Iterable<BlockPos> pos)
    {
        return level.getBlockState(pos.iterator().next()).hasBlockEntity();
    }

    public static boolean mineMultipleBlocks(int minX, int minZ, int maxX, int maxZ, Player player, BlockPos pos, TagKey<Block> tagType)
    {
        BlockPos pos1 = new BlockPos(minX,  pos.getY(), minZ);
        BlockPos pos2 = new BlockPos(maxX, pos.getY(), maxZ);

        if(isBlockEntity(player.level(), BlockPos.betweenClosed(pos1, pos2)))
        {
            player.sendSystemMessage(Component.literal("Unable to mine block: it contains a block entity!").withStyle(ChatFormatting.RED));
            return false;
        }

        float f = 0.7F;
        float d0 = player.level().random.nextFloat() * f + (1.0F - f) * 0.5F;
        float d1 = player.level().random.nextFloat() * f + (1.0F - f) * 0.5F;
        float d2 = player.level().random.nextFloat() * f + (1.0F - f) * 0.5F;

        for(BlockPos pos3 : BlockPos.betweenClosed(pos1, pos2))
        {
            if(player.level().getBlockState(pos3).is(tagType))
            {
                player.level().setBlockAndUpdate(pos3, Blocks.AIR.defaultBlockState());
                player.level().addFreshEntity(new ItemEntity(player.level(), pos.getX() + d0, pos.getY() + d1, pos.getZ() + d2, new ItemStack(player.level().getBlockState(pos3).getBlock())));
                return true;
            }

            else
            {
                return false;
            }
        }

        return false;
    }

    public static boolean mineMultipleBlocks(int minX, int minY, int minZ, int maxX, int maxY, int maxZ, Player player, BlockPos pos, TagKey<Block> tagType)
    {
        BlockPos pos1 = new BlockPos(minX,  minY, minZ);
        BlockPos pos2 = new BlockPos(maxX, maxY, maxZ);
        
        float f = 0.7F;
        float d0 = player.level().random.nextFloat() * f + (1.0F - f) * 0.5F;
        float d1 = player.level().random.nextFloat() * f + (1.0F - f) * 0.5F;
        float d2 = player.level().random.nextFloat() * f + (1.0F - f) * 0.5F;

        for(BlockPos pos3 : BlockPos.betweenClosed(pos1, pos2))
        {
            if(player.level().getBlockState(pos3).is(tagType))
            {
                //TODO Copy NBT tags
                player.level().setBlockAndUpdate(pos3, Blocks.AIR.defaultBlockState());
                player.level().addFreshEntity(new ItemEntity(player.level(), pos.getX() + d0, pos.getY() + d1, pos.getZ() + d2, new ItemStack(player.level().getBlockState(pos3).getBlock())));
                return true;
            }

            else
            {
                return false;
            }
        }

        return false;
    }

    public static boolean mineSingleBlock(int x, int y, int z, Player player, BlockPos pos, TagKey<Block> tagType)
    {
        float f = 0.7F;
        float d0 = player.level().random.nextFloat() * f + (1.0F - f) * 0.5F;
        float d1 = player.level().random.nextFloat() * f + (1.0F - f) * 0.5F;
        float d2 = player.level().random.nextFloat() * f + (1.0F - f) * 0.5F;
        
        if(player.level().getBlockState(pos).is(tagType))
        {
            player.level().setBlockAndUpdate(pos, Blocks.AIR.defaultBlockState());
            player.level().addFreshEntity(new ItemEntity(player.level(), pos.getX() + d0, pos.getY() + d1, pos.getZ() + d2, new ItemStack(player.level().getBlockState(pos).getBlock())));
            return true;
        }
        
        else
        {
            return false;
        }
    }
}
