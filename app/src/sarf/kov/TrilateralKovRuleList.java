package sarf.kov;

import java.util.*;


public class TrilateralKovRuleList {
    private List rules = new ArrayList(33);

    public TrilateralKovRuleList() {
    }

    public void addRule(TrilateralKovRule rule) {
        rules.add(rule);
    }

    public List getRules() {
        return rules;
    }
}
