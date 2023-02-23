package sarf.noun.trilateral.unaugmented.modifier.elative.vocalizer;

import java.util.*;

import sarf.noun.*;
import sarf.verb.trilateral.unaugmented.modifier.*;

import sarf.verb.trilateral.Substitution.*;
import sarf.noun.trilateral.unaugmented.modifier.*;


public class YaeiLafifNakesVocalizer extends TrilateralNounSubstitutionApplier implements IUnaugmentedTrilateralNounModificationApplier {
    List substitutions = new LinkedList();

    public YaeiLafifNakesVocalizer() {
        substitutions.add(new SuffixSubstitution("���","��"));// EX: (��� ������ )
        substitutions.add(new SuffixSubstitution("���","��"));// EX: (����� ������ )
        substitutions.add(new SuffixSubstitution("���","��"));// EX: (����� ��� ������ )
        substitutions.add(new InfixSubstitution("����","���"));// EX: (����������)
        substitutions.add(new InfixSubstitution("����","���"));// EX: (����������)
        substitutions.add(new InfixSubstitution("����","����"));// EX: (������)
    }


    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        int kov = conjugationResult.getKov();
        int noc = Integer.parseInt(conjugationResult.getRoot().getConjugation());

        switch (kov) {
        case 26:
            switch (noc) {
            case 2:
            case 3:
            case 4:
                return true;
            }
        case 28:
            return noc == 2 || noc == 4;
        }
        return false;
    }
}
