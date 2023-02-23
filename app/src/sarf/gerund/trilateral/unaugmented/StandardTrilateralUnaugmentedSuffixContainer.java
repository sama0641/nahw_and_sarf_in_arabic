package sarf.gerund.trilateral.unaugmented;

import java.util.*;
import sarf.noun.*;


public class StandardTrilateralUnaugmentedSuffixContainer implements INounSuffixContainer{
    private static StandardTrilateralUnaugmentedSuffixContainer instance = new StandardTrilateralUnaugmentedSuffixContainer();
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

    private StandardTrilateralUnaugmentedSuffixContainer() {
        indefiniteSuffixList.add("�");
        indefiniteSuffixList.add("�");
        indefiniteSuffixList.add("");
        indefiniteSuffixList.add("");
        indefiniteSuffixList.add("");
        indefiniteSuffixList.add("");
        indefiniteSuffixList.add("��");
        indefiniteSuffixList.add("�");
        indefiniteSuffixList.add("");
        indefiniteSuffixList.add("");
        indefiniteSuffixList.add("");
        indefiniteSuffixList.add("");
        indefiniteSuffixList.add("�");
        indefiniteSuffixList.add("�");
        indefiniteSuffixList.add("");
        indefiniteSuffixList.add("");
        indefiniteSuffixList.add("");
        indefiniteSuffixList.add("");

        definiteSuffixList.add("�");
        definiteSuffixList.add("�");
        definiteSuffixList.add("");
        definiteSuffixList.add("");
        definiteSuffixList.add("");
        definiteSuffixList.add("");
        definiteSuffixList.add("�");
        definiteSuffixList.add("�");
        definiteSuffixList.add("");
        definiteSuffixList.add("");
        definiteSuffixList.add("");
        definiteSuffixList.add("");
        definiteSuffixList.add("�");
        definiteSuffixList.add("�");
        definiteSuffixList.add("");
        definiteSuffixList.add("");
        definiteSuffixList.add("");
        definiteSuffixList.add("");

        annexedSuffixList.add("�");
        annexedSuffixList.add("�");
        annexedSuffixList.add("");
        annexedSuffixList.add("");
        annexedSuffixList.add("");
        annexedSuffixList.add("");
        annexedSuffixList.add("�");
        annexedSuffixList.add("�");
        annexedSuffixList.add("");
        annexedSuffixList.add("");
        annexedSuffixList.add("");
        annexedSuffixList.add("");
        annexedSuffixList.add("�");
        annexedSuffixList.add("�");
        annexedSuffixList.add("");
        annexedSuffixList.add("");
        annexedSuffixList.add("");
        annexedSuffixList.add("");
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

    public static StandardTrilateralUnaugmentedSuffixContainer getInstance() {
        return instance;
    }

    public String getPrefix() {
        return prefix;
    }

    public String get(int index) {
        return (String) currentSuffixList.get(index);
    }

    public boolean isAnnexed() {
         return currentSuffixList == annexedSuffixList;
     }

     public boolean isDefinite() {
         return currentSuffixList == definiteSuffixList;
     }

     public boolean isIndefinite() {
         return currentSuffixList == indefiniteSuffixList;
     }

}
