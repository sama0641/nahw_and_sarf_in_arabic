
package sarf.verb.trilateral.Substitution;

import java.util.*;
import sarf.verb.trilateral.*;


public abstract class SubstitutionsApplier {

    protected static List defaultAppliedProunounsIndecies = new ArrayList(13);
    static {
        for (int i=0; i<13; i++) {
            defaultAppliedProunounsIndecies.add(i+1 +"");
        }
    }

    public SubstitutionsApplier() {

    }

    /**
     * ���� ���� ������� ����� ���������� ��� ��  ����
     * ��� ��� ��� ����������� �� ���� �� ���
     * @param words List
     * @param root TrilateralRoot
     */
    public void apply(List words, TrilateralRoot root) {
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
                    words.set(index, result);
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

    protected List getAppliedPronounsIndecies() {
        return defaultAppliedProunounsIndecies;
    }


}
