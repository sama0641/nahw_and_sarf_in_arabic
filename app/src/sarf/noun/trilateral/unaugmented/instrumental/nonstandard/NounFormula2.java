package sarf.noun.trilateral.unaugmented.instrumental.nonstandard;

import sarf.noun.trilateral.unaugmented.instrumental.*;
import sarf.util.*;
import sarf.verb.trilateral.unaugmented.*;


public class NounFormula2 extends NonStandardInstrumentalNounFormula{

    public NounFormula2(UnaugmentedTrilateralRoot root, String suffixNo) {
        super(root, suffixNo);
    }

    //to be used in refection getting the formula name
    public NounFormula2() {
    }

    public String form() {
        switch (suffixNo) {
        case 1:
        case 3:
        case 7:
        case 9:
        case 13:
        case 15:
            return root.getC1()+ArabCharUtil.KASRA+root.getC2()+ArabCharUtil.FATHA+"�"+root.getC3()+suffix;
        }

        return "";
    }

    public String getFormulaName() {
        return "������";
    }

    public String getSymbol() {
        return "F";
    }


}
