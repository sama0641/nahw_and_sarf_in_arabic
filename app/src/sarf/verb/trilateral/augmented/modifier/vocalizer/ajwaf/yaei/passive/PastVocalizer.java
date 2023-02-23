package sarf.verb.trilateral.augmented.modifier.vocalizer.ajwaf.yaei.passive;

import java.util.*;

import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.augmented.modifier.*;
import sarf.verb.trilateral.augmented.ConjugationResult;


public class PastVocalizer extends SubstitutionsApplier implements IAugmentedTrilateralModifier {

    private List substitutions = new LinkedList();

    public PastVocalizer() {


        substitutions.add(new ExpressionInfixSubstitution("���C3�","�C3�"));// EX: (�������� ���������)
        substitutions.add(new ExpressionInfixSubstitution("���C3�","�C3�"));// EX: (�������)
        substitutions.add(new ExpressionInfixSubstitution("���C3�","��C3�"));// EX: (������ ��������)
        substitutions.add(new ExpressionInfixSubstitution("���C3�","��C3�"));// EX: (�������ǡ ���������ǡ)
        substitutions.add(new ExpressionInfixSubstitution("���C3�","�C3�"));// EX: (���������� ��������)
        substitutions.add(new ExpressionInfixSubstitution("���C3�","�C3�"));// EX: (�������)
        substitutions.add(new ExpressionInfixSubstitution("���C3�","��C3�"));// EX: (�������� ������)
        substitutions.add(new ExpressionInfixSubstitution("���C3�","��C3�"));// EX: (�������ǡ ��������)


    }


    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        int kov = conjugationResult.getKov();
        int formulaNo = conjugationResult.getFormulaNo();

        return ((kov == 19 || kov == 20) && formulaNo == 1) ||
                (kov == 20 && formulaNo == 4) ||
                ((kov == 20 || kov == 18) && formulaNo == 5) ||
                ((kov == 18 || kov == 19 || kov == 20) && formulaNo == 9);
    }
}
