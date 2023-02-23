package sarf.verb.trilateral.Substitution;

import sarf.verb.trilateral.TrilateralRoot;


public class PrefixSubstitution extends Substitution {

    public PrefixSubstitution(String segment, String result) {
        super(segment, result);
    }

    /**
     *
     * @param word String
     * @return String
     */
    public String apply(String word, TrilateralRoot root) {
        return word.startsWith(segment)? word.replaceFirst(segment,result): null;
    }
}
