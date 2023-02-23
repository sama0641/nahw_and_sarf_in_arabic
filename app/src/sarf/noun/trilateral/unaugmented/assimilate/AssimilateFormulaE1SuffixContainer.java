package sarf.noun.trilateral.unaugmented.assimilate;

import java.util.*;

import sarf.noun.*;


public class AssimilateFormulaE1SuffixContainer implements INounSuffixContainer{
    private static AssimilateFormulaE1SuffixContainer instance = new AssimilateFormulaE1SuffixContainer();
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

    private AssimilateFormulaE1SuffixContainer() {
        indefiniteSuffixList.add("�");
        indefiniteSuffixList.add("� ��");
        indefiniteSuffixList.add("� ���");
        indefiniteSuffixList.add("� �����");
        indefiniteSuffixList.add("");
        indefiniteSuffixList.add("");
        indefiniteSuffixList.add("�");
        indefiniteSuffixList.add("� ��");
        indefiniteSuffixList.add("� ����");
        indefiniteSuffixList.add("� ������");
        indefiniteSuffixList.add("");
        indefiniteSuffixList.add("");
        indefiniteSuffixList.add("�");
        indefiniteSuffixList.add("� ��");
        indefiniteSuffixList.add("� ����");
        indefiniteSuffixList.add("� ������");
        indefiniteSuffixList.add("");
        indefiniteSuffixList.add("");


        definiteSuffixList.add("�");
        definiteSuffixList.add("� ��");
        definiteSuffixList.add("� ���");
        definiteSuffixList.add("� �����");
        definiteSuffixList.add("");
        definiteSuffixList.add("");
        definiteSuffixList.add("�");
        definiteSuffixList.add("� ��");
        definiteSuffixList.add("� ����");
        definiteSuffixList.add("� ������");
        definiteSuffixList.add("");
        definiteSuffixList.add("");
        definiteSuffixList.add("�");
        definiteSuffixList.add("� ��");
        definiteSuffixList.add("� ����");
        definiteSuffixList.add("� ������");
        definiteSuffixList.add("");
        definiteSuffixList.add("");


        annexedSuffixList.add("�");
        annexedSuffixList.add("� ��");
        annexedSuffixList.add("� �");
        annexedSuffixList.add("� ���");
        annexedSuffixList.add("");
        annexedSuffixList.add("");
        annexedSuffixList.add("�");
        annexedSuffixList.add("� ��");
        annexedSuffixList.add("� ��");
        annexedSuffixList.add("� ����");
        annexedSuffixList.add("");
        annexedSuffixList.add("");
        annexedSuffixList.add("�");
        annexedSuffixList.add("� ��");
        annexedSuffixList.add("� ��");
        annexedSuffixList.add("� ����");
        annexedSuffixList.add("");
        annexedSuffixList.add("");

    }

    public void selectDefiniteMode() {
        prefix = "��";
        currentSuffixList = definiteSuffixList;

        if (AssimilateFormulaE2SuffixContainer.getInstance().getCurrentSuffixList() != AssimilateFormulaE2SuffixContainer.getInstance().getDefiniteSuffixList())
            AssimilateFormulaE2SuffixContainer.getInstance().selectDefiniteMode();
    }

    public void selectInDefiniteMode() {
        prefix = "";
        currentSuffixList = indefiniteSuffixList;

        if (AssimilateFormulaE2SuffixContainer.getInstance().getCurrentSuffixList() != AssimilateFormulaE2SuffixContainer.getInstance().getIndefiniteSuffixList())
            AssimilateFormulaE2SuffixContainer.getInstance().selectInDefiniteMode();
    }

    public void selectAnnexedMode() {
        prefix = "";
        currentSuffixList = annexedSuffixList;

        if (AssimilateFormulaE2SuffixContainer.getInstance().getCurrentSuffixList() != AssimilateFormulaE2SuffixContainer.getInstance().getAnnexedSuffixList())
            AssimilateFormulaE2SuffixContainer.getInstance().selectAnnexedMode();
    }

    public static AssimilateFormulaE1SuffixContainer getInstance() {
        return instance;
    }

    public String getPrefix() {
        return prefix;
    }

    public ArrayList getAnnexedSuffixList() {
        return annexedSuffixList;
    }

    public ArrayList getCurrentSuffixList() {
        return currentSuffixList;
    }

    public ArrayList getDefiniteSuffixList() {
        return definiteSuffixList;
    }

    public ArrayList getIndefiniteSuffixList() {
        return indefiniteSuffixList;
    }

    public String get(int index) {
        return (String) currentSuffixList.get(index);
    }

}
