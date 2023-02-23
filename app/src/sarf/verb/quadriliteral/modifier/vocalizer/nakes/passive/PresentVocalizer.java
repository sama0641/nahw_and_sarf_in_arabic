package sarf.verb.quadriliteral.modifier.vocalizer.nakes.passive;

import java.util.*;
import sarf.verb.quadriliteral.substitution.*;
import sarf.verb.quadriliteral.modifier.*;
import sarf.verb.quadriliteral.*;


public class PresentVocalizer extends SubstitutionsApplier implements IQuadrilateralModifier {

    private List substitutions = new LinkedList();

    public PresentVocalizer() {
        substitutions.add(new SuffixSubstitution("��", "�")); // EX: (��������� ����������� �����������)
        substitutions.add(new SuffixSubstitution("��", "�")); // EX: (�� ��������� ����������� �����������)
        substitutions.add(new SuffixSubstitution("��", "")); // EX: (�� �������� ���������� ����������)
        substitutions.add(new InfixSubstitution("���", "��")); // EX: (���� ������������ ��������������� ��������������)
        substitutions.add(new InfixSubstitution("���", "��")); // EX: (���� ������������ ��������������� ��������������)
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (���� ������������� ���������������� ���������������)
    }


    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        if (conjugationResult.getRoot().getC4() != '�')
            return false;

        switch (conjugationResult.getFormulaNo()) {
        case 0:
        case 1:
        case 2:
            return true;
        }

        return false;
    }
}
