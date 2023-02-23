package sarf.noun.trilateral.unaugmented.exaggeration;

import java.util.*;


public class XmExaggerationNounFormulaTree {

    private List formulas = new LinkedList();

    public XmExaggerationNounFormulaTree() {
    }

    public void addFormula(XmExaggerationNounFormula formula) {
        formulas.add(formula);
    }

    public List getFormulaList() {
        return formulas;
    }

}
