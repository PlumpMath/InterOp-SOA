//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.08.30 at 10:17:48 AM EDT 
//


package net.aegis.gateway.client.connect248.pd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userFamilyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userGivenName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userInitials" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userRoleCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userRoleDisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userPurposeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userPurposeDisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="patientId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="patientPrefix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="patientLastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="patientGivenName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="patientGender" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="patientDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="patientSsn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="patientTel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="patientStreetAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="patientCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="patientState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="patientZip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="demographicQueryOnly" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="patientNames" type="{}patientNamesType" minOccurs="0"/>
 *         &lt;element name="patientTels" type="{}patientTelsType" minOccurs="0"/>
 *         &lt;element name="patientAddresses" type="{}patientAddressesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "userFamilyName",
    "userGivenName",
    "userInitials",
    "userName",
    "userRoleCode",
    "userRoleDisplayName",
    "userPurposeCode",
    "userPurposeDisplayName",
    "patientId",
    "patientPrefix",
    "patientLastName",
    "patientGivenName",
    "patientGender",
    "patientDateOfBirth",
    "patientSsn",
    "patientTel",
    "patientStreetAddress",
    "patientCity",
    "patientState",
    "patientZip",
    "demographicQueryOnly",
    "patientNames",
    "patientTels",
    "patientAddresses"
})
@XmlRootElement(name = "patientPD")
public class PatientPD {

    @XmlElement(required = true)
    protected String userFamilyName;
    @XmlElement(required = true)
    protected String userGivenName;
    @XmlElement(required = true)
    protected String userInitials;
    @XmlElement(required = true)
    protected String userName;
    @XmlElement(required = true)
    protected String userRoleCode;
    @XmlElement(required = true)
    protected String userRoleDisplayName;
    @XmlElement(required = true)
    protected String userPurposeCode;
    @XmlElement(required = true)
    protected String userPurposeDisplayName;
    @XmlElement(required = true)
    protected String patientId;
    @XmlElement(required = true)
    protected String patientPrefix;
    @XmlElement(required = true)
    protected String patientLastName;
    @XmlElement(required = true)
    protected String patientGivenName;
    @XmlElement(required = true)
    protected String patientGender;
    @XmlElement(required = true)
    protected String patientDateOfBirth;
    @XmlElement(required = true)
    protected String patientSsn;
    @XmlElement(required = true)
    protected String patientTel;
    @XmlElement(required = true)
    protected String patientStreetAddress;
    @XmlElement(required = true)
    protected String patientCity;
    @XmlElement(required = true)
    protected String patientState;
    @XmlElement(required = true)
    protected String patientZip;
    @XmlElement(required = true, defaultValue = "N")
    protected String demographicQueryOnly;
    protected PatientNamesType patientNames;
    protected PatientTelsType patientTels;
    protected PatientAddressesType patientAddresses;

    /**
     * Gets the value of the userFamilyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserFamilyName() {
        return userFamilyName;
    }

    /**
     * Sets the value of the userFamilyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserFamilyName(String value) {
        this.userFamilyName = value;
    }

    /**
     * Gets the value of the userGivenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserGivenName() {
        return userGivenName;
    }

    /**
     * Sets the value of the userGivenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserGivenName(String value) {
        this.userGivenName = value;
    }

    /**
     * Gets the value of the userInitials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserInitials() {
        return userInitials;
    }

    /**
     * Sets the value of the userInitials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserInitials(String value) {
        this.userInitials = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the userRoleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserRoleCode() {
        return userRoleCode;
    }

    /**
     * Sets the value of the userRoleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserRoleCode(String value) {
        this.userRoleCode = value;
    }

    /**
     * Gets the value of the userRoleDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserRoleDisplayName() {
        return userRoleDisplayName;
    }

    /**
     * Sets the value of the userRoleDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserRoleDisplayName(String value) {
        this.userRoleDisplayName = value;
    }

    /**
     * Gets the value of the userPurposeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPurposeCode() {
        return userPurposeCode;
    }

    /**
     * Sets the value of the userPurposeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPurposeCode(String value) {
        this.userPurposeCode = value;
    }

    /**
     * Gets the value of the userPurposeDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPurposeDisplayName() {
        return userPurposeDisplayName;
    }

    /**
     * Sets the value of the userPurposeDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPurposeDisplayName(String value) {
        this.userPurposeDisplayName = value;
    }

    /**
     * Gets the value of the patientId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * Sets the value of the patientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientId(String value) {
        this.patientId = value;
    }

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
     * Gets the value of the patientGivenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientGivenName() {
        return patientGivenName;
    }

    /**
     * Sets the value of the patientGivenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientGivenName(String value) {
        this.patientGivenName = value;
    }

    /**
     * Gets the value of the patientGender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientGender() {
        return patientGender;
    }

    /**
     * Sets the value of the patientGender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientGender(String value) {
        this.patientGender = value;
    }

    /**
     * Gets the value of the patientDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientDateOfBirth() {
        return patientDateOfBirth;
    }

    /**
     * Sets the value of the patientDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientDateOfBirth(String value) {
        this.patientDateOfBirth = value;
    }

    /**
     * Gets the value of the patientSsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientSsn() {
        return patientSsn;
    }

    /**
     * Sets the value of the patientSsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientSsn(String value) {
        this.patientSsn = value;
    }

    /**
     * Gets the value of the patientTel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientTel() {
        return patientTel;
    }

    /**
     * Sets the value of the patientTel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientTel(String value) {
        this.patientTel = value;
    }

    /**
     * Gets the value of the patientStreetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientStreetAddress() {
        return patientStreetAddress;
    }

    /**
     * Sets the value of the patientStreetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientStreetAddress(String value) {
        this.patientStreetAddress = value;
    }

    /**
     * Gets the value of the patientCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientCity() {
        return patientCity;
    }

    /**
     * Sets the value of the patientCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientCity(String value) {
        this.patientCity = value;
    }

    /**
     * Gets the value of the patientState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientState() {
        return patientState;
    }

    /**
     * Sets the value of the patientState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientState(String value) {
        this.patientState = value;
    }

    /**
     * Gets the value of the patientZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientZip() {
        return patientZip;
    }

    /**
     * Sets the value of the patientZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientZip(String value) {
        this.patientZip = value;
    }

    /**
     * Gets the value of the demographicQueryOnly property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDemographicQueryOnly() {
        return demographicQueryOnly;
    }

    /**
     * Sets the value of the demographicQueryOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDemographicQueryOnly(String value) {
        this.demographicQueryOnly = value;
    }

    /**
     * Gets the value of the patientNames property.
     * 
     * @return
     *     possible object is
     *     {@link PatientNamesType }
     *     
     */
    public PatientNamesType getPatientNames() {
        return patientNames;
    }

    /**
     * Sets the value of the patientNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatientNamesType }
     *     
     */
    public void setPatientNames(PatientNamesType value) {
        this.patientNames = value;
    }

    /**
     * Gets the value of the patientTels property.
     * 
     * @return
     *     possible object is
     *     {@link PatientTelsType }
     *     
     */
    public PatientTelsType getPatientTels() {
        return patientTels;
    }

    /**
     * Sets the value of the patientTels property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatientTelsType }
     *     
     */
    public void setPatientTels(PatientTelsType value) {
        this.patientTels = value;
    }

    /**
     * Gets the value of the patientAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link PatientAddressesType }
     *     
     */
    public PatientAddressesType getPatientAddresses() {
        return patientAddresses;
    }

    /**
     * Sets the value of the patientAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatientAddressesType }
     *     
     */
    public void setPatientAddresses(PatientAddressesType value) {
        this.patientAddresses = value;
    }

}