package com.raylib.java.gui.elements;

import com.raylib.java.shapes.Rectangle;

public class ProgressBar {

    public Rectangle bounds;
    public String textLeft, textRight;
    public float value,  minValue,  maxValue;

    public ProgressBar(Rectangle bounds, String textLeft, String textRight, float value, float minValue, float maxValue) {
        this.bounds = bounds;
        this.textLeft = textLeft;
        this.textRight = textRight;
        this.value = value;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public ProgressBar(float x, float y, float width, float height, String textLeft, String textRight, float value, float minValue, float maxValue) {
        this.bounds = new Rectangle(x, y, width, height);
        this.textLeft = textLeft;
        this.textRight = textRight;
        this.value = value;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

}
