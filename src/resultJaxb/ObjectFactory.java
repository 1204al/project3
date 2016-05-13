
package resultJaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the resultJaxb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Name_QNAME = new QName("http://www.example.org/Candy", "name");
    private final static QName _Production_QNAME = new QName("http://www.example.org/Candy", "production");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: resultJaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Candy }
     * 
     */
    public Candy createCandy() {
        return new Candy();
    }

    /**
     * Create an instance of {@link ItemCandy }
     * 
     */
    public ItemCandy createItemCandy() {
        return new ItemCandy();
    }

    /**
     * Create an instance of {@link ValueType }
     * 
     */
    public ValueType createValueType() {
        return new ValueType();
    }

    /**
     * Create an instance of {@link Ingredients }
     * 
     */
    public Ingredients createIngredients() {
        return new Ingredients();
    }

    /**
     * Create an instance of {@link TypeCandy }
     * 
     */
    public TypeCandy createTypeCandy() {
        return new TypeCandy();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Candy", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Candy", name = "production")
    public JAXBElement<String> createProduction(String value) {
        return new JAXBElement<String>(_Production_QNAME, String.class, null, value);
    }

}
