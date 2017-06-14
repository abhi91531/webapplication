//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.14 at 06:08:02 PM IST 
//


package com.matrix360.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OnNetIPService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OnNetIPService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numberOfIpAddresses" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ipProvisioningProfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="provisioningStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="provisionedIpBlock" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="primaryDns" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="secondaryDns" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pppUserName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pppPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pppDomainName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ipAddress" type="{http://www.megapath.com/m360}IpAddress" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnNetIPService", propOrder = {
    "numberOfIpAddresses",
    "ipProvisioningProfile",
    "provisioningStatus",
    "provisionedIpBlock",
    "primaryDns",
    "secondaryDns",
    "pppUserName",
    "pppPassword",
    "pppDomainName",
    "ipAddress"
})
public class OnNetIPService {

    @XmlElement(required = true)
    protected String numberOfIpAddresses;
    @XmlElement(required = true)
    protected String ipProvisioningProfile;
    @XmlElement(required = true)
    protected String provisioningStatus;
    @XmlElement(required = true)
    protected String provisionedIpBlock;
    @XmlElement(required = true)
    protected String primaryDns;
    @XmlElement(required = true)
    protected String secondaryDns;
    @XmlElement(required = true)
    protected String pppUserName;
    @XmlElement(required = true)
    protected String pppPassword;
    @XmlElement(required = true)
    protected String pppDomainName;
    protected List<IpAddress> ipAddress;

    /**
     * Gets the value of the numberOfIpAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfIpAddresses() {
        return numberOfIpAddresses;
    }

    /**
     * Sets the value of the numberOfIpAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfIpAddresses(String value) {
        this.numberOfIpAddresses = value;
    }

    /**
     * Gets the value of the ipProvisioningProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpProvisioningProfile() {
        return ipProvisioningProfile;
    }

    /**
     * Sets the value of the ipProvisioningProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpProvisioningProfile(String value) {
        this.ipProvisioningProfile = value;
    }

    /**
     * Gets the value of the provisioningStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvisioningStatus() {
        return provisioningStatus;
    }

    /**
     * Sets the value of the provisioningStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvisioningStatus(String value) {
        this.provisioningStatus = value;
    }

    /**
     * Gets the value of the provisionedIpBlock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvisionedIpBlock() {
        return provisionedIpBlock;
    }

    /**
     * Sets the value of the provisionedIpBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvisionedIpBlock(String value) {
        this.provisionedIpBlock = value;
    }

    /**
     * Gets the value of the primaryDns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryDns() {
        return primaryDns;
    }

    /**
     * Sets the value of the primaryDns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryDns(String value) {
        this.primaryDns = value;
    }

    /**
     * Gets the value of the secondaryDns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryDns() {
        return secondaryDns;
    }

    /**
     * Sets the value of the secondaryDns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryDns(String value) {
        this.secondaryDns = value;
    }

    /**
     * Gets the value of the pppUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPppUserName() {
        return pppUserName;
    }

    /**
     * Sets the value of the pppUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPppUserName(String value) {
        this.pppUserName = value;
    }

    /**
     * Gets the value of the pppPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPppPassword() {
        return pppPassword;
    }

    /**
     * Sets the value of the pppPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPppPassword(String value) {
        this.pppPassword = value;
    }

    /**
     * Gets the value of the pppDomainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPppDomainName() {
        return pppDomainName;
    }

    /**
     * Sets the value of the pppDomainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPppDomainName(String value) {
        this.pppDomainName = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ipAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIpAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IpAddress }
     * 
     * 
     */
    public List<IpAddress> getIpAddress() {
        if (ipAddress == null) {
            ipAddress = new ArrayList<IpAddress>();
        }
        return this.ipAddress;
    }

}
