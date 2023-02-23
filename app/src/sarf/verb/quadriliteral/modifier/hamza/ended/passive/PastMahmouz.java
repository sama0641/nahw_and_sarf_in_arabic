package sarf.verb.quadriliteral.modifier.hamza.ended.passive;

import java.util.*;

import sarf.verb.quadriliteral.substitution.*;


public class PastMahmouz extends SubstitutionsApplier {

    private List substitutions = new LinkedList();

    public PastMahmouz() {
        substitutions.add(new InfixSubstitution("��","��"));// EX: (�������� ���������� �����������)
    }


    public List getSubstitutions() {
        return substitutions;
    }
}
