package net.skpc9.mixin;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(PlayerEntity.class)
public class DisableDamageScaleMixin {
	@Redirect(method = "attackEntityFrom", at = @At(value = "INVOKE", target = "Lnet/minecraft/util/DamageSource;isDifficultyScaled()Z"))
	private boolean injected(DamageSource source) {
		return false;
	}
}