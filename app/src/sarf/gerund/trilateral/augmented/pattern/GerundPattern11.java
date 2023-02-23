package sarf.gerund.trilateral.augmented.pattern;

import sarf.gerund.trilateral.augmented.*;
import sarf.verb.trilateral.augmented.*;
import sarf.util.*;
import sarf.gerund.trilateral.*;


public class GerundPattern11 extends TrilateralAugmentedGerund {
    public GerundPattern11() {
        super();
    }

    public GerundPattern11(AugmentedTrilateralRoot root, String suffixNo) {
        super(root, suffixNo);
    }

    /**
     * form
     *
     * @return String
     * @todo Implement this
     *   sarf.gerund.trilateral.augmented.TrilateralAugmentedGerund method
     */
    public String form() {
        switch (suffixNo) {
        case 1:
        case 3:
        case 6:
        case 7:
        case 9:
        case 12:
        case 13:
        case 15:
        case 18:
            return "�" + root.getC1() + ArabCharUtil.SKOON + root.getC2() + ArabCharUtil.KASRA + "�" + ArabCharUtil.SHADDA + ArabCharUtil.FATHA + "�" + root.getC3() + suffix;
        }
        return "";

    }

    /**
     * getPattern
     *
     * @return String
     * @todo Implement this
     *   sarf.gerund.trilateral.augmented.TrilateralAugmentedGerund method
     */
    public String getPattern() {
        return "����������";
    }

}
