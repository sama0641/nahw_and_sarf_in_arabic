package sarf.noun.trilateral.augmented.modifier;

import sarf.noun.*;
import sarf.verb.trilateral.augmented.modifier.*;
import sarf.verb.trilateral.augmented.*;


public abstract class AbstractEinMahmouz extends TrilateralNounSubstitutionApplier implements IAugmentedTrilateralModifier {

    public boolean isApplied(ConjugationResult conjugationResult) {
        int kov = conjugationResult.getKov();

        switch (kov) {
        case 6:
        case 9:
        case 13:
        case 22:
        case 25:
        case 29:
            return true;
        }

        return false;
    }
}
