package com.staticvoid.redtech;

import com.staticvoid.redtech.registry.RedtechBlocks;
import com.staticvoid.redtech.registry.RedtechItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("unused")
public class Redtech implements ModInitializer {
    public static final String MOD_NAME = "Redtech";
    public static final String MOD_ID = "redtech";
    public static final String MOD_VERSION = "1.0.0-alpha.1";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

    @Override
    public void onInitialize() {
        RedtechBlocks.init();
        RedtechItems.init();

        LOGGER.info("{} v{} has been initialized.", MOD_NAME, MOD_VERSION);
    }
}
