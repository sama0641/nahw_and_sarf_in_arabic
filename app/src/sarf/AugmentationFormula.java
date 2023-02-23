package sarf;

public class AugmentationFormula {
    private int formulaNo;
    private char transitive;

    public AugmentationFormula() {
    }

    public char getTransitive() {
        return transitive;
    }

    public int getFormulaNo() {
        return formulaNo;
    }

    public void setFormulaNo(int formulaNo) {
        this.formulaNo = formulaNo;
    }

    public void setTransitive(char transitive) {
        this.transitive = transitive;
    }
}
