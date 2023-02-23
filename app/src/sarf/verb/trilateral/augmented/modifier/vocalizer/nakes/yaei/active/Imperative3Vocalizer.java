package sarf.verb.trilateral.augmented.modifier.vocalizer.nakes.yaei.active;

import java.util.*;

import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.augmented.modifier.*;
import sarf.verb.trilateral.augmented.ConjugationResult;


public class Imperative3Vocalizer extends SubstitutionsApplier implements IAugmentedTrilateralModifier {

    private List substitutions = new LinkedList();

    public Imperative3Vocalizer() {
        substitutions.add(new SuffixSubstitution("��", "")); // EX: (������ �������)
        substitutions.add(new InfixSubstitution("���", "�")); // EX: (���� ������� ��������)
        substitutions.add(new InfixSubstitution("���", "�")); // EX: (���� �������� ����������)
        substitutions.add(new InfixSubstitution("���", "��")); // EX: (���� �������� ����������)
        substitutions.add(new InfixSubstitution("����", "��")); // EX: (���� ������ǡ ���������)
    }


    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        int kov = conjugationResult.getKov();
        int formulaNo = conjugationResult.getFormulaNo();

        return ((kov == 26 || kov == 24) && formulaNo == 2) || (kov == 25 && (formulaNo == 2 || formulaNo == 11));
    }
}
