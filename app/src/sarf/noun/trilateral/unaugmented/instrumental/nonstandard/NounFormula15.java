package sarf.noun.trilateral.unaugmented.instrumental.nonstandard;

import sarf.noun.NounFormula;
import sarf.verb.trilateral.unaugmented.*;
import sarf.util.*;
import sarf.noun.trilateral.unaugmented.instrumental.*;


public class NounFormula15 extends NonStandardInstrumentalNounFormula{

    public NounFormula15(UnaugmentedTrilateralRoot root, String suffixNo) {
        super(root, suffixNo);
    }

    //to be used in refection getting the formula name
    public NounFormula15() {
    }

    public String form() {
        if (suffixNo % 2 == 0)
            return "�"+ArabCharUtil.DAMMA+root.getC1()+ArabCharUtil.FATHA+root.getC2()+ArabCharUtil.SHADDA+ArabCharUtil.KASRA+root.getC3()+suffix;
        return "";
    }

    public String getFormulaName() {
        return "����������";
    }

    public String getSymbol() {
        return "S";
    }


}
