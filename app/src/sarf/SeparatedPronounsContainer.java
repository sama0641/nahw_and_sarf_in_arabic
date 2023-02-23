package sarf;

import java.util.*;


public class SeparatedPronounsContainer {
    private static SeparatedPronounsContainer instance = new SeparatedPronounsContainer();
    private List pronouns = new ArrayList(13);

    private SeparatedPronounsContainer() {
        pronouns.add("���");
        pronouns.add("���");
        pronouns.add("����");
        pronouns.add("����");
        pronouns.add("�����");
        pronouns.add("����");
        pronouns.add("������");
        pronouns.add("��");
        pronouns.add("��");
        pronouns.add("���(��)");
        pronouns.add("���(��)");
        pronouns.add("��");
        pronouns.add("����");
    }

    public static SeparatedPronounsContainer getInstance() {
        return instance;
    }

    public List getPronouns() {
        return pronouns;
    }

}
