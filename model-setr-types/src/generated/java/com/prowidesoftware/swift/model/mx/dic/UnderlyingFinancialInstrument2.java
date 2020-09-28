
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
 * Underlying financial instrument to which an trade confirmation is related.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderlyingFinancialInstrument2", propOrder = {
    "id",
    "attrbts"
})
public class UnderlyingFinancialInstrument2 {

    @XmlElement(name = "Id", required = true)
    protected SecurityIdentification14 id;
    @XmlElement(name = "Attrbts")
    protected FinancialInstrumentAttributes44 attrbts;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public SecurityIdentification14 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public UnderlyingFinancialInstrument2 setId(SecurityIdentification14 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the attrbts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes44 }
     *     
     */
    public FinancialInstrumentAttributes44 getAttrbts() {
        return attrbts;
    }

    /**
     * Sets the value of the attrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes44 }
     *     
     */
    public UnderlyingFinancialInstrument2 setAttrbts(FinancialInstrumentAttributes44 value) {
        this.attrbts = value;
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
