package ua.andrey;


import jdk.internal.org.xml.sax.SAXException;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
import resultJaxb.*;

public class SAXHandler extends DefaultHandler {
    private Candy candy = new Candy();
    private String currEl = "";
    private ItemCandy itemCandy;
    private TypeCandy typeCandy;
    private Ingredients ingredients;
    protected ValueType valueType;

    public Candy getCandy() {
        return candy;
    }

    @Override
    public void startDocument() {

        System.out.println("start SAXparsing");
    }


    @Override
    public void endDocument() {

        System.out.println("end SAXparsing");
    }

    @Override
    public void startElement(String namespace, String localName, String qName, Attributes attributes) {
        currEl = qName;
        if (currEl.equals("tns:item")) {
            itemCandy = new ItemCandy();
            itemCandy.setID(Integer.valueOf(attributes.getValue(0)));
        }
        if (currEl.equals("tns:ingredients")) {
            ingredients = new Ingredients();
        }
        if (currEl.equals("tns:value")) {
            valueType = new ValueType();
        }

        if (currEl.equals("tns:type")) {
            typeCandy = new TypeCandy();
        }


    }

    @Override
    public void endElement(String namespace, String localName, String qName) {
        currEl = "";
        if (qName.equals("tns:item")) {
            candy.getItem().add(itemCandy);
        }
        if (qName.equals("tns:integridients")) {
            itemCandy.setIngredients(ingredients);
        }
        if (qName.equals("tns:valueType")) {
            itemCandy.setValue(valueType);
        }

        if (qName.equals("tns:type")) {
            itemCandy.setType(typeCandy);

        }

    }

    @Override
    public void characters(char[] chars, int start, int end) {
        if (currEl.equals("tns:name")) {
            itemCandy.setName(new String(chars, start, end));
        }
        if (currEl.equals("tns:production")) {
            itemCandy.setProduction(new String(chars, start, end));
        }
        if (currEl.equals("tns:energy")) {
            itemCandy.setEnergy(new String(chars, start, end));
        }


        if (currEl.equals("tns2:water")) {
            ingredients.setWater(new String(chars, start, end));
        }
        if (currEl.equals("tns2:sugar")) {
            ingredients.setSugar(new String(chars, start, end));
        }
        if (currEl.equals("tns2:fructosa")) {
            ingredients.setFructosa(new String(chars, start, end));
        }
        if (currEl.equals("tns2:vanilin")) {
            ingredients.setVanilin(new String(chars, start, end));
        }

        if (currEl.equals("tns2:proteins")) {
            valueType.setProteins(new String(chars, start, end));
        }
        if (currEl.equals("tns2:carbohydrates")) {
            valueType.setCarbohydrates(new String(chars, start, end));
        }
        if (currEl.equals("tns2:fats")) {
            valueType.setFats(new String(chars, start, end));
        }


        if (currEl.equals("tns2:kind")) {
            typeCandy.setKind(new String(chars, start, end));
        }
        if (currEl.equals("tns2:filling")) {
            typeCandy.setFilling(new Boolean(new String(chars, start, end)));
        }


    }
}
