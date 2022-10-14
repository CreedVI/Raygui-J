package com.raylib.java.gui.elements;

import com.raylib.java.shapes.Rectangle;

public class Grid {

    public Rectangle bounds;
    public float spacing;
    public int subdivs;

    public Grid(Rectangle bounds, float spacing, int subdivs) {
        this.bounds = bounds;
        this.spacing = spacing;
        this.subdivs = subdivs;
    }

    public Grid(float x, float y, float width, float height, float spacing, int subdivs) {
        this.bounds = new Rectangle(x, y, width, height);
        this.spacing = spacing;
        this.subdivs = subdivs;
    }
}
