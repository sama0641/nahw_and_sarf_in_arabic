package sarf.noun.trilateral.augmented.modifier.activeparticiple.vocalizer;

import java.util.*;

import sarf.noun.*;
import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.augmented.modifier.IAugmentedTrilateralModifier;
import sarf.verb.trilateral.augmented.*;


public class WawiNakesLafifVocalizer extends TrilateralNounSubstitutionApplier implements IAugmentedTrilateralModifier {

    private List substitutions = new LinkedList();

    public WawiNakesLafifVocalizer() {
        substitutions.add(new SuffixSubstitution("���", "��")); // EX: (��� ����������)
        substitutions.add(new SuffixSubstitution("���", "���")); // EX: (����� ����������  )
        substitutions.add(new SuffixSubstitution("���", "��")); // EX: (����� ��� ���������� )
        substitutions.add(new InfixSubstitution("���", "�")); // EX: (��� ������)
        substitutions.add(new InfixSubstitution("���", "�")); // EX: (����� ��� ������)
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (����� ���������)
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (���������� ��������� ���������� ��������ʡ )
        substitutions.add(new InfixSubstitution("���", "�")); // EX: (��������� )
        substitutions.add(new InfixSubstitution("���", "�")); // EX: (��������� )
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        if (conjugationResult.getRoot().getC3() != '�')
            return false;

        int kov = conjugationResult.getKov();
        int formulaNo = conjugationResult.getFormulaNo();

        switch (kov) {
        case 21:
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

        case 22:
            switch (formulaNo) {
            case 1:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
                return true;
            }

        case 23:
            switch (formulaNo) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return true;
            }

        case 28:
            switch (formulaNo) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 11:
                return true;
            }
        }
        return false;
    }

    public List getSubstitutions() {
        return substitutions;
    }
}
