package ua.andrey;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import resultJaxb.*;


import javax.xml.parsers.*;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

    public static Candy DOMParsing(String filePath) {
        Candy candyItems = new Candy();
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = factory.newDocumentBuilder();
            Document document = documentBuilder.parse(new File(filePath));
            NodeList items = document.getElementsByTagName("tns:item");
            for (int i = 0; i < items.getLength(); i++) {
                ItemCandy itemCandy = new ItemCandy();
                Element item = (Element) items.item(i);
                itemCandy.setId(item.getAttribute("id"));


                itemCandy.setName(item.getElementsByTagName("tns:name").item(0).getFirstChild().getNodeValue());

                itemCandy.setProduction(item.getElementsByTagName("tns:production").item(0).getFirstChild().getNodeValue());

                itemCandy.setEnergy(item.getElementsByTagName("tns:energy").item(0).getFirstChild().getNodeValue());

                Ingredients ingredients = new Ingredients();
                NodeList listIngridients = item.getElementsByTagName("tns:ingredients");
                Element innersIngridient = (Element) listIngridients.item(0);
                ingredients.setWater(innersIngridient.getElementsByTagName("tns2:water").item(0).getFirstChild().getNodeValue());
                ingredients.setSugar(innersIngridient.getElementsByTagName("tns2:sugar").item(0).getFirstChild().getNodeValue());
                ingredients.setFructosa(innersIngridient.getElementsByTagName("tns2:fructosa").item(0).getFirstChild().getNodeValue());
                ingredients.setVanilin(innersIngridient.getElementsByTagName("tns2:vanilin").item(0).getFirstChild().getNodeValue());

                itemCandy.setIngredients(ingredients);


                ValueType valueType = new ValueType();
                NodeList listValueType = item.getElementsByTagName("tns:value");
                Element innersValueType = (Element) listValueType.item(0);
                valueType.setProteins(innersValueType.getElementsByTagName("tns2:proteins").item(0).getFirstChild().getNodeValue());
                valueType.setCarbohydrates(innersValueType.getElementsByTagName("tns2:carbohydrates").item(0).getFirstChild().getNodeValue());
                valueType.setFats(innersValueType.getElementsByTagName("tns2:fats").item(0).getFirstChild().getNodeValue());


                TypeCandy typeCandy = new TypeCandy();
                NodeList listTypeCandy = item.getElementsByTagName("tns:type");
                Element innersType = (Element) listTypeCandy.item(0);
                typeCandy.setKind(innersType.getElementsByTagName("tns2:kind").item(0).getFirstChild().getNodeValue());
                typeCandy.setFilling(Boolean.parseBoolean(innersType.getElementsByTagName("tns2:filling").item(0).getFirstChild().getNodeValue()));

                itemCandy.setType(typeCandy);

                candyItems.getItem().add(itemCandy);


            }

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return candyItems;

    }

    public static Candy StAXParsing(String filePath) {
        Candy candyItems = new Candy();
        try {
            ItemCandy itemCandy = null;
            Ingredients ingredients = null;
            TypeCandy typeCandy = null;
            ValueType valueType = null;
            String tagContent = null;


            FileInputStream input = new FileInputStream(filePath);
            XMLInputFactory factory = XMLInputFactory.newInstance();
            XMLStreamReader streamReader = factory.createXMLStreamReader(input);

            while (streamReader.hasNext()) {

                int eventType = streamReader.next();
                // Если старт элемента
                switch (eventType) {
                    case XMLStreamReader.START_ELEMENT:
                        if ((streamReader.getLocalName()).equals("item")) {
                            itemCandy = new ItemCandy();
                            itemCandy.setId(streamReader.getAttributeValue(0));
                        }
                        if ((streamReader.getLocalName()).equals("ingredients")) {
                            ingredients = new Ingredients();
                        }
                        if ((streamReader.getLocalName()).equals("value")) {
                            valueType = new ValueType();
                        }
                        if ((streamReader.getLocalName()).equals("type")) {
                            typeCandy = new TypeCandy();
                        }
                        break;
                    case XMLStreamConstants.CHARACTERS:
                        tagContent = streamReader.getText().trim();
                        break;
                    case XMLStreamConstants.END_ELEMENT:
                        switch (streamReader.getLocalName()) {
                            case "item":
                                candyItems.getItem().add(itemCandy);
                                break;
                            case "name":
                                itemCandy.setName(tagContent);
                                break;
                            case "production":
                                itemCandy.setProduction(tagContent);
                                break;
                            case "energy":
                                itemCandy.setEnergy(tagContent);
                                break;

                            //ingredients
                            case "ingredients":
                                itemCandy.setIngredients(ingredients);
                                break;
                            case "water":
                                ingredients.setWater(tagContent);
                                break;
                            case "sugar":
                                ingredients.setSugar(tagContent);
                                break;
                            case "fructosa":
                                ingredients.setFructosa(tagContent);
                                break;
                            case "vanilin":
                                ingredients.setVanilin(tagContent);
                                break;

                            //value
                            case "value":
                                itemCandy.setValue(valueType);
                                break;
                            case "proteins":
                                valueType.setProteins(tagContent);
                                break;
                            case "carbohydrates":
                                valueType.setCarbohydrates(tagContent);
                                break;
                            case "fats":
                                valueType.setFats(tagContent);
                                break;

                            //type
                            case "type":
                                itemCandy.setType(typeCandy);
                                break;
                            case "kind":
                                typeCandy.setKind(tagContent);
                                break;
                            case "filling":
                                typeCandy.setFilling(Boolean.parseBoolean(tagContent));
                                break;
                        }
                }


            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
        return candyItems;
    }
}
