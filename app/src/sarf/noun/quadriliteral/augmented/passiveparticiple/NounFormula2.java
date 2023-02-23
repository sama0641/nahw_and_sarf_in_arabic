package sarf.noun.quadriliteral.augmented.passiveparticiple;

import sarf.noun.quadriliteral.*;
import sarf.verb.quadriliteral.augmented.*;
import sarf.util.ArabCharUtil;
import sarf.noun.quadriliteral.augmented.*;


public class NounFormula2 extends AugmentedQuadriliteralNoun {
    public NounFormula2(AugmentedQuadriliteralRoot root, String suffix) {
        super(root, suffix);
    }

    /**
     * form
     *
     * @return String
     * @todo Implement this sarf.noun.quadriliteral.QuadriliteralNoun method
     */
    public String form() {
        return "�"+ArabCharUtil.DAMMA+root.getC1()+ArabCharUtil.SKOON+root.getC2()+ArabCharUtil.FATHA+"�"+ArabCharUtil.SKOON+root.getC3()+ArabCharUtil.FATHA+root.getC4()+suffix;
    }
}
