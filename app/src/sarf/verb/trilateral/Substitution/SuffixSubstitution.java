package sarf.verb.trilateral.Substitution;

import sarf.verb.trilateral.TrilateralRoot;


public class SuffixSubstitution extends Substitution {

    public SuffixSubstitution(String segment, String result) {
        super(segment, result);
    }

    /**
     *
     * @param word String
     * @return String
     */
    public String apply(String word, TrilateralRoot root) {
        if (word.endsWith(segment)) {
            int changeIndex = word.lastIndexOf(segment);
            //String replacement = word.substring(changeIndex, word.length());
            //replacement.replaceAll(segment, result);
            return word.substring(0,changeIndex) + result;
        }
        return  null;
    }
}
