package ua.andrey;


import resultJaxb.Candy;
import ua.andrey.comparator.SortedByID;
import ua.andrey.comparator.SortedByName;
import ua.andrey.comparator.SortedByProduction;

public class Main {
    public static void main(String[] args) {
        HTMLBuilder builder=new HTMLBuilder();
        builder.buildHTML("src/CandyItems.xsl","src/CandyItems.xml","src/CandyItems.html");

//        XMLValidator validator = new XMLValidator();
//        validator.validate("src/CandyItems.xml", "src/Elements.xsd");
//
//        Candy candyItems;
//        candyItems = Parser.SAXParsing("src/CandyItems.xml");
//        for (int i = 0; i < candyItems.getItem().size(); i++) {
//            System.out.println(candyItems.getItem().get(i).getEnergy());
//        }
//        for (int i = 0; i < candyItems.getItem().size(); i++) {
//            System.out.println(candyItems.getItem().get(i).getName());
//        }
//        System.out.println();
//        sortByParameter(candyItems,"name");
//        for (int i = 0; i < candyItems.getItem().size(); i++) {
//            System.out.println(candyItems.getItem().get(i).getEnergy());
//        }
//        for (int i = 0; i < candyItems.getItem().size(); i++) {
//            System.out.println(candyItems.getItem().get(i).getName());
//        }
//
//
//
//        System.out.println();
//        System.out.println();
//
//        candyItems = Parser.DOMParsing("src/CandyItems.xml");
//        for (int i = 0; i < candyItems.getItem().size(); i++) {
//            System.out.println(candyItems.getItem().get(i).getEnergy());
//        }
//
//        System.out.println();
//        System.out.println();
//        candyItems=Parser.StAXParsing("src/CandyItems.xml");
//        for (int i = 0; i < candyItems.getItem().size(); i++) {
//            System.out.println(candyItems.getItem().get(i).getIngredients().getSugar());
//        }
    }

    public static void sortByParameter(Candy candyItems,String parameter){
        switch (parameter){
            case "ID":
                candyItems.getItem().sort(new SortedByID());
                break;
            case "name":
                candyItems.getItem().sort(new SortedByName());
                break;
            case "production":
                candyItems.getItem().sort(new SortedByProduction());
                break;
        }

    }
}
