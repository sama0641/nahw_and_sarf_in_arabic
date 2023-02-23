package sarf.ui;

import sarf.noun.INounSuffixContainer;
import sarf.Action;
import sarf.ui.controlpane.NounStateSelectionUI;
import sarf.ui.controlpane.INounStateSelectionUI;
import sarf.ui.controlpane.*;


public class ElativeNounConjugationUI extends NounConjugationUI {
    public ElativeNounConjugationUI(sarf.Action sarfAction, String title) {
        super(sarfAction, null, title);
    }

    protected INounStateSelectionUI createNounStateSelectionUI(Action action, INounSuffixContainer nounSuffixContainer, NounStateSelectionUIListener listener) {
        ElativeNounStateSelectionUI nounStateSelectionUI = new ElativeNounStateSelectionUI();
        nounStateSelectionUI.init(action, nounSuffixContainer,this);
        return nounStateSelectionUI;
    }

}
