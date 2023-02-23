package sarf.verb.quadriliteral.substitution;

import java.util.*;
import sarf.verb.quadriliteral.*;


public abstract class SubstitutionsApplier {

    public SubstitutionsApplier() {

    }

    /**
     * ���� ���� ������� ����� ���������� ��� ��  ����
     * ��� ��� ��� ����������� �� ���� �� ���
     * @param words List
     */
    public void apply(List words, QuadrilateralRoot root) {
        for (int i=0; i< getAppliedPronounsIndecies().size(); i++) {
            int index = Integer.parseInt(getAppliedPronounsIndecies().get(i).toString())-1;
            Object wordObj = words.get(index);
            if (wordObj == null) {
                continue;
            }
            String word = wordObj.toString().trim();

            Iterator subIter = getSubstitutions().iterator();
            while (subIter.hasNext()) {
                Substitution substitution = (Substitution) subIter.next();
                String result = substitution.apply(word, root);
                if (result != null) {
                    //����� ������ ������� ��������� ������� �������
                    words.set(i, result);
                    //�� ���� ���� ���� �����������
                    break;
                }
            }
        }
    }

    /**
     * ����� �����������
     * @return List
     */
    public abstract List getSubstitutions();

    protected static List defaultAppliedProunounsIndecies = new ArrayList(13);
    static {
        for (int i=0; i<13; i++) {
            defaultAppliedProunounsIndecies.add(i+1 +"");
        }
    }


    protected List getAppliedPronounsIndecies() {
        return defaultAppliedProunounsIndecies;
    }

}
