package sarf.noun.trilateral.unaugmented.instrumental;

import sarf.noun.*;
import sarf.verb.trilateral.unaugmented.UnaugmentedTrilateralRoot;


public abstract class NonStandardInstrumentalNounFormula extends NounFormula {
    public NonStandardInstrumentalNounFormula() {
    }

    public NonStandardInstrumentalNounFormula(UnaugmentedTrilateralRoot root, String suffixNo) {
        super(root, suffixNo);
    }

    /**
     * Every non standard instrumental has a symbol to be represented by
     * @return String
     */
    public abstract String getSymbol();

}
