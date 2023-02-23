package sarf.verb.quadriliteral.unaugmented.passive;

import java.util.*;

import sarf.*;
import sarf.verb.quadriliteral.*;
import sarf.verb.quadriliteral.unaugmented.*;


public class PassivePastConjugator {
    private PassivePastConjugator() {
    }

    private static PassivePastConjugator instance = new PassivePastConjugator();

    public static PassivePastConjugator getInstance() {
        return instance;
    }

    /**
     *  ����� ����� ��� ������
     * @param pronounIndex int
     * @param root TripleVerb
     * @return PassivePastVerb
     */
    public PassivePastVerb createVerb(int pronounIndex, UnaugmentedQuadriliteralRoot root) {
        //	����� �� �� ��� ��� ������� ������
        if (root.getTransitive().equals("�") && pronounIndex != 7 && pronounIndex != 8) {
            return null;
        }

        String lastDpa = PastConjugationDataContainer.getInstance().getLastDpa(pronounIndex);
        String connectedPronoun = PastConjugationDataContainer.getInstance().getConnectedPronoun(pronounIndex);
        return new PassivePastVerb(root, lastDpa, connectedPronoun);
    }

    /**
     *  �����  ����� ����� ������� �� ������� ������� ���
     * @param root TripleVerb
     * @return List
     */
    public List createVerbList(UnaugmentedQuadriliteralRoot root) {
        List result = new LinkedList();
        for (int i = 0; i < 13; i++) {
            result.add(createVerb(i, root));
        }

        return result;
    }

}
