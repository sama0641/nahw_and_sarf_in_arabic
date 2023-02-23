package sarf.verb.quadriliteral.modifier.hamza.ended.active;

import java.util.*;

import sarf.verb.quadriliteral.substitution.*;


public class ImperativeMahmouz extends SubstitutionsApplier {

    private List substitutions = new LinkedList();

    public ImperativeMahmouz() {
        substitutions.add(new InfixSubstitution("��", "��")); // EX: (��������� �����������)
        substitutions.add(new InfixSubstitution("��", "��")); // EX: (���� ������������ )
        substitutions.add(new SuffixSubstitution("���", "���")); // EX: (���� ����������� )
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (����� ����������ǡ )
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (���� ������������ )
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (���� �����������ǡ )
    }


    public List getSubstitutions() {
        return substitutions;
    }
}
