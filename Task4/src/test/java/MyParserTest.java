import junit.framework.TestCase;

import java.io.FileNotFoundException;

public class MyParserTest extends TestCase {

    private MyXMLParser parser;
    private String fileName = "File Name";



    public void testAttribute(){
        reInitParser();
        assertEquals(parser.next().getAttribute("id"), "1");
    }


    public void testContent(){
        reInitParser();
        assertEquals(parser.next().next().getContent(), "Belgian Waffles");
    }

    public void testTagName(){
        reInitParser();
        String[] tagNames = {"breakfast-menu", "food", "name"};
        for (int i=0; i<3; i++) {
            assertEquals(parser.getTagName(), tagNames[i]);
            parser = parser.next();
        }
    }

    public void testEmpty(){
        reInitParser();
        for (int i=0; i<2; i++) {
            assertTrue(parser.isEmpty());
            parser = parser.next();
        }
        assertFalse(parser.isEmpty());
    }

    private void reInitParser(){
        try {
            parser = MyXMLParserImpl.getParser(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
