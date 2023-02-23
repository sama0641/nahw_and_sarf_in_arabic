package sarf.noun.trilateral.unaugmented.modifier.activeparticiple.vocalizer;

import java.util.*;

import sarf.noun.*;
import sarf.noun.trilateral.unaugmented.modifier.*;
import sarf.verb.trilateral.Substitution.*;


public class WawiLafifNakesVocalizer extends TrilateralNounSubstitutionApplier implements IUnaugmentedTrilateralNounModificationApplier {
    List substitutions = new LinkedList();

    public WawiLafifNakesVocalizer() {
        substitutions.add(new InfixSubstitution("���", "�")); // EX: (��� ����)
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (����� �������)
        substitutions.add(new InfixSubstitution("���", "�")); // EX: (����� ��� ����)
        substitutions.add(new SuffixSubstitution("���", "��")); // EX: (��� �������� ����� ������ɡ )
        substitutions.add(new SuffixSubstitution("���", "���")); // EX: (����� ������� ������ ������ɡ )
        substitutions.add(new SuffixSubstitution("���", "��")); // EX: (����� ��� ������� ����� ������ɡ )
        substitutions.add(new InfixSubstitution("���", "���")); // EX: (�������� ��������� ������������ �������� )
        substitutions.add(new InfixSubstitution("���", "�")); // EX: (������� )
        substitutions.add(new InfixSubstitution("���", "�")); // EX: (������� )
    }


    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        if (conjugationResult.getRoot().getC3() != '�')
            return false;

        int kov = conjugationResult.getKov();
        int noc = Integer.parseInt(conjugationResult.getRoot().getConjugation());

        switch (kov) {
        case 21:
            return noc == 1 || noc == 5;

        case 22:
            return noc == 1 || noc == 3;

        case 23:
            switch (noc) {
            case 1:
            case 3:
            case 4:
            case 5:
                return true;
            }

        case 28:
            return noc == 4;
        }
        return false;
    }
}
