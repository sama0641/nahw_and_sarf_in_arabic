package sarf.noun;

import java.util.*;


public class GenericNounSuffixContainer implements INounSuffixContainer{
    private static GenericNounSuffixContainer instance = new GenericNounSuffixContainer();
    //���� ������
    private ArrayList indefiniteSuffixList = new ArrayList(18);
    //���� �������
    private ArrayList definiteSuffixList = new ArrayList(18);
    //���� �������
    private ArrayList annexedSuffixList = new ArrayList(18);

    //���� ��� ���� ����� ���� ������ �� �����
    private String prefix = "";
    //���� ������� �������� ����� ������
    private ArrayList currentSuffixList = indefiniteSuffixList ;

    private GenericNounSuffixContainer() {
        indefiniteSuffixList.add("�");
        indefiniteSuffixList.add("���");
        indefiniteSuffixList.add("����");
        indefiniteSuffixList.add("������");
        indefiniteSuffixList.add("����");
        indefiniteSuffixList.add("����");
        indefiniteSuffixList.add("��");
        indefiniteSuffixList.add("���");
        indefiniteSuffixList.add("�����");
        indefiniteSuffixList.add("�������");
        indefiniteSuffixList.add("����");
        indefiniteSuffixList.add("����");
        indefiniteSuffixList.add("�");
        indefiniteSuffixList.add("���");
        indefiniteSuffixList.add("�����");
        indefiniteSuffixList.add("�������");
        indefiniteSuffixList.add("����");
        indefiniteSuffixList.add("����");

        definiteSuffixList.add("�");
        definiteSuffixList.add("���");
        definiteSuffixList.add("����");
        definiteSuffixList.add("������");
        definiteSuffixList.add("����");
        definiteSuffixList.add("����");
        definiteSuffixList.add("�");
        definiteSuffixList.add("���");
        definiteSuffixList.add("�����");
        definiteSuffixList.add("�������");
        definiteSuffixList.add("����");
        definiteSuffixList.add("����");
        definiteSuffixList.add("�");
        definiteSuffixList.add("���");
        definiteSuffixList.add("�����");
        definiteSuffixList.add("�������");
        definiteSuffixList.add("����");
        definiteSuffixList.add("����");


        annexedSuffixList.add("�");
        annexedSuffixList.add("���");
        annexedSuffixList.add("��");
        annexedSuffixList.add("����");
        annexedSuffixList.add("��");
        annexedSuffixList.add("����");
        annexedSuffixList.add("�");
        annexedSuffixList.add("���");
        annexedSuffixList.add("���");
        annexedSuffixList.add("�����");
        annexedSuffixList.add("��");
        annexedSuffixList.add("����");
        annexedSuffixList.add("�");
        annexedSuffixList.add("���");
        annexedSuffixList.add("���");
        annexedSuffixList.add("�����");
        annexedSuffixList.add("��");
        annexedSuffixList.add("����");

    }

    public void selectDefiniteMode() {
        prefix = "��";
        currentSuffixList = definiteSuffixList;
    }

    public void selectInDefiniteMode() {
        prefix = "";
        currentSuffixList = indefiniteSuffixList;
    }

    public void selectAnnexedMode() {
        prefix = "";
        currentSuffixList = annexedSuffixList;
    }

    public static GenericNounSuffixContainer getInstance() {
        return instance;
    }

    public String getPrefix() {
        return prefix;
    }

    public String get(int index) {
        return (String) currentSuffixList.get(index);
    }

    public boolean isInDefiniteMode() {
        return currentSuffixList == indefiniteSuffixList;
    }

}
