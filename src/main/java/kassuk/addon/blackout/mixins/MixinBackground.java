package kassuk.addon.blackout.mixins;

import kassuk.addon.blackout.modules.Fog;
import meteordevelopment.meteorclient.systems.modules.Modules;
import net.minecraft.client.render.BackgroundRenderer;
import net.minecraft.client.render.Camera;

import org.joml.Vector4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BackgroundRenderer.class)
public class MixinBackground {
    // @Inject(method =
    // "applyFog(Lnet/minecraft/client.render/Camera;Lnet/minecraft/client/render/BackgroundRenderer/FogType;Lorg/joml/Vector4f;F;Z;F;)Lnet/minecraft/client/render/Fog;",
    // at = @At("TAIL"))
    // @Inject(method =
    // "applyFog(Lnet/minecraft/client/render/Camera;Lnet/minecraft/client/render/BackgroundRenderer/FogType;Lorg/joml/Vector4f;FZF)Lnet/minecraft/client/render/Fog;",
    // at = @At("TAIL"))
    private static void applyFog(Camera camera, BackgroundRenderer.FogType fogType, Vector4f color, float viewDistance,
            boolean thickenFog, float tickDelta, CallbackInfo i) {
        Fog fog = Modules.get().get(Fog.class);
        if (fog != null && fog.isActive() && fogType == BackgroundRenderer.FogType.FOG_TERRAIN) {
            fog.modifyFog();
        }
    }
}
