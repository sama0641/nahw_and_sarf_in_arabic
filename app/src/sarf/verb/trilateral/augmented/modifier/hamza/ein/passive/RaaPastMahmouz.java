package sarf.verb.trilateral.augmented.modifier.hamza.ein.passive;

import java.util.*;
import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.augmented.modifier.IAugmentedTrilateralModifier;
import sarf.verb.trilateral.augmented.ConjugationResult;
import sarf.verb.trilateral.*;


public class RaaPastMahmouz extends SubstitutionsApplier implements IAugmentedTrilateralModifier {
    private List substitutions = new ArrayList();

    public RaaPastMahmouz() {
        substitutions.add(new InfixSubstitution("���", "�")); // EX: (�������� ������)
        substitutions.add(new InfixSubstitution("���", "�")); // EX: (�����ǡ )
    }

    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        TrilateralRoot root = conjugationResult.getRoot();
        return conjugationResult.getFormulaNo() == 1 && root.getC1() == '�' && root.getC2() == '�' && root.getC3() == '�';
    }
}
