package net.shlauf.glowinglights;

import net.fabricmc.api.ModInitializer;
import net.shlauf.glowinglights.block.ModBlocks;
import net.shlauf.glowinglights.item.ModItems;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GlowingLightsMain implements ModInitializer {


	public static final String MOD_ID = "glowinglights";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();

	}
}
