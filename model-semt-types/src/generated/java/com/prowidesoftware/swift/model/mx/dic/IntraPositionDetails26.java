
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
 * Details of the intra-position movement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraPositionDetails26", propOrder = {
    "sttldQty",
    "sctiesSubBalId",
    "collMntrAmt",
    "prevslySttldQty",
    "rmngToBeSttldQty",
    "sttlmDt",
    "avlblDt",
    "corpActnEvtTp",
    "balFr",
    "balTo",
    "instrPrcgAddtlDtls"
})
public class IntraPositionDetails26 {

    @XmlElement(name = "SttldQty", required = true)
    protected FinancialInstrumentQuantity15Choice sttldQty;
    @XmlElement(name = "SctiesSubBalId")
    protected GenericIdentification39 sctiesSubBalId;
    @XmlElement(name = "CollMntrAmt")
    protected AmountAndDirection24 collMntrAmt;
    @XmlElement(name = "PrevslySttldQty")
    protected FinancialInstrumentQuantity15Choice prevslySttldQty;
    @XmlElement(name = "RmngToBeSttldQty")
    protected FinancialInstrumentQuantity15Choice rmngToBeSttldQty;
    @XmlElement(name = "SttlmDt", required = true)
    protected DateAndDateTimeChoice sttlmDt;
    @XmlElement(name = "AvlblDt")
    protected DateAndDateTimeChoice avlblDt;
    @XmlElement(name = "CorpActnEvtTp")
    protected CorporateActionEventType4Choice corpActnEvtTp;
    @XmlElement(name = "BalFr", required = true)
    protected SecuritiesSubBalanceTypeAndQuantityBreakdown2 balFr;
    @XmlElement(name = "BalTo", required = true)
    protected SecuritiesSubBalanceTypeAndQuantityBreakdown2 balTo;
    @XmlElement(name = "InstrPrcgAddtlDtls")
    protected String instrPrcgAddtlDtls;

    /**
     * Gets the value of the sttldQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public FinancialInstrumentQuantity15Choice getSttldQty() {
        return sttldQty;
    }

    /**
     * Sets the value of the sttldQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public IntraPositionDetails26 setSttldQty(FinancialInstrumentQuantity15Choice value) {
        this.sttldQty = value;
        return this;
    }

    /**
     * Gets the value of the sctiesSubBalId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification39 }
     *     
     */
    public GenericIdentification39 getSctiesSubBalId() {
        return sctiesSubBalId;
    }

    /**
     * Sets the value of the sctiesSubBalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification39 }
     *     
     */
    public IntraPositionDetails26 setSctiesSubBalId(GenericIdentification39 value) {
        this.sctiesSubBalId = value;
        return this;
    }

    /**
     * Gets the value of the collMntrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection24 }
     *     
     */
    public AmountAndDirection24 getCollMntrAmt() {
        return collMntrAmt;
    }

    /**
     * Sets the value of the collMntrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection24 }
     *     
     */
    public IntraPositionDetails26 setCollMntrAmt(AmountAndDirection24 value) {
        this.collMntrAmt = value;
        return this;
    }

    /**
     * Gets the value of the prevslySttldQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public FinancialInstrumentQuantity15Choice getPrevslySttldQty() {
        return prevslySttldQty;
    }

    /**
     * Sets the value of the prevslySttldQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public IntraPositionDetails26 setPrevslySttldQty(FinancialInstrumentQuantity15Choice value) {
        this.prevslySttldQty = value;
        return this;
    }

    /**
     * Gets the value of the rmngToBeSttldQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public FinancialInstrumentQuantity15Choice getRmngToBeSttldQty() {
        return rmngToBeSttldQty;
    }

    /**
     * Sets the value of the rmngToBeSttldQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public IntraPositionDetails26 setRmngToBeSttldQty(FinancialInstrumentQuantity15Choice value) {
        this.rmngToBeSttldQty = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public IntraPositionDetails26 setSttlmDt(DateAndDateTimeChoice value) {
        this.sttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the avlblDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getAvlblDt() {
        return avlblDt;
    }

    /**
     * Sets the value of the avlblDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public IntraPositionDetails26 setAvlblDt(DateAndDateTimeChoice value) {
        this.avlblDt = value;
        return this;
    }

    /**
     * Gets the value of the corpActnEvtTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventType4Choice }
     *     
     */
    public CorporateActionEventType4Choice getCorpActnEvtTp() {
        return corpActnEvtTp;
    }

    /**
     * Sets the value of the corpActnEvtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventType4Choice }
     *     
     */
    public IntraPositionDetails26 setCorpActnEvtTp(CorporateActionEventType4Choice value) {
        this.corpActnEvtTp = value;
        return this;
    }

    /**
     * Gets the value of the balFr property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSubBalanceTypeAndQuantityBreakdown2 }
     *     
     */
    public SecuritiesSubBalanceTypeAndQuantityBreakdown2 getBalFr() {
        return balFr;
    }

    /**
     * Sets the value of the balFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSubBalanceTypeAndQuantityBreakdown2 }
     *     
     */
    public IntraPositionDetails26 setBalFr(SecuritiesSubBalanceTypeAndQuantityBreakdown2 value) {
        this.balFr = value;
        return this;
    }

    /**
     * Gets the value of the balTo property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSubBalanceTypeAndQuantityBreakdown2 }
     *     
     */
    public SecuritiesSubBalanceTypeAndQuantityBreakdown2 getBalTo() {
        return balTo;
    }

    /**
     * Sets the value of the balTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSubBalanceTypeAndQuantityBreakdown2 }
     *     
     */
    public IntraPositionDetails26 setBalTo(SecuritiesSubBalanceTypeAndQuantityBreakdown2 value) {
        this.balTo = value;
        return this;
    }

    /**
     * Gets the value of the instrPrcgAddtlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrPrcgAddtlDtls() {
        return instrPrcgAddtlDtls;
    }

    /**
     * Sets the value of the instrPrcgAddtlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IntraPositionDetails26 setInstrPrcgAddtlDtls(String value) {
        this.instrPrcgAddtlDtls = value;
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
