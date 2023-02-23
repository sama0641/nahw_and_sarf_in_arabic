package sarf.gerund.trilateral.unaugmented;

import java.util.*;


public class GerundDescriptionList {
    private Map gerundsBySymbol = new HashMap();
    private Map gerundsByPattern = new HashMap();

    public GerundDescriptionList() {
    }

    public void addGerundDescription(GerundDescription gerundDescription) {
        gerundsBySymbol.put(gerundDescription.getSymbol(), gerundDescription);
        gerundsByPattern.put(gerundDescription.getPattern(), gerundDescription);
    }

    public GerundDescription getGerundDescriptionBySymbol(String symbol) {
        return (GerundDescription) gerundsBySymbol.get(symbol);
    }

    public GerundDescription getGerundDescriptionByPattern(String pattern) {
        return (GerundDescription) gerundsByPattern.get(pattern);
    }

}
