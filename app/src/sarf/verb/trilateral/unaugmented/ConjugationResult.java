package sarf.verb.trilateral.unaugmented;

import java.util.*;


public class ConjugationResult {
    protected int kov;
    protected UnaugmentedTrilateralRoot root;

    //13 conjugated verbs
    protected List originalResult;
    //������� ���  ������� �������� �������
    protected List finalResult;

    public ConjugationResult(int kov, UnaugmentedTrilateralRoot root, List originalResult) {
        this.kov = kov;
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

    public UnaugmentedTrilateralRoot getRoot() {
        return root;
    }
}
