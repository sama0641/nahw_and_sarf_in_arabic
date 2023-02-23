package sarf.verb.trilateral.augmented.modifier.vocalizer.lafif.connected.active;

import java.util.*;

import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.augmented.modifier.*;
import sarf.verb.trilateral.augmented.ConjugationResult;
import sarf.verb.trilateral.augmented.*;


public class Imperative1Vocalizer extends SubstitutionsApplier implements IAugmentedTrilateralModifier {

    private List substitutions = new LinkedList();

    public Imperative1Vocalizer() {

        substitutions.add(new SuffixSubstitution("��",""));// EX: (������ ������ ����� ����� ������ ������ ������� ������)
        substitutions.add(new InfixSubstitution("���","�"));// EX: (���� ������� ������� ������ ������ ������� ������� �������� �������)
        substitutions.add(new InfixSubstitution("���","�"));// EX: (���� ������ǡ ������ǡ �����ǡ �����ǡ ������ǡ ������ǡ �������ǡ ��������)
        substitutions.add(new InfixSubstitution("���","��"));// EX: (���� �������� �������� ������� ������� �������� �������� ��������� ���������)

    }


    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        int kov = conjugationResult.getKov();
        int formulaNo = conjugationResult.getFormulaNo();
        AugmentedTrilateralRoot root = conjugationResult.getRoot();
        if ((root.getC2() == '�' || root.getC2() == '�') && root.getC3() == '�') {
            switch (kov) {
            case 27:
                switch (formulaNo) {
                case 1:
                case 5:
                case 9:
                    return true;
                }

            case 28:
                switch (formulaNo) {
                case 1:
                case 3:
                case 4:
                case 5:
                case 9:
                    return true;
                }
            }

        }
        return false;
    }
}
