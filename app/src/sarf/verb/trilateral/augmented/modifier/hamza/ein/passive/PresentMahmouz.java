package sarf.verb.trilateral.augmented.modifier.hamza.ein.passive;

import java.util.*;

import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.augmented.modifier.hamza.ein.AbstractEinMahmouz;


public class PresentMahmouz extends AbstractEinMahmouz {

    private List substitutions = new LinkedList();

    public PresentMahmouz() {
        substitutions.add(new InfixSubstitution("����", "����")); // EX: (������������� )
        substitutions.add(new InfixSubstitution("����", "����")); // EX: (������������� ����������� )
        substitutions.add(new InfixSubstitution("���", "����")); // EX: (�������� )
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (��������� ���������� ������������� )
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (���������� ����������� )
        substitutions.add(new InfixSubstitution("����", "����")); // EX: (���������� ������������ )
        substitutions.add(new InfixSubstitution("����", "����")); // EX: (��������� )
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (��������� ����������� )
    }


    public List getSubstitutions() {
        return substitutions;
    }
}
