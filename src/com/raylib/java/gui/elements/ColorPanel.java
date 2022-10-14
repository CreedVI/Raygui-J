package com.raylib.java.gui.elements;

import com.raylib.java.core.Color;
import com.raylib.java.shapes.Rectangle;

public class ColorPanel {

    public Rectangle bounds;
    public Color color;

    public ColorPanel(Rectangle bounds, Color color) {
        this.bounds = bounds;
        this.color = color;
    }
}
