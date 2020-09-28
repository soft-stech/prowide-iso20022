
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
 * Indicates how the amount of the investment plan is split amongst the funds.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Repartition4", propOrder = {
    "qty",
    "finInstrm",
    "ccyOfPlan"
})
public class Repartition4 {

    @XmlElement(name = "Qty", required = true)
    protected UnitsOrAmountOrPercentage1Choice qty;
    @XmlElement(name = "FinInstrm", required = true)
    protected FinancialInstrument51 finInstrm;
    @XmlElement(name = "CcyOfPlan")
    protected String ccyOfPlan;

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitsOrAmountOrPercentage1Choice }
     *     
     */
    public UnitsOrAmountOrPercentage1Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitsOrAmountOrPercentage1Choice }
     *     
     */
    public Repartition4 setQty(UnitsOrAmountOrPercentage1Choice value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the finInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument51 }
     *     
     */
    public FinancialInstrument51 getFinInstrm() {
        return finInstrm;
    }

    /**
     * Sets the value of the finInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument51 }
     *     
     */
    public Repartition4 setFinInstrm(FinancialInstrument51 value) {
        this.finInstrm = value;
        return this;
    }

    /**
     * Gets the value of the ccyOfPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcyOfPlan() {
        return ccyOfPlan;
    }

    /**
     * Sets the value of the ccyOfPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Repartition4 setCcyOfPlan(String value) {
        this.ccyOfPlan = value;
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
