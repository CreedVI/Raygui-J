package com.raylib.java.gui.elements;

import com.raylib.java.raymath.Vector2;
import com.raylib.java.shapes.Rectangle;

public class ScrollPanel {

    public Rectangle bounds;
    public Rectangle content;
    public Vector2 scroll;

    public ScrollPanel(Rectangle bounds, Rectangle content, Vector2 scroll) {
        this.bounds = bounds;
        this.content = content;
        this.scroll = scroll;
    }

    public ScrollPanel(float x, float y, float width, float height, float x2, float y2, float width2, float height2, float x3, float y3) {
        this.bounds = new Rectangle(x,y,width,height);
        this.content = new Rectangle(x2,y2,width2,height2);
        this.scroll = new Vector2(x3, y3);
    }


}
