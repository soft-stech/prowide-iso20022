
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
 * Class for auth.044.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "finInstrmRptgEqtyTradgActvtyRslt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.044.001.01")
public class MxAuth04400101
    extends AbstractMX
{

    @XmlElement(name = "FinInstrmRptgEqtyTradgActvtyRslt", required = true)
    protected FinancialInstrumentReportingEquityTradingActivityResultV01 finInstrmRptgEqtyTradgActvtyRslt;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 44;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, FinancialInstrumentReportingEquityTradingActivityResultV01 .class, MarketDetail2 .class, MxAuth04400101 .class, Period2 .class, Period4Choice.class, SecuritiesMarketReportHeader1 .class, StatisticsTransparency3 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradingVenue2Code.class, TradingVenueIdentification1Choice.class, TradingVenueIdentification2 .class, TransparencyDataReport12 .class, TransparencyMethodology2Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.044.001.01";

    public MxAuth04400101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth04400101(final String xml) {
        this();
        MxAuth04400101 tmp = parse(xml);
        finInstrmRptgEqtyTradgActvtyRslt = tmp.getFinInstrmRptgEqtyTradgActvtyRslt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth04400101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the finInstrmRptgEqtyTradgActvtyRslt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentReportingEquityTradingActivityResultV01 }
     *     
     */
    public FinancialInstrumentReportingEquityTradingActivityResultV01 getFinInstrmRptgEqtyTradgActvtyRslt() {
        return finInstrmRptgEqtyTradgActvtyRslt;
    }

    /**
     * Sets the value of the finInstrmRptgEqtyTradgActvtyRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentReportingEquityTradingActivityResultV01 }
     *     
     */
    public MxAuth04400101 setFinInstrmRptgEqtyTradgActvtyRslt(FinancialInstrumentReportingEquityTradingActivityResultV01 value) {
        this.finInstrmRptgEqtyTradgActvtyRslt = value;
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
    public static MxAuth04400101 parse(String xml) {
        return ((MxAuth04400101) MxReadImpl.parse(MxAuth04400101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth04400101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth04400101) parserImpl.read(MxAuth04400101 .class, xml, _classes));
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
     * Creates an MxAuth04400101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth04400101 message
     * @return
     *     a new instance of MxAuth04400101
     */
    public final static MxAuth04400101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxAuth04400101 .class);
    }

}
