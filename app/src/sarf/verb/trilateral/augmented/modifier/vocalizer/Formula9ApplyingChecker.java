package sarf.verb.trilateral.augmented.modifier.vocalizer;

import java.util.*;

public class Formula9ApplyingChecker extends IFormulaApplyingChecker{
    private List twoStateList = new LinkedList();
    private List notVocalizedList = new LinkedList();

    public Formula9ApplyingChecker() {
        twoStateList.add("���");
        twoStateList.add("���");
        twoStateList.add("���");
        twoStateList.add("���");
        twoStateList.add("���");
        twoStateList.add("���");

        notVocalizedList.add("���");
        notVocalizedList.add("���");
        notVocalizedList.add("���");
        notVocalizedList.add("���");
        notVocalizedList.add("���");
        notVocalizedList.add("���");
        notVocalizedList.add("���");
        notVocalizedList.add("���");
        notVocalizedList.add("���");
        notVocalizedList.add("���");
    }

    public List getNotVocalizedList() {
        return notVocalizedList;
    }

    public List getTwoStateList() {
        return twoStateList;
    }
}
