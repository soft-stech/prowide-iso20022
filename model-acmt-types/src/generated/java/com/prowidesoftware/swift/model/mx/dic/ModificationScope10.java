
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Scope of the modification to be applied on an identified set of information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModificationScope10", propOrder = {
    "modScpIndctn",
    "svcLvlAgrmt"
})
public class ModificationScope10 {

    @XmlElement(name = "ModScpIndctn", required = true)
    @XmlSchemaType(name = "string")
    protected DataModification1Code modScpIndctn;
    @XmlElement(name = "SvcLvlAgrmt", required = true)
    protected DocumentToSend1 svcLvlAgrmt;

    /**
     * Gets the value of the modScpIndctn property.
     * 
     * @return
     *     possible object is
     *     {@link DataModification1Code }
     *     
     */
    public DataModification1Code getModScpIndctn() {
        return modScpIndctn;
    }

    /**
     * Sets the value of the modScpIndctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataModification1Code }
     *     
     */
    public ModificationScope10 setModScpIndctn(DataModification1Code value) {
        this.modScpIndctn = value;
        return this;
    }

    /**
     * Gets the value of the svcLvlAgrmt property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentToSend1 }
     *     
     */
    public DocumentToSend1 getSvcLvlAgrmt() {
        return svcLvlAgrmt;
    }

    /**
     * Sets the value of the svcLvlAgrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentToSend1 }
     *     
     */
    public ModificationScope10 setSvcLvlAgrmt(DocumentToSend1 value) {
        this.svcLvlAgrmt = value;
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
