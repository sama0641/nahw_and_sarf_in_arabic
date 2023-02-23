package sarf.verb.trilateral.unaugmented.modifier.vocalizer.lafif.separeted;

import java.util.*;

import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.unaugmented.modifier.*;
import sarf.verb.trilateral.unaugmented.ConjugationResult;

/
public class WawiPassivePresentVocalizer extends SubstitutionsApplier implements IUnaugmentedTrilateralModifier {

    private List substitutions = new LinkedList();

    public WawiPassivePresentVocalizer() {
        substitutions.add(new ExpressionSuffixSubstitution("�C2���", "C2��")); // EX: (������)
        substitutions.add(new ExpressionSuffixSubstitution("�C2���", "C2��")); // EX: (�� ������)
        substitutions.add(new ExpressionSuffixSubstitution("�C2���", "C2�")); // EX: (�� �����)
        substitutions.add(new ExpressionInfixSubstitution("�C2���", "C2���")); // EX: (���� �������)
        substitutions.add(new ExpressionInfixSubstitution("�C2���", "C2���")); // EX: (����� ���������)
        substitutions.add(new ExpressionInfixSubstitution("�C2����", "C2���")); // EX: (���� ���������)
        substitutions.add(new ExpressionInfixSubstitution("�C2����","C2����"));// EX: (���� ����������)
        substitutions.add(new ExpressionInfixSubstitution("�C2����", "C2���")); // EX: (���� ���������)
        substitutions.add(new ExpressionInfixSubstitution("�C2����", "C2����")); // EX: (���� ����������)
    }


    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        if (conjugationResult.getRoot().getC1() != '�') {
            return false;
        }

        int kov = conjugationResult.getKov();
        int noc = Integer.parseInt(conjugationResult.getRoot().getConjugation());
        return ((kov == 29 || kov == 30) && (noc == 2)) ||
                (kov == 30 && (noc == 6 || noc == 4));
    }
}
