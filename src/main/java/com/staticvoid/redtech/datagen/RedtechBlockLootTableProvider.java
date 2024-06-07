package com.staticvoid.redtech.datagen;

import com.staticvoid.redtech.registry.RedtechBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.DyeColor;

import java.util.concurrent.CompletableFuture;

public class RedtechBlockLootTableProvider extends FabricBlockLootTableProvider {
    protected RedtechBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        for (var color : DyeColor.values()) {
            addDrop(RedtechBlocks.LED_BLOCKS.get(color));
        }
    }
}
