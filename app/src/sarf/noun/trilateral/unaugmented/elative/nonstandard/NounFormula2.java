package sarf.noun.trilateral.unaugmented.elative.nonstandard;

import sarf.noun.NounFormula;
import sarf.verb.trilateral.unaugmented.*;
import sarf.util.*;
import sarf.noun.trilateral.unaugmented.elative.ElativeSuffixContainer;
import sarf.noun.INounSuffixContainer;


public class NounFormula2 extends NounFormula {


    public NounFormula2(UnaugmentedTrilateralRoot root, String suffixNo) {
        this.root = root;
        this.suffixNo = Integer.parseInt(suffixNo) + 1;
        suffix = ElativeSuffixContainer.getInstance().get(this.suffixNo - 1).replaceAll(" ", "");
    }

    //to be used in refection getting the formula name
    public NounFormula2() {
    }

    public String form() {

        return root.getC1() + ArabCharUtil.DAMMA + root.getC2() + ArabCharUtil.SKOON + root.getC3()  + suffix;

    }

    public String getFormulaName() {
        return "�������";
    }

    protected INounSuffixContainer getNounSuffixContainer() {
        return ElativeSuffixContainer.getInstance();
    }
}
