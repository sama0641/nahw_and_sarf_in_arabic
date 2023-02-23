package sarf.verb.quadriliteral.unaugmented.active;

import sarf.*;
import sarf.util.ArabCharUtil;
import sarf.verb.quadriliteral.*;
import sarf.verb.quadriliteral.unaugmented.*;



public class ActivePastVerb {
    private UnaugmentedQuadriliteralRoot root;

    //���� ��� ����� ��� ������
    private String lastDpa;

    //���� ����� ������
    private String connectedPronoun;

    public ActivePastVerb(UnaugmentedQuadriliteralRoot root, String lastDpa, String connectedPronoun) {
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
        return root.getC1()+ArabCharUtil.FATHA+root.getC2()+ArabCharUtil.SKOON+root.getC3()+ArabCharUtil.FATHA+root.getC4()+lastDpa+connectedPronoun;
    }

}
