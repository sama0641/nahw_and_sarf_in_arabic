package sarf.verb.trilateral.augmented.modifier.vocalizer.ajwaf.wawi.active;

import java.util.*;

import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.augmented.modifier.*;
import sarf.verb.trilateral.augmented.ConjugationResult;


public class Past2Vocalizer extends SubstitutionsApplier implements IAugmentedTrilateralModifier {

    private List substitutions = new LinkedList();

    public Past2Vocalizer() {

        substitutions.add(new ExpressionInfixSubstitution("���C3�","�C3�"));// EX: (���������� ���������)
        substitutions.add(new ExpressionInfixSubstitution("���C3�","�C3�"));// EX: (�������)
        substitutions.add(new ExpressionInfixSubstitution("���C3�","��C3�"));// EX: (������ �������)
        substitutions.add(new ExpressionInfixSubstitution("���C3�","��C3�"));// EX: (�������ǡ ��������)

    }


    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        int kov = conjugationResult.getKov();
        int formulaNo = conjugationResult.getFormulaNo();

        return ((kov == 15 || kov == 17) && formulaNo == 4) || ((kov == 15 || kov == 16 || kov == 17) && formulaNo == 5);
    }
}
