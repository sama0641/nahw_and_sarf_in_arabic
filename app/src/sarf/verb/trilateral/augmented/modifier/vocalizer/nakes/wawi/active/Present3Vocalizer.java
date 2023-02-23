package sarf.verb.trilateral.augmented.modifier.vocalizer.nakes.wawi.active;

import java.util.*;

import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.augmented.modifier.*;
import sarf.verb.trilateral.augmented.ConjugationResult;


public class Present3Vocalizer extends SubstitutionsApplier implements IAugmentedTrilateralModifier {

    private List substitutions = new LinkedList();

    public Present3Vocalizer() {
        substitutions.add(new SuffixSubstitution("��", "�")); // EX: (�� ��������)
        substitutions.add(new SuffixSubstitution("��", "")); // EX: (�� �������)
        substitutions.add(new InfixSubstitution("����", "��")); // EX: (���� ����������)
        substitutions.add(new InfixSubstitution("���", "��")); // EX: (���� ����������)
        substitutions.add(new InfixSubstitution("��", "��")); // EX: (�� ���������)
        substitutions.add(new InfixSubstitution("��", "")); // EX: (���� ����������)
    }


    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        int kov = conjugationResult.getKov();
        int formulaNo = conjugationResult.getFormulaNo();

        return (kov == 21 || kov == 23) && formulaNo == 2;
    }
}
