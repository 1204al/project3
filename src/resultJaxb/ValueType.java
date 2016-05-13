
package resultJaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for valueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="valueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="proteins" type="{http://www.example.org/SimpleTypes}g"/>
 *         &lt;element name="carbohydrates" type="{http://www.example.org/SimpleTypes}g"/>
 *         &lt;element name="fats" type="{http://www.example.org/SimpleTypes}g"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "valueType", namespace = "http://www.example.org/ComplexTypes", propOrder = {
    "proteins",
    "carbohydrates",
    "fats"
})
public class ValueType {

    @XmlElement(namespace = "http://www.example.org/ComplexTypes", required = true)
    protected String proteins;
    @XmlElement(namespace = "http://www.example.org/ComplexTypes", required = true)
    protected String carbohydrates;
    @XmlElement(namespace = "http://www.example.org/ComplexTypes", required = true)
    protected String fats;

    /**
     * Gets the value of the proteins property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProteins() {
        return proteins;
    }

    /**
     * Sets the value of the proteins property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProteins(String value) {
        this.proteins = value;
    }

    /**
     * Gets the value of the carbohydrates property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarbohydrates() {
        return carbohydrates;
    }

    /**
     * Sets the value of the carbohydrates property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarbohydrates(String value) {
        this.carbohydrates = value;
    }

    /**
     * Gets the value of the fats property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFats() {
        return fats;
    }

    /**
     * Sets the value of the fats property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFats(String value) {
        this.fats = value;
    }

}
