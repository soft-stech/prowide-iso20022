
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice of formats for the identification of a party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification182Choice", propOrder = {
    "anyBIC",
    "prtryId",
    "nmAndAdr",
    "taxIdNb",
    "ntlRegnNb"
})
public class PartyIdentification182Choice {

    @XmlElement(name = "AnyBIC")
    protected String anyBIC;
    @XmlElement(name = "PrtryId")
    protected GenericIdentification1 prtryId;
    @XmlElement(name = "NmAndAdr")
    protected NameAndAddress15 nmAndAdr;
    @XmlElement(name = "TaxIdNb")
    protected String taxIdNb;
    @XmlElement(name = "NtlRegnNb")
    protected String ntlRegnNb;

    /**
     * Gets the value of the anyBIC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnyBIC() {
        return anyBIC;
    }

    /**
     * Sets the value of the anyBIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification182Choice setAnyBIC(String value) {
        this.anyBIC = value;
        return this;
    }

    /**
     * Gets the value of the prtryId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification1 }
     *     
     */
    public GenericIdentification1 getPrtryId() {
        return prtryId;
    }

    /**
     * Sets the value of the prtryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification1 }
     *     
     */
    public PartyIdentification182Choice setPrtryId(GenericIdentification1 value) {
        this.prtryId = value;
        return this;
    }

    /**
     * Gets the value of the nmAndAdr property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress15 }
     *     
     */
    public NameAndAddress15 getNmAndAdr() {
        return nmAndAdr;
    }

    /**
     * Sets the value of the nmAndAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress15 }
     *     
     */
    public PartyIdentification182Choice setNmAndAdr(NameAndAddress15 value) {
        this.nmAndAdr = value;
        return this;
    }

    /**
     * Gets the value of the taxIdNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxIdNb() {
        return taxIdNb;
    }

    /**
     * Sets the value of the taxIdNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification182Choice setTaxIdNb(String value) {
        this.taxIdNb = value;
        return this;
    }

    /**
     * Gets the value of the ntlRegnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtlRegnNb() {
        return ntlRegnNb;
    }

    /**
     * Sets the value of the ntlRegnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification182Choice setNtlRegnNb(String value) {
        this.ntlRegnNb = value;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}
