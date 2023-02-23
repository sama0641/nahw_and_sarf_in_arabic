package sarf.noun.trilateral.unaugmented.modifier.activeparticiple;

import java.util.*;

import sarf.noun.*;
import sarf.verb.trilateral.Substitution.*;
import sarf.noun.trilateral.unaugmented.modifier.IUnaugmentedTrilateralNounModificationApplier;
import sarf.noun.trilateral.unaugmented.modifier.*;


public class Geminator extends AbstractGeminator {
    List substitutions = new LinkedList();

    public Geminator() {
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3","�C3�"));// EX: (����� �����ǡ ����� ������� ������� ��������)
    }


    public List getSubstitutions() {
        return substitutions;
    }
}
