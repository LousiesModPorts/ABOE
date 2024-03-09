package net.dimidium.aboe.data;

import net.dimidium.aboe.util.Constants;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = Constants.MOD_ID)
public class DataHandler
{
    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event)
    {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> provider = event.getLookupProvider();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(event.includeClient(), new ABOEBlockStates(output, existingFileHelper));
        generator.addProvider(event.includeClient(), new ABOEModels(output, existingFileHelper));
        generator.addProvider(event.includeClient(), new ABOELanguage(output, "en_us"));

        generator.addProvider(event.includeServer(), ABOELootTableProvider.create(output));
        ABOEBlockTags blockTags = new ABOEBlockTags(output, provider, existingFileHelper);
        generator.addProvider(event.includeServer(), blockTags);
        generator.addProvider(event.includeServer(), new ABOEItemTags(output, provider, blockTags, existingFileHelper));
        generator.addProvider(event.includeServer(), new ABOERecipes(output));
        generator.addProvider(event.includeServer(), new ABOEWorldGen(output,  provider));
    }
}