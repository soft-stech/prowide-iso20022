
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
 * Card payment transaction choice between cancellation, authorisation request and authorisation response.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentDataSetTransaction6Choice", propOrder = {
    "cmpltn",
    "cxl",
    "authstnReq",
    "authstnRspn"
})
public class CardPaymentDataSetTransaction6Choice {

    @XmlElement(name = "Cmpltn")
    protected CardPaymentDataSetTransaction24 cmpltn;
    @XmlElement(name = "Cxl")
    protected CardPaymentDataSetTransaction23 cxl;
    @XmlElement(name = "AuthstnReq")
    protected CardPaymentDataSetTransaction22 authstnReq;
    @XmlElement(name = "AuthstnRspn")
    protected CardPaymentDataSetTransaction25 authstnRspn;

    /**
     * Gets the value of the cmpltn property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentDataSetTransaction24 }
     *     
     */
    public CardPaymentDataSetTransaction24 getCmpltn() {
        return cmpltn;
    }

    /**
     * Sets the value of the cmpltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentDataSetTransaction24 }
     *     
     */
    public CardPaymentDataSetTransaction6Choice setCmpltn(CardPaymentDataSetTransaction24 value) {
        this.cmpltn = value;
        return this;
    }

    /**
     * Gets the value of the cxl property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentDataSetTransaction23 }
     *     
     */
    public CardPaymentDataSetTransaction23 getCxl() {
        return cxl;
    }

    /**
     * Sets the value of the cxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentDataSetTransaction23 }
     *     
     */
    public CardPaymentDataSetTransaction6Choice setCxl(CardPaymentDataSetTransaction23 value) {
        this.cxl = value;
        return this;
    }

    /**
     * Gets the value of the authstnReq property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentDataSetTransaction22 }
     *     
     */
    public CardPaymentDataSetTransaction22 getAuthstnReq() {
        return authstnReq;
    }

    /**
     * Sets the value of the authstnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentDataSetTransaction22 }
     *     
     */
    public CardPaymentDataSetTransaction6Choice setAuthstnReq(CardPaymentDataSetTransaction22 value) {
        this.authstnReq = value;
        return this;
    }

    /**
     * Gets the value of the authstnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentDataSetTransaction25 }
     *     
     */
    public CardPaymentDataSetTransaction25 getAuthstnRspn() {
        return authstnRspn;
    }

    /**
     * Sets the value of the authstnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentDataSetTransaction25 }
     *     
     */
    public CardPaymentDataSetTransaction6Choice setAuthstnRspn(CardPaymentDataSetTransaction25 value) {
        this.authstnRspn = value;
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
