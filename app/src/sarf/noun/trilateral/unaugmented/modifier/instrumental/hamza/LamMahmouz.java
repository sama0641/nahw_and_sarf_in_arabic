package sarf.noun.trilateral.unaugmented.modifier.instrumental.hamza;

import java.util.*;

import sarf.noun.*;
import sarf.verb.trilateral.Substitution.*;
import sarf.noun.trilateral.unaugmented.modifier.IUnaugmentedTrilateralNounModificationApplier;
import sarf.noun.trilateral.unaugmented.modifier.*;


public class LamMahmouz extends AbstractLamMahmouz {
    List substitutions = new LinkedList();

    public LamMahmouz() {

        substitutions.add(new SuffixSubstitution("���","���"));// EX: (���������)
        substitutions.add(new SuffixSubstitution("���","���"));// EX: (���������)
        substitutions.add(new InfixSubstitution("����","���"));// EX: (������)
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (��������)
        substitutions.add(new InfixSubstitution("����", "���")); // EX: (��������)
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (��������)
        substitutions.add(new InfixSubstitution("����", "��")); // EX: (�������)
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (�������� �����ɡ ��������)
        substitutions.add(new InfixSubstitution("��", "��")); // EX: (�����)
    }


    public List getSubstitutions() {
        return substitutions;
    }
}
