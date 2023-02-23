package sarf.verb.quadriliteral.augmented;


public abstract class AugmentedPresentVerb {

    protected AugmentedQuadriliteralRoot root;
    protected String lastDpr;
    protected String connectedPronoun;
    //��� �������
    protected String cp;

    public AugmentedPresentVerb(AugmentedQuadriliteralRoot root, String cp, String lastDpr, String connectedPronoun) {
        this.root = root;
        this.cp = cp;
        this.lastDpr = lastDpr;
        this.connectedPronoun = connectedPronoun;
    }

    public abstract String form();

    public String getConnectedPronoun() {
        return connectedPronoun;
    }

    public AugmentedQuadriliteralRoot getRoot() {
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
