package sarf.noun.trilateral.unaugmented.instrumental.nonstandard;

import sarf.noun.NounFormula;
import sarf.verb.trilateral.unaugmented.*;
import sarf.util.*;
import sarf.noun.trilateral.unaugmented.instrumental.*;


public class NounFormula1 extends NonStandardInstrumentalNounFormula{

    public NounFormula1(UnaugmentedTrilateralRoot root, String suffixNo) {
        super(root, suffixNo);
    }

    //to be used in refection getting the formula name
    public NounFormula1() {
    }

    public String form() {
        switch (suffixNo) {
        case 1:
        case 3:
        case 7:
        case 9:
        case 13:
        case 15:
            return root.getC1()+ArabCharUtil.FATHA+"�"+root.getC2()+ArabCharUtil.DAMMA+"�"+root.getC3()+suffix;
         }

        return "";
    }

    public String getFormulaName() {
        return "�������";
    }

    public String getSymbol() {
        return "E";
    }


}
