
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
 * Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementParties92", propOrder = {
    "pty2",
    "pty3",
    "pty4",
    "pty5"
})
public class SettlementParties92 {

    @XmlElement(name = "Pty2")
    protected PartyIdentificationAndAccount176 pty2;
    @XmlElement(name = "Pty3")
    protected PartyIdentificationAndAccount176 pty3;
    @XmlElement(name = "Pty4")
    protected PartyIdentificationAndAccount176 pty4;
    @XmlElement(name = "Pty5")
    protected PartyIdentificationAndAccount176 pty5;

    /**
     * Gets the value of the pty2 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount176 }
     *     
     */
    public PartyIdentificationAndAccount176 getPty2() {
        return pty2;
    }

    /**
     * Sets the value of the pty2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount176 }
     *     
     */
    public SettlementParties92 setPty2(PartyIdentificationAndAccount176 value) {
        this.pty2 = value;
        return this;
    }

    /**
     * Gets the value of the pty3 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount176 }
     *     
     */
    public PartyIdentificationAndAccount176 getPty3() {
        return pty3;
    }

    /**
     * Sets the value of the pty3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount176 }
     *     
     */
    public SettlementParties92 setPty3(PartyIdentificationAndAccount176 value) {
        this.pty3 = value;
        return this;
    }

    /**
     * Gets the value of the pty4 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount176 }
     *     
     */
    public PartyIdentificationAndAccount176 getPty4() {
        return pty4;
    }

    /**
     * Sets the value of the pty4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount176 }
     *     
     */
    public SettlementParties92 setPty4(PartyIdentificationAndAccount176 value) {
        this.pty4 = value;
        return this;
    }

    /**
     * Gets the value of the pty5 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount176 }
     *     
     */
    public PartyIdentificationAndAccount176 getPty5() {
        return pty5;
    }

    /**
     * Sets the value of the pty5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount176 }
     *     
     */
    public SettlementParties92 setPty5(PartyIdentificationAndAccount176 value) {
        this.pty5 = value;
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
