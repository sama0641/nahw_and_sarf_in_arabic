package sarf.verb.trilateral.augmented.modifier.vocalizer.nakes.yaei.active;

import java.util.*;

import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.augmented.modifier.*;
import sarf.verb.trilateral.augmented.ConjugationResult;


public class Present2Vocalizer extends SubstitutionsApplier implements IAugmentedTrilateralModifier {

    private List substitutions = new LinkedList();

    public Present2Vocalizer() {
        substitutions.add(new SuffixSubstitution("���", "��")); // EX: (��������� ����������)
        substitutions.add(new SuffixSubstitution("��", "�")); // EX: (�� ��������� ����������)
        substitutions.add(new SuffixSubstitution("��", "")); // EX: (�� �������� ���������)
        substitutions.add(new InfixSubstitution("���", "��")); // EX: (���� ������������ �������������)
        substitutions.add(new InfixSubstitution("���", "��")); // EX: (���� ������������ �������������)
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (���� ������������� ��������������)
    }


    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        int kov = conjugationResult.getKov();
        int formulaNo = conjugationResult.getFormulaNo();

        return (kov == 26 || kov == 24 || kov == 25) && (formulaNo == 7 || formulaNo == 8);
    }
}
