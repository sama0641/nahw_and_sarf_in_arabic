package sarf.gerund.trilateral.augmented.nomen;

import sarf.noun.*;
import sarf.verb.trilateral.augmented.*;


public abstract class TrilateralAugmentedNomenGerund {
    protected AugmentedTrilateralRoot root;
    protected int suffixNo;
    protected String suffix;


    public TrilateralAugmentedNomenGerund() {}

    public TrilateralAugmentedNomenGerund(AugmentedTrilateralRoot root, String suffixNo) {
        init(root, suffixNo);
    }

    protected void init(AugmentedTrilateralRoot root, String suffixNo) {
        this.root = root;
        this.suffixNo = Integer.parseInt(suffixNo);

        suffix = GenericNounSuffixContainer.getInstance().get(this.suffixNo);
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
