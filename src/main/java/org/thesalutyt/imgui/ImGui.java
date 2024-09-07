package org.thesalutyt.imgui;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.thesalutyt.imgui.screens.Test;

@Mod(ImGui.MOD_ID)
public class ImGui {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "imgui";
    private static boolean initialized = false;

    public ImGui() {
        new Test();
        MinecraftForge.EVENT_BUS.register(this);
    }

    public static Logger getLogger() {
        return LOGGER;
    }

    public static String getModId() {
        return MOD_ID;
    }

}
