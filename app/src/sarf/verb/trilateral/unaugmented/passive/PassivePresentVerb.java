package sarf.verb.trilateral.unaugmented.passive;

import sarf.util.*;
import sarf.verb.trilateral.unaugmented.*;



public class PassivePresentVerb {
    private UnaugmentedTrilateralRoot root;

    //��� �������
    private String cp;

    //���� ��� ������� ��� ������� ���
    private static final String vcp = ArabCharUtil.DAMMA;

    //���� ��� ����� ��� ������ ����� ����
    private static final String dpr1 = ArabCharUtil.SKOON;

    //���� ��� ����� ��� ������ ����� ����
    private static final String dpr2 = ArabCharUtil.FATHA;

    //���� ��� ����� ��� ������
    private String lastDpr;

    //������ ������� ������ ����� ��� ������
    private String connectedPronoun;

    public PassivePresentVerb(UnaugmentedTrilateralRoot root, String cp, String lastDpr, String connectedPronoun) {
        this.root = root;
        this.cp = cp;
        this.lastDpr = lastDpr;
        this.connectedPronoun = connectedPronoun;
    }

    public String getConnectedPronoun() {
        return connectedPronoun;
    }

    public String getdpr2() {
        return dpr2;
    }

    public UnaugmentedTrilateralRoot getRoot() {
        return root;
    }

    public String getlastDpr() {
        return lastDpr;
    }

    public String getCp() {
        return cp;
    }

    public String toString() {
        return cp+vcp+root.getC1()+dpr1+root.getC2()+dpr2+root.getC3()+lastDpr+connectedPronoun;
    }

}
