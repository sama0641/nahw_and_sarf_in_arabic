package sarf.noun.trilateral.augmented;

import sarf.verb.trilateral.augmented.*;
import sarf.noun.*;


public abstract class AugmentedTrilateralNoun {
    protected AugmentedTrilateralRoot root;
    protected String suffix;

    public AugmentedTrilateralNoun(AugmentedTrilateralRoot root, String suffix) {
        this.root = root;
        this.suffix = suffix;
    }

    public abstract String form();

    public String toString() {
        return GenericNounSuffixContainer.getInstance().getPrefix()+form();
    }
}
