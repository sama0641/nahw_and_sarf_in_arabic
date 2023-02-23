package sarf.verb.trilateral.augmented.modifier.hamza.ein.active;

import java.util.*;

import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.augmented.modifier.hamza.ein.*;


public class ImperativeMahmouz extends AbstractEinMahmouz {

    private List substitutions = new LinkedList();

    public ImperativeMahmouz() {
        substitutions.add(new InfixSubstitution("����","����"));// EX: (�����������)
        substitutions.add(new SuffixSubstitution("���","���"));// EX: (�����)
        substitutions.add(new SuffixSubstitution("���","���"));// EX: (�������� �������)
        substitutions.add(new SuffixSubstitution("���","���"));// EX: (�����)
        substitutions.add(new SuffixSubstitution("����","����"));// EX: (�����)
        substitutions.add(new InfixSubstitution("��","��"));// EX: (�������� ������������ �������� ���������� ���������� ��������� ������)
        substitutions.add(new InfixSubstitution("����","����"));// EX: (��������  )
        substitutions.add(new InfixSubstitution("����","����"));// EX: (��������� )
        substitutions.add(new InfixSubstitution("����","����"));// EX: (������ǡ  )
        substitutions.add(new InfixSubstitution("���","���"));// EX: (��������ǡ ���������)
        substitutions.add(new InfixSubstitution("���","���"));// EX: (������ǡ )
        substitutions.add(new InfixSubstitution("���","���"));// EX: (�������� ���������� )
        substitutions.add(new InfixSubstitution("���","���"));// EX: (��������� )
        substitutions.add(new InfixSubstitution("���","���"));// EX: (�����ǡ )
    }


    public List getSubstitutions() {
        return substitutions;
    }
}
