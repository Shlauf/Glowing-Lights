package net.shlauf.glowinglights.mixin;

import net.shlauf.glowinglights.GlowingLightsMain;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class GlowingLightsMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		GlowingLightsMain.LOGGER.info("Glowing Lights has been loaded. Have fun <3");
	}
}
