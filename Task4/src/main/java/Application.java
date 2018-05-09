import java.io.FileNotFoundException;

public class Application {
    private static String fileName = "filename";

    public static void main(String[] args) {
        try {
            MyXMLParserImpl.getParser(fileName).next();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
