package net.skpc9.mixin;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(Player.class)
public class DisableDamageScaleMixin {
	@Redirect(method = "hurt", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/damagesource/DamageSource;scalesWithDifficulty()Z"))
	private boolean injected(DamageSource source) {
		return false;
	}
}