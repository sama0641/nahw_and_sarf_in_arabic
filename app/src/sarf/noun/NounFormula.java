package sarf.noun;

import sarf.verb.trilateral.unaugmented.*;


public abstract class NounFormula {
    protected UnaugmentedTrilateralRoot root;
    protected int suffixNo;
    protected String suffix;

    //to be used in refection getting the formula name
    public NounFormula() {}

    public NounFormula(UnaugmentedTrilateralRoot root, String suffixNo) {
        this.root = root;
        this.suffixNo = Integer.parseInt(suffixNo)+1;
        suffix = GenericNounSuffixContainer.getInstance().get(this.suffixNo-1);
    }

    public abstract String form();

    public abstract String getFormulaName();

    public String toString() {
        String result = form();
        if (result != null && result != "")
            return getNounSuffixContainer().getPrefix()+result;
        return "";
    }

    //it is needed to add the prefix
    protected INounSuffixContainer getNounSuffixContainer() {
        return GenericNounSuffixContainer.getInstance();
    }
}
