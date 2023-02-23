package sarf.verb.quadriliteral.unaugmented.passive;

import sarf.verb.quadriliteral.*;
import sarf.util.*;
import sarf.verb.quadriliteral.unaugmented.*;


public class PassivePastVerb {
    private UnaugmentedQuadriliteralRoot root;


    //���� ��� ����� ��� ������
    private String lastDpa;

    //������ ������� ������ ����� ��� ������
    private String connectedPronoun;

    public PassivePastVerb(UnaugmentedQuadriliteralRoot root, String lastDpa, String connectedPronoun) {
        this.root = root;
        this.lastDpa = lastDpa;
        this.connectedPronoun = connectedPronoun;
    }

    public String getConnectedPronoun() {
        return connectedPronoun;
    }

    public UnaugmentedQuadriliteralRoot getRoot() {
        return root;
    }

    public String getLastDpa() {
        return lastDpa;
    }

    public String toString() {
        return root.getC1()+ArabCharUtil.DAMMA+root.getC2()+ArabCharUtil.SKOON+root.getC3()+ArabCharUtil.KASRA+root.getC4()+lastDpa+connectedPronoun;
    }

}
