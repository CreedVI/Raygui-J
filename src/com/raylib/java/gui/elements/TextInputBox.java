package com.raylib.java.gui.elements;

import com.raylib.java.shapes.Rectangle;

public class TextInputBox {

    public Rectangle bounds;
    public String title, message, buttons, text;

    public TextBox textBox;

    public TextInputBox(Rectangle bounds, String title, String message, String buttons, String text) {
        this.bounds = bounds;
        this.title = title;
        this.message = message;
        this.buttons = buttons;
        this.text = text;
    }

    public TextInputBox(float x, float y, float width, float height, String title, String message, String buttons, String text) {
        this.bounds = new Rectangle(x, y, width, height);
        this.title = title;
        this.message = message;
        this.buttons = buttons;
        this.text = text;
    }
}
