package sarf.verb.quadriliteral.augmented.imperative.formula;

import sarf.util.*;
import sarf.verb.quadriliteral.augmented.*;
import sarf.verb.quadriliteral.augmented.*;
import sarf.verb.quadriliteral.augmented.imperative.*;


public class AugmentedImperativeVerb1 extends AugmentedImperativeVerb {

    public AugmentedImperativeVerb1(AugmentedQuadriliteralRoot root,  String lastDim, String connectedPronoun) {
        super(root, lastDim, connectedPronoun);
    }

    public String form() {
        return "�"+ArabCharUtil.FATHA+root.getC1()+ArabCharUtil.FATHA+root.getC2()+ArabCharUtil.SKOON+root.getC3()+ArabCharUtil.FATHA+root.getC4()+lastDim+connectedPronoun;
    }
}
