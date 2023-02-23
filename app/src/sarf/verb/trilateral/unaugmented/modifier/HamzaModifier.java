package sarf.verb.trilateral.unaugmented.modifier;

import sarf.verb.trilateral.Substitution.SubstitutionsApplier;
import java.util.Map;
import java.util.HashMap;
import sarf.verb.trilateral.unaugmented.ConjugationResult;
import sarf.SystemConstants;
import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;


public class HamzaModifier {
    private Map modifiersMap = new HashMap();

    public HamzaModifier() {
        List activePastList = new LinkedList();
        List passivePastList = new LinkedList();
        List activePresentList = new LinkedList();
        List passivePresentList = new LinkedList();
        List imperativeList = new LinkedList();
        List emphasizedImperativeList = new LinkedList();

        //��� �����  ������  ������� ������� ������� ������ �� ������ �������� ������
        modifiersMap.put(SystemConstants.PAST_TENSE + "true", activePastList);
        modifiersMap.put(SystemConstants.PRESENT_TENSE + "true", activePresentList);
        modifiersMap.put(SystemConstants.NOT_EMPHASIZED_IMPERATIVE_TENSE + "true", imperativeList);
        modifiersMap.put(SystemConstants.EMPHASIZED_IMPERATIVE_TENSE + "true", emphasizedImperativeList);
        modifiersMap.put(SystemConstants.PAST_TENSE + "false", passivePastList);
        modifiersMap.put(SystemConstants.PRESENT_TENSE + "false", passivePresentList);

        //����� ������ ������ ������
        activePastList.add(new sarf.verb.trilateral.unaugmented.modifier.hamza.ein.ActivePastMahmouz());
        activePastList.add(new sarf.verb.trilateral.unaugmented.modifier.hamza.faa.ActivePastMahmouz());
        activePastList.add(new sarf.verb.trilateral.unaugmented.modifier.hamza.lam.ActivePastMahmouz());

        //����� ������ ������ ������
        passivePastList.add(new sarf.verb.trilateral.unaugmented.modifier.hamza.ein.PassivePastMahmouz());
        passivePastList.add(new sarf.verb.trilateral.unaugmented.modifier.hamza.faa.PassivePastMahmouz());
        passivePastList.add(new sarf.verb.trilateral.unaugmented.modifier.hamza.lam.PassivePastMahmouz());


        //����� ������� ������ ������
        activePresentList.add(new sarf.verb.trilateral.unaugmented.modifier.hamza.ein.RaaPresentMahmouz());
        activePresentList.add(new sarf.verb.trilateral.unaugmented.modifier.hamza.ein.ActivePresentMahmouz());
        activePresentList.add(new sarf.verb.trilateral.unaugmented.modifier.hamza.faa.ActivePresentMahmouz());
        activePresentList.add(new sarf.verb.trilateral.unaugmented.modifier.hamza.lam.ActivePresentMahmouz());

        //����� ������� ������ ������
        passivePresentList.add(new sarf.verb.trilateral.unaugmented.modifier.hamza.ein.RaaPresentMahmouz());
        passivePresentList.add(new sarf.verb.trilateral.unaugmented.modifier.hamza.ein.PassivePresentMahmouz());
        passivePresentList.add(new sarf.verb.trilateral.unaugmented.modifier.hamza.faa.PassivePresentMahmouz());
        passivePresentList.add(new sarf.verb.trilateral.unaugmented.modifier.hamza.lam.PassivePresentMahmouz());

        //����� �����
        //��� ������� ������ �����
        imperativeList.add(new sarf.verb.trilateral.unaugmented.modifier.hamza.ein.RaaImperativeMahmouz());
        imperativeList.add(new sarf.verb.trilateral.unaugmented.modifier.hamza.faa.SpecialImperativeMahmouz1());
        imperativeList.add(new sarf.verb.trilateral.unaugmented.modifier.hamza.faa.SpecialImperativeMahmouz2());
        imperativeList.add(new sarf.verb.trilateral.unaugmented.modifier.hamza.ein.SpecialImperativeMahmouz());
        imperativeList.add(new sarf.verb.trilateral.unaugmented.modifier.hamza.ein.ImperativeMahmouz());
        imperativeList.add(new sarf.verb.trilateral.unaugmented.modifier.hamza.faa.ImperativeMahmouz());
        imperativeList.add(new sarf.verb.trilateral.unaugmented.modifier.hamza.lam.ImperativeMahmouz());

        //����� ����� ������
        emphasizedImperativeList.add(imperativeList.get(0));
        emphasizedImperativeList.add(new sarf.verb.trilateral.unaugmented.modifier.hamza.faa.SpecialEmphsizedImperativeMahmouz1());
        emphasizedImperativeList.add(new sarf.verb.trilateral.unaugmented.modifier.hamza.faa.SpecialEmphsizedImperativeMahmouz2());
        emphasizedImperativeList.add(new sarf.verb.trilateral.unaugmented.modifier.hamza.ein.SpecialEmphsizedImperativeMahmouz());
        emphasizedImperativeList.add(imperativeList.get(4));
        emphasizedImperativeList.add(imperativeList.get(5));
        emphasizedImperativeList.add(imperativeList.get(6));
    }

    /**
     * ����� �����  ������ ��� ������ ���� �� ����� �� ��� ������� �� ������
     * �� �� ���� �� ���
     * @param tense String
     * @param active boolean
     * @param conjResult ConjugationResult
     */
    public void apply(String tense, boolean active, ConjugationResult conjResult) {
        List modifiers = (List) modifiersMap.get(tense+active);
        Iterator iter = modifiers.iterator();
        while (iter.hasNext()) {
            IUnaugmentedTrilateralModifier modifier = (IUnaugmentedTrilateralModifier) iter.next();
            if (modifier.isApplied(conjResult)) {
                ((SubstitutionsApplier)modifier).apply(conjResult.getFinalResult(), conjResult.getRoot());
                break;
            }
        }
    }

}
