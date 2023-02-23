package sarf.noun.trilateral.unaugmented.assimilate;

import java.util.*;


public class AssimilateAdjectiveFormulaTree {

    private List formulas = new LinkedList();

    public AssimilateAdjectiveFormulaTree() {
    }

    public void addFormula(AssimilateAdjectiveFormula formula) {
        formulas.add(formula);
    }

    public List getFormulaList() {
        return formulas;
    }

}
