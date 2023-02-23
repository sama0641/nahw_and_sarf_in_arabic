package sarf.kov;

import java.util.*;


public class QuadrilateralKovRuleList {
    private List rules = new ArrayList(20);

    public QuadrilateralKovRuleList() {
    }

    public void addRule(QuadrilateralKovRule rule) {
        rules.add(rule);
    }

    public List getRules() {
        return rules;
    }
}
