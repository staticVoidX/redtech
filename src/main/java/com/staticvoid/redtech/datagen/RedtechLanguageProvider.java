package com.staticvoid.redtech.datagen;

import com.staticvoid.redtech.registry.RedtechBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.DyeColor;

import java.util.concurrent.CompletableFuture;

public class RedtechLanguageProvider extends FabricLanguageProvider {
    protected RedtechLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(RedtechBlocks.LED_BLOCKS.get(DyeColor.WHITE), "White LED");
        translationBuilder.add(RedtechBlocks.LED_BLOCKS.get(DyeColor.ORANGE), "Orange LED");
        translationBuilder.add(RedtechBlocks.LED_BLOCKS.get(DyeColor.MAGENTA), "Magenta LED");
        translationBuilder.add(RedtechBlocks.LED_BLOCKS.get(DyeColor.LIGHT_BLUE), "Light Blue LED");
        translationBuilder.add(RedtechBlocks.LED_BLOCKS.get(DyeColor.YELLOW), "Yellow LED");
        translationBuilder.add(RedtechBlocks.LED_BLOCKS.get(DyeColor.LIME), "Lime LED");
        translationBuilder.add(RedtechBlocks.LED_BLOCKS.get(DyeColor.PINK), "Pink LED");
        translationBuilder.add(RedtechBlocks.LED_BLOCKS.get(DyeColor.GRAY), "Gray LED");
        translationBuilder.add(RedtechBlocks.LED_BLOCKS.get(DyeColor.LIGHT_GRAY), "Light Gray LED");
        translationBuilder.add(RedtechBlocks.LED_BLOCKS.get(DyeColor.CYAN), "Cyan LED");
        translationBuilder.add(RedtechBlocks.LED_BLOCKS.get(DyeColor.PURPLE), "Purple LED");
        translationBuilder.add(RedtechBlocks.LED_BLOCKS.get(DyeColor.BLUE), "Blue LED");
        translationBuilder.add(RedtechBlocks.LED_BLOCKS.get(DyeColor.BROWN), "Brown LED");
        translationBuilder.add(RedtechBlocks.LED_BLOCKS.get(DyeColor.GREEN), "Green LED");
        translationBuilder.add(RedtechBlocks.LED_BLOCKS.get(DyeColor.RED), "Red LED");
        translationBuilder.add(RedtechBlocks.LED_BLOCKS.get(DyeColor.BLACK), "Black LED");
        translationBuilder.add("itemGroup.redtech.redtech", "Redtech");
    }
}
