//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.04.14 at 04:39:02 PM EDT 
//


package net.aegis.gateway.client.connect32.rd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for documentRD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="documentRD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responderHCIDCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="repositoryUniqueId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="documentUniqueId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentRD", propOrder = {
    "responderHCIDCode",
    "repositoryUniqueId",
    "documentUniqueId"
})
public class DocumentRD {

    @XmlElement(required = true)
    protected String responderHCIDCode;
    @XmlElement(required = true)
    protected String repositoryUniqueId;
    @XmlElement(required = true)
    protected String documentUniqueId;

    /**
     * Gets the value of the responderHCIDCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponderHCIDCode() {
        return responderHCIDCode;
    }

    /**
     * Sets the value of the responderHCIDCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponderHCIDCode(String value) {
        this.responderHCIDCode = value;
    }

    /**
     * Gets the value of the repositoryUniqueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepositoryUniqueId() {
        return repositoryUniqueId;
    }

    /**
     * Sets the value of the repositoryUniqueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepositoryUniqueId(String value) {
        this.repositoryUniqueId = value;
    }

    /**
     * Gets the value of the documentUniqueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentUniqueId() {
        return documentUniqueId;
    }

    /**
     * Sets the value of the documentUniqueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentUniqueId(String value) {
        this.documentUniqueId = value;
    }

}