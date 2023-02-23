package sarf.verb.trilateral.augmented.modifier.geminator.generic;

import java.util.*;
import sarf.verb.trilateral.Substitution.*;


public class ImperativeGeminator extends SubstitutionsApplier {

    private List substitutions = new LinkedList();

    public ImperativeGeminator() {

        substitutions.add(new ExpressionInfixSubstitution("C1�C3�C3�", "C1�C3��")); // EX: (���������)
        substitutions.add(new ExpressionInfixSubstitution("C1�C3�C3�", "C1�C3��")); // EX: (��������)
        substitutions.add(new ExpressionInfixSubstitution("C1�C3�C3�", "C1�C3��")); // EX: (��������)
        substitutions.add(new ExpressionSuffixSubstitution("C1�C3�C3�", "C1�C3��")); // EX: (�������)
        substitutions.add(new ExpressionInfixSubstitution("C3�C3�", "C3��")); // EX: (��������ǡ �������)
        substitutions.add(new ExpressionInfixSubstitution("C3�C3�", "C3��")); // EX: (��������ǡ ������)
        substitutions.add(new ExpressionInfixSubstitution("C3�C3�", "C3��")); // EX: (���������� ������)
        substitutions.add(new ExpressionSuffixSubstitution("C3�C3�", "C3��")); // EX: (�������� �����)
        substitutions.add(new ExpressionSuffixSubstitution("�C3�C3�", "�C3��")); // EX: (�����)
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3��","�C3�C3��"));// EX: (��������)
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3", "�C3�")); // EX: (������ǡ �����ǡ ������)
    }

    public List getSubstitutions() {
        return substitutions;
    }
}
