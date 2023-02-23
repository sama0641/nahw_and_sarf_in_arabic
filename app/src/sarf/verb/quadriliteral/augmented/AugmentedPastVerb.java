package sarf.verb.quadriliteral.augmented;



public abstract class AugmentedPastVerb {

    protected AugmentedQuadriliteralRoot root;
    protected String lastDpa;
    protected String connectedPronoun;

    public AugmentedPastVerb(AugmentedQuadriliteralRoot root, String lastDpa, String connectedPronoun) {
        this.root = root;
        this.lastDpa = lastDpa;
        this.connectedPronoun = connectedPronoun;
    }

    public abstract String form();

    public String getConnectedPronoun() {
        return connectedPronoun;
    }

    public AugmentedQuadriliteralRoot getRoot() {
        return root;
    }

    public String getLastDpa() {
        return lastDpa;
    }

    public String toString() {
        return form();
    }

}
