package sarf.gerund.modifier.trilateral.unaugmented.nomen;

import java.util.List;
import sarf.verb.trilateral.unaugmented.UnaugmentedTrilateralRoot;
import sarf.noun.trilateral.unaugmented.modifier.*;
import sarf.*;


public class TitlateralUnaugmentedNomenModifier implements IUnaugmentedTrilateralNounModifier{
    private Geminator geminator = new Geminator();
    private Mahmouz mahmouz = new Mahmouz();

    private TitlateralUnaugmentedNomenModifier() {
    }

    private static TitlateralUnaugmentedNomenModifier instance = new TitlateralUnaugmentedNomenModifier();

    public static TitlateralUnaugmentedNomenModifier getInstance() {
        return instance;
    }

    public ConjugationResult build(UnaugmentedTrilateralRoot root, int kov, List conjugations, String formula) {
        ConjugationResult conjResult = new ConjugationResult(kov, root, conjugations, formula);
        geminator.apply(conjResult);
        mahmouz.apply(conjResult);
        NounLamAlefModifier.getInstance().apply(conjResult);
        NounSunLamModifier.getInstance().apply(conjResult);
        return conjResult;
    }

}
