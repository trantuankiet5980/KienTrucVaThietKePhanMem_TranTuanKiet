package adapterPattern;

public class AdapterMain {
    public static void main(String[] args) {
        JsonService jsonProcessor = new JsonProcessor();
        jsonProcessor.processJson("JSON data");

        XmlService xmlService = new XmlService();
        JsonService xmlToJsonAdapter = new XmlToJsonAdapter(xmlService);
        xmlToJsonAdapter.processJson("JSON data");
    }
}
