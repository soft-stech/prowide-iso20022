
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
 * Class for semt.014.002.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "intraPosMvmntStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:semt.014.002.03")
public class MxSemt01400203
    extends AbstractMX
{

    @XmlElement(name = "IntraPosMvmntStsAdvc", required = true)
    protected IntraPositionMovementStatusAdvice002V03 intraPosMvmntStsAdvc;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 14;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus20Choice.class, AcknowledgementReason5Code.class, AcknowledgementReason6 .class, AcknowledgementReason8Choice.class, CancellationReason13Choice.class, CancellationReason6 .class, CancellationStatus11Choice.class, CancelledStatusReason13Code.class, DateAndDateTimeChoice.class, FailingReason3Code.class, FailingReason6 .class, FailingReason6Choice.class, FailingStatus5Choice.class, FinancialInstrumentQuantity1Choice.class, GenericIdentification24 .class, GenericIdentification25 .class, GenericIdentification39 .class, IdentificationSource4Choice.class, IntraPositionDetails23 .class, IntraPositionMovementStatusAdvice002V03 .class, IntraPositionProcessingStatus4Choice.class, MxSemt01400203 .class, NoReasonCode.class, OtherIdentification2 .class, PartyIdentification51Choice.class, PendingReason10Code.class, PendingReason13 .class, PendingReason21Choice.class, PendingStatus23Choice.class, ProprietaryReason2 .class, ProprietaryStatusAndReason2 .class, RejectionAndRepairReason17Choice.class, RejectionOrRepairReason17 .class, RejectionOrRepairStatus21Choice.class, RejectionReason29Code.class, SecuritiesAccount17 .class, SecuritiesBalanceType13Code.class, SecuritiesBalanceType4Choice.class, SecurityIdentification15 .class, SettlementStatus15Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TransactionIdentifications19 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:semt.014.002.03";

    public MxSemt01400203() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt01400203(final String xml) {
        this();
        MxSemt01400203 tmp = parse(xml);
        intraPosMvmntStsAdvc = tmp.getIntraPosMvmntStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt01400203(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the intraPosMvmntStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link IntraPositionMovementStatusAdvice002V03 }
     *     
     */
    public IntraPositionMovementStatusAdvice002V03 getIntraPosMvmntStsAdvc() {
        return intraPosMvmntStsAdvc;
    }

    /**
     * Sets the value of the intraPosMvmntStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraPositionMovementStatusAdvice002V03 }
     *     
     */
    public MxSemt01400203 setIntraPosMvmntStsAdvc(IntraPositionMovementStatusAdvice002V03 value) {
        this.intraPosMvmntStsAdvc = value;
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
    public static MxSemt01400203 parse(String xml) {
        return ((MxSemt01400203) MxReadImpl.parse(MxSemt01400203 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt01400203 parse(String xml, MxRead parserImpl) {
        return ((MxSemt01400203) parserImpl.read(MxSemt01400203 .class, xml, _classes));
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
     * Creates an MxSemt01400203 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt01400203 message
     * @return
     *     a new instance of MxSemt01400203
     */
    public final static MxSemt01400203 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSemt01400203 .class);
    }

}
