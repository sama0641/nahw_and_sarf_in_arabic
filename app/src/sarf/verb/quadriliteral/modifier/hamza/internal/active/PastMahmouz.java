package sarf.verb.quadriliteral.modifier.hamza.internal.active;

import java.util.*;

import sarf.verb.quadriliteral.substitution.*;


public class PastMahmouz extends SubstitutionsApplier {

    private List substitutions = new LinkedList();

    public PastMahmouz() {
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (�������� ����������)
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (�������� ���������� ��������� ������������)
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (����������)
    }


    public List getSubstitutions() {
        return substitutions;
    }
}
