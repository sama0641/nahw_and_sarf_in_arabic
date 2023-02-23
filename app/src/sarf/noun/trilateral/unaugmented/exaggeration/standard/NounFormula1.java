package sarf.noun.trilateral.unaugmented.exaggeration.standard;

import sarf.noun.NounFormula;
import sarf.verb.trilateral.unaugmented.*;
import sarf.util.*;


public class NounFormula1 extends NounFormula{

    public NounFormula1(UnaugmentedTrilateralRoot root, String suffixNo) {
        super(root, suffixNo);
    }

    public String form() {
        return root.getC1()+ArabCharUtil.FATHA+root.getC2()+ArabCharUtil.SHADDA+ArabCharUtil.FATHA+"�"+root.getC3()+suffix;
    }

    public String getFormulaName() {
        return "�������";
    }


}
