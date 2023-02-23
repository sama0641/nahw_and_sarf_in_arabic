package xml;



public class XmlPropertyElement extends XmlDataElement{

    public XmlPropertyElement(String name, String value) {
        super(name,value);
    }

    public String toString() {
        return "<property name= \""+name+"\" value= \"" + value + "\"/>";
    }
}
