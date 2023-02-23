package sarf.verb.trilateral.augmented.modifier.geminator.generic;

import java.util.*;
import sarf.verb.trilateral.Substitution.*;


public class ActivePresentGeminator extends SubstitutionsApplier {

    private List substitutions = new LinkedList();

    public ActivePresentGeminator() {
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3�", "�C3��")); // EX: (�������)
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3�", "�C3��")); // EX: (���������)
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3�", "�C3��")); // EX: (����������)
        substitutions.add(new ExpressionSuffixSubstitution("�C3�C3�", "�C3��")); // EX: (�� �������)
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3�", "�C3��")); // EX: (������)
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3�", "�C3��")); // EX: (��������)
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3�", "�C3��")); // EX: (����������)
        substitutions.add(new ExpressionSuffixSubstitution("�C3�C3�", "�C3��")); // EX: (�� ������)
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3�", "�C3��")); // EX: (�����������)
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3�", "�C3��")); // EX: (����������ǡ)
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3�", "�C3��")); // EX: (������������)
        substitutions.add(new ExpressionSuffixSubstitution("�C3�C3�", "�C3��")); // EX: (�� ����������)
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3�", "�C3��")); // EX: (������)
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3�", "�C3��")); // EX: (�������)
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3�", "�C3��")); // EX: (��������)
        substitutions.add(new ExpressionSuffixSubstitution("�C3�C3�", "�C3��")); // EX: (��  � K������)
    }

    public List getSubstitutions() {
        return substitutions;
    }
}
