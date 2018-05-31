import exception.FileEndException;
import junit.framework.TestCase;
import parser.XMLParser;
import parser.XMLParserFactory;
import parser.XMLParserImpl;

import java.io.FileNotFoundException;

public class ParserTest extends TestCase {

    private XMLParser parser;
    private String fileNameTemp = "Pass To breakfastMenu.xml";
    private String fileName = "C:\\Users\\Mikle\\IdeaProjects\\JavaWebEpamTraining\\Task4\\src\\main\\resources\\breakfastMenu.xml";


    public void testAttribute() {
        reInitParser();
        assertEquals(parser.next().getAttribute("id"), "1");
    }


    public void testContent() {
        reInitParser();
        assertEquals(parser.next().next().getContent(), "Belgian Waffles");
    }

    public void testTagName() {
        reInitParser();
        String[] tagNames = {"breakfast-menu", "food", "name"};
        for (int i = 0; i < 3; i++) {
            assertEquals(parser.getTagName(), tagNames[i]);
            parser = parser.next();
        }
    }

    public void testEmpty() {
        reInitParser();
        for (int i = 0; i < 2; i++) {
            assertTrue(parser.isEmpty());
            parser = parser.next();
        }
        assertFalse(parser.isEmpty());
    }

    public void testFileEndException(){
        reInitParser();
        try {
            for (int i = 0; i < 20; i++) {
                parser = parser.next();
            }
        } catch (FileEndException e){
            assertEquals(e.getClass().getSimpleName(), "FileEndException");
        }
    }

    private void reInitParser() {
        parser = XMLParserFactory.getBasicXMLParser(fileName);
    }
}
