package sarf.noun.quadriliteral.modifier.activeparticiple;

import java.util.*;

import sarf.noun.*;
import sarf.verb.quadriliteral.*;
import sarf.verb.quadriliteral.modifier.*;
import sarf.verb.quadriliteral.substitution.*;


public class Vocalizer extends QuadrilateralNounSubstitutionApplier implements IQuadrilateralModifier {
    List substitutions = new LinkedList();

    public Vocalizer() {
        substitutions.add(new SuffixSubstitution("���","��"));// EX: (��� ��������� )
        substitutions.add(new SuffixSubstitution("���","���"));// EX: (����� ��������� � )
        substitutions.add(new SuffixSubstitution("���","��"));// EX: (����� ��� �������� � )
        substitutions.add(new InfixSubstitution("���","�"));// EX: (��� �����)
        substitutions.add(new InfixSubstitution("���","�"));// EX: (����� ��� �����)
        substitutions.add(new InfixSubstitution("���","�"));// EX: (�������� � )
        substitutions.add(new InfixSubstitution("���","�"));// EX: (�������� � )
    }


    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        return conjugationResult.getRoot().getC4() == '�';
    }
}
