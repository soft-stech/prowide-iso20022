
package com.prowidesoftware.swift.model.mx.dic;

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
 * Reports on transactions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transactions4", propOrder = {
    "pmtCmonInf",
    "txsSummry",
    "txRpt"
})
public class Transactions4 {

    @XmlElement(name = "PmtCmonInf")
    protected PaymentCommonDetails4 pmtCmonInf;
    @XmlElement(name = "TxsSummry")
    protected NumberAndSumOfTransactions2 txsSummry;
    @XmlElement(name = "TxRpt", required = true)
    protected List<TransactionReportDetails5> txRpt;

    /**
     * Gets the value of the pmtCmonInf property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCommonDetails4 }
     *     
     */
    public PaymentCommonDetails4 getPmtCmonInf() {
        return pmtCmonInf;
    }

    /**
     * Sets the value of the pmtCmonInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCommonDetails4 }
     *     
     */
    public Transactions4 setPmtCmonInf(PaymentCommonDetails4 value) {
        this.pmtCmonInf = value;
        return this;
    }

    /**
     * Gets the value of the txsSummry property.
     * 
     * @return
     *     possible object is
     *     {@link NumberAndSumOfTransactions2 }
     *     
     */
    public NumberAndSumOfTransactions2 getTxsSummry() {
        return txsSummry;
    }

    /**
     * Sets the value of the txsSummry property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberAndSumOfTransactions2 }
     *     
     */
    public Transactions4 setTxsSummry(NumberAndSumOfTransactions2 value) {
        this.txsSummry = value;
        return this;
    }

    /**
     * Gets the value of the txRpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txRpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionReportDetails5 }
     * 
     * 
     */
    public List<TransactionReportDetails5> getTxRpt() {
        if (txRpt == null) {
            txRpt = new ArrayList<TransactionReportDetails5>();
        }
        return this.txRpt;
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
     * Adds a new item to the txRpt list.
     * @see #getTxRpt()
     * 
     */
    public Transactions4 addTxRpt(TransactionReportDetails5 txRpt) {
        getTxRpt().add(txRpt);
        return this;
    }

}
