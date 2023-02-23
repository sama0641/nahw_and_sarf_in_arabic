package sarf.verb.quadriliteral.unaugmented;

import java.util.*;


public class UnaugmentedQuadriliteralRootTree {
    private List roots = new LinkedList();

    public UnaugmentedQuadriliteralRootTree() {
    }

    public void addRoot(UnaugmentedQuadriliteralRoot root) {
        roots.add(root);
    }

    public List getRoots() {
        return roots;
    }
}
