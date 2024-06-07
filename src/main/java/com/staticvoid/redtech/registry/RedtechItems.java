package com.staticvoid.redtech.registry;

import com.staticvoid.redtech.Redtech;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;

@SuppressWarnings("unused")
public class RedtechItems {
    public static final ItemGroup ITEM_GROUP;
    public static final Map<DyeColor, BlockItem> LED_BLOCKS;

    public static void init() {
    }

    private static <I extends Item> Map<DyeColor, I> register16Colors(String name, Function<DyeColor, I> factory) {
        var items = new TreeMap<DyeColor, I>();

        for (var color : DyeColor.values()) {
            items.put(color, register(color.getName().toLowerCase() + '_' + name, factory.apply(color)));
        }
        return items;
    }

    private static <I extends Item> I register(String name, I item) {

        return Registry.register(Registries.ITEM, Identifier.of(Redtech.MOD_ID, name), item);
    }

    static {
        LED_BLOCKS = register16Colors("led", (color) -> new BlockItem(RedtechBlocks.LED_BLOCKS.get(color), new Item.Settings()));
        ITEM_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(Redtech.MOD_ID, "redtech"), FabricItemGroup.builder().icon(() -> new ItemStack(Blocks.REDSTONE_BLOCK)).displayName(Text.translatable("itemGroup.redtech.redtech")).entries((context, entries) -> {
            entries.add(LED_BLOCKS.get(DyeColor.WHITE));
            entries.add(LED_BLOCKS.get(DyeColor.LIGHT_GRAY));
            entries.add(LED_BLOCKS.get(DyeColor.GRAY));
            entries.add(LED_BLOCKS.get(DyeColor.BLACK));
            entries.add(LED_BLOCKS.get(DyeColor.BROWN));
            entries.add(LED_BLOCKS.get(DyeColor.RED));
            entries.add(LED_BLOCKS.get(DyeColor.ORANGE));
            entries.add(LED_BLOCKS.get(DyeColor.YELLOW));
            entries.add(LED_BLOCKS.get(DyeColor.LIME));
            entries.add(LED_BLOCKS.get(DyeColor.GREEN));
            entries.add(LED_BLOCKS.get(DyeColor.CYAN));
            entries.add(LED_BLOCKS.get(DyeColor.LIGHT_BLUE));
            entries.add(LED_BLOCKS.get(DyeColor.BLUE));
            entries.add(LED_BLOCKS.get(DyeColor.PURPLE));
            entries.add(LED_BLOCKS.get(DyeColor.MAGENTA));
            entries.add(LED_BLOCKS.get(DyeColor.PINK));
        }).build());
    }
}
