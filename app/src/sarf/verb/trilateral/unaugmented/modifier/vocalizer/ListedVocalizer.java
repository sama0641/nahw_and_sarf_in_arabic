package sarf.verb.trilateral.unaugmented.modifier.vocalizer;

import sarf.verb.trilateral.unaugmented.*;
import java.util.*;
import sarf.verb.trilateral.unaugmented.modifier.*;
import sarf.verb.trilateral.Substitution.*;


public abstract class ListedVocalizer extends SubstitutionsApplier implements IUnaugmentedTrilateralModifier {
    public ListedVocalizer() {
    }

    /**
     * isApplied
     *
     * @param conjugationResult ConjugationResult
     * @return boolean
     * @todo Implement this
     *   sarf.verb.trilateral.unaugmented.modifier.IUnaugmentedTrilateralModifier
     *   method
     */
    public boolean isApplied(ConjugationResult conjugationResult) {
        UnaugmentedTrilateralRoot root = conjugationResult.getRoot();
        //��� ����� �������� �����
        if (!root.getConjugation().equals(getNoc()+"")) return false;

        Iterator iter = getAppliedRoots().iterator();
        while (iter.hasNext()) {
            String appliedRoot = (String) iter.next();
            char c1 = appliedRoot.charAt(0);
            char c2 = appliedRoot.charAt(1);
            char c3 = appliedRoot.charAt(2);
            if (c1 == root.getC1() && c2 == root.getC2() && root.getC3() == c3)
                return true;
        }
        return false;
    }

    protected abstract List getAppliedRoots();
    protected abstract int getNoc();
}
