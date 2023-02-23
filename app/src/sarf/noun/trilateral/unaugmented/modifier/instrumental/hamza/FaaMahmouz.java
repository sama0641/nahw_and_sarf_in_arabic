package sarf.noun.trilateral.unaugmented.modifier.instrumental.hamza;

import java.util.*;

import sarf.noun.*;
import sarf.verb.trilateral.Substitution.*;
import sarf.noun.trilateral.unaugmented.modifier.IUnaugmentedTrilateralNounModificationApplier;
import sarf.noun.trilateral.unaugmented.modifier.*;


public class FaaMahmouz extends AbstractFaaMahmouz {
    List substitutions = new LinkedList();

    public FaaMahmouz() {
        substitutions.add(new InfixSubstitution("��", "��")); // EX: (������ѡ �����ɡ ������)
        substitutions.add(new PrefixSubstitution("��", "��")); // EX: (������ɡ )
        substitutions.add(new InfixSubstitution("����","����"));// EX: (�������ɡ ������)
        substitutions.add(new InfixSubstitution("��", "��")); // EX: (���ѡ )
        substitutions.add(new InfixSubstitution("��", "��")); // EX: (������ɡ )
    }


    public List getSubstitutions() {
        return substitutions;
    }
}
