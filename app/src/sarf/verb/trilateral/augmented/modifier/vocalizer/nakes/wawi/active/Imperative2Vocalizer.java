package sarf.verb.trilateral.augmented.modifier.vocalizer.nakes.wawi.active;

import java.util.*;

import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.augmented.modifier.*;
import sarf.verb.trilateral.augmented.ConjugationResult;


public class Imperative2Vocalizer extends SubstitutionsApplier implements IAugmentedTrilateralModifier {

    private List substitutions = new LinkedList();

    public Imperative2Vocalizer() {

        substitutions.add(new SuffixSubstitution("��",""));// EX: (������ �������)
        substitutions.add(new InfixSubstitution("���","��"));// EX: (���� �������� ��������)
        substitutions.add(new InfixSubstitution("���","���"));// EX: (���� ���������� �����������)
        substitutions.add(new InfixSubstitution("���","��"));// EX: (���� �������ǡ ���������)
        substitutions.add(new InfixSubstitution("���","���"));// EX: (���� ��������� ����������)
        substitutions.add(new InfixSubstitution("��","��"));// EX: (����� ������ǡ �������)
    }


    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        int kov = conjugationResult.getKov();
        int formulaNo = conjugationResult.getFormulaNo();

        switch (kov) {
        case 21:
        case 22:
        case 23:
            switch (formulaNo) {
            case 7:
            case 8:
                return true;
            }
        }
        return false;
    }
}
