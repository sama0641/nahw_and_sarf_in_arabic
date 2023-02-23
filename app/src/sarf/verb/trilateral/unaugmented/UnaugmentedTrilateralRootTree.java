package sarf.verb.trilateral.unaugmented;

import java.util.*;


public class UnaugmentedTrilateralRootTree {
    private List roots = new LinkedList();

    public UnaugmentedTrilateralRootTree() {
    }

    public void addRoot(UnaugmentedTrilateralRoot root) {
        roots.add(root);
    }

    public List getRoots() {
        return roots;
    }
}
