package sarf.noun.trilateral.augmented.activeparticiple;

import sarf.noun.trilateral.*;
import sarf.verb.trilateral.augmented.*;
import sarf.util.ArabCharUtil;
import sarf.noun.trilateral.augmented.*;


public class NounFormula8 extends AugmentedTrilateralNoun {
    public NounFormula8(AugmentedTrilateralRoot root, String suffix) {
        super(root, suffix);
    }

    /**
     * form
     *
     * @return String
     * @todo Implement this sarf.noun.trilateral.TrilateralNoun method
     */
    public String form() {
        return "�"+ArabCharUtil.DAMMA+"�"+ArabCharUtil.FATHA+root.getC1()+ArabCharUtil.FATHA+root.getC2()+ArabCharUtil.SHADDA+ArabCharUtil.KASRA+root.getC3()+suffix;
    }
}
