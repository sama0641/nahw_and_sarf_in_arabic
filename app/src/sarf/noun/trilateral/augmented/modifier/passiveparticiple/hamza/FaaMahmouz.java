package sarf.noun.trilateral.augmented.modifier.passiveparticiple.hamza;

import java.util.*;

import sarf.noun.*;
import sarf.verb.trilateral.Substitution.*;
import sarf.noun.trilateral.augmented.modifier.*;


public class FaaMahmouz extends AbstractFaaMahmouz {
    List substitutions = new LinkedList();

    public FaaMahmouz() {
        substitutions.add(new InfixSubstitution("����", "��")); // EX: (��������)
        substitutions.add(new InfixSubstitution("����","��"));// EX: (������)
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (��������)
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (����������)
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (����������)
        substitutions.add(new InfixSubstitution("��", "��")); // EX: (�������� ��������� ���������)
    }


    public List getSubstitutions() {
        return substitutions;
    }
}
