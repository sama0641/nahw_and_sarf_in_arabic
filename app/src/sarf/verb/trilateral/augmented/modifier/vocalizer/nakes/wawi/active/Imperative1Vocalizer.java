package sarf.verb.trilateral.augmented.modifier.vocalizer.nakes.wawi.active;

import java.util.*;

import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.augmented.modifier.*;
import sarf.verb.trilateral.augmented.ConjugationResult;


public class Imperative1Vocalizer extends SubstitutionsApplier implements IAugmentedTrilateralModifier {

    private List substitutions = new LinkedList();

    public Imperative1Vocalizer() {
        substitutions.add(new InfixSubstitution("����","��"));// EX: (���� ������ǡ �����ǡ ������ǡ ������ǡ �������ǡ �������ǡ ����������)
        substitutions.add(new InfixSubstitution("����","��"));// EX: (���� �������� ������� �������� �������� ��������� ��������� �����������)
        substitutions.add(new SuffixSubstitution("��",""));// EX: (������ ����� ������ ������ ������� ������� ��������)
        substitutions.add(new InfixSubstitution("���","��"));// EX: (���� ������� ������ ������� ������ ������ ������� �������)
        substitutions.add(new InfixSubstitution("���","�"));// EX: (���� ������� ������ ������� ������ ������ ������� ������)
        substitutions.add(new InfixSubstitution("��","��"));// EX: (����� ������ǡ �����ǡ ������ǡ �����ǡ �����ǡ ������ǡ �������)
    }


    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        int kov = conjugationResult.getKov();
        int formulaNo = conjugationResult.getFormulaNo();

        if ((kov == 22 || kov == 23) && formulaNo == 4) return true;
        if ((kov == 21 || kov == 23) &&  formulaNo == 9) return true;
        if (kov == 23 && (formulaNo == 6 || formulaNo == 10)) return true;

        switch (kov) {
        case 21:
        case 22:
        case 23:
            switch (formulaNo) {
            case 1:
            case 3:
            case 5:
                return true;
            }
        }
        return false;
    }
}
