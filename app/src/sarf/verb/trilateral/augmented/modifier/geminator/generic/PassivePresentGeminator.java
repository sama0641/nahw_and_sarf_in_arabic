package sarf.verb.trilateral.augmented.modifier.geminator.generic;

import java.util.*;
import sarf.verb.trilateral.Substitution.*;


public class PassivePresentGeminator extends SubstitutionsApplier {

    private List substitutions = new LinkedList();

    public PassivePresentGeminator() {

        substitutions.add(new ExpressionInfixSubstitution("�C3�C3�","�C3��"));// EX: (��������)
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3�","�C3��"));// EX: (���������)
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3�","�C3��"));// EX: (���������)
        substitutions.add(new ExpressionSuffixSubstitution("�C3�C3�","�C3��"));// EX: (�� �������)
        substitutions.add(new ExpressionSuffixSubstitution("�C3�C3�","�C3��"));// EX: (�� ��������� ���������)
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3�","�C3��"));// EX: (����������� ������)
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3�","�C3��"));// EX: (����������ǡ ������)
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3�","�C3��"));// EX: (������������ ������)
        substitutions.add(new ExpressionSuffixSubstitution("�C3�C3�","�C3��"));// EX: (�� ���������� ������)
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3�","�C3��"));// EX: (���������� ���������)
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3�","�C3��"));// EX: (�� ��������� �� ��������� �� �������)
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3�","�C3��"));// EX: (����������)

    }

    public List getSubstitutions() {
        return substitutions;
    }
}
