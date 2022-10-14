package com.raylib.java.gui.elements;

import com.raylib.java.shapes.Rectangle;

public class TextBox {

    public Rectangle bounds;
    public String text;
    public boolean editMode;
    public int textSize;

    public TextBox(Rectangle bounds, String text, boolean editMode, int textSize) {
        this.bounds = bounds;
        this.text = text;
        this.editMode = editMode;
        this.textSize = textSize;
    }

    public TextBox(float x, float y, float width, float height, String text, boolean editMode, int textSize) {
        this.bounds = new Rectangle(x, y, width, height);
        this.text = text;
        this.editMode = editMode;
        this.textSize = textSize;
    }

}
