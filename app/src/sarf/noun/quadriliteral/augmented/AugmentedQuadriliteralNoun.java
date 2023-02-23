package sarf.noun.quadriliteral.augmented;

import sarf.verb.quadriliteral.augmented.*;
import sarf.noun.GenericNounSuffixContainer;


public abstract class AugmentedQuadriliteralNoun {
    protected AugmentedQuadriliteralRoot root;
    protected String suffix;

    public AugmentedQuadriliteralNoun(AugmentedQuadriliteralRoot root, String suffix) {
        this.root = root;
        this.suffix = suffix;
    }

    public abstract String form();

    public String toString() {
        return GenericNounSuffixContainer.getInstance().getPrefix()+form();
    }
}
