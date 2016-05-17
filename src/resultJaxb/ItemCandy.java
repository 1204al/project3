
package resultJaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for itemCandy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="itemCandy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="production" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="energy" type="{http://www.example.org/SimpleTypes}energyType"/>
 *         &lt;element name="ingredients" type="{http://www.example.org/ComplexTypes}ingredients"/>
 *         &lt;element name="value" type="{http://www.example.org/ComplexTypes}valueType"/>
 *         &lt;element name="type" type="{http://www.example.org/ComplexTypes}typeCandy"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemCandy", namespace = "http://www.example.org/Candy", propOrder = {
    "name",
    "production",
    "energy",
    "ingredients",
    "value",
    "type"
})
public class ItemCandy {

    @XmlElement(namespace = "http://www.example.org/Candy", required = true)
    protected String name;
    @XmlElement(namespace = "http://www.example.org/Candy", required = true)
    protected String production;
    @XmlElement(namespace = "http://www.example.org/Candy", required = true)
    protected String energy;
    @XmlElement(namespace = "http://www.example.org/Candy", required = true)
    protected Ingredients ingredients;
    @XmlElement(namespace = "http://www.example.org/Candy", required = true)
    protected ValueType value;
    @XmlElement(namespace = "http://www.example.org/Candy", required = true)
    protected TypeCandy type;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the production property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduction() {
        return production;
    }

    /**
     * Sets the value of the production property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduction(String value) {
        this.production = value;
    }

    /**
     * Gets the value of the energy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnergy() {
        return energy;
    }

    /**
     * Sets the value of the energy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnergy(String value) {
        this.energy = value;
    }

    /**
     * Gets the value of the ingredients property.
     * 
     * @return
     *     possible object is
     *     {@link Ingredients }
     *     
     */
    public Ingredients getIngredients() {
        return ingredients;
    }

    /**
     * Sets the value of the ingredients property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ingredients }
     *     
     */
    public void setIngredients(Ingredients value) {
        this.ingredients = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link ValueType }
     *     
     */
    public ValueType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueType }
     *     
     */
    public void setValue(ValueType value) {
        this.value = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCandy }
     *     
     */
    public TypeCandy getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCandy }
     *     
     */
    public void setType(TypeCandy value) {
        this.type = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
