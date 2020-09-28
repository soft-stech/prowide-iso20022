
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
 * This CollateralSubstitutionRequest message is sent by either the collateral giver or its collateral manager to the collateral taker or its collateral manager. It is used to request a substitution of collateral by specifying the collateral to be returned and proposing the new type(s) of collateral to be delivered. Note: There are cases where the collateral taker can initiate the CollateralSubstitutionRequest message, for example in case of breach in the concentration limit.
 * 
 * The message definition is intended for use with the ISO20022 Business Application Header.
 * 
 * Usage
 * The CollateralSubstitutionRequest message can be sent by either the collateral giver or collateral taker in order to substitute collateral that is already held by the other party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralSubstitutionRequestV03", propOrder = {
    "txId",
    "oblgtn",
    "agrmt",
    "collSbstitnRtr",
    "collSbstitnDlvr",
    "splmtryData"
})
public class CollateralSubstitutionRequestV03 {

    @XmlElement(name = "TxId", required = true)
    protected String txId;
    @XmlElement(name = "Oblgtn", required = true)
    protected Obligation3 oblgtn;
    @XmlElement(name = "Agrmt")
    protected Agreement2 agrmt;
    @XmlElement(name = "CollSbstitnRtr", required = true)
    protected CollateralSubstitution2 collSbstitnRtr;
    @XmlElement(name = "CollSbstitnDlvr")
    protected CollateralSubstitution3 collSbstitnDlvr;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CollateralSubstitutionRequestV03 setTxId(String value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the oblgtn property.
     * 
     * @return
     *     possible object is
     *     {@link Obligation3 }
     *     
     */
    public Obligation3 getOblgtn() {
        return oblgtn;
    }

    /**
     * Sets the value of the oblgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Obligation3 }
     *     
     */
    public CollateralSubstitutionRequestV03 setOblgtn(Obligation3 value) {
        this.oblgtn = value;
        return this;
    }

    /**
     * Gets the value of the agrmt property.
     * 
     * @return
     *     possible object is
     *     {@link Agreement2 }
     *     
     */
    public Agreement2 getAgrmt() {
        return agrmt;
    }

    /**
     * Sets the value of the agrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Agreement2 }
     *     
     */
    public CollateralSubstitutionRequestV03 setAgrmt(Agreement2 value) {
        this.agrmt = value;
        return this;
    }

    /**
     * Gets the value of the collSbstitnRtr property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralSubstitution2 }
     *     
     */
    public CollateralSubstitution2 getCollSbstitnRtr() {
        return collSbstitnRtr;
    }

    /**
     * Sets the value of the collSbstitnRtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralSubstitution2 }
     *     
     */
    public CollateralSubstitutionRequestV03 setCollSbstitnRtr(CollateralSubstitution2 value) {
        this.collSbstitnRtr = value;
        return this;
    }

    /**
     * Gets the value of the collSbstitnDlvr property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralSubstitution3 }
     *     
     */
    public CollateralSubstitution3 getCollSbstitnDlvr() {
        return collSbstitnDlvr;
    }

    /**
     * Sets the value of the collSbstitnDlvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralSubstitution3 }
     *     
     */
    public CollateralSubstitutionRequestV03 setCollSbstitnDlvr(CollateralSubstitution3 value) {
        this.collSbstitnDlvr = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public CollateralSubstitutionRequestV03 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
