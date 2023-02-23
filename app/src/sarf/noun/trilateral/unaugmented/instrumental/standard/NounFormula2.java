package sarf.noun.trilateral.unaugmented.instrumental.standard;

import sarf.noun.NounFormula;
import sarf.verb.trilateral.unaugmented.*;
import sarf.util.*;


public class NounFormula2 extends NounFormula {

    public NounFormula2(UnaugmentedTrilateralRoot root, String suffix) {
        super(root, suffix);
    }

    public String form() {
        switch (suffixNo) {
        case 2:
        case 4:
        case 8:
        case 10:
        case 14:
        case 16:
            return "�" + ArabCharUtil.KASRA + root.getC1() + ArabCharUtil.SKOON + root.getC2() + ArabCharUtil.FATHA + root.getC3() + suffix;
        }

        return "";
    }

    public String getFormulaName() {
        return "���������";
    }

}
