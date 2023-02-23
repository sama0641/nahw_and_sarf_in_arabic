package sarf.verb.trilateral.augmented.modifier.vocalizer.ajwaf.yaei.active;

import java.util.*;

import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.augmented.modifier.*;
import sarf.verb.trilateral.augmented.ConjugationResult;


public class Present1Vocalizer extends SubstitutionsApplier implements IAugmentedTrilateralModifier {

    private List substitutions = new LinkedList();

    public Present1Vocalizer() {
        substitutions.add(new ExpressionInfixSubstitution("���C3�","��C3�"));// EX: (�� �������� ������)
        substitutions.add(new ExpressionInfixSubstitution("���C3�","��C3�"));// EX: (���� ��������� ���������)
        substitutions.add(new ExpressionInfixSubstitution("���C3�","��C3�"));// EX: (����� �������� ��������)
        substitutions.add(new ExpressionInfixSubstitution("���C3�","�C3�"));// EX: (��� �������� �������)
    }


    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        int kov = conjugationResult.getKov();
        int formulaNo = conjugationResult.getFormulaNo();

        return ((kov == 18 || kov == 19 || kov == 20) && formulaNo == 1) || ((kov == 18 || kov == 19 || kov == 20) && formulaNo == 9);
    }
}
