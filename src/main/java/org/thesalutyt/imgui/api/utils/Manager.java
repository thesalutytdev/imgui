package org.thesalutyt.imgui.api.utils;

import org.thesalutyt.imgui.api.interfaces.Renderable;

import java.util.ArrayList;

public class Manager {
    private static final ArrayList<Renderable> renderStack = new ArrayList<>();

    public static void push(Renderable renderable) {
        renderStack.add(renderable);
    }

    public static void pop() {
        renderStack.remove(renderStack.size() - 1);
    }

    public static void pull(Renderable renderable) {
        renderStack.remove(renderable);
    }

    public static ArrayList<Renderable> getStack() {
        return renderStack;
    }
}
