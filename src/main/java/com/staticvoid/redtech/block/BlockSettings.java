package com.staticvoid.redtech.block;

import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.block.Blocks;
import net.minecraft.sound.BlockSoundGroup;

public final class BlockSettings {
    public static Settings LED = Settings.create().luminance(Blocks.createLightLevelFromLitBlockState(1)).strength(0.3f).sounds(BlockSoundGroup.GLASS).allowsSpawning(Blocks::always).postProcess(Blocks::always).emissiveLighting(Blocks::always).solidBlock(Blocks::never);
}
