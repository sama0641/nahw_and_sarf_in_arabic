package sarf.ui;

import java.io.File;


public interface IHtmlContentSaver {
    public boolean saveToHtml(File file);
    public String getSavedFileNameTitle();
}
