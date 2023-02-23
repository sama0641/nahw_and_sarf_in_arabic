package sarf.verb.trilateral.augmented.modifier.hamza.faa.passive;

import java.util.*;

import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.augmented.modifier.hamza.faa.*;


public class PresentMahmouz extends AbstractFaaMahmouz {

    private List substitutions = new LinkedList();

    public PresentMahmouz() {
        substitutions.add(new InfixSubstitution("����", "���")); // EX: (�������� ���������� )
        substitutions.add(new InfixSubstitution("����", "��")); // EX: (���������� )
        substitutions.add(new InfixSubstitution("����", "��")); // EX: (������ )
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (��������� ����������� )
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (���������� ���������� )
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (����������� )
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (����������� )
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (����������� )
    }


    public List getSubstitutions() {
        return substitutions;
    }
}
