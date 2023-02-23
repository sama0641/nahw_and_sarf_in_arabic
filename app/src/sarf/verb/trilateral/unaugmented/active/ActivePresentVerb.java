package sarf.verb.trilateral.unaugmented.active;

import sarf.util.*;
import sarf.verb.trilateral.unaugmented.*;



public class ActivePresentVerb {
    private UnaugmentedTrilateralRoot root;

    //��� �������
    private String cp;

    //���� ��� ������� ��� �������  ����
    private static final String vcp = ArabCharUtil.FATHA;

    //���� ��� ����� ��� ������ ����� ����
    private static final String dpr1 = ArabCharUtil.SKOON;

    //���� ��� ����� ��� ��� �������
    private String dpr2;

    //���� ��� ����� ��� ������
    private String lastDpr;

    //������ ������� ������ ����� ��� ������
    private String connectedPronoun;

    public ActivePresentVerb(UnaugmentedTrilateralRoot root, String cp, String dpr2, String lastDpr, String connectedPronoun) {
        this.root = root;
        this.cp = cp;
        this.dpr2 = dpr2;
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
