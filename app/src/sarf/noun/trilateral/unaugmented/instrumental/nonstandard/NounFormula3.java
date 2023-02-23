package sarf.noun.trilateral.unaugmented.instrumental.nonstandard;

import sarf.noun.NounFormula;
import sarf.verb.trilateral.unaugmented.*;
import sarf.util.*;
import sarf.noun.trilateral.unaugmented.instrumental.*;


public class NounFormula3 extends NonStandardInstrumentalNounFormula{

    public NounFormula3(UnaugmentedTrilateralRoot root, String suffixNo) {
        super(root, suffixNo);
    }

    //to be used in refection getting the formula name
    public NounFormula3() {
    }

    public String form() {
        switch (suffixNo) {
        case 2:
        case 4:
        case 8:
        case 10:
        case 14:
        case 16:
            return root.getC1()+ArabCharUtil.FATHA+"�"+root.getC2()+ArabCharUtil.KASRA+root.getC3()+suffix;
        }
        return "";
    }

    public String getFormulaName() {
        return "��������";
    }

    public String getSymbol() {
        return "G";
    }

}
