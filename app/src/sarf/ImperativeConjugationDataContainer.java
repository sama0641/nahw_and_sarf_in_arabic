package sarf;

import java.util.*;

import sarf.util.*;
import sarf.*;

public class ImperativeConjugationDataContainer {

   
    private List lastDimList = new ArrayList(13);
   
    private List emphasizedLastDimList = new ArrayList(13);

   
    private List connectedPronounList = new ArrayList(13);
    
    private List emphasizedConnectedPronounList = new ArrayList(13);

    private static ImperativeConjugationDataContainer instance = new ImperativeConjugationDataContainer();

    public static ImperativeConjugationDataContainer getInstance() {
        return instance;
    }

    public List getEmphasizedConnectedPronounList() {
        return emphasizedConnectedPronounList;
    }

    public List getEmphasizedLastDimList() {
        return emphasizedLastDimList;
    }

    public List getConnectedPronounList() {
        return connectedPronounList;
    }

    public List getLastDimList() {
        return lastDimList;
    }

    private ImperativeConjugationDataContainer() {
        lastDimList.add("");
        lastDimList.add("");
        lastDimList.add(ArabCharUtil.SKOON);
        lastDimList.add(ArabCharUtil.KASRA);
        lastDimList.add(ArabCharUtil.FATHA);
        lastDimList.add(ArabCharUtil.DAMMA);
        lastDimList.add(ArabCharUtil.SKOON);
        lastDimList.add("");
        lastDimList.add("");
        lastDimList.add("");
        lastDimList.add("");
        lastDimList.add("");
        lastDimList.add("");

        connectedPronounList.add("");
        connectedPronounList.add("");
        connectedPronounList.add("");
        connectedPronounList.add("�");
        connectedPronounList.add("�");
        connectedPronounList.add("��");
        connectedPronounList.add("��");
        connectedPronounList.add("");
        connectedPronounList.add("");
        connectedPronounList.add("");
        connectedPronounList.add("");
        connectedPronounList.add("");
        connectedPronounList.add("");

        emphasizedLastDimList.add("");
        emphasizedLastDimList.add("");
        emphasizedLastDimList.add(ArabCharUtil.FATHA);
        emphasizedLastDimList.add(ArabCharUtil.KASRA);
        emphasizedLastDimList.add(ArabCharUtil.FATHA);
        emphasizedLastDimList.add(ArabCharUtil.DAMMA);
        emphasizedLastDimList.add(ArabCharUtil.SKOON);
        emphasizedLastDimList.add("");
        emphasizedLastDimList.add("");
        emphasizedLastDimList.add("");
        emphasizedLastDimList.add("");
        emphasizedLastDimList.add("");
        emphasizedLastDimList.add("");

        emphasizedConnectedPronounList.add("");
        emphasizedConnectedPronounList.add("");
        emphasizedConnectedPronounList.add("���");
        emphasizedConnectedPronounList.add("���");
        emphasizedConnectedPronounList.add("����");
        emphasizedConnectedPronounList.add("���");
        emphasizedConnectedPronounList.add("������");
        emphasizedConnectedPronounList.add("");
        emphasizedConnectedPronounList.add("");
        emphasizedConnectedPronounList.add("");
        emphasizedConnectedPronounList.add("");
        emphasizedConnectedPronounList.add("");
        emphasizedConnectedPronounList.add("");
    }

    /**
     
     * @param pronounIndex int
     * @return String
     */
    public String getLastDim(int pronounIndex) {
        return (String) lastDimList.get(pronounIndex);
    }

    /**
    
     * @param pronounIndex int
     * @return String
     */
    public String getEmphasizedLastDim(int pronounIndex) {
        return (String) emphasizedLastDimList.get(pronounIndex);
    }

    /**
   
     * @param pronounIndex int
     * @return String
     */
    public String getConnectedPronoun(int pronounIndex) {
        return (String) connectedPronounList.get(pronounIndex);
    }

    /**
     
     * @param pronounIndex int
     * @return String
     */
    public String getEmphasizedConnectedPronoun(int pronounIndex) {
        return (String) emphasizedConnectedPronounList.get(pronounIndex);
    }
}
