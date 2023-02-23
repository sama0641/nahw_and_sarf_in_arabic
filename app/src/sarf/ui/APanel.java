package sarf.ui;

import javax.swing.*;
import java.awt.*;


public class APanel extends JPanel {

    public APanel() {
        setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    }

    public APanel(LayoutManager layoutManager) {
        super(layoutManager);
        setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    }
}
