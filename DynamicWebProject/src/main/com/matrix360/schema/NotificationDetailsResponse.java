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
 * <p>Java class for NotificationDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationDetailsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="incidentId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="notificationPurpose" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="notificationDetails" type="{http://www.megapath.com/m360}NotificationDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationDetailsResponse", propOrder = {
    "incidentId",
    "notificationPurpose",
    "notificationDetails"
})
public class NotificationDetailsResponse {

    protected long incidentId;
    @XmlElement(required = true)
    protected String notificationPurpose;
    protected List<NotificationDetails> notificationDetails;

    /**
     * Gets the value of the incidentId property.
     * 
     */
    public long getIncidentId() {
        return incidentId;
    }

    /**
     * Sets the value of the incidentId property.
     * 
     */
    public void setIncidentId(long value) {
        this.incidentId = value;
    }

    /**
     * Gets the value of the notificationPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationPurpose() {
        return notificationPurpose;
    }

    /**
     * Sets the value of the notificationPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationPurpose(String value) {
        this.notificationPurpose = value;
    }

    /**
     * Gets the value of the notificationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotificationDetails }
     * 
     * 
     */
    public List<NotificationDetails> getNotificationDetails() {
        if (notificationDetails == null) {
            notificationDetails = new ArrayList<NotificationDetails>();
        }
        return this.notificationDetails;
    }

}