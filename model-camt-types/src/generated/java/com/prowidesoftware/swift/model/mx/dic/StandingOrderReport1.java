
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
 * Defines the detailed attributes of a standing order.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandingOrderReport1", propOrder = {
    "stgOrdrId",
    "stgOrdrOrErr"
})
public class StandingOrderReport1 {

    @XmlElement(name = "StgOrdrId", required = true)
    protected StandingOrderIdentification4 stgOrdrId;
    @XmlElement(name = "StgOrdrOrErr", required = true)
    protected StandingOrderOrError6Choice stgOrdrOrErr;

    /**
     * Gets the value of the stgOrdrId property.
     * 
     * @return
     *     possible object is
     *     {@link StandingOrderIdentification4 }
     *     
     */
    public StandingOrderIdentification4 getStgOrdrId() {
        return stgOrdrId;
    }

    /**
     * Sets the value of the stgOrdrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingOrderIdentification4 }
     *     
     */
    public StandingOrderReport1 setStgOrdrId(StandingOrderIdentification4 value) {
        this.stgOrdrId = value;
        return this;
    }

    /**
     * Gets the value of the stgOrdrOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link StandingOrderOrError6Choice }
     *     
     */
    public StandingOrderOrError6Choice getStgOrdrOrErr() {
        return stgOrdrOrErr;
    }

    /**
     * Sets the value of the stgOrdrOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingOrderOrError6Choice }
     *     
     */
    public StandingOrderReport1 setStgOrdrOrErr(StandingOrderOrError6Choice value) {
        this.stgOrdrOrErr = value;
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
