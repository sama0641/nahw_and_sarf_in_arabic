package sarf.verb.trilateral.augmented.modifier.hamza.faa.active;

import java.util.*;

import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.augmented.modifier.hamza.faa.*;


public class ImperativeMahmouz extends AbstractFaaMahmouz {

    private List substitutions = new LinkedList();

    public ImperativeMahmouz() {
        substitutions.add(new InfixSubstitution("����","�"));// EX: (������  )
        substitutions.add(new InfixSubstitution("���","�"));// EX: (������ ������� )
        substitutions.add(new InfixSubstitution("���","���"));// EX: (��������� )
        substitutions.add(new InfixSubstitution("���","���"));// EX: (���������� )
        substitutions.add(new InfixSubstitution("���","���"));// EX: (���������� )
        substitutions.add(new InfixSubstitution("���","���"));// EX: (������������ )
        substitutions.add(new InfixSubstitution("���","���"));// EX: (���������� ������)
        substitutions.add(new InfixSubstitution("��","��"));// EX: (������� )
    }


    public List getSubstitutions() {
        return substitutions;
    }
}
