package com.staticvoid.redtech.datagen;

import com.staticvoid.redtech.registry.RedtechBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.util.DyeColor;

public class RedtechModelProvider extends FabricModelProvider {
    public RedtechModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        for (var color : DyeColor.values()) {
            blockStateModelGenerator.registerSimpleCubeAll(RedtechBlocks.LED_BLOCKS.get(color));
        }
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
