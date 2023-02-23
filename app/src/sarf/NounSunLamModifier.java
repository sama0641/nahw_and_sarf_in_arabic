package sarf;

import java.util.*;
import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.TrilateralRoot;


public class NounSunLamModifier extends SubstitutionsApplier {
    protected static List appliedProunounsIndecies = new ArrayList(13);
    static {
        for (int i = 0; i < 18; i++) {
            appliedProunounsIndecies.add(i + 1 + "");
        }
    }


    List substitutions = new LinkedList();

    private NounSunLamModifier() {
        List sunLetters = new LinkedList();
        sunLetters.add("�");
        sunLetters.add("�");
        sunLetters.add("�");
        sunLetters.add("�");
        sunLetters.add("�");
        sunLetters.add("�");
        sunLetters.add("�");
        sunLetters.add("�");
        sunLetters.add("�");
        sunLetters.add("�");
        sunLetters.add("�");
        sunLetters.add("�");
        sunLetters.add("�");
        sunLetters.add("�");

        substitutions.add(new ListedInfixSubstitution(sunLetters,"��SL�","��SL��"));
        substitutions.add(new ListedInfixSubstitution(sunLetters,"��SL�","��SL��"));
        substitutions.add(new ListedInfixSubstitution(sunLetters,"��SL�","��SL��"));
    }

    private static NounSunLamModifier instance = new NounSunLamModifier();

    public static NounSunLamModifier getInstance() {
        return instance;
    }

    public void apply(sarf.verb.trilateral.unaugmented.ConjugationResult conjResult) {
        apply(conjResult.getFinalResult(), null);
    }

    public void apply(sarf.verb.trilateral.augmented.ConjugationResult conjResult) {
        apply(conjResult.getFinalResult(), null);
    }


    public void apply(sarf.verb.quadriliteral.ConjugationResult conjResult) {
        apply(conjResult.getFinalResult(), null);
    }

    public List getSubstitutions() {
        return substitutions;
    }

    protected List getAppliedPronounsIndecies() {
        return appliedProunounsIndecies;
    }

    class ListedInfixSubstitution extends Substitution {
        private List probableChars;
        public ListedInfixSubstitution(List probableChars, String segment, String result) {
            super(segment, result);
            this.probableChars = probableChars;
        }

        /**
         *
         * @param word String
         * @return String
         */
        public String apply(String word, TrilateralRoot root) {
            Iterator iter = probableChars.iterator();
            while (iter.hasNext()) {
                String sl = (String) iter.next();
                String appliedResut = apply(word, sl);
                if (appliedResut != null) {
                    return appliedResut;
                }
            }
            return null;
        }

        public String apply(String word, String sl) {
            String wordSegment = segment.replaceAll("SL", sl);

            if (word.indexOf(wordSegment) == -1) {
                return null;
            }

            String replacedResult = result.replaceAll("SL", sl);
            return word.replaceAll(wordSegment, replacedResult);
        }


    }


}
