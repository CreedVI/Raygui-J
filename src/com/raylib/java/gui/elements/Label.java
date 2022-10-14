package com.raylib.java.gui.elements;

import com.raylib.java.shapes.Rectangle;

public class Label {

    public Rectangle bounds;
    public String text;

    public Label(Rectangle bounds, String text) {
        this.bounds = bounds;
        this.text = text;
    }

    public Label(float x, float y, float width, float height, String text) {
        this.bounds = new Rectangle(x,y,width,height);
        this.text = text;
    }

}
