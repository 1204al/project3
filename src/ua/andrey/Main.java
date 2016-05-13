package ua.andrey;


import resultJaxb.Candy;

public class Main {
	public static void main(String[] args) {
		XMLValidator validator=new XMLValidator();
		validator.validate("src/CandyItems.xml", "src/Elements.xsd");
		Candy candyItems=Parser.SAXParsing("src/CandyItems.xml");

        for (int i = 0; i < candyItems.getItem().size(); i++) {
            System.out.println(candyItems.getItem().get(i).getEnergy());
        }


	}
}
