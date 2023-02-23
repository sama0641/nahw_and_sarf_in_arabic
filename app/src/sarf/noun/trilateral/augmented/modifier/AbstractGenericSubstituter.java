package sarf.noun.trilateral.augmented.modifier;

import sarf.verb.trilateral.augmented.modifier.*;
import sarf.verb.trilateral.augmented.ConjugationResult;
import sarf.verb.trilateral.Substitution.*;
import sarf.noun.*;


public abstract class AbstractGenericSubstituter extends TrilateralNounSubstitutionApplier implements IAugmentedTrilateralModifier {
    public AbstractGenericSubstituter() {
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        int kov = conjugationResult.getKov();
        int formulaNo = conjugationResult.getFormulaNo();
        if (formulaNo != 5) {
            return false;
        }

        switch (kov) {
        case 1:
        case 2:
        case 6:
        case 7:
        case 16:
        case 17:
        case 20:
        case 23:
        case 26:
        case 28:
            return true;
        }

        return false;
    }
}
