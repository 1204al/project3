package ua.andrey;


import org.xml.sax.SAXException;
import resultJaxb.Candy;


import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class Parser {
    public static Candy SAXParsing(String filePath) {

        SAXParserFactory parserFactory = SAXParserFactory.newInstance();
        SAXHandler handler = new SAXHandler();
        try {
            SAXParser saxParser = parserFactory.newSAXParser();
            saxParser.parse(filePath, handler);


        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return handler.getCandy();
    }
}
