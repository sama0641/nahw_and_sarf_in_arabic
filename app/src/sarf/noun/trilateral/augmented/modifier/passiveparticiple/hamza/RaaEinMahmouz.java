package sarf.noun.trilateral.augmented.modifier.passiveparticiple.hamza;

import java.util.*;

import sarf.noun.*;
import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.augmented.*;
import sarf.verb.trilateral.augmented.modifier.*;


public class RaaEinMahmouz extends TrilateralNounSubstitutionApplier implements IAugmentedTrilateralModifier {
    List substitutions = new LinkedList();

    public RaaEinMahmouz() {

        substitutions.add(new InfixSubstitution("���","�"));// EX: (����� )
        substitutions.add(new InfixSubstitution("���","�"));// EX: (��������� )

    }


    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        AugmentedTrilateralRoot root = conjugationResult.getRoot();
        return root.getC1() == '�' && root.getC2() == '�' && root.getC3() == '�' && conjugationResult.getFormulaNo() == 1;
    }
}
