
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
 * Identification of a previous notification.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationUpdate1", propOrder = {
    "prvsNtfctnId",
    "rcnfrmInstrs"
})
public class NotificationUpdate1 {

    @XmlElement(name = "PrvsNtfctnId", required = true)
    protected String prvsNtfctnId;
    @XmlElement(name = "RcnfrmInstrs")
    protected boolean rcnfrmInstrs;

    /**
     * Gets the value of the prvsNtfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvsNtfctnId() {
        return prvsNtfctnId;
    }

    /**
     * Sets the value of the prvsNtfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NotificationUpdate1 setPrvsNtfctnId(String value) {
        this.prvsNtfctnId = value;
        return this;
    }

    /**
     * Gets the value of the rcnfrmInstrs property.
     * 
     */
    public boolean isRcnfrmInstrs() {
        return rcnfrmInstrs;
    }

    /**
     * Sets the value of the rcnfrmInstrs property.
     * 
     */
    public NotificationUpdate1 setRcnfrmInstrs(boolean value) {
        this.rcnfrmInstrs = value;
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
