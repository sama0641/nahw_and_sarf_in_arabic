package sarf.verb.trilateral.augmented.modifier;

import sarf.verb.trilateral.augmented.modifier.geminator.*;
import sarf.verb.trilateral.augmented.ConjugationResult;


public class Geminator {
    //����� �����
    private GenericGeminator genericGeminator = new GenericGeminator();
    //����� ������� ���� �����
    private NEndedGeminator nEndedGeminator = new NEndedGeminator();
    //����� ������� ���� �����
    private NStartedGeminator nStartedGeminator = new NStartedGeminator();

    //����� ������� ���� �����
    private TEndedGeminator tEndedGeminator = new TEndedGeminator();
    //����� ������� ���� �����
    private TStartedGeminator tStartedGeminator = new TStartedGeminator();

    public Geminator() {
    }

    /**
     * ����� ������� ��� ������ ���� �� ����� �� ��� ������� �� ������
     * ����� ������� ������ ��� ������ ������
     * �� �� ���� �� ��� �� �������
     * @param tense String
     * @param active boolean
     * @param conjResult ConjugationResult
     */
    public void apply(String tense, boolean active, ConjugationResult conjResult) {
        //althoug it will enter the generic block, it may found some rules in the special ones
        if (genericGeminator.isApplied(conjResult))
            genericGeminator.apply(tense, active, conjResult);

        if (tStartedGeminator.isApplied(conjResult))
            tStartedGeminator.apply(tense, active, conjResult);

        if (tEndedGeminator.isApplied(conjResult))
            tEndedGeminator.apply(tense, active, conjResult);

        if (nStartedGeminator.isApplied(conjResult))
            nStartedGeminator.apply(tense, active, conjResult);

        if (nEndedGeminator.isApplied(conjResult))
            nEndedGeminator.apply(tense, active, conjResult);
    }

}
