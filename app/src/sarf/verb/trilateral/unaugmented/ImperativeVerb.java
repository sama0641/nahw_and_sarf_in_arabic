package sarf.verb.trilateral.unaugmented;

import sarf.util.*;



public class ImperativeVerb {
    private UnaugmentedTrilateralRoot root;

    //��� �����
    private final static String ci = "�";

    //���� ��� ����� ��� ������ ������
    private static final String dim1 = ArabCharUtil.SKOON;

    //���� ��� ����� ��� ��� �������
    //��� ����� �� �������
    private String dpr2;

    //���� ��� ����� ��� ������
    private String lastDim;

    //���� ����� ������
    private String connectedPronoun;

    public ImperativeVerb(UnaugmentedTrilateralRoot root, String dpr2, String lastDim, String connectedPronoun) {
        this.root = root;
        this.dpr2 = dpr2;
        this.lastDim = lastDim;
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

    public String getlastDim() {
        return lastDim;
    }

    public String getCi() {
        return ci;
    }

    public String toString() {
        return ci+root.getC1()+dim1+root.getC2()+dpr2+root.getC3()+lastDim+connectedPronoun;
    }

}
