package com.staticvoid.redtech.datagen;

import com.staticvoid.redtech.registry.RedtechBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.DyeColor;

import java.util.concurrent.CompletableFuture;

public class RedtechRecipeProvider extends FabricRecipeProvider {
    public RedtechRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        for (var color : DyeColor.values()) {
            ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, RedtechBlocks.LED_BLOCKS.get(color)).group("led").pattern("GGG").pattern("GLG").pattern("SSS").input('G', StainedGlassBlocks.get(color)).input('L', Blocks.REDSTONE_LAMP).input('S', Blocks.SMOOTH_STONE).criterion(FabricRecipeProvider.hasItem(Blocks.REDSTONE_LAMP), FabricRecipeProvider.conditionsFromItem(Blocks.REDSTONE_LAMP)).offerTo(exporter);
        }
    }
}
