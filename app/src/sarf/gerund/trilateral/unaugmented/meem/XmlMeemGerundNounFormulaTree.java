package sarf.gerund.trilateral.unaugmented.meem;

import java.util.*;


public class XmlMeemGerundNounFormulaTree {

    private List formulas = new LinkedList();

    public XmlMeemGerundNounFormulaTree() {
    }

    public void addFormula(XmlMeemGerundNounFormula formula) {
        formulas.add(formula);
    }

    public List getFormulaList() {
        return formulas;
    }

}
