package sarf.verb.quadriliteral.augmented.imperative.formula;

import sarf.util.*;
import sarf.verb.quadriliteral.augmented.*;
import sarf.verb.quadriliteral.augmented.imperative.*;



public class AugmentedImperativeVerb2 extends AugmentedImperativeVerb {

    public AugmentedImperativeVerb2(AugmentedQuadriliteralRoot root,  String lastDim, String connectedPronoun) {
        super(root, lastDim, connectedPronoun);
    }

    public String form() {
        return "�"+root.getC1()+ArabCharUtil.SKOON+root.getC2()+ArabCharUtil.FATHA+"�"+ArabCharUtil.SKOON+root.getC3()+ArabCharUtil.KASRA+root.getC4()+lastDim+connectedPronoun;
    }
}
