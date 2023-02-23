package sarf.noun.trilateral.unaugmented.exaggeration.nonstandard;

import sarf.noun.NounFormula;
import sarf.verb.trilateral.unaugmented.*;
import sarf.util.*;
import sarf.noun.trilateral.unaugmented.exaggeration.NonStandardExaggerationNounFormula;
import sarf.noun.GenericNounSuffixContainer;


public class NounFormula6 extends NonStandardExaggerationNounFormula{

    public NounFormula6(UnaugmentedTrilateralRoot root, String suffixNo) {
        super(root, suffixNo);
        if (this.suffixNo == 7 && GenericNounSuffixContainer.getInstance().isInDefiniteMode()) {
            suffix = "�";
        }

    }

    //to be used in refection getting the formula name
    public NounFormula6() {
    }

    public String form() {
        switch (suffixNo) {
        case 1:
        case 7:
        case 13:
            return root.getC1()+ArabCharUtil.FATHA+root.getC2()+ArabCharUtil.SHADDA+ArabCharUtil.FATHA+"�"+root.getC3()+ArabCharUtil.FATHA+"�"+suffix;
        }

        return "";
    }

    public String getFormulaName() {
        return "���������";
    }

    public String getSymbol() {
        return "G";
    }
}
