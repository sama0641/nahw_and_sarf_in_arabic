package sarf.verb.trilateral.augmented.modifier.hamza.ein.passive;

import java.util.*;

import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.augmented.modifier.hamza.ein.*;


public class PastMahmouz extends AbstractEinMahmouz {

    private List substitutions = new LinkedList();

    public PastMahmouz() {
        substitutions.add(new InfixSubstitution("��", "��")); // EX: (�������� ������� ��������� �������� ��������� ��������� �������� )
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (�������� )
        substitutions.add(new InfixSubstitution("���","���"));// EX: (�������ǡ )
        substitutions.add(new InfixSubstitution("����", "����")); // EX: (������� ��������� )
        substitutions.add(new InfixSubstitution("����", "����")); // EX: (������ǡ )
    }


    public List getSubstitutions() {
        return substitutions;
    }
}
