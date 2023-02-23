package sarf.verb.quadriliteral.modifier.hamza.ended.active;

import java.util.*;

import sarf.verb.quadriliteral.substitution.*;


public class PresentMahmouz extends SubstitutionsApplier {

    private List substitutions = new LinkedList();

    public PresentMahmouz() {
        substitutions.add(new InfixSubstitution("��", "��")); // EX: (����������� ������������)
        substitutions.add(new InfixSubstitution("��", "��")); // EX: (���� ��������������� )
        substitutions.add(new SuffixSubstitution("���", "���")); // EX: (������������� )
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (����� ���������������� )
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (���� �������������� )
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (���� ��������������� )
    }


    public List getSubstitutions() {
        return substitutions;
    }
}
