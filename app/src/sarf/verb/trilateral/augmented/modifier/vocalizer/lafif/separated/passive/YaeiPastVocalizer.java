package sarf.verb.trilateral.augmented.modifier.vocalizer.lafif.separated.passive;

import java.util.*;

import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.augmented.modifier.*;
import sarf.verb.trilateral.augmented.ConjugationResult;


public class YaeiPastVocalizer extends SubstitutionsApplier implements IAugmentedTrilateralModifier {

    private List substitutions = new LinkedList();

    public YaeiPastVocalizer() {
        substitutions.add(new InfixSubstitution("���", "��")); // EX: (��� ��������� )
        substitutions.add(new InfixSubstitution("���", "�")); // EX: (�� ������ǡ )
        substitutions.add(new InfixSubstitution("����", "��")); // EX: (�� ������ǡ )
    }


    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        if (conjugationResult.getRoot().getC1() != '�') {
            return false;
        }

        int kov = conjugationResult.getKov();
        int formulaNo = conjugationResult.getFormulaNo();

        switch (kov) {
        case 29:
            switch (formulaNo) {
            case 5:
            case 7:
            case 9:
                return true;
            }

        case 30:
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
