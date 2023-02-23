package sarf.verb.trilateral.augmented.modifier.hamza.lam.active;

import java.util.*;

import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.augmented.modifier.hamza.lam.*;


public class PastMahmouz extends AbstractLamMahmouz {

    private List substitutions = new LinkedList();

    public PastMahmouz() {
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (���������� �������� ���������� ���������� ���������� ������������� �������������)
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (������� ������ ��������� ������� ������� ���������� ����������� )
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (��������ǡ �������ǡ ��������ǡ ��������ǡ ��������ǡ �����������ǡ �������������)
        substitutions.add(new InfixSubstitution("����", "����")); // EX: (���������� ������������ )
        substitutions.add(new InfixSubstitution("����", "����")); // EX: (������� ���������)
        substitutions.add(new InfixSubstitution("����", "����")); // EX: (��������ǡ ����������ǡ )
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (����� ������ )
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (������ǡ �������ǡ )
    }


    public List getSubstitutions() {
        return substitutions;
    }
}
