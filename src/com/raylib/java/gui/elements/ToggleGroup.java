package com.raylib.java.gui.elements;

import com.raylib.java.shapes.Rectangle;

public class ToggleGroup {

    public Rectangle bounds;
    public String text;
    public int active;

    public ToggleGroup(Rectangle bounds, String text, int active) {
        this.bounds = bounds;
        this.text = text;
        this.active = active;
    }

    public ToggleGroup(float x, float y, float width, float height, String text, int active) {
        this.bounds = new Rectangle(x, y, width, height);
        this.text = text;
        this.active = active;
    }

}
