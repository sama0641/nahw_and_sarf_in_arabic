package sarf.verb.quadriliteral.modifier;

import java.util.*;

import sarf.verb.quadriliteral.*;
import sarf.*;


public class QuadrilateralModifier {

    private QuadrilateralModifier() {
    }

    private static QuadrilateralModifier instance = new QuadrilateralModifier();

    private Geminator geminator = new Geminator();
    private Vocalizer vocalizer = new Vocalizer();
    private InternalMahmouz internalMahmouz = new InternalMahmouz();
    private EndedMahmouz endedMahmouz = new EndedMahmouz();



    public static QuadrilateralModifier getInstance() {
        return instance;
    }

    /**
     * ����� ����� ������� ��� ���������
     * @param root UnaugmentedTrilateralRoot
     * @param conjugations List
     * @param tense String (From SystemConstans class the values are stored)  ���� �� ����� �� ���
     * @return ConjugationResult
     */
    public ConjugationResult build(QuadrilateralRoot root, int formulaNo, int kov, List conjugations, String tense, boolean active, boolean applyGemination) {
        ConjugationResult conjResult = new ConjugationResult(formulaNo, kov, root, conjugations);
        if (applyGemination)
            geminator.apply(tense, active, conjResult);
        vocalizer.apply(tense, active, conjResult);
        internalMahmouz.apply(tense, active, conjResult);
        endedMahmouz.apply(tense, active, conjResult);
        VerbLamAlefModifier.getInstance().apply(conjResult);
        return conjResult;
    }

    public ConjugationResult build(QuadrilateralRoot root, int formulaNo, int kov, List conjugations, String tense, boolean active) {
        return build(root, formulaNo, kov, conjugations, tense, active, true);
    }
}
