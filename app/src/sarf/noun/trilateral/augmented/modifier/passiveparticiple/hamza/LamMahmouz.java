package sarf.noun.trilateral.augmented.modifier.passiveparticiple.hamza;

import java.util.*;

import sarf.noun.*;
import sarf.verb.trilateral.Substitution.*;
import sarf.noun.trilateral.augmented.modifier.*;


public class LamMahmouz extends AbstractLamMahmouz {
    List substitutions = new LinkedList();

    public LamMahmouz() {

        substitutions.add(new SuffixSubstitution("���","���"));// EX: (������)
        substitutions.add(new SuffixSubstitution("���","���"));// EX: (������)
        substitutions.add(new SuffixSubstitution("���","���"));// EX: (������)
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (�������� �����������)
        substitutions.add(new InfixSubstitution("����", "���")); // EX: (�������� �����������)
        substitutions.add(new InfixSubstitution("����", "���")); // EX: (������)
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (�������� �����������)
        substitutions.add(new InfixSubstitution("����", "��")); // EX: (���������� ������������)
        substitutions.add(new InfixSubstitution("����", "����")); // EX: (������������ ���������������)
        substitutions.add(new SuffixSubstitution("���", "���")); // EX: (��������� �������������)
        substitutions.add(new SuffixSubstitution("���", "���")); // EX: (�������� �������������)
        substitutions.add(new SuffixSubstitution("���", "���")); // EX: (��������� �������������)
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (�������ɡ ���������)
        substitutions.add(new InfixSubstitution("��", "��")); // EX: (����������� ��������������)
        substitutions.add(new InfixSubstitution("��", "��")); // EX: (����������� ��������������)
    }


    public List getSubstitutions() {
        return substitutions;
    }
}
