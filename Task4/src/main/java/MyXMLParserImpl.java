import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class MyXMLParserImpl implements MyXMLParser {

    private static String tagBegin = "<";
    private static String tagEnd = ">";
    private static String emptySymbol = "";
    private static String whiteSpace = " ";
    private static String equals = "=";
    private static String backSlash = "/";
    private static String quotes = "\"";
    private String tagName;
    private HashMap<String, String> attributes;
    private String content;
    private Scanner scanner;

    public static MyXMLParser getParser(String fileName) throws FileNotFoundException {
        return new MyXMLParserImpl(new Scanner(new FileReader(fileName)));
    }

    private MyXMLParserImpl(Scanner scanner){
        this.scanner = scanner;
        parseFirstTag(findFirstTag());
        //TODO заинить инфу о первом тэге
    }

    private String findFirstTag() {
        scanner.useDelimiter(tagBegin).next();
        return scanner.useDelimiter(tagEnd).next().replaceAll(tagBegin, emptySymbol).trim();
    }

    private void parseFirstTag(String rootTag) {
        String[] nameAndAttrs = rootTag.split(whiteSpace);
        tagName = nameAndAttrs[0];
        attributes = new HashMap<String, String>();
        for (int i = 1; i<nameAndAttrs.length; i++){
            String[] attrAndValue = nameAndAttrs[i].split(equals);
            attributes.put(attrAndValue[0], attrAndValue[1].replaceAll(quotes, emptySymbol));
        }
        content = scanner.useDelimiter(tagBegin).next().replaceAll(tagEnd, emptySymbol).trim();
    }

    public MyXMLParser next() {
        parseTag(findNextTag());
        return this;
    }

    public boolean isEmpty() {
        return content.isEmpty();
    }

    public String getAttribute(String key) {
        return attributes.get(key);
    }

    public String getContent() {
        return content;
    }

    public String getTagName() {
        return tagName;
    }

    private String findNextTag() {
        String tag = scanner.useDelimiter(tagEnd).next();
        while (!tag.contains(backSlash+tagEnd) && tag.contains(backSlash)){
            scanner.useDelimiter(tagBegin).next();
            tag = scanner.useDelimiter(tagEnd).next();
        }
        return tag;
    }

    private void parseTag(String tag) {
        tag = tag.replaceAll(tagEnd, emptySymbol);
        tag = tag.replaceAll(tagBegin, emptySymbol);
        String[] nameAndAttrs = tag.split(whiteSpace);
        tagName = nameAndAttrs[0];
        for (int i = 1; i<nameAndAttrs.length; i++){
            String[] attrAndValue = nameAndAttrs[i].split(equals);
            attributes.put(attrAndValue[0], attrAndValue[1].replaceAll(quotes, emptySymbol));
        }
        content = scanner.useDelimiter(tagBegin).next().replaceAll(tagEnd, emptySymbol).trim();
    }
}
