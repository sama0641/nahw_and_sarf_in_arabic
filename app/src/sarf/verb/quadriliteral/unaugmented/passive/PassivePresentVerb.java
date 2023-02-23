package sarf.verb.quadriliteral.unaugmented.passive;

import sarf.verb.quadriliteral.*;
import sarf.util.*;
import sarf.verb.quadriliteral.unaugmented.*;



public class PassivePresentVerb {
    private UnaugmentedQuadriliteralRoot root;

    //��� �������
    private String cp;

    //���� ��� ����� ��� ������
    private String lastDpr;

    //������ ������� ������ ����� ��� ������
    private String connectedPronoun;

    public PassivePresentVerb(UnaugmentedQuadriliteralRoot root, String cp, String lastDpr, String connectedPronoun) {
        this.root = root;
        this.cp = cp;
        this.lastDpr = lastDpr;
        this.connectedPronoun = connectedPronoun;
    }

    public String getConnectedPronoun() {
        return connectedPronoun;
    }

    public UnaugmentedQuadriliteralRoot getRoot() {
        return root;
    }

    public String getlastDpr() {
        return lastDpr;
    }

    public String getCp() {
        return cp;
    }

    public String toString() {
        return cp+ArabCharUtil.DAMMA+root.getC1()+ArabCharUtil.FATHA+root.getC2()+ArabCharUtil.SKOON+root.getC3()+ArabCharUtil.FATHA+root.getC4()+lastDpr+connectedPronoun;
    }

}
