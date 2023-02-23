package sarf.gerund.trilateral.augmented;

import sarf.noun.*;
import sarf.verb.trilateral.augmented.*;


public abstract class TrilateralAugmentedGerund {
    protected AugmentedTrilateralRoot root;
    protected int suffixNo;
    protected String suffix;

    public TrilateralAugmentedGerund() {}

    public TrilateralAugmentedGerund(AugmentedTrilateralRoot root, String suffixNo) {
        init(root, suffixNo);
    }

    protected void init(AugmentedTrilateralRoot root, String suffixNo) {
        this.root = root;
        this.suffixNo = Integer.parseInt(suffixNo) + 1;

        suffix = GenericNounSuffixContainer.getInstance().get(this.suffixNo-1);
    }

    public abstract String form();
    public abstract String getPattern();

    public String toString() {
        String result = form();
        if (result != null && result != "")
            return GenericNounSuffixContainer.getInstance().getPrefix()+result;
        return "";
    }

}
