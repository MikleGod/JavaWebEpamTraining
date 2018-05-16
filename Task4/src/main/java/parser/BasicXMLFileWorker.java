package parser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import static parser.XMLParserImpl.*;

public class BasicXMLFileWorker implements FileWorker {
    private Scanner scanner;

    public BasicXMLFileWorker(Scanner scanner) {
        this.scanner = scanner;
    }

    public BasicXMLFileWorker(String filename) {
        try {
            this.scanner = new Scanner(new FileReader(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace(); // throw new custom exception
        }
    }

    @Override
    public String findFirstTag() {
        scanner.useDelimiter(tagBegin).next();
        return scanner.useDelimiter(tagEnd).next().replaceAll(tagBegin, emptySymbol).trim();
    }

    @Override
    public String findNextTag() {
        String tag = scanner.useDelimiter(tagEnd).next();
        while (!tag.contains(backSlash + tagEnd) && tag.contains(backSlash)) {
            scanner.useDelimiter(tagBegin).next();
            tag = scanner.useDelimiter(tagEnd).next();
        }
        return tag;
    }

    @Override
    public String findContent() {
        return scanner.useDelimiter(tagBegin).next().replaceAll(tagEnd, emptySymbol).trim();
    }

    @Override
    public void close() throws IOException {
        scanner.close();
    }
}
