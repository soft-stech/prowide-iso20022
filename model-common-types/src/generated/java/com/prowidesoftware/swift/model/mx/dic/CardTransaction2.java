
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
 * Card transaction details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardTransaction2", propOrder = {
    "card",
    "poi",
    "tx",
    "prePdAcct"
})
public class CardTransaction2 {

    @XmlElement(name = "Card")
    protected PaymentCard4 card;
    @XmlElement(name = "POI")
    protected PointOfInteraction1 poi;
    @XmlElement(name = "Tx")
    protected CardTransaction2Choice tx;
    @XmlElement(name = "PrePdAcct")
    protected CashAccount24 prePdAcct;

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCard4 }
     *     
     */
    public PaymentCard4 getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCard4 }
     *     
     */
    public CardTransaction2 setCard(PaymentCard4 value) {
        this.card = value;
        return this;
    }

    /**
     * Gets the value of the poi property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteraction1 }
     *     
     */
    public PointOfInteraction1 getPOI() {
        return poi;
    }

    /**
     * Sets the value of the poi property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteraction1 }
     *     
     */
    public CardTransaction2 setPOI(PointOfInteraction1 value) {
        this.poi = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link CardTransaction2Choice }
     *     
     */
    public CardTransaction2Choice getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardTransaction2Choice }
     *     
     */
    public CardTransaction2 setTx(CardTransaction2Choice value) {
        this.tx = value;
        return this;
    }

    /**
     * Gets the value of the prePdAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount24 }
     *     
     */
    public CashAccount24 getPrePdAcct() {
        return prePdAcct;
    }

    /**
     * Sets the value of the prePdAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount24 }
     *     
     */
    public CardTransaction2 setPrePdAcct(CashAccount24 value) {
        this.prePdAcct = value;
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
