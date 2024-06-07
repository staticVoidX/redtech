package com.staticvoid.redtech.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class RedtechDatagen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        var pack = fabricDataGenerator.createPack();

        pack.addProvider(RedtechModelProvider::new);
        pack.addProvider(RedtechBlockTagProvider::new);
        pack.addProvider(RedtechLanguageProvider::new);
        pack.addProvider(RedtechBlockLootTableProvider::new);
        pack.addProvider(RedtechRecipeProvider::new);
    }
}
