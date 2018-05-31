package parser;

public class XMLParserFactory {
    public static XMLParser getParser(FileWorker worker) {
        return new XMLParserImpl(worker);
    }

    public static XMLParser getBasicXMLParser(String filename) {
        return new XMLParserImpl(new BasicXMLFileWorker(filename));
    }
}
