package sarf.verb.trilateral.augmented.modifier.hamza.lam.active;

import java.util.*;

import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.augmented.modifier.hamza.lam.*;


public class ImperativeMahmouz extends AbstractLamMahmouz {

    private List substitutions = new LinkedList();

    public ImperativeMahmouz() {
        substitutions.add(new InfixSubstitution("���","���"));// EX: (�������ǡ )
        substitutions.add(new InfixSubstitution("���","���"));// EX: (��������ǡ )
        substitutions.add(new InfixSubstitution("��","��"));// EX: (��������� ������� ���������� ��������� ��������� ������������ ������� )
        substitutions.add(new InfixSubstitution("��","��"));// EX: (������ )
        substitutions.add(new InfixSubstitution("���","���"));// EX: (�������� )
        substitutions.add(new InfixSubstitution("���","���"));// EX: (�������� ��������� �������)
        substitutions.add(new InfixSubstitution("���","���"));// EX: (�������ǡ )
        substitutions.add(new InfixSubstitution("���","���"));// EX: (��������ǡ )
        substitutions.add(new InfixSubstitution("����","����"));// EX: (���������� ����������� )
        substitutions.add(new InfixSubstitution("����","����"));// EX: (���������ǡ )
        substitutions.add(new InfixSubstitution("����","����"));// EX: (����������ǡ )
        substitutions.add(new InfixSubstitution("���","���"));// EX: (��������ǡ )
    }


    public List getSubstitutions() {
        return substitutions;
    }
}
