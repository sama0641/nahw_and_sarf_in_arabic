package sarf.noun.trilateral.augmented.passiveparticiple;

import sarf.noun.trilateral.*;
import sarf.verb.trilateral.augmented.*;
import sarf.util.ArabCharUtil;
import sarf.noun.trilateral.augmented.*;


public class NounFormula6 extends AugmentedTrilateralNoun {
    public NounFormula6(AugmentedTrilateralRoot root, String suffix) {
        super(root, suffix);
    }

    /**
     * form
     *
     * @return String
     * @todo Implement this sarf.noun.trilateral.TrilateralNoun method
     */
    public String form() {
        return "�"+ArabCharUtil.DAMMA+root.getC1()+ArabCharUtil.SKOON+root.getC2()+ArabCharUtil.FATHA+root.getC3()+ArabCharUtil.FATHA+root.getC3()+suffix;
    }
}
