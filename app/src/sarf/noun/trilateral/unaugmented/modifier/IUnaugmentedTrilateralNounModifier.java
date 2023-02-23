package sarf.noun.trilateral.unaugmented.modifier;

import java.util.List;
import sarf.verb.trilateral.unaugmented.UnaugmentedTrilateralRoot;


public interface IUnaugmentedTrilateralNounModifier {
    public ConjugationResult build(UnaugmentedTrilateralRoot root, int kov, List conjugations, String formula);
}
