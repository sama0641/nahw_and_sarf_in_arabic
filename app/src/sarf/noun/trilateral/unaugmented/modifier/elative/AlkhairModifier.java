package sarf.noun.trilateral.unaugmented.modifier.elative;

import sarf.verb.trilateral.unaugmented.*;
import java.util.*;
import sarf.noun.trilateral.unaugmented.modifier.elative.hamza.*;
import sarf.verb.trilateral.Substitution.*;
import sarf.noun.trilateral.unaugmented.modifier.IUnaugmentedTrilateralNounModificationApplier;
import sarf.noun.trilateral.unaugmented.modifier.ConjugationResult;
import sarf.noun.trilateral.unaugmented.elative.*;


public class AlkhairModifier {

    public AlkhairModifier() {
    }

    public void apply(ConjugationResult conjResult) {
        List conjugations = conjResult.getFinalResult();
        //���� ����� ��� ������� ������� �� (��)
        if (ElativeSuffixContainer.getInstance().isDefinite()) {
            for (int i=0;i<6; i++) {
                conjugations.set(i, "���������");
            }
            for (int i=6;i<12; i++) {
                conjugations.set(i, "���������");
            }
            for (int i=12;i<18; i++) {
                conjugations.set(i, "���������");
            }
        }
        //- ���� ����� ��� ������� ������ ��� �����
        // ���� ����� ��� ������� ������ ��� ����
        else if (ElativeSuffixContainer.getInstance().isAnnexed() || ElativeSuffixContainer.getInstance().isIndefinite()) {
            for (int i=0;i<6; i++) {
                conjugations.set(i, "������");
            }
            for (int i=6;i<12; i++) {
                conjugations.set(i, "������");
            }
            for (int i=12;i<18; i++) {
                conjugations.set(i, "������");
            }
        }
        // ���� ����� ��� ������� ��� ������
        else {
            for (int i=0;i<6; i++) {
                conjugations.set(i, "������");
            }
            for (int i=6;i<12; i++) {
                conjugations.set(i, "�������");
            }
            for (int i=12;i<18; i++) {
                conjugations.set(i, "������");
            }

        }
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        UnaugmentedTrilateralRoot root = conjugationResult.getRoot();
        return root.getC1() == '�' && root.getC2() == '�' && root.getC3() == '�';
    }
}
