package sarf.noun;

import java.util.*;

import sarf.verb.quadriliteral.substitution.*;


public abstract class QuadrilateralNounSubstitutionApplier extends SubstitutionsApplier {

    protected static List appliedProunounsIndecies = new ArrayList(18);
    static {
        for (int i=0; i<18; i++) {
            appliedProunounsIndecies.add(i+1 +"");
        }
    }

    public QuadrilateralNounSubstitutionApplier() {
    }

    protected List getAppliedPronounsIndecies() {
        return appliedProunounsIndecies;
    }

}
