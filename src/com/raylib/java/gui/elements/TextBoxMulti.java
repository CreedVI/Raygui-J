package com.raylib.java.gui.elements;

import com.raylib.java.shapes.Rectangle;

public class TextBoxMulti {

    public Rectangle bounds;
    public String text;
    public boolean editMode;
    public int textSize;

    public TextBoxMulti(Rectangle bounds, String text, boolean editMode, int textSize) {
        this.bounds = bounds;
        this.text = text;
        this.editMode = editMode;
        this.textSize = textSize;
    }

    public TextBoxMulti(float x, float y, float width, float height, String text, boolean editMode, int textSize) {
        this.bounds = new Rectangle(x, y, width, height);
        this.text = text;
        this.editMode = editMode;
        this.textSize = textSize;
    }

}
