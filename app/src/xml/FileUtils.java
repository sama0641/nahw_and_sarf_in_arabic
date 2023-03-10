package xml;
import java.io.*;


public class FileUtils {

    public static String getExtension(File f) {
        String ext = null;
        String s = f.getName();
        int i = s.lastIndexOf('.');

        if (i > 0 &&  i < s.length() - 1) {
            ext = s.substring(i+1).toLowerCase();
        }
        return ext;
    }

    public static String getNameWithoutExtension(String name){
        return name.substring(0, name.lastIndexOf("."));
    }
    public static String getNameWithoutExtension(File file){
        return getNameWithoutExtension(file.getName());
    }
}
