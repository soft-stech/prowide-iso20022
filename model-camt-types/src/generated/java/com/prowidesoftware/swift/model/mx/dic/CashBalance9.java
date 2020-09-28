
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * Balance details for a cash account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashBalance9", propOrder = {
    "tp",
    "ctrPtyTp",
    "ctrPtyId",
    "valDt"
})
public class CashBalance9 {

    @XmlElement(name = "Tp")
    protected List<BalanceType8Choice> tp;
    @XmlElement(name = "CtrPtyTp", required = true)
    @XmlSchemaType(name = "string")
    protected BalanceCounterparty1Code ctrPtyTp;
    @XmlElement(name = "CtrPtyId")
    protected List<BranchAndFinancialInstitutionIdentification5> ctrPtyId;
    @XmlElement(name = "ValDt")
    protected List<DateAndDateTimeSearch3Choice> valDt;

    /**
     * Gets the value of the tp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceType8Choice }
     * 
     * 
     */
    public List<BalanceType8Choice> getTp() {
        if (tp == null) {
            tp = new ArrayList<BalanceType8Choice>();
        }
        return this.tp;
    }

    /**
     * Gets the value of the ctrPtyTp property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceCounterparty1Code }
     *     
     */
    public BalanceCounterparty1Code getCtrPtyTp() {
        return ctrPtyTp;
    }

    /**
     * Sets the value of the ctrPtyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceCounterparty1Code }
     *     
     */
    public CashBalance9 setCtrPtyTp(BalanceCounterparty1Code value) {
        this.ctrPtyTp = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtyId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ctrPtyId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtrPtyId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BranchAndFinancialInstitutionIdentification5 }
     * 
     * 
     */
    public List<BranchAndFinancialInstitutionIdentification5> getCtrPtyId() {
        if (ctrPtyId == null) {
            ctrPtyId = new ArrayList<BranchAndFinancialInstitutionIdentification5>();
        }
        return this.ctrPtyId;
    }

    /**
     * Gets the value of the valDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateAndDateTimeSearch3Choice }
     * 
     * 
     */
    public List<DateAndDateTimeSearch3Choice> getValDt() {
        if (valDt == null) {
            valDt = new ArrayList<DateAndDateTimeSearch3Choice>();
        }
        return this.valDt;
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
     * Adds a new item to the tp list.
     * @see #getTp()
     * 
     */
    public CashBalance9 addTp(BalanceType8Choice tp) {
        getTp().add(tp);
        return this;
    }

    /**
     * Adds a new item to the ctrPtyId list.
     * @see #getCtrPtyId()
     * 
     */
    public CashBalance9 addCtrPtyId(BranchAndFinancialInstitutionIdentification5 ctrPtyId) {
        getCtrPtyId().add(ctrPtyId);
        return this;
    }

    /**
     * Adds a new item to the valDt list.
     * @see #getValDt()
     * 
     */
    public CashBalance9 addValDt(DateAndDateTimeSearch3Choice valDt) {
        getValDt().add(valDt);
        return this;
    }

}
