package sarf.noun.trilateral.unaugmented.modifier.instrumental;

import java.util.*;

import sarf.noun.*;
import sarf.verb.trilateral.Substitution.*;
import sarf.noun.trilateral.unaugmented.modifier.IUnaugmentedTrilateralNounModificationApplier;
import sarf.noun.trilateral.unaugmented.modifier.*;


public class Geminator extends AbstractGeminator {
    List substitutions = new LinkedList();

    public Geminator() {
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3","�C3�"));// EX: (������)
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3","�C3�"));// EX: (������)
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3","�C3�"));// EX: (������)
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3","�C3�"));// EX: (������)
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3","�C3�"));// EX: (������)
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3","�C3�"));// EX: (�������)
    }


    public List getSubstitutions() {
        return substitutions;
    }
}
