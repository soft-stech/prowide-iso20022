
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
 * Class for camt.023.001.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "bckpPmt"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.023.001.06")
public class MxCamt02300106
    extends AbstractMX
{

    @XmlElement(name = "BckpPmt", required = true)
    protected BackupPaymentV06 bckpPmt;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 23;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, Amount2Choice.class, BackupPaymentV06 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, FinancialIdentificationSchemeName1Choice.class, GenericFinancialIdentification1 .class, MarketInfrastructureIdentification1Choice.class, MemberIdentification2Choice.class, MessageHeader1 .class, MxCamt02300106 .class, PaymentInstruction13 .class, PaymentType3Code.class, PaymentType4Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemIdentification2Choice.class, SystemMember2 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.023.001.06";

    public MxCamt02300106() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt02300106(final String xml) {
        this();
        MxCamt02300106 tmp = parse(xml);
        bckpPmt = tmp.getBckpPmt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt02300106(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the bckpPmt property.
     * 
     * @return
     *     possible object is
     *     {@link BackupPaymentV06 }
     *     
     */
    public BackupPaymentV06 getBckpPmt() {
        return bckpPmt;
    }

    /**
     * Sets the value of the bckpPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BackupPaymentV06 }
     *     
     */
    public MxCamt02300106 setBckpPmt(BackupPaymentV06 value) {
        this.bckpPmt = value;
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
    public static MxCamt02300106 parse(String xml) {
        return ((MxCamt02300106) MxReadImpl.parse(MxCamt02300106 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt02300106 parse(String xml, MxRead parserImpl) {
        return ((MxCamt02300106) parserImpl.read(MxCamt02300106 .class, xml, _classes));
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
     * Creates an MxCamt02300106 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt02300106 message
     * @return
     *     a new instance of MxCamt02300106
     */
    public final static MxCamt02300106 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCamt02300106 .class);
    }

}
