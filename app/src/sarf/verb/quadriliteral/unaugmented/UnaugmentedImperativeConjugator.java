package sarf.verb.quadriliteral.unaugmented;

import java.util.*;

import sarf.*;


public class UnaugmentedImperativeConjugator {

    private static UnaugmentedImperativeConjugator instance = new UnaugmentedImperativeConjugator();

    public static UnaugmentedImperativeConjugator getInstance() {
        return instance;
    }

    private UnaugmentedImperativeConjugator() {
    }

    /**
     * ����� ���� ����� ����� ��� ������
     * @param pronounIndex int
     * @param root QuadriliteralVerb
     * @return PresentConjugation
     */
    public ImperativeVerb createVerb(int pronounIndex, UnaugmentedQuadriliteralRoot root) {
        String lastDim = ImperativeConjugationDataContainer.getInstance().getLastDim(pronounIndex);
        String connectedPronoun = ImperativeConjugationDataContainer.getInstance().getConnectedPronoun(pronounIndex);
        if (lastDim == "" && connectedPronoun == "") return null;

        return new ImperativeVerb(root, lastDim, connectedPronoun);
    }

    /**
     * ����� ���� ����� �����  ������
     * @param pronounIndex int
     * @param root QuadriliteralVerb
     * @return PresentConjugation
     */
    public ImperativeVerb createEmphasizedVerb(int pronounIndex, UnaugmentedQuadriliteralRoot root) {
        String lastDim = ImperativeConjugationDataContainer.getInstance().getEmphasizedLastDim(pronounIndex);
        String connectedPronoun = ImperativeConjugationDataContainer.getInstance().getEmphasizedConnectedPronoun(pronounIndex);
        if (lastDim == "" && connectedPronoun == "") return null;

        return new ImperativeVerb(root, lastDim, connectedPronoun);
    }



    /**
     * ����� ����� ����� ��� ��� ����� ����� ��� �������
     * ����� ��� ������
     * @param root TripleVerb
     * @return List
     */
    public List createVerbList(UnaugmentedQuadriliteralRoot root) {
        List result = new LinkedList();
        for (int i = 0; i < 13; i++) {
            ImperativeVerb conj = createVerb(i, root);
            result.add(conj);
        }

        return result;
    }

    /**
    * ����� ����� ����� ��� ��� ����� ����� ��� �������
    * �����  ������
    * @param root TripleVerb
    * @return List
    */
   public List createEmphasizedVerbList(UnaugmentedQuadriliteralRoot root) {
       List result = new LinkedList();
       for (int i = 0; i < 13; i++) {
           ImperativeVerb conj = createEmphasizedVerb(i, root);
           result.add(conj);
       }

       return result;
   }


}
