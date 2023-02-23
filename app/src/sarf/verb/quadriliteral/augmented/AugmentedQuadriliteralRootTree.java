package sarf.verb.quadriliteral.augmented;

import java.util.*;


public class AugmentedQuadriliteralRootTree {
    private List roots = new LinkedList();

    public AugmentedQuadriliteralRootTree() {
    }

    public void addRoot(AugmentedQuadriliteralRoot root) {
        roots.add(root);
    }

    public List getRoots() {
        return roots;
    }
}
