package sarf.noun.trilateral.unaugmented.timeandplace;

import java.util.*;


public class XmlTimeAndPlaceNounFormulaTree {

    private List formulas = new LinkedList();

    public XmlTimeAndPlaceNounFormulaTree() {
    }

    public void addFormula(XmlTimeAndPlaceNounFormula formula) {
        formulas.add(formula);
    }

    public List getFormulaList() {
        return formulas;
    }

}
