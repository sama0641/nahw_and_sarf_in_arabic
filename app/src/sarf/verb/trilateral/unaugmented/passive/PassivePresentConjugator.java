package sarf.verb.trilateral.unaugmented.passive;

import java.util.List;
import java.util.LinkedList;
import sarf.verb.trilateral.unaugmented.*;
import sarf.PresentConjugationDataContainer;


public class PassivePresentConjugator {
    private PassivePresentConjugator() {
    }

    private static PassivePresentConjugator instance = new PassivePresentConjugator();

    public static PassivePresentConjugator getInstance() {
        return instance;
    }

    /**
     * ����� ����� ������� ��� ����� �� ����� ���������
     * @param pronounIndex int
     * @param root UnaugmentedTrilateralRoot
     * @param lastDprList List
     * @param connectedPronounList List
     * @return PassivePresentVerb
     */
    private PassivePresentVerb createVerb(int pronounIndex, UnaugmentedTrilateralRoot root, List lastDprList, List connectedPronounList) {
        //	����� �� �� ��� ��� ������� ������
        if (root.getTransitive().equals("�") && pronounIndex != 7 && pronounIndex != 8) {
            return null;
        }

        String cp = PresentConjugationDataContainer.getInstance().getCp(pronounIndex);
        String lastDpr = (String) lastDprList.get(pronounIndex);
        String connectedPronoun = (String) connectedPronounList.get(pronounIndex);
        return new PassivePresentVerb(root, cp, lastDpr, connectedPronoun);
    }


    /**
     * ����� ����� ������� �� ���� �����
     * @param pronounIndex int
     * @param root TrilateralVerb
     * @return PresentConjugation
     */
    public PassivePresentVerb createNominativeVerb(int pronounIndex, UnaugmentedTrilateralRoot root) {
        return createVerb(pronounIndex, root, PresentConjugationDataContainer.getInstance().getNominativeLastDprList(), PresentConjugationDataContainer.getInstance().getNominativeConnectedPronounList());
    }


    /**
     * ����� ����� ������� �� ���� �����
     * @param pronounIndex int
     * @param root TrilateralVerb
     * @return PresentConjugation
     */
    public PassivePresentVerb createAccusativeVerb(int pronounIndex, UnaugmentedTrilateralRoot root) {
        return createVerb(pronounIndex, root, PresentConjugationDataContainer.getInstance().getAccusativeLastDprList(), PresentConjugationDataContainer.getInstance().getAccusativeConnectedPronounList());
    }


    /**
     * ����� ����� ������� �� ���� �����
     * @param pronounIndex int
     * @param root TrilateralVerb
     * @return PresentConjugation
     */
    public PassivePresentVerb createJussiveVerb(int pronounIndex, UnaugmentedTrilateralRoot root) {
        return createVerb(pronounIndex, root, PresentConjugationDataContainer.getInstance().getJussiveLastDprList(), PresentConjugationDataContainer.getInstance().getJussiveConnectedPronounList());
    }


    /**
     * ����� ����� ������� �� ���� �������
     * @param pronounIndex int
     * @param root TrilateralVerb
     * @return PresentConjugation
     */
    public PassivePresentVerb createEmphasizedVerb(int pronounIndex, UnaugmentedTrilateralRoot root) {
        return createVerb(pronounIndex, root, PresentConjugationDataContainer.getInstance().getEmphasizedLastDprList(), PresentConjugationDataContainer.getInstance().getEmphasizedConnectedPronounList());
    }

    /**
     * ����� ����� ����� ������� ��� �������
     * �� ���� �����
     * @param root TripleVerb
     * @return List
     */
    public List createNominativeVerbList(UnaugmentedTrilateralRoot root) {
        List result = new LinkedList();
        for (int i = 0; i < 13; i++) {
            result.add(createNominativeVerb(i, root));
        }

        return result;
    }

    /**
     * ����� ����� ����� ������� ��� �������
     * �� ���� �����
     * @param root TripleVerb
     * @return List
     */
    public List createAccusativeVerbList(UnaugmentedTrilateralRoot root) {
        List result = new LinkedList();
        for (int i = 0; i < 13; i++) {
            result.add(createAccusativeVerb(i, root));
        }

        return result;
    }

    /**
     * ����� ����� ����� ������� ��� �������
     * �� ���� �����
     * @param root TripleVerb
     * @return List
     */
    public List createJussiveVerbList(UnaugmentedTrilateralRoot root) {
        List result = new LinkedList();
        for (int i = 0; i < 13; i++) {
            result.add(createJussiveVerb(i, root));
        }

        return result;
    }


    /**
     * ����� ����� ����� ������� ��� �������
     * �� ���� �������
     * @param root TripleVerb
     * @return List
     */
    public List createEmphasizedVerbList(UnaugmentedTrilateralRoot root) {
        List result = new LinkedList();
        for (int i = 0; i < 13; i++) {
            result.add(createEmphasizedVerb(i, root));
        }

        return result;
    }

}
