package sarf.verb.trilateral.augmented;

import java.util.*;


public class AugmentedTrilateralRootTree {
    private List roots = new LinkedList();

    public AugmentedTrilateralRootTree() {
    }

    public void addRoot(AugmentedTrilateralRoot root) {
        roots.add(root);
    }

    public List getRoots() {
        return roots;
    }
}
