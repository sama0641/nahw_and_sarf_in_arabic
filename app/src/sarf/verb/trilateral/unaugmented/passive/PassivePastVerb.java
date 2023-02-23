package sarf.verb.trilateral.unaugmented.passive;

import sarf.util.ArabCharUtil;
import sarf.verb.trilateral.unaugmented.*;


public class PassivePastVerb {
    private UnaugmentedTrilateralRoot root;

    //���� ��� ����� ��� ������  ���
    private static final String dpa1 = ArabCharUtil.DAMMA;

    //���� ��� ����� ��� ������ ����
    private static final String dpa2 = ArabCharUtil.KASRA;

    //���� ��� ����� ��� ������
    private String lastDpa;

    //������ ������� ������ ����� ��� ������
    private String connectedPronoun;

    public PassivePastVerb(UnaugmentedTrilateralRoot root, String lastDpa, String connectedPronoun) {
        this.root = root;
        this.lastDpa = lastDpa;
        this.connectedPronoun = connectedPronoun;
    }

    public String getConnectedPronoun() {
        return connectedPronoun;
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
