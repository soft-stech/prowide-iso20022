
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Pricing component, such as a service, promotion, allowance or charge, for this line item.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItemAllowanceCharge1", propOrder = {
    "chrgInd",
    "actlAmt",
    "bsisQty",
    "clctnPct",
    "seqNb",
    "rsn"
})
public class LineItemAllowanceCharge1 {

    @XmlElement(name = "ChrgInd")
    protected Boolean chrgInd;
    @XmlElement(name = "ActlAmt")
    protected List<CurrencyAndAmount> actlAmt;
    @XmlElement(name = "BsisQty")
    protected Quantity3 bsisQty;
    @XmlElement(name = "ClctnPct")
    protected BigDecimal clctnPct;
    @XmlElement(name = "SeqNb")
    protected BigDecimal seqNb;
    @XmlElement(name = "Rsn")
    protected DiscountOrChargeType1Choice rsn;

    /**
     * Gets the value of the chrgInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChrgInd() {
        return chrgInd;
    }

    /**
     * Sets the value of the chrgInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public LineItemAllowanceCharge1 setChrgInd(Boolean value) {
        this.chrgInd = value;
        return this;
    }

    /**
     * Gets the value of the actlAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actlAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActlAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyAndAmount }
     * 
     * 
     */
    public List<CurrencyAndAmount> getActlAmt() {
        if (actlAmt == null) {
            actlAmt = new ArrayList<CurrencyAndAmount>();
        }
        return this.actlAmt;
    }

    /**
     * Gets the value of the bsisQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity3 }
     *     
     */
    public Quantity3 getBsisQty() {
        return bsisQty;
    }

    /**
     * Sets the value of the bsisQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity3 }
     *     
     */
    public LineItemAllowanceCharge1 setBsisQty(Quantity3 value) {
        this.bsisQty = value;
        return this;
    }

    /**
     * Gets the value of the clctnPct property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getClctnPct() {
        return clctnPct;
    }

    /**
     * Sets the value of the clctnPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public LineItemAllowanceCharge1 setClctnPct(BigDecimal value) {
        this.clctnPct = value;
        return this;
    }

    /**
     * Gets the value of the seqNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeqNb() {
        return seqNb;
    }

    /**
     * Sets the value of the seqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public LineItemAllowanceCharge1 setSeqNb(BigDecimal value) {
        this.seqNb = value;
        return this;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountOrChargeType1Choice }
     *     
     */
    public DiscountOrChargeType1Choice getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountOrChargeType1Choice }
     *     
     */
    public LineItemAllowanceCharge1 setRsn(DiscountOrChargeType1Choice value) {
        this.rsn = value;
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

    /**
     * Adds a new item to the actlAmt list.
     * @see #getActlAmt()
     * 
     */
    public LineItemAllowanceCharge1 addActlAmt(CurrencyAndAmount actlAmt) {
        getActlAmt().add(actlAmt);
        return this;
    }

}
