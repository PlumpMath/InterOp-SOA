//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.08.03 at 04:24:27 PM EDT 
//


package net.aegis.gateway.client.connect248.pd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for patientNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="patientNameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="patientPrefix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="patientLastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="patientGivenNames" type="{}patientGivenNamesType"/>
 *         &lt;element name="patientSuffix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "patientNameType", propOrder = {
    "patientPrefix",
    "patientLastName",
    "patientGivenNames",
    "patientSuffix"
})
public class PatientNameType {

    @XmlElement(required = true)
    protected String patientPrefix;
    @XmlElement(required = true)
    protected String patientLastName;
    @XmlElement(required = true)
    protected PatientGivenNamesType patientGivenNames;
    @XmlElement(required = true)
    protected String patientSuffix;

    /**
     * Gets the value of the patientPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientPrefix() {
        return patientPrefix;
    }

    /**
     * Sets the value of the patientPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientPrefix(String value) {
        this.patientPrefix = value;
    }

    /**
     * Gets the value of the patientLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientLastName() {
        return patientLastName;
    }

    /**
     * Sets the value of the patientLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientLastName(String value) {
        this.patientLastName = value;
    }

    /**
     * Gets the value of the patientGivenNames property.
     * 
     * @return
     *     possible object is
     *     {@link PatientGivenNamesType }
     *     
     */
    public PatientGivenNamesType getPatientGivenNames() {
        return patientGivenNames;
    }

    /**
     * Sets the value of the patientGivenNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatientGivenNamesType }
     *     
     */
    public void setPatientGivenNames(PatientGivenNamesType value) {
        this.patientGivenNames = value;
    }

    /**
     * Gets the value of the patientSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientSuffix() {
        return patientSuffix;
    }

    /**
     * Sets the value of the patientSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientSuffix(String value) {
        this.patientSuffix = value;
    }

}