
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
 * The LiquidityCreditTransfer message is sent by a member to the transaction administrator.
 * It is used to request a transfer of funds between two accounts belonging to the same member or the same group of accounts, and being held at the transaction administrator.
 * Usage
 * At any time during the operating hours of the system, and to perform the appropriate liquidity management, the member can request the transaction administrator to execute the transfer of funds between two accounts that the transaction administrator maintains for the member. For instance, this may be an action resulting from a Get/Return Account pair of messages.
 * The LiquidityCreditTransfer message can be used when the transactions to/from the member are unbalanced in value for the business day, or to unlock pending transactions at the end of day.
 * The member can request the transfer by identifying the accounts stored at the transaction administrator:
 * - If the accounts involved in the requested transfer are known without doubt to the transaction administrator, it is possible to indicate only the type of the account to be credited.
 * - If, on the contrary, more clarity is desired, it is possible to identify the accounts from and to which the funds should be transferred.
 * Note that transfers are processed only when the balance in the account to be debited is sufficient to pass the liquidity transfer instruction and remain positive. Based on the criteria received within the LiquidityCreditTransfer message, the transaction administrator will execute or reject the requested transfer.
 * In principle, the transaction administrator may send a Receipt message as a reply to the liquidity transfer request. To verify the outcome of the request, the member may submit a GetTransaction or GetAccount message with the appropriate search criteria.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LiquidityCreditTransferV03", propOrder = {
    "msgHdr",
    "lqdtyCdtTrf"
})
public class LiquidityCreditTransferV03 {

    @XmlElement(name = "MsgHdr", required = true)
    protected MessageHeader1 msgHdr;
    @XmlElement(name = "LqdtyCdtTrf", required = true)
    protected LiquidityCreditTransfer1 lqdtyCdtTrf;

    /**
     * Gets the value of the msgHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader1 }
     *     
     */
    public MessageHeader1 getMsgHdr() {
        return msgHdr;
    }

    /**
     * Sets the value of the msgHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader1 }
     *     
     */
    public LiquidityCreditTransferV03 setMsgHdr(MessageHeader1 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the lqdtyCdtTrf property.
     * 
     * @return
     *     possible object is
     *     {@link LiquidityCreditTransfer1 }
     *     
     */
    public LiquidityCreditTransfer1 getLqdtyCdtTrf() {
        return lqdtyCdtTrf;
    }

    /**
     * Sets the value of the lqdtyCdtTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiquidityCreditTransfer1 }
     *     
     */
    public LiquidityCreditTransferV03 setLqdtyCdtTrf(LiquidityCreditTransfer1 value) {
        this.lqdtyCdtTrf = value;
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
