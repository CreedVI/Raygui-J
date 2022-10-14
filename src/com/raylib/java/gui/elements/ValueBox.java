package com.raylib.java.gui.elements;

import com.raylib.java.shapes.Rectangle;

public class ValueBox {

    public Rectangle bounds;
    public String text;
    public int value;
    public int minValue;
    public int maxValue;
    public boolean editMode;

    public ValueBox(Rectangle bounds, String text, int value, int minValue, int maxValue, boolean editMode) {
        this.bounds = bounds;
        this.text = text;
        this.value = value;
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.editMode = editMode;
    }

    public ValueBox(float x, float y, float width, float height, String text, int value, int minValue, int maxValue, boolean editMode) {
        this.bounds = new Rectangle(x, y, width, height);
        this.text = text;
        this.value = value;
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.editMode = editMode;
    }

}
