package sarf.ui;

import javax.swing.*;
import java.awt.Font;


public class RenderedButton extends JButton {
    public static final Font FONT = new Font("Tahoma", Font.PLAIN, 12);

    public RenderedButton(String text) {
        super(text);
        setFont(FONT);
        setFocusPainted(false);
    }

    public RenderedButton() {
        setFont(FONT);
    }
}
