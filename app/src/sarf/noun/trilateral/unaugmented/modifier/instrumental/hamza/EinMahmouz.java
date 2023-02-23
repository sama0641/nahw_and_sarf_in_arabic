package sarf.noun.trilateral.unaugmented.modifier.instrumental.hamza;

import java.util.*;

import sarf.noun.*;
import sarf.verb.trilateral.Substitution.*;
import sarf.noun.trilateral.unaugmented.modifier.IUnaugmentedTrilateralNounModificationApplier;
import sarf.noun.trilateral.unaugmented.modifier.*;


public class EinMahmouz extends AbstractEinMahmouz {
    List substitutions = new LinkedList();

    public EinMahmouz() {

        substitutions.add(new InfixSubstitution("�����","����"));// EX: (�������)
        substitutions.add(new InfixSubstitution("����","��"));// EX: (�����)
        substitutions.add(new InfixSubstitution("���","���"));// EX: (������ȡ ��������)
        substitutions.add(new InfixSubstitution("���","���"));// EX: (�������)
        substitutions.add(new InfixSubstitution("���","���"));// EX: (������)
        substitutions.add(new InfixSubstitution("���","���"));// EX: (�����ϡ ������ɡ ������)

    }


    public List getSubstitutions() {
        return substitutions;
    }
}
