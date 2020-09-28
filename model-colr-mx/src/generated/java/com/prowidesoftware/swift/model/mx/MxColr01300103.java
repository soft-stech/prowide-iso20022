
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
 * Class for colr.013.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "intrstPmtReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:colr.013.001.03")
public class MxColr01300103
    extends AbstractMX
{

    @XmlElement(name = "IntrstPmtReq", required = true)
    protected InterestPaymentRequestV03 intrstPmtReq;
    public final static transient String BUSINESS_PROCESS = "colr";
    public final static transient int FUNCTIONALITY = 13;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, Agreement2 .class, AgreementFramework1Choice.class, AgreementFramework1Code.class, CalculationMethod1Code.class, CollateralAccount1 .class, CollateralAccountIdentificationType1Choice.class, CollateralAccountType1Code.class, CollateralBalance1 .class, CollateralPurpose1Choice.class, CollateralPurpose1Code.class, DateAndDateTimeChoice.class, DatePeriodDetails.class, ExposureType5Code.class, Frequency1Code.class, GenericIdentification29 .class, GenericIdentification30 .class, InterestAmount1 .class, InterestComputationMethod2Code.class, InterestMethod1Code.class, InterestPaymentRequestV03 .class, InterestRate1Choice.class, InterestRequestSequence1Code.class, InterestResult1 .class, MxColr01300103 .class, NameAndAddress6 .class, Obligation3 .class, PartyIdentification33Choice.class, PostalAddress2 .class, Reference20 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, VariableInterest1Rate.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:colr.013.001.03";

    public MxColr01300103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxColr01300103(final String xml) {
        this();
        MxColr01300103 tmp = parse(xml);
        intrstPmtReq = tmp.getIntrstPmtReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxColr01300103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the intrstPmtReq property.
     * 
     * @return
     *     possible object is
     *     {@link InterestPaymentRequestV03 }
     *     
     */
    public InterestPaymentRequestV03 getIntrstPmtReq() {
        return intrstPmtReq;
    }

    /**
     * Sets the value of the intrstPmtReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestPaymentRequestV03 }
     *     
     */
    public MxColr01300103 setIntrstPmtReq(InterestPaymentRequestV03 value) {
        this.intrstPmtReq = value;
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
    public static MxColr01300103 parse(String xml) {
        return ((MxColr01300103) MxReadImpl.parse(MxColr01300103 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxColr01300103 parse(String xml, MxRead parserImpl) {
        return ((MxColr01300103) parserImpl.read(MxColr01300103 .class, xml, _classes));
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
     * Creates an MxColr01300103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxColr01300103 message
     * @return
     *     a new instance of MxColr01300103
     */
    public final static MxColr01300103 fromJson(String json) {
        return AbstractMX.fromJson(json, MxColr01300103 .class);
    }

}
