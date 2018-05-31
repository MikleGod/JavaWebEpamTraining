package parser;

import exception.FileEndException;

import java.io.Closeable;

public interface XMLParser extends Closeable{
    XMLParser next() throws FileEndException;

    boolean isEmpty();
    String getAttribute(String key);
    String getContent();
    String getTagName();
}
