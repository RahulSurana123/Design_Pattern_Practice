package AdapterPattern;

public class Demo {

    public static void main(String[] args) {
        // Create a JSON log
        JsonLog jsonLog = new JsonLog("{\"message\": \"This is a JSON log.\"}");
        XMLLog xmlData = new XMLLog("<xml><data>This is an XML log.</data></xml>");

        // Use the adapter to convert JSON log to XML format
        XMLLogGenerator xmlLogGenerator = new JsonToXmlAdapter(jsonLog);

        // Generate and print the XML log
        String xmlLog = xmlLogGenerator.generateXML();
        System.out.println(xmlLog);
        System.out.println(xmlData.generateXML());
    }
}