package sarf.verb.trilateral.unaugmented.modifier;

import sarf.verb.trilateral.unaugmented.*;
import java.util.*;
import sarf.verb.trilateral.unaugmented.modifier.geminator.*;
import sarf.*;


public class UnaugmentedTrilateralModifier {
    private Geminator geminator = new Geminator();
    private Vocalizer vocalizer = new Vocalizer();
    private HamzaModifier hamzaModifier = new HamzaModifier();
    private PostHamzaModifier postHamzaModifier = new PostHamzaModifier();

    private UnaugmentedTrilateralModifier() {
    }

    private static UnaugmentedTrilateralModifier instance = new UnaugmentedTrilateralModifier();

    public static UnaugmentedTrilateralModifier getInstance() {
        return instance;
    }

    /**
     * ����� ����� ������� ��� ���������
     * ����� ��������
     * @param root UnaugmentedTrilateralRoot
     * @param kov int
     * @param conjugations List
     * @param tense String (From SystemConstans class the values are stored)  ���� �� ����� �� ���
     * @return ConjugationResult
     */
    public ConjugationResult build(UnaugmentedTrilateralRoot root, int kov, List conjugations, String tense, boolean active) {
        return build(root, kov, conjugations, tense, active, true);
    }

    public ConjugationResult build(UnaugmentedTrilateralRoot root, int kov, List conjugations, String tense, boolean active, boolean applyGemination) {
        ConjugationResult conjResult = new ConjugationResult(kov, root, conjugations);
        if (applyGemination)
            geminator.apply(tense, active, conjResult);
        vocalizer.apply(tense, active, conjResult);
        hamzaModifier.apply(tense, active, conjResult);
        //������ ����� ���
        postHamzaModifier.apply(tense, active, conjResult);
        VerbLamAlefModifier.getInstance().apply(conjResult);
        return conjResult;
    }

}
