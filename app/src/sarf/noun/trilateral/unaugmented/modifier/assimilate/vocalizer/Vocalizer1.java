package sarf.noun.trilateral.unaugmented.modifier.assimilate.vocalizer;

import java.util.*;

import sarf.noun.*;
import sarf.verb.trilateral.unaugmented.modifier.*;

import sarf.verb.trilateral.Substitution.*;
import sarf.noun.trilateral.unaugmented.modifier.*;


public class Vocalizer1 extends TrilateralNounSubstitutionApplier implements IUnaugmentedTrilateralNounModificationApplier {
    List substitutions = new LinkedList();

    public Vocalizer1() {
        substitutions.add(new SuffixSubstitution("���", "��")); // EX: (��� ������ )
        substitutions.add(new SuffixSubstitution("���", "��")); // EX: (����� ������ � )
        substitutions.add(new SuffixSubstitution("���", "��")); // EX: (����� ��� ������ � )
    }


    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        String nounFormula = conjugationResult.getNounFormula();
        int kov = conjugationResult.getKov();
        int noc = Integer.parseInt(conjugationResult.getRoot().getConjugation());

        return nounFormula.equals("����") && (kov == 25 || kov == 26) && noc == 4;
    }

}
