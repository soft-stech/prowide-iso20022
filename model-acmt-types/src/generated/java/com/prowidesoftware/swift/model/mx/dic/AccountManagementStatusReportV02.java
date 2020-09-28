
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
 * Scope
 * An account servicer, eg, a registrar, transfer agent or custodian bank sends the AccountManagementStatusReport message to an account owner or its designated agent, eg, an investor to report on the receipt or the processing status of a previously received AccountOpeningInstruction or AccountModificationInstruction or GetAccountDetails message.
 * Usage
 * The AccountManagementStatusReport message is used to provide the processing status of a previously received AccountOpeningInstruction or of an AccountModificationInstruction message.
 * The AccountManagementStatusReport message is also used by an account servicer to reject an AccountOpeningInstruction or AccountModificationInstruction or GetAccountDetails message when the message is not compliant with the agreed SLA or when the account cannot be uniquely identified.
 * The account owner may report that the status of the instruction is either rejected, accepted, that the instruction is being processed or that the instruction has been forwarded to the next intermediary party for further processing.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountManagementStatusReportV02", propOrder = {
    "msgId",
    "rltdRef",
    "stsRpt"
})
public class AccountManagementStatusReportV02 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "RltdRef", required = true)
    protected List<AdditionalReference3> rltdRef;
    @XmlElement(name = "StsRpt", required = true)
    protected AccountManagementStatusAndReason1 stsRpt;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public AccountManagementStatusReportV02 setMsgId(MessageIdentification1 value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rltdRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalReference3 }
     * 
     * 
     */
    public List<AdditionalReference3> getRltdRef() {
        if (rltdRef == null) {
            rltdRef = new ArrayList<AdditionalReference3>();
        }
        return this.rltdRef;
    }

    /**
     * Gets the value of the stsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link AccountManagementStatusAndReason1 }
     *     
     */
    public AccountManagementStatusAndReason1 getStsRpt() {
        return stsRpt;
    }

    /**
     * Sets the value of the stsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountManagementStatusAndReason1 }
     *     
     */
    public AccountManagementStatusReportV02 setStsRpt(AccountManagementStatusAndReason1 value) {
        this.stsRpt = value;
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
     * Adds a new item to the rltdRef list.
     * @see #getRltdRef()
     * 
     */
    public AccountManagementStatusReportV02 addRltdRef(AdditionalReference3 rltdRef) {
        getRltdRef().add(rltdRef);
        return this;
    }

}
