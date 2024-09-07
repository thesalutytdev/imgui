package org.thesalutyt.imgui.screens;

import imgui.ImGui;
import org.thesalutyt.imgui.api.interfaces.Renderable;
import org.thesalutyt.imgui.api.interfaces.Theme;
import org.thesalutyt.imgui.api.utils.Manager;

public class Test implements Renderable, Theme {
    public Test() {
        Manager.push(this);
    }

    @Override
    public String getName() {
        return "Test";
    }

    @Override
    public Theme getTheme() {
        return this;
    }

    @Override
    public void render() {
        ImGui.text("Test");
        ImGui.showDemoWindow();
    }

    @Override
    public void preRender() {

    }

    @Override
    public void postRender() {

    }
}
