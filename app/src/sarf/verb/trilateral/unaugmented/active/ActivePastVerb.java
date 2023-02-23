package sarf.verb.trilateral.unaugmented.active;

import sarf.*;
import sarf.util.ArabCharUtil;
import sarf.verb.trilateral.unaugmented.*;



public class ActivePastVerb {
    private UnaugmentedTrilateralRoot root;

    //���� ��� ����� ��� ������ ������
    private static final String dpa1 = ArabCharUtil.FATHA;

    //���� ��� ����� ��� ��� �������
    private String dpa2;

    //���� ��� ����� ��� ������
    private String lastDpa;

    //���� ����� ������
    private String connectedPronoun;

    public ActivePastVerb(UnaugmentedTrilateralRoot root, String dpa2, String lastDpa, String connectedPronoun) {
        this.root = root;
        this.dpa2 = dpa2;
        this.lastDpa = lastDpa;
        this.connectedPronoun = connectedPronoun;
    }

    public String getConnectedPronoun() {
        return connectedPronoun;
    }

    public String getDpa2() {
        return dpa2;
    }

    public UnaugmentedTrilateralRoot getRoot() {
        return root;
    }

    public String getLastDpa() {
        return lastDpa;
    }

    public String toString() {
        return root.getC1()+dpa1+root.getC2()+dpa2+root.getC3()+lastDpa+connectedPronoun;
    }

}
