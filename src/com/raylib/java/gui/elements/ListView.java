package com.raylib.java.gui.elements;

import com.raylib.java.shapes.Rectangle;

public class ListView {

    public Rectangle bounds;
    public String text;
    public int scrollIndex, active;

    public ListView(Rectangle bounds, String text, int scrollIndex, int active) {
        this.bounds = bounds;
        this.text = text;
        this.scrollIndex = scrollIndex;
        this.active = active;
    }

    public ListView(float x, float y, float width, float height, String text, int scrollIndex, int active) {
        this.bounds = new Rectangle(x, y, width, height);
        this.text = text;
        this.scrollIndex = scrollIndex;
        this.active = active;
    }
}
