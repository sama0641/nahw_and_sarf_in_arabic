package sarf.verb.quadriliteral.augmented.passive.past.formula;

import sarf.util.*;
import sarf.verb.quadriliteral.augmented.*;
import sarf.verb.quadriliteral.augmented.*;


public class AugmentedPastVerb1 extends AugmentedPastVerb {

    public AugmentedPastVerb1(AugmentedQuadriliteralRoot root, String lastDpa, String connectedPronoun) {
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
        return "�"+ArabCharUtil.DAMMA+root.getC1()+ArabCharUtil.DAMMA+root.getC2()+ArabCharUtil.SKOON+root.getC3()+ArabCharUtil.KASRA+root.getC4()+lastDpa+connectedPronoun;
    }
}
