package sarf.noun.trilateral.unaugmented.exaggeration.nonstandard;

import sarf.noun.NounFormula;
import sarf.verb.trilateral.unaugmented.*;
import sarf.util.*;
import sarf.noun.trilateral.unaugmented.exaggeration.NonStandardExaggerationNounFormula;


public class NounFormula5 extends NonStandardExaggerationNounFormula{

    public NounFormula5(UnaugmentedTrilateralRoot root, String suffixNo) {
        super(root, suffixNo);
    }

    //to be used in refection getting the formula name
    public NounFormula5() {
    }

    public String form() {
        return root.getC1()+ArabCharUtil.FATHA+root.getC2()+ArabCharUtil.KASRA+"�"+root.getC3()+suffix;
    }

    public String getFormulaName() {
        return "������";
    }

    public String getSymbol() {
        return "F";
    }

}
