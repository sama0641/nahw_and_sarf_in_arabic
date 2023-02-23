package sarf.verb.trilateral.augmented.modifier.hamza.lam.passive;

import java.util.*;

import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.augmented.modifier.hamza.lam.*;


public class PastMahmouz extends AbstractLamMahmouz {

    private List substitutions = new LinkedList();

    public PastMahmouz() {
        substitutions.add(new SuffixSubstitution("���", "���")); // EX: (������� )
        substitutions.add(new InfixSubstitution("��", "��")); // EX: (������ǡ ���������)
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (��������� )
        substitutions.add(new InfixSubstitution("��", "��")); // EX: (�������� ������� ��������� �������� ��������� ���������� ���������� )
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (������� ��������� )
    }


    public List getSubstitutions() {
        return substitutions;
    }
}
