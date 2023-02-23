package sarf;

import java.util.*;
import sarf.util.*;


public class Validator {
    private String arabicLetters = "������������������������������";
    private String hamzaString = "����";

    private Validator() {
    }

    private static Validator instance = new Validator();

    public static Validator getInstance() {
        return instance;
    }

    /**
     * ��� ����� 3  �� 4
     * @param root String
     * @return boolean
     */
    public boolean checkLength(String root) {
        return root.length() == 3 || root.length() == 4;
    }

    /**
     * ��� ��� ���� ���� ����� �� ���� �����
     * @param root String
     * @return boolean
     */
    public boolean checkArabicLetters(String root) {
        for (int i = 0; i < root.length(); i++) {
            if (arabicLetters.indexOf(root.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }

    /**
     * ��� ��� ��� ����� ���� ����
     * @param root String
     * @return boolean
     */
    public boolean checkStartedWithAlef(String root) {
        return root.charAt(0) == '�';
    }

    /**
     * ��� ��� ��� ����� ����� ��� ������
     * @param root String
     * @return boolean
     */
    public boolean checkAlefMamdoda(String root) {
        return root.indexOf("�") != -1;
    }

    /**
     * ��� ��� ��� ����� ����� ������ �����
     * @param root String
     * @return boolean
     */
    public boolean checkTashkil(String root) {
        return
                root.indexOf(ArabCharUtil.FATHA) != -1 ||
                root.indexOf(ArabCharUtil.DAMMA) != -1 ||
                root.indexOf(ArabCharUtil.KASRA) != -1 ||
                root.indexOf(ArabCharUtil.SKOON) != -1 ||
                root.indexOf(ArabCharUtil.SHADDA) != -1;
    }


    /**
     * �� ������ ��� ����� ��� ������ ������
     * @param root String
     * @return String
     */
    public String correctHamza(String root) {
        char[] rootArray = root.toCharArray();
        for (int i = 0; i < rootArray.length; i++) {
            if (hamzaString.indexOf(rootArray[i]) != -1) {
                rootArray[i] = '�';
            }
        }
        return new String(rootArray);
    }

    /**
     * ��� ��� ���� ����� ��� ����� �� ����� ������ �� ������
     * ���� ����� ��� ����� �� ����� �� �����
     * @param root String
     * @return List
     */
    public List getTrilateralAlefAlternatives(String root) {
        List result = new LinkedList();
        if (root.charAt(1) == '�' && (root.charAt(2) == '�' || root.charAt(2) == '�')) {
            result.add(root.charAt(0) + "�" + "�");
            result.add(root.charAt(0) + "�" + "�");
            result.add(root.charAt(0) + "�" + "�");
            result.add(root.charAt(0) + "�" + "�");
        }
        else {
            if (root.charAt(1) == '�') {
                result.add(root.charAt(0) + "�" + root.charAt(2));
                result.add(root.charAt(0) + "�" + root.charAt(2));
            }
            if (root.charAt(2) == '�' || root.charAt(2) == '�') {
                result.add(root.charAt(0) + "" + root.charAt(1) + "�");
                result.add(root.charAt(0) + "" + root.charAt(1) + "�");
            }
        }
        return result;
    }


    /**
     * ��� ��� ���� ����� ��� ����� �� ����� ������ �� ������
     * ���� ����� ��� ����� �� ����� �� �����
     * ���� ���� �� ������ ���� ��� ���
     * @param root String
     * @return List
     */
    public List getQuadrilateralAlefAlternatives(String root) {
        List result = new LinkedList();
        if (root.charAt(1) == '�') {
            result.add(root.charAt(0) + "�" + root.charAt(2) + root.charAt(3));
            result.add(root.charAt(0) + "�" + root.charAt(2) + root.charAt(3));
        }
        if (root.charAt(2) == '�') {
            result.add(root.charAt(0) + "" + root.charAt(1) + "�" + root.charAt(3));
            result.add(root.charAt(0) + "" + root.charAt(1) + "�" + root.charAt(3));
        }

        if (root.charAt(3) == '�' || root.charAt(3) == '�') {
            result.add(root.charAt(0) + "" + root.charAt(1) + "" + root.charAt(2) + "�");
        }
        return result;
    }
}
