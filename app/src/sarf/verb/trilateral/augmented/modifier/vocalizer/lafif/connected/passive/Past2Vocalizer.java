package sarf.verb.trilateral.augmented.modifier.vocalizer.lafif.connected.passive;

import java.util.*;

import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.augmented.modifier.*;
import sarf.verb.trilateral.augmented.ConjugationResult;
import sarf.verb.trilateral.augmented.*;


public class Past2Vocalizer extends SubstitutionsApplier implements IAugmentedTrilateralModifier {

    private List substitutions = new LinkedList();

    public Past2Vocalizer() {
        substitutions.add(new InfixSubstitution("���","�"));// EX: (�������ǡ ������ǡ �������ǡ �������ǡ ��������ǡ ����������)
        substitutions.add(new InfixSubstitution("����","��"));// EX: (������ǡ ��������ǡ ����������)
        substitutions.add(new InfixSubstitution("��","��"));// EX: (�������� ������� ����������� ��������ǡ ������� �������� �������� ��������� ���������� ����������)
        substitutions.add(new InfixSubstitution("��","�"));// EX: (���������� �������� ��������� ���������� ���������� ����������� �����������)
    }


    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        int kov = conjugationResult.getKov();
        int formulaNo = conjugationResult.getFormulaNo();
        AugmentedTrilateralRoot root = conjugationResult.getRoot();
        if (root.getC2() == root.getC3() && root.getC3() == '�' && kov == 28) {
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
}
