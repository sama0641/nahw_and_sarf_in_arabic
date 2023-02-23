package sarf.noun.trilateral.unaugmented.modifier.exaggeration.hamza;

import java.util.*;

import sarf.noun.*;
import sarf.verb.trilateral.Substitution.*;
import sarf.noun.trilateral.unaugmented.modifier.IUnaugmentedTrilateralNounModificationApplier;
import sarf.noun.trilateral.unaugmented.modifier.*;


public class FaaMahmouz extends AbstractFaaMahmouz {
    List substitutions = new LinkedList();

    public FaaMahmouz() {
        substitutions.add(new InfixSubstitution("����", "��")); // EX: (�����ݡ)
        substitutions.add(new PrefixSubstitution("����","����"));// EX: (��������� ������)
        substitutions.add(new PrefixSubstitution("����","����"));// EX: (��������ɡ)
        substitutions.add(new PrefixSubstitution("��", "��")); // EX: (������� ����)
        substitutions.add(new PrefixSubstitution("��", "��")); // EX: (������ɡ)
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (������ݡ)

    }


    public List getSubstitutions() {
        return substitutions;
    }
}
