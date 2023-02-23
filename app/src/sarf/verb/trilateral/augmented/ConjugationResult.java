package sarf.verb.trilateral.augmented;

import java.util.*;


public class ConjugationResult {
    private int kov;
    private int formulaNo;
    private AugmentedTrilateralRoot root;

    //13 conjugated verbs
    private List originalResult;
    //������� ���  ������� �������� �������
    private List finalResult;

    public ConjugationResult(int kov, int formulaNo, AugmentedTrilateralRoot root, List originalResult) {
        this.kov = kov;
        this.formulaNo = formulaNo;
        this.originalResult = originalResult;
        this.root = root;
        this.finalResult = new ArrayList(originalResult);
    }

    public List getFinalResult() {
        return finalResult;
    }

    public int getKov() {
        return kov;
    }

    public List getOriginalResult() {
        return originalResult;
    }

    public AugmentedTrilateralRoot getRoot() {
        return root;
    }

    public int getFormulaNo() {
        return formulaNo;
    }
}
