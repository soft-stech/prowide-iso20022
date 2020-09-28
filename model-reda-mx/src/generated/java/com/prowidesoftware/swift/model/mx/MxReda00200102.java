
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
 * Class for reda.002.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "reda00200102"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:reda.002.001.02")
public class MxReda00200102
    extends AbstractMX
{

    @XmlElement(name = "reda.002.001.02", required = true)
    protected Reda00200102 reda00200102;
    public final static transient String BUSINESS_PROCESS = "reda";
    public final static transient int FUNCTIONALITY = 2;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference3 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, AmountPrice1Choice.class, CalculationBasis1 .class, CalculationBasis1Code.class, Charge9 .class, ChargeType2 .class, ChargeType7Code.class, CurrencyAndAmount.class, DateAndDateTimeChoice.class, DateTimePeriodDetails.class, DistributionPolicy1Code.class, EUCapitalGain1 .class, EUCapitalGain1Code.class, Extension1 .class, FinancialInstrument5 .class, FinancialInstrumentQuantity1 .class, FormOfSecurity1Code.class, GenericIdentification1 .class, MxReda00200102 .class, NameAndAddress5 .class, PartyIdentification2Choice.class, PostalAddress1 .class, PriceMethod1Code.class, PriceReport1 .class, PriceType2 .class, PriceValuation2 .class, PriceValue1 .class, PriceValue2 .class, Reda00200102 .class, SecurityIdentification1Choice.class, StatisticsByPredefinedTimePeriods1 .class, StatisticsByUserDefinedTimePeriod1 .class, Tax8 .class, TaxCalculationInformation2 .class, TaxType3 .class, TaxType6Code.class, TaxableIncomePerShareCalculated1 .class, TaxableIncomePerShareCalculated1Code.class, TypeOfPrice6Code.class, TypeOfPrice8Code.class, UnitPrice4 .class, UnitPrice6 .class, ValuationStatistics2 .class, ValuationTiming1Code.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:reda.002.001.02";

    public MxReda00200102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda00200102(final String xml) {
        this();
        MxReda00200102 tmp = parse(xml);
        reda00200102 = tmp.getReda00200102();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda00200102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the reda00200102 property.
     * 
     * @return
     *     possible object is
     *     {@link Reda00200102 }
     *     
     */
    public Reda00200102 getReda00200102() {
        return reda00200102;
    }

    /**
     * Sets the value of the reda00200102 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reda00200102 }
     *     
     */
    public MxReda00200102 setReda00200102(Reda00200102 value) {
        this.reda00200102 = value;
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
    public static MxReda00200102 parse(String xml) {
        return ((MxReda00200102) MxReadImpl.parse(MxReda00200102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda00200102 parse(String xml, MxRead parserImpl) {
        return ((MxReda00200102) parserImpl.read(MxReda00200102 .class, xml, _classes));
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
     * Creates an MxReda00200102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda00200102 message
     * @return
     *     a new instance of MxReda00200102
     */
    public final static MxReda00200102 fromJson(String json) {
        return AbstractMX.fromJson(json, MxReda00200102 .class);
    }

}
