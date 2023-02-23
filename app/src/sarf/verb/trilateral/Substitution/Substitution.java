package sarf.verb.trilateral.Substitution;

import sarf.verb.trilateral.*;


public abstract class Substitution {
    protected String segment;
    protected String result;

    public Substitution(String segment, String result) {
        this.segment = segment;
        this.result = result;
    }

    /**
     * check wheather this Substitution cn be applied for this root and word (which generated form this root)
     * if ok the result will be used
     * @param word String
     * @return String
     */
    public abstract String apply(String word, TrilateralRoot root);
}
