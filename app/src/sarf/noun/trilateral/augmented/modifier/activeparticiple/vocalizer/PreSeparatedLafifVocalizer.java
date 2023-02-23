package sarf.noun.trilateral.augmented.modifier.activeparticiple.vocalizer;

import java.util.*;

import sarf.noun.*;
import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.augmented.modifier.IAugmentedTrilateralModifier;
import sarf.verb.trilateral.augmented.*;


public class PreSeparatedLafifVocalizer extends TrilateralNounSubstitutionApplier implements IAugmentedTrilateralModifier {

    private List substitutions = new LinkedList();

    public PreSeparatedLafifVocalizer() {
        substitutions.add(new InfixSubstitution("���","��"));// EX: (�����)
        substitutions.add(new InfixSubstitution("���","��"));// EX: (�����)
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        int kov = conjugationResult.getKov();
        int formulaNo = conjugationResult.getFormulaNo();

        return kov == 30 && formulaNo == 1;
    }

    public List getSubstitutions() {
        return substitutions;
    }
}
