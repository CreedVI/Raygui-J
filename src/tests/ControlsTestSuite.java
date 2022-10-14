package tests;

import com.raylib.java.Raylib;
import com.raylib.java.core.Color;
import com.raylib.java.gui.Raygui;
import com.raylib.java.gui.elements.*;
import com.raylib.java.raymath.Vector2;
import com.raylib.java.shapes.Rectangle;

import static com.raylib.java.core.Color.RAYWHITE;
import static com.raylib.java.core.Color.RED;
import static com.raylib.java.core.input.Keyboard.*;
import static com.raylib.java.gui.Raygui.GuiControl.*;
import static com.raylib.java.gui.Raygui.GuiControlProperty.TEXT_ALIGNMENT;
import static com.raylib.java.gui.Raygui.GuiControlState.*;
import static com.raylib.java.gui.Raygui.GuiDefaultProperty.BACKGROUND_COLOR;
import static com.raylib.java.gui.Raygui.GuiIconName.RICON_EXIT;
import static com.raylib.java.gui.Raygui.GuiIconName.RICON_FILE_SAVE;
import static com.raylib.java.gui.Raygui.GuiTextAlignment.GUI_TEXT_ALIGN_CENTER;
import static com.raylib.java.gui.Raygui.GuiTextAlignment.GUI_TEXT_ALIGN_LEFT;

public class ControlsTestSuite {

    /*******************************************************************************************
     *
     *   raygui - controls test suite
     *
     *   TEST CONTROLS:
     *       - GuiDropdownBox()
     *       - GuiCheckBox()
     *       - GuiSpinner()
     *       - GuiValueBox()
     *       - GuiTextBox()
     *       - GuiButton()
     *       - GuiComboBox()
     *       - GuiListView()
     *       - GuiToggleGroup()
     *       - GuiTextBoxMulti()
     *       - GuiColorPicker()
     *       - GuiSlider()
     *       - GuiSliderBar()
     *       - GuiProgressBar()
     *       - GuiColorBarAlpha()
     *       - GuiScrollPanel()
     *
     *
     *   DEPENDENCIES:
     *       raylib 4.0 - Windowing/input management and drawing.
     *       raygui 3.2 - Immediate-mode GUI controls.
     *
     *   COMPILATION (Windows - MinGW):
     *       gcc -o $(NAME_PART).exe $(FILE_NAME) -I../../src -lraylib -lopengl32 -lgdi32 -std=c99
     *
     *   LICENSE: zlib/libpng
     *
     *   Copyright (c) 2016-2022 Ramon Santamaria (@raysan5)
     *
     **********************************************************************************************/

    //------------------------------------------------------------------------------------
    // Program main entry point
    //------------------------------------------------------------------------------------
    public static void main(String[] args) {
        
        // Initialization
        //---------------------------------------------------------------------------------------
        int screenWidth = 690;
        int screenHeight = 560;

        Raylib rlj = new Raylib(screenWidth, screenHeight, "raygui - controls test suite");
        rlj.core.SetExitKey(0);

        Raygui rgui = new Raygui(rlj);

        // GUI controls initialization
        //----------------------------------------------------------------------------------
        int dropdownBox000Active = 0;
        DropdownBox dropdownBox000 = new DropdownBox(25, 25, 125, 30, "ONE;TWO;THREE", dropdownBox000Active, false);

        int dropdownBox001Active = 0;
        DropdownBox dropdownBox001 = new DropdownBox(25, 65, 125, 30, "#01#ONE;#02#TWO;#03#THREE;#04#FOUR", dropdownBox001Active, false);

        int spinner001Value = 0;
        boolean spinnerEditMode = false;
        Spinner spinner001 = new Spinner(25, 135, 125, 30, null, spinner001Value, 0, 100, spinnerEditMode);

        int valueBox002Value = 0;
        boolean valueBoxEditMode = false;
        ValueBox valueBox002 = new ValueBox(25, 175, 125, 30, null, valueBox002Value, 0, 100, valueBoxEditMode);

        String textBoxText = "Text box";
        boolean textBoxEditMode = false;
        TextBox textBox = new TextBox(25, 215, 125, 30, textBoxText, textBoxEditMode, 64);

        int listViewScrollIndex = 0;
        int listViewActive = -1;
        ListView listView = new ListView(165, 25, 140, 140, "Charmander;Bulbasaur;#18#Squirtle;Pikachu;Eevee;Pidgey", listViewScrollIndex, listViewActive);

        int listViewExScrollIndex = 0;
        int listViewExActive = 2;
        int listViewExFocus = -1;
        String[] listViewExList = { "This", "is", "a", "list view", "with", "disable", "elements", "amazing!" };
        ListView listViewEx =  new ListView(165, 180, 140, 200, "",listViewExScrollIndex, listViewExActive);

        String multiTextBoxText = "Multi text box";
        boolean multiTextBoxEditMode = false;
        Color colorPickerValue = RED;
        TextBoxMulti textBoxMulti = new TextBoxMulti(320, 25, 225, 140, multiTextBoxText, multiTextBoxEditMode, 512);

        int sliderValue = 50;
        Slider slider = new Slider(355, 400, 165, 20, "TEST", rlj.text.TextFormat("%2.2f", (float)sliderValue), sliderValue, -50, 100);
        int sliderBarValue = 60;
        Slider sliderBar = new Slider(320, 430, 200, 20, null, rlj.text.TextFormat("%d", sliderBarValue), sliderBarValue, 0, 100);
        float progressValue = 0.4f;
        ProgressBar progressBar = new ProgressBar(320, 460, 200, 20, null, null, progressValue, 0, 1);

        boolean forceSquaredChecked = false;
        CheckBox forceSquared = new CheckBox(25, 108, 15, 15, "FORCE CHECK!", forceSquaredChecked);

        float alphaValue = 0.5f;

        int comboBoxActive = 1;
        ComboBox comboBox = new ComboBox(new Rectangle(25, 470, 125, 30), "ONE;TWO;THREE;FOUR", comboBoxActive);

        int toggleGroupActive = 0;
        ToggleGroup toggleGroup = new ToggleGroup(165, 400, 140, 25, "#1#ONE\n#3#TWO\n#8#THREE\n#23#", toggleGroupActive);

        ScrollPanel scrollPanel = new ScrollPanel(new Rectangle(560, 25, 100, 160), new Rectangle(560, 25, 200, 400), new Vector2());

        Button saveButton = new Button(25, 255, 125, 30, rgui.GuiIconText(RICON_FILE_SAVE, "Save File"));

        TextInputBox textInputBox = new TextInputBox((float)rlj.core.GetScreenWidth()/2 - 120, (float)rlj.core.GetScreenHeight()/2 - 60, 240, 140, "Save", rgui.GuiIconText(RICON_FILE_SAVE, "Save file as..."), "Ok;Cancel", textBoxText);
        //----------------------------------------------------------------------------------

        // Custom GUI font loading
        //Font font = LoadFontEx("fonts/rainyhearts16.ttf", 12, 0, 0);
        //GuiSetFont(font);

        boolean exitWindow = false;
        boolean showMessageBox = false;

        String textInput = "";
        boolean showTextInputBox = false;

        rlj.core.SetTargetFPS(60);
        //--------------------------------------------------------------------------------------

        // Main game loop
        while (!exitWindow) {    // Detect window close button or ESC key
            // Update
            //----------------------------------------------------------------------------------
            exitWindow = rlj.core.WindowShouldClose();

            if (rlj.core.IsKeyPressed(KEY_ESCAPE)) {
                showMessageBox = !showMessageBox;
            }

            if (rlj.core.IsKeyDown(KEY_LEFT_CONTROL) && rlj.core.IsKeyPressed(KEY_S)) {
                showTextInputBox = true;
            }

            /*if (rlj.core.IsFileDropped()) {
                FilePathList droppedFiles = rlj.core.LoadDroppedFiles();

                if ((droppedFiles.count > 0) && rlj.core.IsFileExtension(droppedFiles.paths[0], ".rgs")) GuiLoadStyle(droppedFiles.paths[0]);

                rlj.core.DroppedFiles(droppedFiles);    // Clear internal buffers
            }*/
            //----------------------------------------------------------------------------------

            // Draw
            //----------------------------------------------------------------------------------
            rlj.core.BeginDrawing();

            rlj.core.ClearBackground(rgui.GetColor(rgui.GuiGetStyle(DEFAULT, BACKGROUND_COLOR)));

            // raygui: controls drawing
            //----------------------------------------------------------------------------------
            if (dropdownBox000.editMode || dropdownBox001.editMode) {
                rgui.GuiLock();
            }
            else if (!dropdownBox000.editMode && !dropdownBox001.editMode) {
                rgui.GuiUnlock();
            }
            //GuiDisable();

            // First GUI column
            //GuiSetStyle(CHECKBOX, TEXT_ALIGNMENT, TEXT_ALIGN_LEFT);
            rgui.GuiCheckBox(forceSquared);

            rgui.GuiSetStyle(TEXTBOX, TEXT_ALIGNMENT, GUI_TEXT_ALIGN_CENTER);
            //GuiSetStyle(VALUEBOX, TEXT_ALIGNMENT, TEXT_ALIGN_LEFT);
            if (rgui.GuiSpinner(spinner001)) {
                spinner001.editMode = !spinner001.editMode;
            }
            if (rgui.GuiValueBox(valueBox002)) {
                valueBox002.editMode = !valueBox002.editMode;
            }
            rgui.GuiSetStyle(TEXTBOX, TEXT_ALIGNMENT, GUI_TEXT_ALIGN_LEFT);
            if (rgui.GuiTextBox(textBox)) {
                textBox.editMode = !textBox.editMode;
            }

            rgui.GuiSetStyle(BUTTON, TEXT_ALIGNMENT, GUI_TEXT_ALIGN_CENTER);

            if (rgui.GuiButton(saveButton)) {
                showTextInputBox = true;
            }

            rgui.GuiGroupBox(new GroupBox(25, 310, 125, 150, "STATES"));
            //GuiLock();
            rgui.GuiSetState(GUI_STATE_NORMAL); if (rgui.GuiButton(new Button(30, 320, 115, 30, "NORMAL"))) { }
            rgui.GuiSetState(GUI_STATE_FOCUSED); if (rgui.GuiButton(new Button(30, 355, 115, 30, "FOCUSED"))) { }
            rgui.GuiSetState(GUI_STATE_PRESSED); if (rgui.GuiButton(new Button(30, 390, 115, 30, "#15#PRESSED"))) { }
            rgui.GuiSetState(GUI_STATE_DISABLED); if (rgui.GuiButton(new Button(30, 425, 115, 30, "DISABLED"))) { }
            rgui.GuiSetState(GUI_STATE_NORMAL);
            //GuiUnlock();

            comboBox.active = rgui.GuiComboBox(comboBox);

            // NOTE: GuiDropdownBox must draw after any other control that can be covered on unfolding
            rgui.GuiSetStyle(DROPDOWNBOX, TEXT_ALIGNMENT, GUI_TEXT_ALIGN_LEFT);
            if (rgui.GuiDropdownBox(dropdownBox001)) {
                dropdownBox001.editMode = !dropdownBox001.editMode;
            }

            rgui.GuiSetStyle(DROPDOWNBOX, TEXT_ALIGNMENT, GUI_TEXT_ALIGN_CENTER);
            if (rgui.GuiDropdownBox(dropdownBox000)) {
                dropdownBox000.editMode = !dropdownBox000.editMode;
            }

            // Second GUI column
            listView.active = rgui.GuiListView(listView);
            listViewEx.active = rgui.GuiListViewEx(listViewEx, listViewExList, listViewExFocus);

            // TODO: 13/10/2022  
            rgui.GuiToggleGroup(toggleGroup);

            // Third GUI column
            if (rgui.GuiTextBoxMulti(textBoxMulti)) {
                textBoxMulti.editMode = !textBoxMulti.editMode;
            }
            colorPickerValue = rgui.GuiColorPicker(new Rectangle(320, 185, 196, 192), colorPickerValue);

            slider.value = rgui.GuiSlider(slider);
            slider.textRight = rlj.text.TextFormat("%2.2f", slider.value);
            sliderBar.value = rgui.GuiSliderBar(sliderBar);
            sliderBar.textRight = rlj.text.TextFormat("%d", (int) sliderBar.value);
            progressBar.value = rgui.GuiProgressBar(progressBar);
            //progressBar.value += 0.001f;
            if (progressBar.value >= progressBar.maxValue) {
                progressBar.value = progressBar.minValue;
            }

            // NOTE: View rectangle could be used to perform some scissor test
            Rectangle view = rgui.GuiScrollPanel(scrollPanel);

            rgui.GuiPanel(new Panel(560, 25 + 180, 100, 160, "Panel Info"));

            rgui.GuiGrid(new Grid(560, 25 + 180 + 180, 100, 120, 20, 2));

            rgui.GuiStatusBar(new StatusBar(0, (float)rlj.core.GetScreenHeight() - 20, (float)rlj.core.GetScreenWidth(), 20, "This is a status bar"));

            alphaValue = rgui.GuiColorBarAlpha(new Rectangle(320, 490, 200, 30), alphaValue);

            if (showMessageBox) {
                rlj.shapes.DrawRectangle(0, 0, rlj.core.GetScreenWidth(), rlj.core.GetScreenHeight(), rgui.Fade(RAYWHITE, 0.8f));
                int result = rgui.GuiMessageBox(new MessageBox(rlj.core.GetScreenWidth()/2 - 125, (float)rlj.core.GetScreenHeight()/2 - 50, 250, 100, rgui.GuiIconText(RICON_EXIT, "Close Window"), "Do you really want to exit?", "Yes;No"));

                if ((result == 0) || (result == 2)) {
                    showMessageBox = false;
                }
                else if (result == 1) {
                    exitWindow = true;
                }
            }

            if (showTextInputBox) {
                rlj.shapes.DrawRectangle(0, 0, rlj.core.GetScreenWidth(), rlj.core.GetScreenHeight(), rgui.Fade(RAYWHITE, 0.8f));
                int result = rgui.GuiTextInputBox(textInputBox, 255);

                if (result == 1) {
                    // TODO: Validate textInput value and save

                    textInputBox.textBox.text = textInput;
                }

                if ((result == 0) || (result == 1) || (result == 2)) {
                    showTextInputBox = false;
                    textInput = "";
                }
            }
            //----------------------------------------------------------------------------------

            rlj.core.EndDrawing();
            //----------------------------------------------------------------------------------
        }

        // De-Initialization
        //--------------------------------------------------------------------------------------
        //--------------------------------------------------------------------------------------
    }
    
}
