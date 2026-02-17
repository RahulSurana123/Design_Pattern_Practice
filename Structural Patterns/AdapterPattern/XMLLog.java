package AdapterPattern;

/**
 * XMLData Class
 * 
 * A class that stores XML data and provides methods to retrieve it when needed.
 * This class can be used in the Adapter Pattern to hold and manage XML formatted data.
 */
public class XMLLog implements XMLLogGenerator {
    private String xmlData;

    public XMLLog(String xmlData) {
        this.xmlData = xmlData;
    }

    @Override
    public String generateXML() {
        return this.xmlData;
    }
}

