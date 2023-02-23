package sarf.noun.trilateral.augmented.modifier.activeparticiple.hamza;

import java.util.*;

import sarf.noun.*;
import sarf.verb.trilateral.Substitution.*;
import sarf.noun.trilateral.augmented.modifier.*;


public class EinMahmouz extends AbstractEinMahmouz {
    List substitutions = new LinkedList();

    public EinMahmouz() {

        substitutions.add(new InfixSubstitution("���","���"));// EX: (������ ������)
        substitutions.add(new InfixSubstitution("���","���"));// EX: (������ ������)
        substitutions.add(new InfixSubstitution("���","���"));// EX: (��������)
        substitutions.add(new InfixSubstitution("����","����"));// EX: (������� ���������)
        substitutions.add(new InfixSubstitution("��","��"));// EX: (�������� �������� ��������)
        substitutions.add(new InfixSubstitution("��","��"));// EX: (�������� ���������� ���������� �����������)
        substitutions.add(new InfixSubstitution("���","���"));// EX: (��������� �����������)
        substitutions.add(new InfixSubstitution("���","���"));// EX: (���������)
        substitutions.add(new InfixSubstitution("���","���"));// EX: (���������)

    }


    public List getSubstitutions() {
        return substitutions;
    }
}
