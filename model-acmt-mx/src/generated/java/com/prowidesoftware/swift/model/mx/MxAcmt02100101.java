
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
 * Class for acmt.021.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acctClsgAddtlInfReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.021.001.01")
public class MxAcmt02100101
    extends AbstractMX
{

    @XmlElement(name = "AcctClsgAddtlInfReq", required = true)
    protected AccountClosingAdditionalInformationRequestV01 acctClsgAddtlInfReq;
    public final static transient String BUSINESS_PROCESS = "acmt";
    public final static transient int FUNCTIONALITY = 21;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountClosingAdditionalInformationRequestV01 .class, AccountForAction1 .class, AccountIdentification4Choice.class, AccountSchemeName1Choice.class, AddressType2Code.class, BranchAndFinancialInstitutionIdentification4 .class, BranchData2 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, DateAndPlaceOfBirth.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification7 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, MessageIdentification1 .class, MxAcmt02100101 .class, NamePrefix1Code.class, OrganisationIdentification6 .class, OrganisationIdentificationSchemeName1Choice.class, Party8Choice.class, PartyAndSignature1 .class, PartyIdentification41 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, ProprietaryData3 .class, References3 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:acmt.021.001.01";

    public MxAcmt02100101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAcmt02100101(final String xml) {
        this();
        MxAcmt02100101 tmp = parse(xml);
        acctClsgAddtlInfReq = tmp.getAcctClsgAddtlInfReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAcmt02100101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acctClsgAddtlInfReq property.
     * 
     * @return
     *     possible object is
     *     {@link AccountClosingAdditionalInformationRequestV01 }
     *     
     */
    public AccountClosingAdditionalInformationRequestV01 getAcctClsgAddtlInfReq() {
        return acctClsgAddtlInfReq;
    }

    /**
     * Sets the value of the acctClsgAddtlInfReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountClosingAdditionalInformationRequestV01 }
     *     
     */
    public MxAcmt02100101 setAcctClsgAddtlInfReq(AccountClosingAdditionalInformationRequestV01 value) {
        this.acctClsgAddtlInfReq = value;
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
    public static MxAcmt02100101 parse(String xml) {
        return ((MxAcmt02100101) MxReadImpl.parse(MxAcmt02100101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAcmt02100101 parse(String xml, MxRead parserImpl) {
        return ((MxAcmt02100101) parserImpl.read(MxAcmt02100101 .class, xml, _classes));
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
     * Creates an MxAcmt02100101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAcmt02100101 message
     * @return
     *     a new instance of MxAcmt02100101
     */
    public final static MxAcmt02100101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxAcmt02100101 .class);
    }

}
