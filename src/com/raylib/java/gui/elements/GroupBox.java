package com.raylib.java.gui.elements;

import com.raylib.java.shapes.Rectangle;

public class GroupBox {

    public Rectangle bounds;
    public String text;

    public GroupBox(Rectangle bounds, String text) {
        this.bounds = bounds;
        this.text = text;
    }

    public GroupBox(float x, float y, float width, float height, String text) {
        this.bounds = new Rectangle(x, y, width, height);
        this.text = text;
    }

}
