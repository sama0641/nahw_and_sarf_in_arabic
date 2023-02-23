package sarf;

import java.util.*;
import sarf.*;
import sarf.util.ArabCharUtil;
import sarf.verb.trilateral.*;
import sarf.verb.trilateral.unaugmented.*;


public class PastConjugationDataContainer {
    //����� ����� ��� ����� ��� ��� �������
    private List dpa2List = new ArrayList(6);
    //�����  ����� ��� ����� ��� ���� �����
    private List lastDpaList = new ArrayList(13);
    //����� ����� ����� �������
    private List connectedPronounsList = new ArrayList(13);

    private static PastConjugationDataContainer instance = new PastConjugationDataContainer();

    public static PastConjugationDataContainer getInstance() {
        return instance;
    }

    private PastConjugationDataContainer() {
        //����� �����
        dpa2List.add(ArabCharUtil.FATHA);
        dpa2List.add(ArabCharUtil.FATHA);
        dpa2List.add(ArabCharUtil.FATHA);
        dpa2List.add(ArabCharUtil.KASRA);
        dpa2List.add(ArabCharUtil.DAMMA);
        dpa2List.add(ArabCharUtil.KASRA);

        lastDpaList.add(ArabCharUtil.SKOON);
        lastDpaList.add(ArabCharUtil.SKOON);
        lastDpaList.add(ArabCharUtil.SKOON);
        lastDpaList.add(ArabCharUtil.SKOON);
        lastDpaList.add(ArabCharUtil.SKOON);
        lastDpaList.add(ArabCharUtil.SKOON);
        lastDpaList.add(ArabCharUtil.SKOON);
        lastDpaList.add(ArabCharUtil.FATHA);
        lastDpaList.add(ArabCharUtil.FATHA);
        lastDpaList.add(ArabCharUtil.FATHA);
        lastDpaList.add(ArabCharUtil.FATHA);
        lastDpaList.add(ArabCharUtil.DAMMA);
        lastDpaList.add(ArabCharUtil.SKOON);

        connectedPronounsList.add("��");
        connectedPronounsList.add("���");
        connectedPronounsList.add("��");
        connectedPronounsList.add("��");
        connectedPronounsList.add("�����");
        connectedPronounsList.add("����");
        connectedPronounsList.add("�����");
        connectedPronounsList.add("");
        connectedPronounsList.add("��");
        connectedPronounsList.add("�");
        connectedPronounsList.add("���");
        connectedPronounsList.add("��");
        connectedPronounsList.add("��");
        connectedPronounsList.add("��");
    }

    /**
     * ������  ��� ���� ��� ����� ��� ��� ����� �����
     * @param root TripleVerb
     * @return String
     */
    public String getDpa2(UnaugmentedTrilateralRoot root) {
        //���� �� ����� ����� �������� ���� �� ������ ��� ��� �� ������� ���� �� ����� ��� ��� ����� ����
        return (String) dpa2List.get((Integer.parseInt(root.getConjugation())-1));
    }

    /**
     *  ������  ���  ���� ��� ����� ��� ������
     * @param pronounIndex int
     * @return String
     */
    public String getLastDpa(int pronounIndex) {
        return (String) lastDpaList.get(pronounIndex);
    }

    /**
     *������ ��� ����� ����� �������
     * @param pronounIndex int
     * @return String
     */
    public String getConnectedPronoun(int pronounIndex) {
        return (String) connectedPronounsList.get(pronounIndex);
    }

}
