package sarf.noun.trilateral.unaugmented.modifier;

import java.util.*;

import sarf.verb.trilateral.unaugmented.*;


public class ConjugationResult extends sarf.verb.trilateral.unaugmented.ConjugationResult{
    private String nounFormula;

    public ConjugationResult(int kov, UnaugmentedTrilateralRoot root, List originalResult, String nounFormula) {
        super(kov, root, originalResult);
        this.nounFormula = nounFormula;
    }

    public String getNounFormula() {
        return nounFormula;
    }
}
