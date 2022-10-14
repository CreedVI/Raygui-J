package tests;

import com.raylib.java.Raylib;
import com.raylib.java.core.Color;
import com.raylib.java.gui.Raygui;
import com.raylib.java.gui.elements.TextBox;

public class text {

    static Raylib rlj;
    static Raygui rgui;

    static TextBox textBox;

    public static void main(String[] args) {
        rlj = new Raylib(800, 600, "rGUI - Textbox");
        rgui = new Raygui(rlj);
        rgui.GuiEnable();
        rlj.core.SetTargetFPS(60);

        textBox = new TextBox(20,20,100,30, "text",true, 16);

        while (!rlj.core.WindowShouldClose()) {
            Update();
            Render();
        }
        rgui.GuiDisable();
    }

    private static void Update() {

    }

    private static void Render() {
        rlj.core.BeginDrawing();
        rlj.core.ClearBackground(Color.WHITE);
        rgui.GuiTextBox(textBox);
        rlj.core.EndDrawing();
    }

}
