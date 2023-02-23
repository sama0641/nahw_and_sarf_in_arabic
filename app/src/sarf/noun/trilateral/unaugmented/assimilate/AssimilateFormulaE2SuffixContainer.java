package sarf.noun.trilateral.unaugmented.assimilate;

import java.util.*;

import sarf.noun.*;


public class AssimilateFormulaE2SuffixContainer implements INounSuffixContainer{
    private static AssimilateFormulaE2SuffixContainer instance = new AssimilateFormulaE2SuffixContainer();
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

    private AssimilateFormulaE2SuffixContainer() {
        indefiniteSuffixList.add("");
        indefiniteSuffixList.add("� �");
        indefiniteSuffixList.add("");
        indefiniteSuffixList.add("� �����");
        indefiniteSuffixList.add("");
        indefiniteSuffixList.add("");
        indefiniteSuffixList.add("");
        indefiniteSuffixList.add("� �");
        indefiniteSuffixList.add("");
        indefiniteSuffixList.add("� ������");
        indefiniteSuffixList.add("");
        indefiniteSuffixList.add("");
        indefiniteSuffixList.add("");
        indefiniteSuffixList.add("� �");
        indefiniteSuffixList.add("");
        indefiniteSuffixList.add("� ������");
        indefiniteSuffixList.add("");
        indefiniteSuffixList.add("");

        definiteSuffixList.add("");
        definiteSuffixList.add("� �");
        definiteSuffixList.add("");
        definiteSuffixList.add("� �����");
        definiteSuffixList.add("");
        definiteSuffixList.add("");
        definiteSuffixList.add("");
        definiteSuffixList.add("� �");
        definiteSuffixList.add("");
        definiteSuffixList.add("� ������");
        definiteSuffixList.add("");
        definiteSuffixList.add("");
        definiteSuffixList.add("");
        definiteSuffixList.add("� �");
        definiteSuffixList.add("");
        definiteSuffixList.add("� ������");
        definiteSuffixList.add("");
        definiteSuffixList.add("");

        annexedSuffixList.add("");
        annexedSuffixList.add("� �");
        annexedSuffixList.add("");
        annexedSuffixList.add("� ���");
        annexedSuffixList.add("");
        annexedSuffixList.add("");
        annexedSuffixList.add("");
        annexedSuffixList.add("� �");
        annexedSuffixList.add("");
        annexedSuffixList.add("� ����");
        annexedSuffixList.add("");
        annexedSuffixList.add("");
        annexedSuffixList.add("�");
        annexedSuffixList.add("� �");
        annexedSuffixList.add("");
        annexedSuffixList.add("� ����");
        annexedSuffixList.add("");
        annexedSuffixList.add("");
    }

    public void selectDefiniteMode() {
        prefix = "��";
        currentSuffixList = definiteSuffixList;

        if (AssimilateFormulaE1SuffixContainer.getInstance().getCurrentSuffixList() != AssimilateFormulaE1SuffixContainer.getInstance().getDefiniteSuffixList())
            AssimilateFormulaE1SuffixContainer.getInstance().selectDefiniteMode();
    }

    public void selectInDefiniteMode() {
        prefix = "";
        currentSuffixList = indefiniteSuffixList;

        if (AssimilateFormulaE1SuffixContainer.getInstance().getCurrentSuffixList() != AssimilateFormulaE1SuffixContainer.getInstance().getIndefiniteSuffixList())
            AssimilateFormulaE1SuffixContainer.getInstance().selectInDefiniteMode();
    }

    public void selectAnnexedMode() {
        prefix = "";
        currentSuffixList = annexedSuffixList;

        if (AssimilateFormulaE1SuffixContainer.getInstance().getCurrentSuffixList() != AssimilateFormulaE1SuffixContainer.getInstance().getAnnexedSuffixList())
            AssimilateFormulaE1SuffixContainer.getInstance().selectAnnexedMode();
    }


    public static AssimilateFormulaE2SuffixContainer getInstance() {
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
