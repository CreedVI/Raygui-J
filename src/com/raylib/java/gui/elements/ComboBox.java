package com.raylib.java.gui.elements;

import com.raylib.java.shapes.Rectangle;

public class ComboBox {

    public Rectangle bounds;
    public String text;
    public int active;

    public ComboBox(Rectangle bounds, String text, int active) {
        this.bounds = bounds;
        this.text = text;
        this.active = active;
    }

    public ComboBox(float x, float y, float width, float height, String text, int active) {
        this.bounds = bounds;
        this.text = text;
        this.active = active;
    }
}
