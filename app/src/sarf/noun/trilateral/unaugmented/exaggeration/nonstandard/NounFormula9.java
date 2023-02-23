package sarf.noun.trilateral.unaugmented.exaggeration.nonstandard;

import sarf.noun.NounFormula;
import sarf.verb.trilateral.unaugmented.*;
import sarf.util.*;
import sarf.noun.trilateral.unaugmented.exaggeration.NonStandardExaggerationNounFormula;


public class NounFormula9 extends NonStandardExaggerationNounFormula{

    public NounFormula9(UnaugmentedTrilateralRoot root, String suffixNo) {
        super(root, suffixNo);
    }

    //to be used in refection getting the formula name
    public NounFormula9() {
    }

    public String form() {
        return "�"+ArabCharUtil.KASRA+root.getC1()+ArabCharUtil.SKOON+root.getC2()+ArabCharUtil.KASRA+"�"+root.getC3()+suffix;
    }

    public String getFormulaName() {
        return "��������";
    }

    public String getSymbol() {
        return "K";
    }


}
