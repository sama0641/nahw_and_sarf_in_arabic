package sarf.verb.trilateral.augmented.active.past.formula;

import sarf.verb.trilateral.augmented.*;
import sarf.util.*;
import sarf.verb.trilateral.augmented.*;


public class AugmentedPastVerb9 extends AugmentedPastVerb {

    public AugmentedPastVerb9(AugmentedTrilateralRoot root, String lastDpa, String connectedPronoun) {
        super(root, lastDpa, connectedPronoun);
    }

    /**
     * form
     *
     * @return String
     * @todo Implement this sarf.trilingual.augmented.past.AugmentedPastVerb
     *   method
     */
    public String form() {
        return "��"+ArabCharUtil.SKOON+ "�"+ArabCharUtil.FATHA+root.getC1()+ArabCharUtil.SKOON+root.getC2()+ArabCharUtil.FATHA+root.getC3()+lastDpa+connectedPronoun;
    }
}
