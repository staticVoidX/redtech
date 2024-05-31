package com.staticvoid.redtech.registry.tag;

import com.staticvoid.redtech.Redtech;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public final class RedtechTags {
    public static final class Blocks {
        public static final TagKey<Block> LED_BLOCKS = TagKey.of(RegistryKeys.BLOCK, Identifier.of(Redtech.MOD_ID, "led_blocks"));
    }
}
