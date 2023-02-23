package sarf.verb.quadriliteral;

import java.util.*;


public class ConjugationResult {
    private int formulaNo;
    private QuadrilateralRoot root;
    private int kov;

    private List originalResult;
    //������� ���  ������� �������� �������
    private List finalResult;

    public ConjugationResult(int formulaNo, int kov, QuadrilateralRoot root, List originalResult) {
        this.formulaNo = formulaNo;
        this.kov = kov;
        this.originalResult = originalResult;
        this.root = root;
        this.finalResult = new ArrayList(originalResult);
    }

    public List getFinalResult() {
        return finalResult;
    }

    public List getOriginalResult() {
        return originalResult;
    }

    public QuadrilateralRoot getRoot() {
        return root;
    }

    public int getFormulaNo() {
        return formulaNo;
    }

    public int getKov() {
        return kov;
    }
}
