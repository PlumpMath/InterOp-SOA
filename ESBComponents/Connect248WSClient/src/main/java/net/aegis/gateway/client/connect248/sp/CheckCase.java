//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2010.04.05 at 05:55:11 PM EDT
//


package net.aegis.gateway.client.connect248.sp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkCase complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="checkCase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caseName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="messageType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="initiatorInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="responderInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkCase", propOrder = {
    "caseName",
    "messageType",
    "initiatorInd",
    "responderInd"
})
public class CheckCase {

    @XmlElement(required = true)
    protected String caseName;
    @XmlElement(required = true)
    protected String messageType;
    @XmlElement(required = true)
    protected String initiatorInd;
    @XmlElement(required = true)
    protected String responderInd;

    /**
     * Gets the value of the caseName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCaseName() {
        return caseName;
    }

    /**
     * Sets the value of the caseName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCaseName(String value) {
        this.caseName = value;
    }

    /**
     * Gets the value of the messageType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMessageType(String value) {
        this.messageType = value;
    }

    /**
     * Gets the value of the initiatorInd property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInitiatorInd() {
        return initiatorInd;
    }

    /**
     * Sets the value of the initiatorInd property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInitiatorInd(String value) {
        this.initiatorInd = value;
    }

    /**
     * Gets the value of the responderInd property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResponderInd() {
        return responderInd;
    }

    /**
     * Sets the value of the responderInd property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResponderInd(String value) {
        this.responderInd = value;
    }

}
