package sarf.verb.trilateral.augmented.modifier.vocalizer.nakes.wawi.passive;

import java.util.*;

import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.augmented.modifier.*;
import sarf.verb.trilateral.augmented.ConjugationResult;


public class Past1Vocalizer extends SubstitutionsApplier implements IAugmentedTrilateralModifier {

    private List substitutions = new LinkedList();

    public Past1Vocalizer() {
        substitutions.add(new InfixSubstitution("��", "�")); // EX: (��� ���������� ��������� ������ʡ �����ʡ ����������� ������������ �����������)
        substitutions.add(new InfixSubstitution("��", "��")); // EX: (�� �������� ������� �������� ������ ��������� ���������� ����������)
        substitutions.add(new InfixSubstitution("���", "�")); // EX: (�� �������ǡ ������ǡ �������ǡ ������ǡ ��������ǡ ���������ǡ ����������)
    }


    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        int kov = conjugationResult.getKov();
        int formulaNo = conjugationResult.getFormulaNo();

        switch (kov) {
        case 21:
            switch (formulaNo) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
                return true;
            }

        case 22:
            switch (formulaNo) {
            case 1:
            case 3:
            case 4:
            case 5:
            case 7:
                return true;
            }

        case 23:
            switch (formulaNo) {
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
                return true;
            }

        }
        return false;
    }
}
