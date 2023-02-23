package sarf.verb.trilateral.augmented.modifier.hamza.lam;

import sarf.verb.trilateral.augmented.*;
import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.augmented.modifier.*;


public abstract class AbstractLamMahmouz extends SubstitutionsApplier implements IAugmentedTrilateralModifier {
    public AbstractLamMahmouz() {
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        int kov = conjugationResult.getKov();
        int formulaNo = conjugationResult.getFormulaNo();

        switch (kov) {

        case 4:
            return formulaNo == 5;
        case 7:
            switch (formulaNo) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return true;
            }

        case 10:
        case 16:
            switch (formulaNo) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 8:
            case 9:
                return true;
            }

        case 19:
            switch (formulaNo) {
            case 1:
            case 2:
            case 3:
            case 7:
            case 8:
            case 9:
                return true;
            }

        }
        return false;
    }

}
