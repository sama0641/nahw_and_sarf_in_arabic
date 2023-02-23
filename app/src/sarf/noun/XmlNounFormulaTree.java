package sarf.noun;

import java.util.*;


public class XmlNounFormulaTree {

    private List formulas = new LinkedList();

    public XmlNounFormulaTree() {
    }

    public void addFormula(XmlNounFormula formula) {
        formulas.add(formula);
    }

    public List getFormulaList() {
        return formulas;
    }

}
