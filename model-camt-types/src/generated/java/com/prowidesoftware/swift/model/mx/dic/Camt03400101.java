
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
 * Scope
 * The DuplicateInstruction message is used by financial institutions, with their own offices, and/or with other financial institutions with which they have established bilateral agreements. It allows to exchange duplicate payment instructions.
 * Usage
 * This message must be sent in response to a Request For Duplicate message.
 * The Duplicate Data element must contain a well formed XML document. This means XML special characters such as '<' must be used in a way that is consistent with XML well-formedness criteria.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "camt.034.001.01", propOrder = {
    "assgnmt",
    "_case",
    "dplctInstr"
})
public class Camt03400101 {

    @XmlElement(name = "Assgnmt", required = true)
    protected CaseAssignment assgnmt;
    @XmlElement(name = "Case", required = true)
    protected Case _case;
    @XmlElement(name = "DplctInstr", required = true)
    protected ProprietaryData dplctInstr;

    /**
     * Gets the value of the assgnmt property.
     * 
     * @return
     *     possible object is
     *     {@link CaseAssignment }
     *     
     */
    public CaseAssignment getAssgnmt() {
        return assgnmt;
    }

    /**
     * Sets the value of the assgnmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseAssignment }
     *     
     */
    public Camt03400101 setAssgnmt(CaseAssignment value) {
        this.assgnmt = value;
        return this;
    }

    /**
     * Gets the value of the case property.
     * 
     * @return
     *     possible object is
     *     {@link Case }
     *     
     */
    public Case getCase() {
        return _case;
    }

    /**
     * Sets the value of the case property.
     * 
     * @param value
     *     allowed object is
     *     {@link Case }
     *     
     */
    public Camt03400101 setCase(Case value) {
        this._case = value;
        return this;
    }

    /**
     * Gets the value of the dplctInstr property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryData }
     *     
     */
    public ProprietaryData getDplctInstr() {
        return dplctInstr;
    }

    /**
     * Sets the value of the dplctInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryData }
     *     
     */
    public Camt03400101 setDplctInstr(ProprietaryData value) {
        this.dplctInstr = value;
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
