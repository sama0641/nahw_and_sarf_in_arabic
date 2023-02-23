package sarf.ui;

import javax.swing.*;


public interface IControlPane {
    public JComponent getComponent();
    public void controlPaneOpened();
    public void controlPaneClosed();
}

