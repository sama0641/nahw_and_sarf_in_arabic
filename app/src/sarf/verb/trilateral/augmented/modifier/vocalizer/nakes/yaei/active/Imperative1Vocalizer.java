package sarf.verb.trilateral.augmented.modifier.vocalizer.nakes.yaei.active;

import java.util.*;

import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.augmented.modifier.*;
import sarf.verb.trilateral.augmented.ConjugationResult;


public class Imperative1Vocalizer extends SubstitutionsApplier implements IAugmentedTrilateralModifier {

    private List substitutions = new LinkedList();

    public Imperative1Vocalizer() {

        substitutions.add(new SuffixSubstitution("��",""));// EX: (������ ������ �������� �������� ������������������ ���������)
        substitutions.add(new InfixSubstitution("���","�"));// EX: (���� ������� ������� ��������� ��������� ��������� ����������)
        substitutions.add(new InfixSubstitution("���","�"));// EX: (���� �������� �������� ���������� ���������� ���������� ������������)
        substitutions.add(new InfixSubstitution("���","��"));// EX: (���� �������� �������� ���������� ���������� ��������� ����������)
        substitutions.add(new InfixSubstitution("���","�"));// EX: (���� ������ǡ ������ǡ ��������ǡ ��������ǡ �������ǡ �����������)

    }


    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        int kov = conjugationResult.getKov();
        int formulaNo = conjugationResult.getFormulaNo();

        switch (kov) {
        case 26:
            switch (formulaNo) {
            case 1:
            case 3:
            case 4:
            case 5:
            case 9:
            case 10:
                return true;
            }

        case 25:
            switch (formulaNo) {
            case 1:
            case 3:
            case 4:
            case 5:
            case 9:
                return true;
            }

        case 24:
            switch (formulaNo) {
            case 1:
            case 3:
            case 5:
            case 9:
                return true;
            }
        }
        return false;
    }
}
