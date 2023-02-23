package sarf.noun.trilateral.unaugmented.timeandplace.nonstandard;

import sarf.noun.NounFormula;
import sarf.verb.trilateral.unaugmented.*;
import sarf.util.*;
import sarf.noun.trilateral.unaugmented.timeandplace.NonStandardTimeAndPlaceNounFormula;


public class NounFormula2 extends NonStandardTimeAndPlaceNounFormula{

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
            return "�"+ArabCharUtil.FATHA+root.getC1()+ArabCharUtil.SKOON+root.getC2()+ArabCharUtil.KASRA+root.getC3()+suffix;
        }

        return "";
    }

    public String getFormulaName() {
        return "�������";
    }

    public String getSymbol() {
        return "B";
    }


}
