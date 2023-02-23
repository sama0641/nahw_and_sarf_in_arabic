package sarf.ui.controlpane;

import sarf.ui.NounStateSelectionUIListener;
import sarf.noun.INounSuffixContainer;
import sarf.Action;
import javax.swing.*;


public interface INounStateSelectionUI {
    public void init(Action action, INounSuffixContainer nounSuffixContainer, NounStateSelectionUIListener listener);
    //execute a selected button to refelct the result on the UI
    public void selectOne();

    public JComponent getComponentUI();
}
