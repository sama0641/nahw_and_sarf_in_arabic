package sarf.verb.trilateral.augmented.modifier.vocalizer.lafif.connected.active;

import java.util.*;

import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.augmented.modifier.*;
import sarf.verb.trilateral.augmented.ConjugationResult;
import sarf.verb.trilateral.augmented.*;


public class Present2Vocalizer extends SubstitutionsApplier implements IAugmentedTrilateralModifier {

    private List substitutions = new LinkedList();

    public Present2Vocalizer() {
        substitutions.add(new SuffixSubstitution("���","��"));// EX: (��������)
        substitutions.add(new SuffixSubstitution("��",""));// EX: (�� �������)
        substitutions.add(new InfixSubstitution("����","��"));// EX: (���� ����������)
        substitutions.add(new InfixSubstitution("����","��"));// EX: (���� ����������)
        substitutions.add(new InfixSubstitution("����","���"));// EX: (���� ����������)
    }


    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        int kov = conjugationResult.getKov();
        int formulaNo = conjugationResult.getFormulaNo();
        AugmentedTrilateralRoot root = conjugationResult.getRoot();
        return root.getC2() == root.getC3() && root.getC3() == '�' && kov == 28 && formulaNo == 2;
    }
}
