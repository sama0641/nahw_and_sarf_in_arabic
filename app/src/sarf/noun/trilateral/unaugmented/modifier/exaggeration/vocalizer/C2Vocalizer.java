package sarf.noun.trilateral.unaugmented.modifier.exaggeration.vocalizer;

import java.util.*;

import sarf.noun.*;
import sarf.verb.trilateral.unaugmented.modifier.*;

import sarf.verb.trilateral.Substitution.*;
import sarf.noun.trilateral.unaugmented.modifier.*;


public class C2Vocalizer extends TrilateralNounSubstitutionApplier implements IUnaugmentedTrilateralNounModificationApplier {
    List substitutions = new LinkedList();

    public C2Vocalizer() {
        substitutions.add(new InfixSubstitution("��","��"));// EX: (������ )
        substitutions.add(new InfixSubstitution("��","��"));// EX: (�������� ������� )
    }


    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        String nounFormula = conjugationResult.getNounFormula();
        if (!nounFormula.equals("��������")) {
            return false;
        }

        int kov = conjugationResult.getKov();
        int noc = Integer.parseInt(conjugationResult.getRoot().getConjugation());

        switch (kov) {
        case 23:
            switch (noc) {
            case 1:
            case 3:
            case 5:
                return true;
            }

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
