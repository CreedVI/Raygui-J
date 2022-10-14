package com.raylib.java.gui.elements;

import com.raylib.java.shapes.Rectangle;

public class MessageBox {

    public Rectangle bounds;
    public String title, message, buttons;

    public MessageBox(Rectangle bounds, String title, String message, String buttons) {
        this.bounds = bounds;
        this.title = title;
        this.message = message;
        this.buttons = buttons;
    }

    public MessageBox(float x, float y, float width, float height, String title, String message, String buttons) {
        this.bounds = new Rectangle(x, y, width, height);
        this.title = title;
        this.message = message;
        this.buttons = buttons;
    }

}
