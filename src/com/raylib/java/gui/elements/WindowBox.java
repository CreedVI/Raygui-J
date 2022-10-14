package com.raylib.java.gui.elements;

import com.raylib.java.shapes.Rectangle;

public class WindowBox {

    public Rectangle bounds;
    public String title;

    public WindowBox(Rectangle bounds, String title) {
        this.bounds = bounds;
        this.title = title;
    }

    public WindowBox(float x, float y, float width, float height, String title) {
        this.bounds = new Rectangle(x, y, width, height);
        this.title = title;
    }

}
