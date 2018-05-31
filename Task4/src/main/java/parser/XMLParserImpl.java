package parser;

import exception.FileEndException;

import java.io.IOException;
import java.util.HashMap;

public class XMLParserImpl implements XMLParser {

    static final String tagBegin = "<";
    static final String tagEnd = ">";
    static final String emptySymbol = "";
    static final String backSlash = "/";

    private static final String whiteSpace = " ";
    private static final String equals = "=";
    private static final String quotes = "\"";

    private String tagName;
    private HashMap<String, String> attributes;
    private String content;
    private FileWorker worker;

    XMLParserImpl(FileWorker worker) {
        this.worker = worker;
        parseFirstTag(worker.findFirstTag());
    }

    public XMLParser next() throws FileEndException {
        try {
            parseTag(worker.findNextTag());
        } catch (Exception e) {
            try {
                worker.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            throw new FileEndException();
        }
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

    @Override
    public void close() {
        try {
            worker.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void parseFirstTag(String rootTag) {
        String[] nameAndAttrs = rootTag.split(whiteSpace);
        tagName = nameAndAttrs[0];
        attributes = new HashMap<String, String>();
        for (int i = 1; i < nameAndAttrs.length; i++) {
            String[] attrAndValue = nameAndAttrs[i].split(equals);
            attributes.put(attrAndValue[0], attrAndValue[1].replaceAll(quotes, emptySymbol));
        }
        content = worker.findContent();
    }


    private void parseTag(String tag) {
        tag = tag.replaceAll(tagEnd, emptySymbol);
        tag = tag.replaceAll(tagBegin, emptySymbol);
        String[] nameAndAttrs = tag.split(whiteSpace);
        tagName = nameAndAttrs[0];
        for (int i = 1; i < nameAndAttrs.length; i++) {
            String[] attrAndValue = nameAndAttrs[i].split(equals);
            attributes.put(attrAndValue[0], attrAndValue[1].replaceAll(quotes, emptySymbol));
        }
        content = worker.findContent();
    }
}
