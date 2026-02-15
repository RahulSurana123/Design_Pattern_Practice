package AdapterPattern;

/**
 * XMLData Class
 * 
 * A class that stores XML data and provides methods to retrieve it when needed.
 * This class can be used in the Adapter Pattern to hold and manage XML formatted data.
 */
public class XMLData {
    private String xmlContent;
    private String rootElement;

    /**
     * Constructor - Initializes XMLData with XML content
     * @param xmlContent The XML data as a string
     */
    public XMLData(String xmlContent) {
        this.xmlContent = xmlContent;
        this.rootElement = extractRootElement(xmlContent);
    }

    /**
     * Get the complete XML data
     * @return The XML content
     */
    public String getXMLData() {
        return xmlContent;
    }

    /**
     * Set new XML data
     * @param xmlContent The new XML content
     */
    public void setXMLData(String xmlContent) {
        this.xmlContent = xmlContent;
        this.rootElement = extractRootElement(xmlContent);
    }

    /**
     * Get the root element name
     * @return The name of the root XML element
     */
    public String getRootElement() {
        return rootElement;
    }

    /**
     * Get XML data formatted with indentation for better readability
     * @return Formatted XML string
     */
    public String getFormattedXMLData() {
        // Simple formatting - add newlines and indentation
        return xmlContent.replaceAll(">", ">\n").replaceAll("<", "\n<");
    }

    /**
     * Get the size of XML data in bytes
     * @return Size of XML content
     */
    public int getDataSize() {
        return xmlContent.getBytes().length;
    }

    /**
     * Extract the root element name from XML content
     * @param xmlContent The XML string
     * @return The root element name
     */
    private String extractRootElement(String xmlContent) {
        if (xmlContent == null || xmlContent.trim().isEmpty()) {
            return "";
        }
        
        // Find the first opening tag
        int startIndex = xmlContent.indexOf('<');
        int endIndex = xmlContent.indexOf('>', startIndex);
        
        if (startIndex != -1 && endIndex != -1) {
            String tagContent = xmlContent.substring(startIndex + 1, endIndex);
            // Remove attributes and get just the tag name
            String[] parts = tagContent.split("\\s+");
            return parts[0];
        }
        
        return "";
    }

    /**
     * Check if XML data is empty
     * @return true if XML content is empty or null
     */
    public boolean isEmpty() {
        return xmlContent == null || xmlContent.trim().isEmpty();
    }

    @Override
    public String toString() {
        return "XMLData{" +
                "rootElement='" + rootElement + '\'' +
                ", dataSize=" + getDataSize() +
                '}';
    }
}

