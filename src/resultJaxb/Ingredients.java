
package resultJaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ingredients complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ingredients">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="water" type="{http://www.example.org/SimpleTypes}mg"/>
 *         &lt;element name="sugar" type="{http://www.example.org/SimpleTypes}mg"/>
 *         &lt;element name="fructosa" type="{http://www.example.org/SimpleTypes}mg"/>
 *         &lt;element name="vanilin" type="{http://www.example.org/SimpleTypes}mg"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ingredients", namespace = "http://www.example.org/ComplexTypes", propOrder = {
    "water",
    "sugar",
    "fructosa",
    "vanilin"
})
public class Ingredients {

    @XmlElement(namespace = "http://www.example.org/ComplexTypes", required = true)
    protected String water;
    @XmlElement(namespace = "http://www.example.org/ComplexTypes", required = true)
    protected String sugar;
    @XmlElement(namespace = "http://www.example.org/ComplexTypes", required = true)
    protected String fructosa;
    @XmlElement(namespace = "http://www.example.org/ComplexTypes", required = true)
    protected String vanilin;

    /**
     * Gets the value of the water property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWater() {
        return water;
    }

    /**
     * Sets the value of the water property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWater(String value) {
        this.water = value;
    }

    /**
     * Gets the value of the sugar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSugar() {
        return sugar;
    }

    /**
     * Sets the value of the sugar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSugar(String value) {
        this.sugar = value;
    }

    /**
     * Gets the value of the fructosa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFructosa() {
        return fructosa;
    }

    /**
     * Sets the value of the fructosa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFructosa(String value) {
        this.fructosa = value;
    }

    /**
     * Gets the value of the vanilin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVanilin() {
        return vanilin;
    }

    /**
     * Sets the value of the vanilin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVanilin(String value) {
        this.vanilin = value;
    }

}
