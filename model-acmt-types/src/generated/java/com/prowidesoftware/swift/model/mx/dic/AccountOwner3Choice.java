
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
 * Choice between an organisation and an individual person.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountOwner3Choice", propOrder = {
    "indvOwnrId",
    "orgOwnrId"
})
public class AccountOwner3Choice {

    @XmlElement(name = "IndvOwnrId")
    protected IndividualPersonIdentification3Choice indvOwnrId;
    @XmlElement(name = "OrgOwnrId")
    protected PartyIdentification220 orgOwnrId;

    /**
     * Gets the value of the indvOwnrId property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPersonIdentification3Choice }
     *     
     */
    public IndividualPersonIdentification3Choice getIndvOwnrId() {
        return indvOwnrId;
    }

    /**
     * Sets the value of the indvOwnrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPersonIdentification3Choice }
     *     
     */
    public AccountOwner3Choice setIndvOwnrId(IndividualPersonIdentification3Choice value) {
        this.indvOwnrId = value;
        return this;
    }

    /**
     * Gets the value of the orgOwnrId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification220 }
     *     
     */
    public PartyIdentification220 getOrgOwnrId() {
        return orgOwnrId;
    }

    /**
     * Sets the value of the orgOwnrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification220 }
     *     
     */
    public AccountOwner3Choice setOrgOwnrId(PartyIdentification220 value) {
        this.orgOwnrId = value;
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
