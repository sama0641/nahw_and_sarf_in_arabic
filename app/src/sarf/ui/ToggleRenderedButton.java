package sarf.ui;

import javax.swing.*;
import java.awt.Font;


public class ToggleRenderedButton extends JToggleButton {

//    public static final Font FONT = new Font("Tahoma", Font.PLAIN, 12);
    public static final Font FONT = new Font("Traditional Arabic", Font.PLAIN, 20);

    public ToggleRenderedButton(String text) {
        super(text);
        setFont(FONT);
        setFocusPainted(false);
    }

    public ToggleRenderedButton() {
        setFont(FONT);
    }

}
