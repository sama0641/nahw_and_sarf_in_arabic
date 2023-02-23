package sarf.noun.trilateral.unaugmented.timeandplace;

import sarf.noun.NounFormula;
import sarf.verb.trilateral.unaugmented.UnaugmentedTrilateralRoot;


public abstract class NonStandardTimeAndPlaceNounFormula extends NounFormula {

    public NonStandardTimeAndPlaceNounFormula() {
    }

    public NonStandardTimeAndPlaceNounFormula(UnaugmentedTrilateralRoot root, String suffixNo) {
        super(root, suffixNo);
    }

    /**
     * Every non standard time and place has a symbol to be represented by
     * @return String
     */
    public abstract String getSymbol();
}
