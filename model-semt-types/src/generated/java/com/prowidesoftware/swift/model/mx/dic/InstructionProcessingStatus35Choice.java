
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
 * Choice of formats for an instruction processing status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstructionProcessingStatus35Choice", propOrder = {
    "pdgPrcg",
    "cxlReqd",
    "ackdAccptd",
    "canc",
    "gnrtd",
    "rpr",
    "pdgCxl",
    "modReqd"
})
public class InstructionProcessingStatus35Choice {

    @XmlElement(name = "PdgPrcg")
    protected PendingProcessingStatus15Choice pdgPrcg;
    @XmlElement(name = "CxlReqd")
    protected ProprietaryReason5 cxlReqd;
    @XmlElement(name = "AckdAccptd")
    protected AcknowledgedAcceptedStatus25Choice ackdAccptd;
    @XmlElement(name = "Canc")
    protected CancellationStatus25Choice canc;
    @XmlElement(name = "Gnrtd")
    protected GeneratedStatus8Choice gnrtd;
    @XmlElement(name = "Rpr")
    protected RepairStatus16Choice rpr;
    @XmlElement(name = "PdgCxl")
    protected PendingStatus46Choice pdgCxl;
    @XmlElement(name = "ModReqd")
    protected ProprietaryReason5 modReqd;

    /**
     * Gets the value of the pdgPrcg property.
     * 
     * @return
     *     possible object is
     *     {@link PendingProcessingStatus15Choice }
     *     
     */
    public PendingProcessingStatus15Choice getPdgPrcg() {
        return pdgPrcg;
    }

    /**
     * Sets the value of the pdgPrcg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingProcessingStatus15Choice }
     *     
     */
    public InstructionProcessingStatus35Choice setPdgPrcg(PendingProcessingStatus15Choice value) {
        this.pdgPrcg = value;
        return this;
    }

    /**
     * Gets the value of the cxlReqd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason5 }
     *     
     */
    public ProprietaryReason5 getCxlReqd() {
        return cxlReqd;
    }

    /**
     * Sets the value of the cxlReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason5 }
     *     
     */
    public InstructionProcessingStatus35Choice setCxlReqd(ProprietaryReason5 value) {
        this.cxlReqd = value;
        return this;
    }

    /**
     * Gets the value of the ackdAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgedAcceptedStatus25Choice }
     *     
     */
    public AcknowledgedAcceptedStatus25Choice getAckdAccptd() {
        return ackdAccptd;
    }

    /**
     * Sets the value of the ackdAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgedAcceptedStatus25Choice }
     *     
     */
    public InstructionProcessingStatus35Choice setAckdAccptd(AcknowledgedAcceptedStatus25Choice value) {
        this.ackdAccptd = value;
        return this;
    }

    /**
     * Gets the value of the canc property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationStatus25Choice }
     *     
     */
    public CancellationStatus25Choice getCanc() {
        return canc;
    }

    /**
     * Sets the value of the canc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationStatus25Choice }
     *     
     */
    public InstructionProcessingStatus35Choice setCanc(CancellationStatus25Choice value) {
        this.canc = value;
        return this;
    }

    /**
     * Gets the value of the gnrtd property.
     * 
     * @return
     *     possible object is
     *     {@link GeneratedStatus8Choice }
     *     
     */
    public GeneratedStatus8Choice getGnrtd() {
        return gnrtd;
    }

    /**
     * Sets the value of the gnrtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneratedStatus8Choice }
     *     
     */
    public InstructionProcessingStatus35Choice setGnrtd(GeneratedStatus8Choice value) {
        this.gnrtd = value;
        return this;
    }

    /**
     * Gets the value of the rpr property.
     * 
     * @return
     *     possible object is
     *     {@link RepairStatus16Choice }
     *     
     */
    public RepairStatus16Choice getRpr() {
        return rpr;
    }

    /**
     * Sets the value of the rpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairStatus16Choice }
     *     
     */
    public InstructionProcessingStatus35Choice setRpr(RepairStatus16Choice value) {
        this.rpr = value;
        return this;
    }

    /**
     * Gets the value of the pdgCxl property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus46Choice }
     *     
     */
    public PendingStatus46Choice getPdgCxl() {
        return pdgCxl;
    }

    /**
     * Sets the value of the pdgCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus46Choice }
     *     
     */
    public InstructionProcessingStatus35Choice setPdgCxl(PendingStatus46Choice value) {
        this.pdgCxl = value;
        return this;
    }

    /**
     * Gets the value of the modReqd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason5 }
     *     
     */
    public ProprietaryReason5 getModReqd() {
        return modReqd;
    }

    /**
     * Sets the value of the modReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason5 }
     *     
     */
    public InstructionProcessingStatus35Choice setModReqd(ProprietaryReason5 value) {
        this.modReqd = value;
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
