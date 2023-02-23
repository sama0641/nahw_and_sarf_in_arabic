package sarf.verb.trilateral.unaugmented.modifier.vocalizer.mithal;

import java.util.*;

import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.unaugmented.modifier.*;
import sarf.verb.trilateral.unaugmented.ConjugationResult;


public class WawiPassivePresentVocalizer extends SubstitutionsApplier implements IUnaugmentedTrilateralModifier {

    private List substitutions = new LinkedList();

    public WawiPassivePresentVocalizer() {
        substitutions.add(new InfixSubstitution("���","��"));// EX: (�������� �������� �������� )
    }


    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        int kov = conjugationResult.getKov();
        int noc = Integer.parseInt(conjugationResult.getRoot().getConjugation());
        return (kov == 9  && noc == 2) ||
                (kov == 10 && (noc == 3 || noc == 4 || noc == 5)) ||
                (kov == 11 && (noc == 2 || noc == 3 || noc == 4 || noc == 5));
    }
}
