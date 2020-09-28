
package com.prowidesoftware.swift.model.mx.dic;

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
 * Identifies a document by a unique identification and a date of issue.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentIdentification23", propOrder = {
    "id",
    "dtOfIsse",
    "ordrLineId"
})
public class DocumentIdentification23 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "DtOfIsse")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtOfIsse;
    @XmlElement(name = "OrdrLineId")
    protected String ordrLineId;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DocumentIdentification23 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the dtOfIsse property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtOfIsse() {
        return dtOfIsse;
    }

    /**
     * Sets the value of the dtOfIsse property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public DocumentIdentification23 setDtOfIsse(XMLGregorianCalendar value) {
        this.dtOfIsse = value;
        return this;
    }

    /**
     * Gets the value of the ordrLineId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdrLineId() {
        return ordrLineId;
    }

    /**
     * Sets the value of the ordrLineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DocumentIdentification23 setOrdrLineId(String value) {
        this.ordrLineId = value;
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
