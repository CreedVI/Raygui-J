package com.raylib.java.gui.elements;

import com.raylib.java.shapes.Rectangle;

public class Line {

    public Rectangle bounds;
    public String text;

    public Line(Rectangle bounds, String text) {
        this.bounds = bounds;
        this.text = text;
    }

    public Line(float x, float y, float width, float height, String text) {
        this.bounds = new Rectangle(x, y, width, height);
        this.text = text;
    }

}
