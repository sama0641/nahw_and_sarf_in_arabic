package sarf;

import java.util.*;

import sarf.util.*;
import sarf.verb.trilateral.*;
import sarf.verb.trilateral.unaugmented.*;


public class PresentConjugationDataContainer {
    //���� �������� ��� ������
    private List cpList = new ArrayList(13);
    //����� ����� ��� ����� ��� ��� �������
    private List dpr2List = new ArrayList(6);

    //�����  ����� ��� ����� ��� ���� �����
    //�����
    private List nominativeLastDprList = new ArrayList(13);
    //�����
    private List accusativeLastDprList = new ArrayList(13);
    //�����
    private List jussiveLastDprList = new ArrayList(13);
    //����
    private List emphasizedLastDprList = new ArrayList(13);

    //����� ����� ����� �������
    //�����
    private List nominativeConnectedPronounList = new ArrayList(13);
    //�����
    private List accusativeConnectedPronounList = new ArrayList(13);
    //�����
    private List jussiveConnectedPronounList = new ArrayList(13);
    //����
    private List emphasizedConnectedPronounList = new ArrayList(13);

    private static PresentConjugationDataContainer instance = new PresentConjugationDataContainer();

    public static PresentConjugationDataContainer getInstance() {
        return instance;
    }

    public List getNominativeLastDprList() {
        return nominativeLastDprList;
    }

    public List getNominativeConnectedPronounList() {
        return nominativeConnectedPronounList;
    }

    public List getEmphasizedLastDprList() {
        return emphasizedLastDprList;
    }

    public List getEmphasizedConnectedPronounList() {
        return emphasizedConnectedPronounList;
    }

    public List getJussiveLastDprList() {
        return jussiveLastDprList;
    }

    public List getJussiveConnectedPronounList() {
        return jussiveConnectedPronounList;
    }

    public List getAccusativeLastDprList() {
        return accusativeLastDprList;
    }

    public List getAccusativeConnectedPronounList() {
        return accusativeConnectedPronounList;
    }

    private PresentConjugationDataContainer() {
        //����� �����
        dpr2List.add(ArabCharUtil.DAMMA);
        dpr2List.add(ArabCharUtil.KASRA);
        dpr2List.add(ArabCharUtil.FATHA);
        dpr2List.add(ArabCharUtil.FATHA);
        dpr2List.add(ArabCharUtil.DAMMA);
        dpr2List.add(ArabCharUtil.KASRA);

        cpList.add("�");
        cpList.add("�");
        cpList.add("�");
        cpList.add("�");
        cpList.add("�");
        cpList.add("�");
        cpList.add("�");
        cpList.add("�");
        cpList.add("�");
        cpList.add("�");
        cpList.add("�");
        cpList.add("�");
        cpList.add("�");

        nominativeLastDprList.add(ArabCharUtil.DAMMA);
        nominativeLastDprList.add(ArabCharUtil.DAMMA);
        nominativeLastDprList.add(ArabCharUtil.DAMMA);
        nominativeLastDprList.add(ArabCharUtil.KASRA);
        nominativeLastDprList.add(ArabCharUtil.FATHA);
        nominativeLastDprList.add(ArabCharUtil.DAMMA);
        nominativeLastDprList.add(ArabCharUtil.SKOON);
        nominativeLastDprList.add(ArabCharUtil.DAMMA);
        nominativeLastDprList.add(ArabCharUtil.DAMMA);
        nominativeLastDprList.add(ArabCharUtil.FATHA);
        nominativeLastDprList.add(ArabCharUtil.FATHA);
        nominativeLastDprList.add(ArabCharUtil.DAMMA);
        nominativeLastDprList.add(ArabCharUtil.SKOON);

        nominativeConnectedPronounList.add("");
        nominativeConnectedPronounList.add("");
        nominativeConnectedPronounList.add("");
        nominativeConnectedPronounList.add("���");
        nominativeConnectedPronounList.add("���");
        nominativeConnectedPronounList.add("���");
        nominativeConnectedPronounList.add("��");
        nominativeConnectedPronounList.add("");
        nominativeConnectedPronounList.add("");
        nominativeConnectedPronounList.add("���");
        nominativeConnectedPronounList.add("���");
        nominativeConnectedPronounList.add("���");
        nominativeConnectedPronounList.add("��");

        accusativeLastDprList.add(ArabCharUtil.FATHA);
        accusativeLastDprList.add(ArabCharUtil.FATHA);
        accusativeLastDprList.add(ArabCharUtil.FATHA);
        accusativeLastDprList.add(ArabCharUtil.KASRA);
        accusativeLastDprList.add(ArabCharUtil.FATHA);
        accusativeLastDprList.add(ArabCharUtil.DAMMA);
        accusativeLastDprList.add(ArabCharUtil.SKOON);
        accusativeLastDprList.add(ArabCharUtil.FATHA);
        accusativeLastDprList.add(ArabCharUtil.FATHA);
        accusativeLastDprList.add(ArabCharUtil.FATHA);
        accusativeLastDprList.add(ArabCharUtil.FATHA);
        accusativeLastDprList.add(ArabCharUtil.DAMMA);
        accusativeLastDprList.add(ArabCharUtil.SKOON);

        accusativeConnectedPronounList.add("");
        accusativeConnectedPronounList.add("");
        accusativeConnectedPronounList.add("");
        accusativeConnectedPronounList.add("�");
        accusativeConnectedPronounList.add("�");
        accusativeConnectedPronounList.add("��");
        accusativeConnectedPronounList.add("��");
        accusativeConnectedPronounList.add("");
        accusativeConnectedPronounList.add("");
        accusativeConnectedPronounList.add("�");
        accusativeConnectedPronounList.add("�");
        accusativeConnectedPronounList.add("��");
        accusativeConnectedPronounList.add("��");

        jussiveLastDprList.add(ArabCharUtil.SKOON);
        jussiveLastDprList.add(ArabCharUtil.SKOON);
        jussiveLastDprList.add(ArabCharUtil.SKOON);
        jussiveLastDprList.add(ArabCharUtil.KASRA);
        jussiveLastDprList.add(ArabCharUtil.FATHA);
        jussiveLastDprList.add(ArabCharUtil.DAMMA);
        jussiveLastDprList.add(ArabCharUtil.SKOON);
        jussiveLastDprList.add(ArabCharUtil.SKOON);
        jussiveLastDprList.add(ArabCharUtil.SKOON);
        jussiveLastDprList.add(ArabCharUtil.FATHA);
        jussiveLastDprList.add(ArabCharUtil.FATHA);
        jussiveLastDprList.add(ArabCharUtil.DAMMA);
        jussiveLastDprList.add(ArabCharUtil.SKOON);

        jussiveConnectedPronounList.add("");
        jussiveConnectedPronounList.add("");
        jussiveConnectedPronounList.add("");
        jussiveConnectedPronounList.add("�");
        jussiveConnectedPronounList.add("�");
        jussiveConnectedPronounList.add("��");
        jussiveConnectedPronounList.add("��");
        jussiveConnectedPronounList.add("");
        jussiveConnectedPronounList.add("");
        jussiveConnectedPronounList.add("�");
        jussiveConnectedPronounList.add("�");
        jussiveConnectedPronounList.add("��");
        jussiveConnectedPronounList.add("��");

        emphasizedLastDprList.add(ArabCharUtil.FATHA);
        emphasizedLastDprList.add(ArabCharUtil.FATHA);
        emphasizedLastDprList.add(ArabCharUtil.FATHA);
        emphasizedLastDprList.add(ArabCharUtil.KASRA);
        emphasizedLastDprList.add(ArabCharUtil.FATHA);
        emphasizedLastDprList.add(ArabCharUtil.DAMMA);
        emphasizedLastDprList.add(ArabCharUtil.SKOON);
        emphasizedLastDprList.add(ArabCharUtil.FATHA);
        emphasizedLastDprList.add(ArabCharUtil.FATHA);
        emphasizedLastDprList.add(ArabCharUtil.FATHA);
        emphasizedLastDprList.add(ArabCharUtil.FATHA);
        emphasizedLastDprList.add(ArabCharUtil.DAMMA);
        emphasizedLastDprList.add(ArabCharUtil.SKOON);

        emphasizedConnectedPronounList.add("���");
        emphasizedConnectedPronounList.add("���");
        emphasizedConnectedPronounList.add("���");
        emphasizedConnectedPronounList.add("���");
        emphasizedConnectedPronounList.add("����");
        emphasizedConnectedPronounList.add("���");
        emphasizedConnectedPronounList.add("������");
        emphasizedConnectedPronounList.add("���");
        emphasizedConnectedPronounList.add("���");
        emphasizedConnectedPronounList.add("����");
        emphasizedConnectedPronounList.add("����");
        emphasizedConnectedPronounList.add("���");
        emphasizedConnectedPronounList.add("������");
    }

    /**
     * ������  ��� ���� ��� ����� ��� ��� ����� �����
     * @param root TripleVerb
     * @return String
     */
    public String getDpr2(UnaugmentedTrilateralRoot root) {
        //���� �� ����� ����� �������� ���� �� ������ ��� ��� �� ������� ���� �� ����� ��� ��� ����� ����
        return (String) dpr2List.get((Integer.parseInt(root.getConjugation()) - 1));
    }


    /**
     * ������  ��� ��� ������� ��� ������
     * @param pronounIndex int
     * @return String
     */
    public String getCp(int pronounIndex) {
        return (String) cpList.get(pronounIndex);
    }
}
