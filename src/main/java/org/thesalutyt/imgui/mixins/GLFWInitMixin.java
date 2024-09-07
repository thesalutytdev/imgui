package org.thesalutyt.imgui.mixins;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.thesalutyt.imgui.api.loader.ImGuiLoader;

@Mixin(RenderSystem.class)
public class GLFWInitMixin {
    @Unique
    @Final private static long window;

    @Unique
    private static boolean initialized = false;

    @Inject(at = @At("HEAD"), method = "finishInitialization", remap = false)
    private static void finishInitialization(CallbackInfo ci) {

        if (!initialized) {
            ImGuiLoader.onGlfwInit(Minecraft.getInstance().getWindow().getWindow());
            initialized = true;
        }
    }
}
