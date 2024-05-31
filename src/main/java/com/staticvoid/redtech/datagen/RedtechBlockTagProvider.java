package com.staticvoid.redtech.datagen;

import com.staticvoid.redtech.registry.RedtechBlocks;
import com.staticvoid.redtech.registry.tag.RedtechTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class RedtechBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public RedtechBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(RedtechTags.Blocks.LED_BLOCKS).add(RedtechBlocks.LED_BLOCKS.values().toArray(Block[]::new));
    }
}
