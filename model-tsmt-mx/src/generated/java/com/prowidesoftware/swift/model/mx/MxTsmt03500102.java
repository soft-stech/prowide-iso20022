
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
 * Class for tsmt.035.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "tsmt03500102"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:tsmt.035.001.02")
public class MxTsmt03500102
    extends AbstractMX
{

    @XmlElement(name = "tsmt.035.001.02", required = true)
    protected Tsmt03500102 tsmt03500102;
    public final static transient String BUSINESS_PROCESS = "tsmt";
    public final static transient int FUNCTIONALITY = 35;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {BICIdentification1 .class, BaselineStatus1Code.class, DocumentIdentification5 .class, MessageIdentification1 .class, MxTsmt03500102 .class, SimpleIdentificationInformation.class, TransactionStatus1 .class, Tsmt03500102 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:tsmt.035.001.02";

    public MxTsmt03500102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsmt03500102(final String xml) {
        this();
        MxTsmt03500102 tmp = parse(xml);
        tsmt03500102 = tmp.getTsmt03500102();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsmt03500102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the tsmt03500102 property.
     * 
     * @return
     *     possible object is
     *     {@link Tsmt03500102 }
     *     
     */
    public Tsmt03500102 getTsmt03500102() {
        return tsmt03500102;
    }

    /**
     * Sets the value of the tsmt03500102 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tsmt03500102 }
     *     
     */
    public MxTsmt03500102 setTsmt03500102(Tsmt03500102 value) {
        this.tsmt03500102 = value;
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
    public static MxTsmt03500102 parse(String xml) {
        return ((MxTsmt03500102) MxReadImpl.parse(MxTsmt03500102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsmt03500102 parse(String xml, MxRead parserImpl) {
        return ((MxTsmt03500102) parserImpl.read(MxTsmt03500102 .class, xml, _classes));
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
     * Creates an MxTsmt03500102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsmt03500102 message
     * @return
     *     a new instance of MxTsmt03500102
     */
    public final static MxTsmt03500102 fromJson(String json) {
        return AbstractMX.fromJson(json, MxTsmt03500102 .class);
    }

}
