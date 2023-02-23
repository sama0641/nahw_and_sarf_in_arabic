package sarf.verb.trilateral.augmented;

import sarf.verb.trilateral.augmented.*;

public abstract class AugmentedPresentVerb {

    protected AugmentedTrilateralRoot root;
    protected String lastDpr;
    protected String connectedPronoun;
    //��� �������
    protected String cp;

    public AugmentedPresentVerb(AugmentedTrilateralRoot root, String cp, String lastDpr, String connectedPronoun) {
        this.root = root;
        this.cp = cp;
        this.lastDpr = lastDpr;
        this.connectedPronoun = connectedPronoun;
    }

    public abstract String form();

    public String getConnectedPronoun() {
        return connectedPronoun;
    }

    public AugmentedTrilateralRoot getRoot() {
        return root;
    }

    public String getLastDpr() {
        return lastDpr;
    }

    public String toString() {
        return form();
    }

    public String getCp() {
        return cp;
    }

}
