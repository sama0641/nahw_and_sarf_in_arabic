package sarf.verb.trilateral.augmented.modifier.geminator.generic;

import sarf.verb.trilateral.Substitution.*;
import java.util.List;
import java.util.*;
import sarf.verb.trilateral.unaugmented.active.*;
import sarf.verb.trilateral.unaugmented.*;


public class ActivePastGeminator extends SubstitutionsApplier {

    private List substitutions = new LinkedList();

    public ActivePastGeminator() {
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3�","�C3��"));// EX: (�������)
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3�","�C3��"));// EX: (��������ǡ)
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3�","�C3��"));// EX: (����� �������)
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3�","�C3��"));// EX: (������ǡ ���������)
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3�","�C3��"));// EX: (������)
        substitutions.add(new ExpressionInfixSubstitution("�C3�C3�","�C3��"));// EX: (��������)
    }

    public List getSubstitutions() {
        return substitutions;
    }
}
