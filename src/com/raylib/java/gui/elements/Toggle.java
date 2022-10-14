package com.raylib.java.gui.elements;

import com.raylib.java.shapes.Rectangle;

public class Toggle {

    public Rectangle bounds;
    public String text;
    public boolean active;

    public Toggle(Rectangle bounds, String text, boolean active) {
        this.bounds = bounds;
        this.text = text;
        this.active = active;
    }

    public Toggle(float x, float y, float width, float height, String text, boolean active) {
        this.bounds = new Rectangle(x, y, width, height);
        this.text = text;
        this.active = active;
    }

}
