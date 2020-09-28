
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for tsmt.011.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "tsmt01100102"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:tsmt.011.001.02")
public class MxTsmt01100102
    extends AbstractMX
{

    @XmlElement(name = "tsmt.011.001.02", required = true)
    protected Tsmt01100102 tsmt01100102;
    public final static transient String BUSINESS_PROCESS = "tsmt";
    public final static transient int FUNCTIONALITY = 11;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Action1Code.class, BICIdentification1 .class, BaselineStatus1Code.class, CurrencyAndAmount.class, DocumentIdentification5 .class, DocumentIdentification6 .class, GenericIdentification4 .class, LineItem6 .class, LineItemDetails5 .class, MessageIdentification1 .class, MxTsmt01100102 .class, PartyIdentification9 .class, PendingActivity1 .class, PercentageTolerance1 .class, PostalAddress2 .class, ProductCategory1 .class, ProductCategory1Choice.class, ProductCategory1Code.class, ProductCharacteristics1 .class, ProductCharacteristics1Choice.class, ProductCharacteristics1Code.class, ProductIdentifier2 .class, ProductIdentifier2Choice.class, ProductIdentifier2Code.class, Quantity2 .class, ReportType2 .class, ReportType2Code.class, SimpleIdentificationInformation.class, TransactionStatus1 .class, Tsmt01100102 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:tsmt.011.001.02";

    public MxTsmt01100102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsmt01100102(final String xml) {
        this();
        MxTsmt01100102 tmp = parse(xml);
        tsmt01100102 = tmp.getTsmt01100102();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsmt01100102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the tsmt01100102 property.
     * 
     * @return
     *     possible object is
     *     {@link Tsmt01100102 }
     *     
     */
    public Tsmt01100102 getTsmt01100102() {
        return tsmt01100102;
    }

    /**
     * Sets the value of the tsmt01100102 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tsmt01100102 }
     *     
     */
    public MxTsmt01100102 setTsmt01100102(Tsmt01100102 value) {
        this.tsmt01100102 = value;
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

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxTsmt01100102 parse(String xml) {
        return ((MxTsmt01100102) MxReadImpl.parse(MxTsmt01100102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsmt01100102 parse(String xml, MxRead parserImpl) {
        return ((MxTsmt01100102) parserImpl.read(MxTsmt01100102 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxTsmt01100102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsmt01100102 message
     * @return
     *     a new instance of MxTsmt01100102
     */
    public final static MxTsmt01100102 fromJson(String json) {
        return AbstractMX.fromJson(json, MxTsmt01100102 .class);
    }

}
