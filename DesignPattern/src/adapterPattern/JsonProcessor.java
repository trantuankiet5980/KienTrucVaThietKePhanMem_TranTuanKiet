package adapterPattern;

public class JsonProcessor implements JsonService {
    @Override
    public void processJson(String json) {
        System.out.println("Processing JSON: " + json);
    }
}
