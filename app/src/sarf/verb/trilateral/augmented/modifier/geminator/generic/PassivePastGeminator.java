package sarf.verb.trilateral.augmented.modifier.geminator.generic;

import java.util.*;

import sarf.verb.trilateral.Substitution.*;


public class PassivePastGeminator extends SubstitutionsApplier {

    private List substitutions = new LinkedList();

    public PassivePastGeminator() {
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3�", "�C3��")); // EX: (�������)
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3�", "�C3��")); // EX: (��������ǡ)
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3�", "�C3��")); // EX: (��������)
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3�", "�C3��")); // EX: (����������)
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3�", "�C3��")); // EX: (������ ���������)
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3�", "�C3��")); // EX: (�������ǡ �����������)
    }

    public List getSubstitutions() {
        return substitutions;
    }
}
