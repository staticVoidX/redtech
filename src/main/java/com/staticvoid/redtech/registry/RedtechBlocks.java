package com.staticvoid.redtech.registry;

import com.staticvoid.redtech.Redtech;
import com.staticvoid.redtech.block.LedBlock;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@SuppressWarnings("unused")
public class RedtechBlocks {
    public static final Map<DyeColor, LedBlock> LED_BLOCKS;

    public static void init() {
    }

    private static <B extends Block> @NotNull Map<DyeColor, B> register16Colors(String name, Function<DyeColor, B> factory) {
        var blocks = new HashMap<DyeColor, B>();

        for (var color : DyeColor.values()) {
            blocks.put(color, register(color.getName().toLowerCase() + '_' + name, factory.apply(color)));
        }
        return blocks;
    }

    private static <B extends Block> B register(String name, B block) {
        return Registry.register(Registries.BLOCK, new Identifier(Redtech.MOD_ID, name), block);
    }

    static {
        LED_BLOCKS = register16Colors("led", LedBlock::new);
    }
}
