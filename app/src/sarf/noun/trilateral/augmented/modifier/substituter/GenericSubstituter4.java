package sarf.noun.trilateral.augmented.modifier.substituter;

import java.util.*;
import sarf.verb.trilateral.Substitution.*;
import sarf.noun.trilateral.augmented.modifier.AbstractGenericSubstituter;
import sarf.verb.trilateral.augmented.ConjugationResult;


public class GenericSubstituter4 extends AbstractGenericSubstituter {
    private List substitutions = new LinkedList();

    public GenericSubstituter4() {

        substitutions.add(new InfixSubstitution("���", "���")); // EX: (�������ѡ)
    }

    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        return conjugationResult.getRoot().getC1() == '�' && super.isApplied(conjugationResult);
    }
}
