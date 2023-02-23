package sarf.gerund.trilateral.unaugmented;

import java.util.List;
import sarf.verb.trilateral.unaugmented.UnaugmentedTrilateralRoot;


public interface IUnaugmentedTrilateralGerundConjugator {
    public List createGerundList(UnaugmentedTrilateralRoot root, String formulaName);
    public List getAppliedFormulaList(UnaugmentedTrilateralRoot root);
}
