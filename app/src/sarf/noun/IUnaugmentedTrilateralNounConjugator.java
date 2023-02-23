package sarf.noun;

import java.util.List;
import sarf.verb.trilateral.unaugmented.UnaugmentedTrilateralRoot;


public interface IUnaugmentedTrilateralNounConjugator {
    public List createNounList(UnaugmentedTrilateralRoot root, String formulaName);
    public List getAppliedFormulaList(UnaugmentedTrilateralRoot root);
}
