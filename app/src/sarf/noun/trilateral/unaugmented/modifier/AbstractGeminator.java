package sarf.noun.trilateral.unaugmented.modifier;

import java.util.*;

import sarf.noun.*;
import sarf.verb.trilateral.Substitution.*;
import sarf.noun.trilateral.unaugmented.modifier.IUnaugmentedTrilateralNounModificationApplier;
import sarf.noun.trilateral.unaugmented.modifier.*;


public abstract class AbstractGeminator extends TrilateralNounSubstitutionApplier implements IUnaugmentedTrilateralNounModificationApplier {

    public AbstractGeminator() {
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        int kov = conjugationResult.getKov();
        int noc = Integer.parseInt(conjugationResult.getRoot().getConjugation());

        switch (kov) {
        case 2:
            switch (noc) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            }

        case 3:
            return noc == 2 || noc == 1;

        case 8:
            return noc == 4;

        case 12:
            return noc == 2 || noc == 4;
        }
        return false;
    }
}
