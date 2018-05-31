package main;

import parser.XMLParserFactory;

import java.io.FileNotFoundException;

public class Application {
    private static String fileName = "filename";

    public static void main(String[] args) {
        XMLParserFactory.getBasicXMLParser(fileName).next();
    }
}
