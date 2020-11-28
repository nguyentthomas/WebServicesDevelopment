
package uts.wsd.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bookApplication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bookApplication"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="filePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="textbooksLists" type="{http://soap.wsd.uts/}textbooksLists" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookApplication", propOrder = {
    "filePath",
    "textbooksLists"
})
public class BookApplication {

    protected String filePath;
    protected TextbooksLists textbooksLists;

    /**
     * Gets the value of the filePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * Sets the value of the filePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilePath(String value) {
        this.filePath = value;
    }

    /**
     * Gets the value of the textbooksLists property.
     * 
     * @return
     *     possible object is
     *     {@link TextbooksLists }
     *     
     */
    public TextbooksLists getTextbooksLists() {
        return textbooksLists;
    }

    /**
     * Sets the value of the textbooksLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextbooksLists }
     *     
     */
    public void setTextbooksLists(TextbooksLists value) {
        this.textbooksLists = value;
    }

}
