package sarf.noun.trilateral.unaugmented.modifier.elative.vocalizer;

import java.util.*;

import sarf.noun.*;
import sarf.noun.trilateral.unaugmented.modifier.*;
import sarf.verb.trilateral.Substitution.*;


public class WawiLafifNakesVocalizer extends TrilateralNounSubstitutionApplier implements IUnaugmentedTrilateralNounModificationApplier {
    List substitutions = new LinkedList();

    public WawiLafifNakesVocalizer() {
        substitutions.add(new SuffixSubstitution("���","��"));// EX: (��� ������ )
        substitutions.add(new SuffixSubstitution("���","��"));// EX: (����� ������ )
        substitutions.add(new SuffixSubstitution("���","��"));// EX: (����� ��� ������ )
        substitutions.add(new InfixSubstitution("���","���"));// EX: (��������)
        substitutions.add(new InfixSubstitution("����","���"));// EX: (���������)
        substitutions.add(new InfixSubstitution("����","���"));// EX: (���������)
        substitutions.add(new InfixSubstitution("����","����"));// EX: (������)
        substitutions.add(new InfixSubstitution("����","����"));// EX: (����������)
    }


    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        int kov = conjugationResult.getKov();
        if (kov != 23) {
            return false;
        }

        int noc = Integer.parseInt(conjugationResult.getRoot().getConjugation());
        switch (noc) {
        case 1:
        case 3:
        case 4:
        case 5:
            return true;
        }

        return false;
    }
}
