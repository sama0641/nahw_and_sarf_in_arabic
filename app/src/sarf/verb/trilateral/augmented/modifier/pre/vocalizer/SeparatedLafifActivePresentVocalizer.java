package sarf.verb.trilateral.augmented.modifier.pre.vocalizer;

import java.util.*;

import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.augmented.modifier.*;
import sarf.verb.trilateral.augmented.ConjugationResult;


public class SeparatedLafifActivePresentVocalizer extends SubstitutionsApplier implements IAugmentedTrilateralModifier {

    private List substitutions = new LinkedList();

    public SeparatedLafifActivePresentVocalizer() {
        substitutions.add(new InfixSubstitution("���", "��")); // EX: (������)
        substitutions.add(new InfixSubstitution("���", "��")); // EX: (������)
    }


    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        int kov = conjugationResult.getKov();
        int formulaNo = conjugationResult.getFormulaNo();

        if (kov == 30 && formulaNo == 1) {
            return true;
        }
        return false;
    }
}
