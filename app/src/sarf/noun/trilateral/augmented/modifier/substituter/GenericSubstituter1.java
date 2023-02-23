package sarf.noun.trilateral.augmented.modifier.substituter;

import java.util.*;
import sarf.verb.trilateral.augmented.ConjugationResult;
import sarf.noun.trilateral.augmented.modifier.AbstractGenericSubstituter;
import sarf.verb.trilateral.Substitution.InfixSubstitution;


public class GenericSubstituter1 extends AbstractGenericSubstituter {
    private List substitutions = new LinkedList();

    public GenericSubstituter1() {
        substitutions.add(new InfixSubstitution("���","��"));// EX: (��������)
    }

    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        return conjugationResult.getRoot().getC1() == '�' && super.isApplied(conjugationResult);
    }
}
