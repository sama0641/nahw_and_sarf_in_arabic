package sarf.noun.trilateral.augmented.modifier.geminator;

import java.util.*;

import sarf.noun.*;
import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.augmented.modifier.IAugmentedTrilateralModifier;
import sarf.verb.trilateral.augmented.*;


public class Geminator2 extends TrilateralNounSubstitutionApplier implements IAugmentedTrilateralModifier {

    private List substitutions = new LinkedList();

    public Geminator2() {
        substitutions.add(new InfixSubstitution("���","��"));// EX: (���������)
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        int kov = conjugationResult.getKov();
        int formulaNo = conjugationResult.getFormulaNo();

        return conjugationResult.getRoot().getC1() == '�' && kov == 1 && formulaNo == 4;
    }

    public List getSubstitutions() {
        return substitutions;
    }
}
