package sarf.verb.trilateral.augmented.modifier.vocalizer.nakes.wawi.passive;

import java.util.*;

import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.augmented.modifier.*;
import sarf.verb.trilateral.augmented.ConjugationResult;


public class Past2Vocalizer extends SubstitutionsApplier implements IAugmentedTrilateralModifier {

    private List substitutions = new LinkedList();

    public Past2Vocalizer() {

        substitutions.add(new InfixSubstitution("��","�"));// EX: (��� ��������� ����������)
        substitutions.add(new InfixSubstitution("��","��"));// EX: (�� ������� ���������)
        substitutions.add(new InfixSubstitution("����","��"));// EX: (�� ������ǡ ���������)

    }


    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        int kov = conjugationResult.getKov();
        int formulaNo = conjugationResult.getFormulaNo();

        return (kov == 22 && formulaNo == 8) || ((kov == 23 || kov == 21) && (formulaNo == 2 || formulaNo == 8));
    }
}
