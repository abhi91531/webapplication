//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.14 at 06:08:02 PM IST 
//


package com.matrix360.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OnNetDispatch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OnNetDispatch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="onCircuitNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="onOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="onTicketNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timeScheduled" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timeActual" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="technicianAssigned" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="technicialActual" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnNetDispatch", propOrder = {
    "onCircuitNumber",
    "onOrderNumber",
    "onTicketNumber",
    "timeScheduled",
    "timeActual",
    "technicianAssigned",
    "technicialActual",
    "status"
})
public class OnNetDispatch {

    @XmlElement(required = true)
    protected String onCircuitNumber;
    @XmlElement(required = true)
    protected String onOrderNumber;
    @XmlElement(required = true)
    protected String onTicketNumber;
    @XmlElement(required = true)
    protected String timeScheduled;
    @XmlElement(required = true)
    protected String timeActual;
    @XmlElement(required = true)
    protected String technicianAssigned;
    @XmlElement(required = true)
    protected String technicialActual;
    @XmlElement(required = true)
    protected String status;

    /**
     * Gets the value of the onCircuitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnCircuitNumber() {
        return onCircuitNumber;
    }

    /**
     * Sets the value of the onCircuitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnCircuitNumber(String value) {
        this.onCircuitNumber = value;
    }

    /**
     * Gets the value of the onOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnOrderNumber() {
        return onOrderNumber;
    }

    /**
     * Sets the value of the onOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnOrderNumber(String value) {
        this.onOrderNumber = value;
    }

    /**
     * Gets the value of the onTicketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnTicketNumber() {
        return onTicketNumber;
    }

    /**
     * Sets the value of the onTicketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnTicketNumber(String value) {
        this.onTicketNumber = value;
    }

    /**
     * Gets the value of the timeScheduled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeScheduled() {
        return timeScheduled;
    }

    /**
     * Sets the value of the timeScheduled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeScheduled(String value) {
        this.timeScheduled = value;
    }

    /**
     * Gets the value of the timeActual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeActual() {
        return timeActual;
    }

    /**
     * Sets the value of the timeActual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeActual(String value) {
        this.timeActual = value;
    }

    /**
     * Gets the value of the technicianAssigned property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnicianAssigned() {
        return technicianAssigned;
    }

    /**
     * Sets the value of the technicianAssigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnicianAssigned(String value) {
        this.technicianAssigned = value;
    }

    /**
     * Gets the value of the technicialActual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnicialActual() {
        return technicialActual;
    }

    /**
     * Sets the value of the technicialActual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnicialActual(String value) {
        this.technicialActual = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}