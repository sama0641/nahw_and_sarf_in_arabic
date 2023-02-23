package sarf.verb.quadriliteral.modifier;

import sarf.verb.quadriliteral.ConjugationResult;
import java.util.*;
import sarf.*;
import sarf.verb.quadriliteral.substitution.SubstitutionsApplier;


public class Vocalizer {
    //�������  �  ������� ����� ����� �������� ������ ������ ����� �������� ������ ���
    private Map modifiersMap = new HashMap();

    public Vocalizer() {
        List activePastList = new LinkedList();
        List passivePastList = new LinkedList();
        List activePresentList = new LinkedList();
        List passivePresentList = new LinkedList();
        List imperativeList = new LinkedList();

        //��� �����  ������  ������� ������� ������� ������ �� ������ �������� ������
        modifiersMap.put(SystemConstants.PAST_TENSE + "true", activePastList);
        modifiersMap.put(SystemConstants.PRESENT_TENSE + "true", activePresentList);
        modifiersMap.put(SystemConstants.NOT_EMPHASIZED_IMPERATIVE_TENSE + "true", imperativeList);
        modifiersMap.put(SystemConstants.EMPHASIZED_IMPERATIVE_TENSE + "true", imperativeList);
        modifiersMap.put(SystemConstants.PAST_TENSE + "false", passivePastList);
        modifiersMap.put(SystemConstants.PRESENT_TENSE + "false", passivePresentList);

        //����� ������ ������ ������
        activePastList.add(new sarf.verb.quadriliteral.modifier.vocalizer.nakes.active.PastVocalizer());

        //����� ������ ������ ������
        passivePastList.add(new sarf.verb.quadriliteral.modifier.vocalizer.nakes.passive.PastVocalizer());

        //����� ������� ������ ������
        activePresentList.add(new sarf.verb.quadriliteral.modifier.vocalizer.nakes.active.Present1Vocalizer());
        activePresentList.add(new sarf.verb.quadriliteral.modifier.vocalizer.nakes.active.Present2Vocalizer());


        //����� ������� ������ ������
        passivePresentList.add(new sarf.verb.quadriliteral.modifier.vocalizer.nakes.passive.PresentVocalizer());

        //����� �����
        imperativeList.add(new sarf.verb.quadriliteral.modifier.vocalizer.nakes.active.Imperative1Vocalizer());
        imperativeList.add(new sarf.verb.quadriliteral.modifier.vocalizer.nakes.active.Imperative2Vocalizer());
    }

    /**
     * ����� ������� ��� ������ ���� �� ����� �� ��� ������� �� ������
     * �� �� ���� �� ��� �� �������
     * @param tense String
     * @param active boolean
     * @param conjResult ConjugationResult
     */
    public void apply(String tense, boolean active, ConjugationResult conjResult) {
        List modifiers = (List) modifiersMap.get(tense+active);
        Iterator iter = modifiers.iterator();
        while (iter.hasNext()) {
            IQuadrilateralModifier modifier = (IQuadrilateralModifier) iter.next();
            if (modifier.isApplied(conjResult)) {
                ((SubstitutionsApplier)modifier).apply(conjResult.getFinalResult(), conjResult.getRoot());
                break;
            }
        }
    }

}
