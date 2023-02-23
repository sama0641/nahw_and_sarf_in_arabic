package sarf.verb.quadriliteral.modifier.geminator.passive;

import java.util.*;
import sarf.verb.quadriliteral.substitution.*;
import sarf.verb.quadriliteral.modifier.*;
import sarf.verb.quadriliteral.*;


public class Past2Geminator extends SubstitutionsApplier implements IQuadrilateralModifier {

    private List substitutions = new LinkedList();

    public Past2Geminator() {
        substitutions.add(new InfixSubstitution("����", "���")); // EX: (��� ���������)
        substitutions.add(new InfixSubstitution("����", "���")); // EX: (���� ���������)
        substitutions.add(new InfixSubstitution("����", "���")); // EX: (���� ���������)
    }


    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        if (conjugationResult.getRoot().getC4() != '�') {
            return false;
        }
        return true;
    }
}
