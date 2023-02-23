package sarf.noun.trilateral.unaugmented.instrumental;

import java.util.*;


public class XmlNonStandardInstrumentalNounFormulaTree {

    private List formulas = new LinkedList();

    public XmlNonStandardInstrumentalNounFormulaTree() {
    }

    public void addFormula(XmlNonStandardInstrumentalNounFormula formula) {
        formulas.add(formula);
    }

    public List getFormulaList() {
        return formulas;
    }

}
