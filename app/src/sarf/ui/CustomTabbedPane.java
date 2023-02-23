package sarf.ui;

import javax.swing.*;
import java.awt.Font;
import java.awt.*;


public class CustomTabbedPane extends JTabbedPane {
    public static final Font FONT = new Font("Traditional Arabic", Font.PLAIN, 18);

    public CustomTabbedPane() {
        setFont(FONT);
        setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    }
}
