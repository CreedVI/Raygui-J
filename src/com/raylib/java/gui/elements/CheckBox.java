package com.raylib.java.gui.elements;

import com.raylib.java.shapes.Rectangle;

public class CheckBox {

    public Rectangle bounds;
    public String text;
    public boolean checked;

    public CheckBox(Rectangle bounds, String text, boolean checked) {
        this.bounds = bounds;
        this.text = text;
        this.checked = checked;
    }

    public CheckBox(float x, float y, float width, float height, String text, boolean checked) {
        this.bounds = new Rectangle(x, y, width, height);
        this.text = text;
        this.checked = checked;
    }

}
