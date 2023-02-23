package sarf.noun.trilateral.unaugmented.modifier.assimilate;

import java.util.*;

import sarf.noun.trilateral.unaugmented.modifier.*;
import sarf.noun.trilateral.unaugmented.modifier.assimilate.hamza.*;
import sarf.verb.trilateral.Substitution.*;


public class Mahmouz {
    private List modifiers = new LinkedList();

    public Mahmouz() {
        modifiers.add(new FaaMahmouz());
        modifiers.add(new EinMahmouz());
        modifiers.add(new LamMahmouz());
    }

    public void apply(ConjugationResult conjResult) {
        Iterator iter = modifiers.iterator();
        while (iter.hasNext()) {
            IUnaugmentedTrilateralNounModificationApplier modifier = (IUnaugmentedTrilateralNounModificationApplier) iter.next();
            if (modifier.isApplied(conjResult)) {
                ((SubstitutionsApplier) modifier).apply(conjResult.getFinalResult(), conjResult.getRoot());
                break;
            }
        }
    }
}
