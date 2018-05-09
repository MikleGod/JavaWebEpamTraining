public interface MyXMLParser {
    MyXMLParser next();

    boolean isEmpty();
    String getAttribute(String key);
    String getContent();
    String getTagName();
}
