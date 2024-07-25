package net.dimidium.aboe.data;

import net.dimidium.aboe.block.RubberWood;
import net.dimidium.aboe.handler.registry.BlockRegistry;
import net.dimidium.aboe.handler.registry.ItemRegistry;
import net.dimidium.aboe.util.Constants;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.storage.loot.ContainerComponentManipulator;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.DynamicLoot;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolSingletonContainer;
import net.minecraft.world.level.storage.loot.functions.*;
import net.minecraft.world.level.storage.loot.providers.nbt.ContextNbtProvider;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ABOELootTables extends BlockLootSubProvider
{
    public ABOELootTables(HolderLookup.Provider pRegistries)
    {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), pRegistries);
    }

    @Override
    public void generate()
    {
        dropSelf(BlockRegistry.ALUMINIUM_BLOCK.get());
        dropSelf(BlockRegistry.COPPER_BLOCK.get());
        dropSelf(BlockRegistry.ENERGIZED_BLOCK.get());
        dropSelf(BlockRegistry.IRIDIUM_BLOCK.get());
        dropSelf(BlockRegistry.LEAD_BLOCK.get());
        dropSelf(BlockRegistry.NICKEL_BLOCK.get());
        dropSelf(BlockRegistry.PLATINUM_BLOCK.get());
        dropSelf(BlockRegistry.SILVER_BLOCK.get());
        dropSelf(BlockRegistry.TIN_BLOCK.get());
        dropSelf(BlockRegistry.URANIUM_BLOCK.get());
        this.add(BlockRegistry.ALUMINIUM_ORE.get(), block -> createOreDrops(BlockRegistry.ALUMINIUM_ORE.get(), ItemRegistry.RAW_ALUMINIUM_CHUNK.get()));
        this.add(BlockRegistry.COPPER_ORE.get(), createOreDrops(BlockRegistry.COPPER_ORE.get(), ItemRegistry.RAW_COPPER_CHUNK.get()));
        this.add(BlockRegistry.ENERGIZED_ORE.get(), createOreDrops(BlockRegistry.ENERGIZED_ORE.get(), ItemRegistry.RAW_ENERGIZED_CHUNK.get()));
        this.add(BlockRegistry.IRIDIUM_ORE.get(), createOreDrops(BlockRegistry.IRIDIUM_ORE.get(), ItemRegistry.RAW_IRIDIUM_CHUNK.get()));
        this.add(BlockRegistry.LEAD_ORE.get(), createOreDrops(BlockRegistry.LEAD_ORE.get(), ItemRegistry.RAW_LEAD_CHUNK.get()));
        this.add(BlockRegistry.NICKEL_ORE.get(), createOreDrops(BlockRegistry.NICKEL_ORE.get(), ItemRegistry.RAW_NICKEL_CHUNK.get()));
        this.add(BlockRegistry.PLATINUM_ORE.get(), createOreDrops(BlockRegistry.PLATINUM_ORE.get(), ItemRegistry.RAW_NICKEL_CHUNK.get()));
        this.add(BlockRegistry.SILVER_ORE.get(), createOreDrops(BlockRegistry.SILVER_ORE.get(), ItemRegistry.RAW_NICKEL_CHUNK.get()));
        this.add(BlockRegistry.TIN_ORE.get(), createOreDrops(BlockRegistry.TIN_ORE.get(), ItemRegistry.RAW_TIN_CHUNK.get()));
        this.add(BlockRegistry.URANIUM_ORE.get(), createOreDrops(BlockRegistry.URANIUM_ORE.get(), ItemRegistry.RAW_URANIUM_CHUNK.get()));
        this.add(BlockRegistry.DEEP_SLATE_ALUMINIUM_ORE.get(), createOreDrops(BlockRegistry.DEEP_SLATE_ALUMINIUM_ORE.get(), ItemRegistry.RAW_ALUMINIUM_CHUNK.get()));
        this.add(BlockRegistry.DEEP_SLATE_COPPER_ORE.get(), createOreDrops(BlockRegistry.DEEP_SLATE_COPPER_ORE.get(), ItemRegistry.RAW_COPPER_CHUNK.get()));
        this.add(BlockRegistry.DEEP_SLATE_ENERGIZED_ORE.get(), createOreDrops(BlockRegistry.DEEP_SLATE_ENERGIZED_ORE.get(), ItemRegistry.RAW_ENERGIZED_CHUNK.get()));
        this.add(BlockRegistry.DEEP_SLATE_IRIDIUM_ORE.get(), createOreDrops(BlockRegistry.DEEP_SLATE_IRIDIUM_ORE.get(), ItemRegistry.RAW_IRIDIUM_CHUNK.get()));
        this.add(BlockRegistry.DEEP_SLATE_LEAD_ORE.get(), createOreDrops(BlockRegistry.DEEP_SLATE_LEAD_ORE.get(), ItemRegistry.RAW_LEAD_CHUNK.get()));
        this.add(BlockRegistry.DEEP_SLATE_NICKEL_ORE.get(), createOreDrops(BlockRegistry.DEEP_SLATE_NICKEL_ORE.get(), ItemRegistry.RAW_NICKEL_CHUNK.get()));
        this.add(BlockRegistry.DEEP_SLATE_PLATINUM_ORE.get(), createOreDrops(BlockRegistry.DEEP_SLATE_PLATINUM_ORE.get(), ItemRegistry.RAW_PLATINUM_CHUNK.get()));
        this.add(BlockRegistry.DEEP_SLATE_SILVER_ORE.get(), createOreDrops(BlockRegistry.DEEP_SLATE_SILVER_ORE.get(), ItemRegistry.RAW_SILVER_CHUNK.get()));
        this.add(BlockRegistry.DEEP_SLATE_TIN_ORE.get(), createOreDrops(BlockRegistry.DEEP_SLATE_TIN_ORE.get(), ItemRegistry.RAW_TIN_CHUNK.get()));
        this.add(BlockRegistry.DEEP_SLATE_URANIUM_ORE.get(), createOreDrops(BlockRegistry.DEEP_SLATE_URANIUM_ORE.get(), ItemRegistry.RAW_URANIUM_CHUNK.get()));

        dropSelf(BlockRegistry.MINETOPIA_PORTAL_FRAME.get());
        dropSelf(BlockRegistry.VOID_PORTAL_FRAME.get());

        this.add(BlockRegistry.RUBBER.get(), rubber());
        this.dropSelf(BlockRegistry.RUBBER_PLANKS.get());
        //createLeavesDrops()
       /* this.dropSelf(BlockRegistry.RUBBER_LOG.get());
        this.dropSelf(BlockRegistry.RUBBER_WOOD.get());
        this.dropSelf(BlockRegistry.RUBBER_SAPLING.get());
        this.dropSelf(BlockRegistry.RUBBER_PLANKS.get());
        this.dropSelf(BlockRegistry.STRIPPED_RUBBER_LOG.get());
        this.dropSelf(BlockRegistry.STRIPPED_RUBBER_WOOD.get());*/
    }

    protected LootTable.Builder rubber()
    {
        return createSilkTouchDispatchTable(BlockRegistry.RUBBER.get(),
                this.applyExplosionDecay(BlockRegistry.RUBBER.get(),
                        LootItem.lootTableItem(ItemRegistry.RAW_RUBBER.get())
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount((Holder<Enchantment>) Enchantments.FORTUNE))));
    }

    protected LootTable.Builder createOreDrops(Block oreBlock, Item chunkItem)
    {
        return createSilkTouchDispatchTable(oreBlock,
                this.applyExplosionDecay(oreBlock,
                        LootItem.lootTableItem(chunkItem)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount((Holder<Enchantment>) Enchantments.FORTUNE))));
    }

    private void createStandardTable(Block block, BlockEntityType<?> type, String... tags)
    {
        LootPoolSingletonContainer.Builder<?> lti = LootItem.lootTableItem(block);
        lti.apply(CopyNameFunction.copyName(CopyNameFunction.NameSource.BLOCK_ENTITY));

        for (String tag : tags)
        {
            //todo lti.apply(CopyNbtFunction.copyData(ContextNbtProvider.BLOCK_ENTITY).copy(tag, "BlockEntityTag." + tag, CopyNbtFunction.MergeStrategy.REPLACE));
        }

        lti.apply(SetContainerContents.setContents((ContainerComponentManipulator<?>) type).withEntry(DynamicLoot.dynamicEntry(ResourceLocation.fromNamespaceAndPath("minecraft", "contents"))));

        LootPool.Builder builder = LootPool.lootPool()
                .setRolls(ConstantValue.exactly(1))
                .add(lti);
        add(block, LootTable.lootTable().withPool(builder));
    }

    @Override
    protected Iterable<Block> getKnownBlocks()
    {
        return BuiltInRegistries.BLOCK.holders()
                .filter(e -> e.key().location().getNamespace().equals(Constants.MOD_ID))
                .map(Holder.Reference::value)
                .collect(Collectors.toList());
    }
}
