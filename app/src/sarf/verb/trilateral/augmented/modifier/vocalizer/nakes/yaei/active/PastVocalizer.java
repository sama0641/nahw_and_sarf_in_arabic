package sarf.verb.trilateral.augmented.modifier.vocalizer.nakes.yaei.active;

import java.util.*;

import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.augmented.modifier.*;
import sarf.verb.trilateral.augmented.ConjugationResult;


public class PastVocalizer extends SubstitutionsApplier implements IAugmentedTrilateralModifier {

    private List substitutions = new LinkedList();

    public PastVocalizer() {
        substitutions.add(new SuffixSubstitution("��","�"));// EX: (�� ���� ����� ���� ����� ����� ����� ������ ������ ������ ��������)
        substitutions.add(new InfixSubstitution("���", "��")); // EX: (�� ������ǡ ������ǡ ������ǡ �������ǡ �������ǡ �������ǡ �������ǡ ��������ǡ ���������ǡ ���������)
        substitutions.add(new InfixSubstitution("���", "�")); // EX: (�� ������� ������ � ������� �������� �������� �������� ������� � ��������� ����������� � ��������)
    }


    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        int kov = conjugationResult.getKov();
        int formulaNo = conjugationResult.getFormulaNo();

        if ((kov == 25 || kov == 26) && formulaNo == 4) return true;
        if (kov == 26 &&  formulaNo == 10) return true;
        if (kov == 25  && formulaNo == 11) return true;

        switch (kov) {
        case 24:
        case 25:
        case 26:
            switch (formulaNo) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 8:
            case 9:
                return true;
            }
        }

        return false;
    }
}
