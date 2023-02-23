package sarf.verb.trilateral.augmented.modifier.substituter.active;

import java.util.*;
import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.augmented.modifier.substituter.*;
import sarf.verb.trilateral.augmented.ConjugationResult;


public class GenericSubstituter6 extends AbstractGenericSubstituter {
    private List substitutions = new LinkedList();

    public GenericSubstituter6() {
        substitutions.add(new InfixSubstitution("����","����"));// EX: (�������ѡ ����������� ���������)
    }

    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        return conjugationResult.getRoot().getC1() == '�' && super.isApplied(conjugationResult);
    }
}
