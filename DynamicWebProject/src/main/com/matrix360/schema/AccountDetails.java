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
 * <p>Java class for AccountDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="billToAccountNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="orgAccountNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="costCenterAccountNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="extranetOrgId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="previousAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="organizationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accountStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accountSegment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accountHierarchy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerContact" type="{http://www.megapath.com/m360}CustomerContact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="orderingSystem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="legacySystem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="legacyAccountNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="accountNotes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orgAccountNotes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gbRefId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="primaryAccountManager" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="costCenterCompanyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="businessUnitName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accountOwner" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="custownerdisp" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="customerOwner" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accountTenure" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="callCount7D" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="callCount30D" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountDetails", propOrder = {
    "accountNumber",
    "billToAccountNumber",
    "orgAccountNumber",
    "costCenterAccountNumber",
    "extranetOrgId",
    "previousAccountNumber",
    "companyName",
    "organizationName",
    "accountStatus",
    "accountSegment",
    "accountHierarchy",
    "customerContact",
    "orderingSystem",
    "legacySystem",
    "legacyAccountNumber",
    "accountNotes",
    "orgAccountNotes",
    "gbRefId",
    "primaryAccountManager",
    "costCenterCompanyName",
    "businessUnitName",
    "accountOwner",
    "custownerdisp",
    "customerOwner",
    "groupId",
    "accountTenure",
    "callCount7D",
    "callCount30D"
})
public class AccountDetails {

    protected long accountNumber;
    protected long billToAccountNumber;
    protected long orgAccountNumber;
    protected long costCenterAccountNumber;
    protected long extranetOrgId;
    @XmlElement(required = true)
    protected String previousAccountNumber;
    @XmlElement(required = true)
    protected String companyName;
    @XmlElement(required = true)
    protected String organizationName;
    @XmlElement(required = true)
    protected String accountStatus;
    @XmlElement(required = true)
    protected String accountSegment;
    @XmlElement(required = true)
    protected String accountHierarchy;
    protected List<CustomerContact> customerContact;
    @XmlElement(required = true)
    protected String orderingSystem;
    @XmlElement(required = true)
    protected String legacySystem;
    protected long legacyAccountNumber;
    @XmlElement(required = true)
    protected String accountNotes;
    @XmlElement(required = true)
    protected String orgAccountNotes;
    @XmlElement(required = true)
    protected String gbRefId;
    @XmlElement(required = true)
    protected String primaryAccountManager;
    @XmlElement(required = true)
    protected String costCenterCompanyName;
    @XmlElement(required = true)
    protected String businessUnitName;
    @XmlElement(required = true)
    protected String accountOwner;
    protected boolean custownerdisp;
    @XmlElement(required = true)
    protected String customerOwner;
    @XmlElement(required = true)
    protected String groupId;
    @XmlElement(required = true)
    protected String accountTenure;
    @XmlElement(required = true)
    protected String callCount7D;
    @XmlElement(required = true)
    protected String callCount30D;

    /**
     * Gets the value of the accountNumber property.
     * 
     */
    public long getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     */
    public void setAccountNumber(long value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the billToAccountNumber property.
     * 
     */
    public long getBillToAccountNumber() {
        return billToAccountNumber;
    }

    /**
     * Sets the value of the billToAccountNumber property.
     * 
     */
    public void setBillToAccountNumber(long value) {
        this.billToAccountNumber = value;
    }

    /**
     * Gets the value of the orgAccountNumber property.
     * 
     */
    public long getOrgAccountNumber() {
        return orgAccountNumber;
    }

    /**
     * Sets the value of the orgAccountNumber property.
     * 
     */
    public void setOrgAccountNumber(long value) {
        this.orgAccountNumber = value;
    }

    /**
     * Gets the value of the costCenterAccountNumber property.
     * 
     */
    public long getCostCenterAccountNumber() {
        return costCenterAccountNumber;
    }

    /**
     * Sets the value of the costCenterAccountNumber property.
     * 
     */
    public void setCostCenterAccountNumber(long value) {
        this.costCenterAccountNumber = value;
    }

    /**
     * Gets the value of the extranetOrgId property.
     * 
     */
    public long getExtranetOrgId() {
        return extranetOrgId;
    }

    /**
     * Sets the value of the extranetOrgId property.
     * 
     */
    public void setExtranetOrgId(long value) {
        this.extranetOrgId = value;
    }

    /**
     * Gets the value of the previousAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousAccountNumber() {
        return previousAccountNumber;
    }

    /**
     * Sets the value of the previousAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousAccountNumber(String value) {
        this.previousAccountNumber = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationName(String value) {
        this.organizationName = value;
    }

    /**
     * Gets the value of the accountStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountStatus() {
        return accountStatus;
    }

    /**
     * Sets the value of the accountStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountStatus(String value) {
        this.accountStatus = value;
    }

    /**
     * Gets the value of the accountSegment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountSegment() {
        return accountSegment;
    }

    /**
     * Sets the value of the accountSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountSegment(String value) {
        this.accountSegment = value;
    }

    /**
     * Gets the value of the accountHierarchy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountHierarchy() {
        return accountHierarchy;
    }

    /**
     * Sets the value of the accountHierarchy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountHierarchy(String value) {
        this.accountHierarchy = value;
    }

    /**
     * Gets the value of the customerContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerContact }
     * 
     * 
     */
    public List<CustomerContact> getCustomerContact() {
        if (customerContact == null) {
            customerContact = new ArrayList<CustomerContact>();
        }
        return this.customerContact;
    }

    /**
     * Gets the value of the orderingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderingSystem() {
        return orderingSystem;
    }

    /**
     * Sets the value of the orderingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderingSystem(String value) {
        this.orderingSystem = value;
    }

    /**
     * Gets the value of the legacySystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegacySystem() {
        return legacySystem;
    }

    /**
     * Sets the value of the legacySystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegacySystem(String value) {
        this.legacySystem = value;
    }

    /**
     * Gets the value of the legacyAccountNumber property.
     * 
     */
    public long getLegacyAccountNumber() {
        return legacyAccountNumber;
    }

    /**
     * Sets the value of the legacyAccountNumber property.
     * 
     */
    public void setLegacyAccountNumber(long value) {
        this.legacyAccountNumber = value;
    }

    /**
     * Gets the value of the accountNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNotes() {
        return accountNotes;
    }

    /**
     * Sets the value of the accountNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNotes(String value) {
        this.accountNotes = value;
    }

    /**
     * Gets the value of the orgAccountNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgAccountNotes() {
        return orgAccountNotes;
    }

    /**
     * Sets the value of the orgAccountNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgAccountNotes(String value) {
        this.orgAccountNotes = value;
    }

    /**
     * Gets the value of the gbRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGbRefId() {
        return gbRefId;
    }

    /**
     * Sets the value of the gbRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGbRefId(String value) {
        this.gbRefId = value;
    }

    /**
     * Gets the value of the primaryAccountManager property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAccountManager() {
        return primaryAccountManager;
    }

    /**
     * Sets the value of the primaryAccountManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAccountManager(String value) {
        this.primaryAccountManager = value;
    }

    /**
     * Gets the value of the costCenterCompanyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCenterCompanyName() {
        return costCenterCompanyName;
    }

    /**
     * Sets the value of the costCenterCompanyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCenterCompanyName(String value) {
        this.costCenterCompanyName = value;
    }

    /**
     * Gets the value of the businessUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessUnitName() {
        return businessUnitName;
    }

    /**
     * Sets the value of the businessUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessUnitName(String value) {
        this.businessUnitName = value;
    }

    /**
     * Gets the value of the accountOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountOwner() {
        return accountOwner;
    }

    /**
     * Sets the value of the accountOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountOwner(String value) {
        this.accountOwner = value;
    }

    /**
     * Gets the value of the custownerdisp property.
     * 
     */
    public boolean isCustownerdisp() {
        return custownerdisp;
    }

    /**
     * Sets the value of the custownerdisp property.
     * 
     */
    public void setCustownerdisp(boolean value) {
        this.custownerdisp = value;
    }

    /**
     * Gets the value of the customerOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerOwner() {
        return customerOwner;
    }

    /**
     * Sets the value of the customerOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerOwner(String value) {
        this.customerOwner = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupId(String value) {
        this.groupId = value;
    }

    /**
     * Gets the value of the accountTenure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountTenure() {
        return accountTenure;
    }

    /**
     * Sets the value of the accountTenure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountTenure(String value) {
        this.accountTenure = value;
    }

    /**
     * Gets the value of the callCount7D property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallCount7D() {
        return callCount7D;
    }

    /**
     * Sets the value of the callCount7D property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallCount7D(String value) {
        this.callCount7D = value;
    }

    /**
     * Gets the value of the callCount30D property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallCount30D() {
        return callCount30D;
    }

    /**
     * Sets the value of the callCount30D property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallCount30D(String value) {
        this.callCount30D = value;
    }

}
