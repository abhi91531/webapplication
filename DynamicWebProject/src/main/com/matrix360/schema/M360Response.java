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
 *       &lt;choice>
 *         &lt;element name="accountDetails" type="{http://www.megapath.com/m360}AccountDetails"/>
 *         &lt;element name="notificationDetailsResponse" type="{http://www.megapath.com/m360}NotificationDetailsResponse"/>
 *         &lt;element name="authenticationApiResponse" type="{http://www.megapath.com/m360}AuthenticationApiResponse"/>
 *         &lt;element name="userVerificationApiResponse" type="{http://www.megapath.com/m360}UserVerificationApiResponse"/>
 *         &lt;element name="serviceDetails" type="{http://www.megapath.com/m360}ServiceDetails"/>
 *         &lt;element name="serviceSummary" type="{http://www.megapath.com/m360}ServiceSummary" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="accountSearchResult" type="{http://www.megapath.com/m360}AccountSearchResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="orderDetails" type="{http://www.megapath.com/m360}OrderDetails"/>
 *         &lt;element name="productBundle" type="{http://www.megapath.com/m360}ProductBundle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="childAccount" type="{http://www.megapath.com/m360}ChildAccount" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BillingDetails" type="{http://www.megapath.com/m360}BillingDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contractDetails" type="{http://www.megapath.com/m360}ContractDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="onNetCircuit" type="{http://www.megapath.com/m360}OnNetCircuit" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ticketDetails" type="{http://www.megapath.com/m360}Ticket" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vpnDetails" type="{http://www.megapath.com/m360}OnNetVpnDetails"/>
 *         &lt;element name="evplCspDetails" type="{http://www.megapath.com/m360}EvplCspDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nidLanPortDetails" type="{http://www.megapath.com/m360}NidLanPortDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="evcDetails" type="{http://www.megapath.com/m360}EvcDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="partnerServiceId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "accountDetails",
    "notificationDetailsResponse",
    "authenticationApiResponse",
    "userVerificationApiResponse",
    "serviceDetails",
    "serviceSummary",
    "accountSearchResult",
    "orderDetails",
    "productBundle",
    "childAccount",
    "billingDetails",
    "contractDetails",
    "onNetCircuit",
    "ticketDetails",
    "errorMessage",
    "vpnDetails",
    "evplCspDetails",
    "nidLanPortDetails",
    "evcDetails",
    "partnerServiceId"
})
@XmlRootElement(name = "m360Response")
public class M360Response {

    protected AccountDetails accountDetails;
    protected NotificationDetailsResponse notificationDetailsResponse;
    protected AuthenticationApiResponse authenticationApiResponse;
    protected UserVerificationApiResponse userVerificationApiResponse;
    protected ServiceDetails serviceDetails;
    protected List<ServiceSummary> serviceSummary;
    protected List<AccountSearchResult> accountSearchResult;
    protected OrderDetails orderDetails;
    protected List<ProductBundle> productBundle;
    protected List<ChildAccount> childAccount;
    @XmlElement(name = "BillingDetails")
    protected List<BillingDetails> billingDetails;
    protected List<ContractDetails> contractDetails;
    protected List<OnNetCircuit> onNetCircuit;
    protected List<Ticket> ticketDetails;
    protected String errorMessage;
    protected OnNetVpnDetails vpnDetails;
    protected List<EvplCspDetails> evplCspDetails;
    protected List<NidLanPortDetails> nidLanPortDetails;
    protected List<EvcDetails> evcDetails;
    protected Integer partnerServiceId;

    /**
     * Gets the value of the accountDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AccountDetails }
     *     
     */
    public AccountDetails getAccountDetails() {
        return accountDetails;
    }

    /**
     * Sets the value of the accountDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountDetails }
     *     
     */
    public void setAccountDetails(AccountDetails value) {
        this.accountDetails = value;
    }

    /**
     * Gets the value of the notificationDetailsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationDetailsResponse }
     *     
     */
    public NotificationDetailsResponse getNotificationDetailsResponse() {
        return notificationDetailsResponse;
    }

    /**
     * Sets the value of the notificationDetailsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationDetailsResponse }
     *     
     */
    public void setNotificationDetailsResponse(NotificationDetailsResponse value) {
        this.notificationDetailsResponse = value;
    }

    /**
     * Gets the value of the authenticationApiResponse property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationApiResponse }
     *     
     */
    public AuthenticationApiResponse getAuthenticationApiResponse() {
        return authenticationApiResponse;
    }

    /**
     * Sets the value of the authenticationApiResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationApiResponse }
     *     
     */
    public void setAuthenticationApiResponse(AuthenticationApiResponse value) {
        this.authenticationApiResponse = value;
    }

    /**
     * Gets the value of the userVerificationApiResponse property.
     * 
     * @return
     *     possible object is
     *     {@link UserVerificationApiResponse }
     *     
     */
    public UserVerificationApiResponse getUserVerificationApiResponse() {
        return userVerificationApiResponse;
    }

    /**
     * Sets the value of the userVerificationApiResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserVerificationApiResponse }
     *     
     */
    public void setUserVerificationApiResponse(UserVerificationApiResponse value) {
        this.userVerificationApiResponse = value;
    }

    /**
     * Gets the value of the serviceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDetails }
     *     
     */
    public ServiceDetails getServiceDetails() {
        return serviceDetails;
    }

    /**
     * Sets the value of the serviceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDetails }
     *     
     */
    public void setServiceDetails(ServiceDetails value) {
        this.serviceDetails = value;
    }

    /**
     * Gets the value of the serviceSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceSummary }
     * 
     * 
     */
    public List<ServiceSummary> getServiceSummary() {
        if (serviceSummary == null) {
            serviceSummary = new ArrayList<ServiceSummary>();
        }
        return this.serviceSummary;
    }

    /**
     * Gets the value of the accountSearchResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountSearchResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountSearchResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountSearchResult }
     * 
     * 
     */
    public List<AccountSearchResult> getAccountSearchResult() {
        if (accountSearchResult == null) {
            accountSearchResult = new ArrayList<AccountSearchResult>();
        }
        return this.accountSearchResult;
    }

    /**
     * Gets the value of the orderDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OrderDetails }
     *     
     */
    public OrderDetails getOrderDetails() {
        return orderDetails;
    }

    /**
     * Sets the value of the orderDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderDetails }
     *     
     */
    public void setOrderDetails(OrderDetails value) {
        this.orderDetails = value;
    }

    /**
     * Gets the value of the productBundle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productBundle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductBundle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductBundle }
     * 
     * 
     */
    public List<ProductBundle> getProductBundle() {
        if (productBundle == null) {
            productBundle = new ArrayList<ProductBundle>();
        }
        return this.productBundle;
    }

    /**
     * Gets the value of the childAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChildAccount }
     * 
     * 
     */
    public List<ChildAccount> getChildAccount() {
        if (childAccount == null) {
            childAccount = new ArrayList<ChildAccount>();
        }
        return this.childAccount;
    }

    /**
     * Gets the value of the billingDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billingDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingDetails }
     * 
     * 
     */
    public List<BillingDetails> getBillingDetails() {
        if (billingDetails == null) {
            billingDetails = new ArrayList<BillingDetails>();
        }
        return this.billingDetails;
    }

    /**
     * Gets the value of the contractDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractDetails }
     * 
     * 
     */
    public List<ContractDetails> getContractDetails() {
        if (contractDetails == null) {
            contractDetails = new ArrayList<ContractDetails>();
        }
        return this.contractDetails;
    }

    /**
     * Gets the value of the onNetCircuit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onNetCircuit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnNetCircuit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OnNetCircuit }
     * 
     * 
     */
    public List<OnNetCircuit> getOnNetCircuit() {
        if (onNetCircuit == null) {
            onNetCircuit = new ArrayList<OnNetCircuit>();
        }
        return this.onNetCircuit;
    }

    /**
     * Gets the value of the ticketDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ticket }
     * 
     * 
     */
    public List<Ticket> getTicketDetails() {
        if (ticketDetails == null) {
            ticketDetails = new ArrayList<Ticket>();
        }
        return this.ticketDetails;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the vpnDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OnNetVpnDetails }
     *     
     */
    public OnNetVpnDetails getVpnDetails() {
        return vpnDetails;
    }

    /**
     * Sets the value of the vpnDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnNetVpnDetails }
     *     
     */
    public void setVpnDetails(OnNetVpnDetails value) {
        this.vpnDetails = value;
    }

    /**
     * Gets the value of the evplCspDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evplCspDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvplCspDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EvplCspDetails }
     * 
     * 
     */
    public List<EvplCspDetails> getEvplCspDetails() {
        if (evplCspDetails == null) {
            evplCspDetails = new ArrayList<EvplCspDetails>();
        }
        return this.evplCspDetails;
    }

    /**
     * Gets the value of the nidLanPortDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nidLanPortDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNidLanPortDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NidLanPortDetails }
     * 
     * 
     */
    public List<NidLanPortDetails> getNidLanPortDetails() {
        if (nidLanPortDetails == null) {
            nidLanPortDetails = new ArrayList<NidLanPortDetails>();
        }
        return this.nidLanPortDetails;
    }

    /**
     * Gets the value of the evcDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evcDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvcDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EvcDetails }
     * 
     * 
     */
    public List<EvcDetails> getEvcDetails() {
        if (evcDetails == null) {
            evcDetails = new ArrayList<EvcDetails>();
        }
        return this.evcDetails;
    }

    /**
     * Gets the value of the partnerServiceId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPartnerServiceId() {
        return partnerServiceId;
    }

    /**
     * Sets the value of the partnerServiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPartnerServiceId(Integer value) {
        this.partnerServiceId = value;
    }

}