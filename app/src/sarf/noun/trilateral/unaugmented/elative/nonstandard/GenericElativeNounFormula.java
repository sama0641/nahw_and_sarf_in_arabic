package sarf.noun.trilateral.unaugmented.elative.nonstandard;

import sarf.noun.NounFormula;
import sarf.verb.trilateral.unaugmented.*;
import sarf.util.*;
import sarf.noun.INounSuffixContainer;
import sarf.noun.GenericNounSuffixContainer;
import sarf.noun.trilateral.unaugmented.elative.*;


public class GenericElativeNounFormula extends NounFormula {

    private NounFormula appliedNounFormula;

    public GenericElativeNounFormula(UnaugmentedTrilateralRoot root, String suffixNo) {
        if ((Integer.parseInt(suffixNo) + 1) % 2 == 0 && (ElativeSuffixContainer.getInstance().isDefinite() || ElativeSuffixContainer.getInstance().isAnnexed())) {
            appliedNounFormula = new NounFormula2(root, suffixNo);
        }
        else {
            appliedNounFormula = new NounFormula1(root, suffixNo);
        }
    }

    //to be used in refection getting the formula name
    public GenericElativeNounFormula() {
    }

    public String form() {
        return appliedNounFormula.form();
    }

    public String getFormulaName() {
        return "�������";
    }

    protected INounSuffixContainer getNounSuffixContainer() {
        return ElativeSuffixContainer.getInstance();
    }
}
