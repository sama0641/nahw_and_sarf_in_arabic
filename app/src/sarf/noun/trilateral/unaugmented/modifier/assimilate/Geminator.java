package sarf.noun.trilateral.unaugmented.modifier.assimilate;

import java.util.*;

import sarf.noun.trilateral.unaugmented.modifier.*;
import sarf.verb.trilateral.Substitution.*;


public class Geminator extends AbstractGeminator {
    List substitutions = new LinkedList();

    public Geminator() {
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3","�C3�"));// EX: (�����)
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3","�C3�"));// EX: (�������� ������� �����)
    }


    public List getSubstitutions() {
        return substitutions;
    }
}
