package ua.andrey;

import java.io.File;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

public class XMLValidator {
	public void validate(String xmlFile, String xsdFile) {
		try {
			SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			Schema schema = factory.newSchema(new File(xsdFile));
			Validator validator = schema.newValidator();
			validator.validate(new StreamSource(xmlFile));
			System.out.println("XML File " + xmlFile + " is valid.");
		} catch (Exception e) {
			System.out.println("XML File " + xmlFile + " is not valid: " + e.getMessage());
		}

	}

}
