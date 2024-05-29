package com.staticvoid.redtech.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.BlockState;
import net.minecraft.block.BulbBlock;
import net.minecraft.util.DyeColor;

public class LedBlock extends BulbBlock {
    public static final MapCodec<LedBlock> CODEC = LedBlock.createCodec(LedBlock::new);

    public LedBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected MapCodec<? extends BulbBlock> getCodec() {
        return CODEC;
    }

    @Override
    protected boolean emitsRedstonePower(BlockState state) {
        return true;
    }

    public LedBlock(DyeColor color) {
        this(BlockSettings.LED.mapColor(color));
    }
}
