package sarf.verb.quadriliteral.modifier.geminator.active;

import java.util.*;
import sarf.verb.quadriliteral.substitution.*;
import sarf.verb.quadriliteral.modifier.*;
import sarf.verb.quadriliteral.*;


public class Imperative1Geminator extends SubstitutionsApplier implements IQuadrilateralModifier {

    private List substitutions = new LinkedList();

    public Imperative1Geminator() {
        substitutions.add(new ExpressionSuffixSubstitution("C3�C4�C4�", "C3�C4��")); // EX: (����������)
        substitutions.add(new ExpressionInfixSubstitution("C3�C4�C4�", "C3�C4��")); // EX: (�����������)
        substitutions.add(new ExpressionInfixSubstitution("C3�C4�C4�", "C3�C4��")); // EX: (������������)
        substitutions.add(new ExpressionInfixSubstitution("C3�C4�C4�", "C3�C4��")); // EX: (�����������)

    }


    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        if (conjugationResult.getFormulaNo() != 3) {
            return false;
        }
        return true;
    }
}
