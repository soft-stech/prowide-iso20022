
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Describes the type of product and the assets to be transferred.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ISATransfer2", propOrder = {
    "mstrRef",
    "trfConfId",
    "trfInstrRef",
    "actlTrfDt",
    "rsdlCsh",
    "prtfl",
    "allOthrCsh",
    "finInstrmAsstForTrf"
})
public class ISATransfer2 {

    @XmlElement(name = "MstrRef")
    protected String mstrRef;
    @XmlElement(name = "TrfConfId", required = true)
    protected String trfConfId;
    @XmlElement(name = "TrfInstrRef", required = true)
    protected String trfInstrRef;
    @XmlElement(name = "ActlTrfDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar actlTrfDt;
    @XmlElement(name = "RsdlCsh")
    @XmlSchemaType(name = "string")
    protected ResidualCash1Code rsdlCsh;
    @XmlElement(name = "Prtfl", required = true)
    protected ISAPortfolio2Choice prtfl;
    @XmlElement(name = "AllOthrCsh")
    protected boolean allOthrCsh;
    @XmlElement(name = "FinInstrmAsstForTrf")
    protected List<FinancialInstrument24> finInstrmAsstForTrf;

    /**
     * Gets the value of the mstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMstrRef() {
        return mstrRef;
    }

    /**
     * Sets the value of the mstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ISATransfer2 setMstrRef(String value) {
        this.mstrRef = value;
        return this;
    }

    /**
     * Gets the value of the trfConfId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrfConfId() {
        return trfConfId;
    }

    /**
     * Sets the value of the trfConfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ISATransfer2 setTrfConfId(String value) {
        this.trfConfId = value;
        return this;
    }

    /**
     * Gets the value of the trfInstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrfInstrRef() {
        return trfInstrRef;
    }

    /**
     * Sets the value of the trfInstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ISATransfer2 setTrfInstrRef(String value) {
        this.trfInstrRef = value;
        return this;
    }

    /**
     * Gets the value of the actlTrfDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActlTrfDt() {
        return actlTrfDt;
    }

    /**
     * Sets the value of the actlTrfDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public ISATransfer2 setActlTrfDt(XMLGregorianCalendar value) {
        this.actlTrfDt = value;
        return this;
    }

    /**
     * Gets the value of the rsdlCsh property.
     * 
     * @return
     *     possible object is
     *     {@link ResidualCash1Code }
     *     
     */
    public ResidualCash1Code getRsdlCsh() {
        return rsdlCsh;
    }

    /**
     * Sets the value of the rsdlCsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidualCash1Code }
     *     
     */
    public ISATransfer2 setRsdlCsh(ResidualCash1Code value) {
        this.rsdlCsh = value;
        return this;
    }

    /**
     * Gets the value of the prtfl property.
     * 
     * @return
     *     possible object is
     *     {@link ISAPortfolio2Choice }
     *     
     */
    public ISAPortfolio2Choice getPrtfl() {
        return prtfl;
    }

    /**
     * Sets the value of the prtfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ISAPortfolio2Choice }
     *     
     */
    public ISATransfer2 setPrtfl(ISAPortfolio2Choice value) {
        this.prtfl = value;
        return this;
    }

    /**
     * Gets the value of the allOthrCsh property.
     * 
     */
    public boolean isAllOthrCsh() {
        return allOthrCsh;
    }

    /**
     * Sets the value of the allOthrCsh property.
     * 
     */
    public ISATransfer2 setAllOthrCsh(boolean value) {
        this.allOthrCsh = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmAsstForTrf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the finInstrmAsstForTrf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinInstrmAsstForTrf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstrument24 }
     * 
     * 
     */
    public List<FinancialInstrument24> getFinInstrmAsstForTrf() {
        if (finInstrmAsstForTrf == null) {
            finInstrmAsstForTrf = new ArrayList<FinancialInstrument24>();
        }
        return this.finInstrmAsstForTrf;
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
     * Adds a new item to the finInstrmAsstForTrf list.
     * @see #getFinInstrmAsstForTrf()
     * 
     */
    public ISATransfer2 addFinInstrmAsstForTrf(FinancialInstrument24 finInstrmAsstForTrf) {
        getFinInstrmAsstForTrf().add(finInstrmAsstForTrf);
        return this;
    }

}
