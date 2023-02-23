package sarf.verb.trilateral.augmented;

import sarf.verb.trilateral.augmented.*;


public abstract class AugmentedPastVerb {

    protected AugmentedTrilateralRoot root;
    protected String lastDpa;
    protected String connectedPronoun;

    public AugmentedPastVerb(AugmentedTrilateralRoot root, String lastDpa, String connectedPronoun) {
        this.root = root;
        this.lastDpa = lastDpa;
        this.connectedPronoun = connectedPronoun;
    }

    public abstract String form();

    public String getConnectedPronoun() {
        return connectedPronoun;
    }

    public AugmentedTrilateralRoot getRoot() {
        return root;
    }

    public String getLastDpa() {
        return lastDpa;
    }

    public String toString() {
        return form();
    }

}
