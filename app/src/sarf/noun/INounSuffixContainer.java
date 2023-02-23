package sarf.noun;


public interface INounSuffixContainer {

    public void selectDefiniteMode() ;
    public void selectInDefiniteMode();
    public void selectAnnexedMode() ;
    public String getPrefix() ;
    public String get(int index) ;
}
