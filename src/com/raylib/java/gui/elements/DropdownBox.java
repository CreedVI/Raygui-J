package com.raylib.java.gui.elements;

import com.raylib.java.shapes.Rectangle;

public class DropdownBox {

    public Rectangle bounds;
    public String text;
    public int active;
    public boolean editMode;

    public DropdownBox(Rectangle bounds, String text, int active, boolean editMode) {
        this.bounds = bounds;
        this.text = text;
        this.active = active;
        this.editMode = editMode;
    }

    public DropdownBox(float x, float y, float width, float height, String text, int active, boolean editMode) {
        this.bounds = new Rectangle(x, y, width, height);
        this.text = text;
        this.active = active;
        this.editMode = editMode;
    }

}
