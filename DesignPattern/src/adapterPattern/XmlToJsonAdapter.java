package adapterPattern;

public class XmlToJsonAdapter implements JsonService {
    private XmlService xmlService;

    public XmlToJsonAdapter(XmlService xmlService) {
        this.xmlService = xmlService;
    }

    @Override
    public void processJson(String json) {
        System.out.println("Adapting JSON to XML");
        xmlService.processXml("<xml>Converted Data</xml>");    }
}
