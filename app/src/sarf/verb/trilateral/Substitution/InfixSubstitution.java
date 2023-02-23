package sarf.verb.trilateral.Substitution;

import sarf.verb.trilateral.TrilateralRoot;


public class InfixSubstitution extends Substitution {

    public InfixSubstitution(String segment, String result) {
        super(segment, result);
    }

    /**
     *
     * @param word String
     * @return String
     */
    public String apply(String word, TrilateralRoot root) {
        return word.indexOf(segment) != -1? word.replaceAll(segment,result): null;
    }
}
