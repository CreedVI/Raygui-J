<img align="left" src="https://raw.githubusercontent.com/CreedVI/Raygui-J/main/raygui-j.png" width=256>

# Raygui-J
A handmade version of Raygui for Raylib-J.

---

## About

Raygui-J is a handwritten binding of [Raygui](https://github.com/raysan5/raygui) in Java for use with the [Raylib-J](https://github.com/CreedVI/Raylib-J) framework.

That being said, Raygui-J operates diferently than its C original.

---

## Use

### basic controls
```
Label       |  Button      |  LabelButton |  Toggle       |  ToggleGroup |  CheckBox
ComboBox    |  DropdownBox |  TextBox     |  TextBoxMulti |  ValueBox    |  Spinner
Slider      |  SliderBar   |  ProgressBar |  StatusBar    |  DummyRec    |  Grid
```
### container/separator controls
```
WindowBox   |  GroupBox    |  Line        |  Panel        |  ScrollPanel
```
### advanced controls
```
ListView    |  ColorPicker |  MessageBox  |  TextInputBox
```

Raygui-J organises these basic controls into objects that are then passed to the appropreate `Gui*` function where object values are updated based on user interaction.

### basic style

Only the default style is currently supported.

### rIcons

Only the default icons are currently supported.

---

## Basic Example

The following code is an example of how to retrieve user text from a TextBox.

```
Java

package tests;

import com.raylib.java.Raylib;
import com.raylib.java.core.Color;
import com.raylib.java.gui.Raygui;
import com.raylib.java.gui.elements.TextBox;

public class text {

    static Raylib rlj;
    static Raygui rgui;

    static TextBox textBox;
    static String userText;

    public static void main(String[] args) {
        rlj = new Raylib(800, 600, "rGUI-J - Textbox");
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
    	userText = textBox.text;
    }

    private static void Render() {
        rlj.core.BeginDrawing();
        rlj.core.ClearBackground(Color.WHITE);
        rgui.GuiTextBox(textBox);
        rlj.core.EndDrawing();
    }

}
```
