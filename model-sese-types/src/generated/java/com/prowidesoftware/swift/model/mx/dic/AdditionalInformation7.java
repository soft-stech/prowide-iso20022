
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
 * Additional specific modification criteria.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalInformation7", propOrder = {
    "acctOwnrTxId",
    "clssfctnTp",
    "sfkpgAcct",
    "finInstrmId",
    "qty",
    "fctvDt",
    "xpryDt",
    "cutOffDt",
    "invstr",
    "dlvrgPty1",
    "rcvgPty1"
})
public class AdditionalInformation7 {

    @XmlElement(name = "AcctOwnrTxId")
    protected String acctOwnrTxId;
    @XmlElement(name = "ClssfctnTp")
    protected ClassificationType1Choice clssfctnTp;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount13 sfkpgAcct;
    @XmlElement(name = "FinInstrmId")
    protected SecurityIdentification14 finInstrmId;
    @XmlElement(name = "Qty")
    protected FinancialInstrumentQuantity1Choice qty;
    @XmlElement(name = "FctvDt")
    protected DateAndDateTimeChoice fctvDt;
    @XmlElement(name = "XpryDt")
    protected DateAndDateTimeChoice xpryDt;
    @XmlElement(name = "CutOffDt")
    protected DateAndDateTimeChoice cutOffDt;
    @XmlElement(name = "Invstr")
    protected PartyIdentification43Choice invstr;
    @XmlElement(name = "DlvrgPty1")
    protected PartyIdentificationAndAccount43 dlvrgPty1;
    @XmlElement(name = "RcvgPty1")
    protected PartyIdentificationAndAccount43 rcvgPty1;

    /**
     * Gets the value of the acctOwnrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctOwnrTxId() {
        return acctOwnrTxId;
    }

    /**
     * Sets the value of the acctOwnrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalInformation7 setAcctOwnrTxId(String value) {
        this.acctOwnrTxId = value;
        return this;
    }

    /**
     * Gets the value of the clssfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationType1Choice }
     *     
     */
    public ClassificationType1Choice getClssfctnTp() {
        return clssfctnTp;
    }

    /**
     * Sets the value of the clssfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationType1Choice }
     *     
     */
    public AdditionalInformation7 setClssfctnTp(ClassificationType1Choice value) {
        this.clssfctnTp = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount13 }
     *     
     */
    public SecuritiesAccount13 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount13 }
     *     
     */
    public AdditionalInformation7 setSfkpgAcct(SecuritiesAccount13 value) {
        this.sfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public SecurityIdentification14 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public AdditionalInformation7 setFinInstrmId(SecurityIdentification14 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public AdditionalInformation7 setQty(FinancialInstrumentQuantity1Choice value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the fctvDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getFctvDt() {
        return fctvDt;
    }

    /**
     * Sets the value of the fctvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public AdditionalInformation7 setFctvDt(DateAndDateTimeChoice value) {
        this.fctvDt = value;
        return this;
    }

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public AdditionalInformation7 setXpryDt(DateAndDateTimeChoice value) {
        this.xpryDt = value;
        return this;
    }

    /**
     * Gets the value of the cutOffDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getCutOffDt() {
        return cutOffDt;
    }

    /**
     * Sets the value of the cutOffDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public AdditionalInformation7 setCutOffDt(DateAndDateTimeChoice value) {
        this.cutOffDt = value;
        return this;
    }

    /**
     * Gets the value of the invstr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43Choice }
     *     
     */
    public PartyIdentification43Choice getInvstr() {
        return invstr;
    }

    /**
     * Sets the value of the invstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43Choice }
     *     
     */
    public AdditionalInformation7 setInvstr(PartyIdentification43Choice value) {
        this.invstr = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgPty1 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount43 }
     *     
     */
    public PartyIdentificationAndAccount43 getDlvrgPty1() {
        return dlvrgPty1;
    }

    /**
     * Sets the value of the dlvrgPty1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount43 }
     *     
     */
    public AdditionalInformation7 setDlvrgPty1(PartyIdentificationAndAccount43 value) {
        this.dlvrgPty1 = value;
        return this;
    }

    /**
     * Gets the value of the rcvgPty1 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount43 }
     *     
     */
    public PartyIdentificationAndAccount43 getRcvgPty1() {
        return rcvgPty1;
    }

    /**
     * Sets the value of the rcvgPty1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount43 }
     *     
     */
    public AdditionalInformation7 setRcvgPty1(PartyIdentificationAndAccount43 value) {
        this.rcvgPty1 = value;
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
