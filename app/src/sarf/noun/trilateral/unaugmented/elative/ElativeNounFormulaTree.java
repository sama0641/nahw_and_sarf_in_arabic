package sarf.noun.trilateral.unaugmented.elative;

import java.util.*;


public class ElativeNounFormulaTree {

    private List formulas = new LinkedList();

    public ElativeNounFormulaTree() {
    }

    public void addFormula(ElativeNounFormula formula) {
        formulas.add(formula);
    }

    public List getFormulaList() {
        return formulas;
    }

}
