
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
 * Class for seev.049.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "shrhldrIdDsclsrRspnStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.049.001.01")
public class MxSeev04900101
    extends AbstractMX
{

    @XmlElement(name = "ShrhldrIdDsclsrRspnStsAdvc", required = true)
    protected ShareholderIdentificationDisclosureResponseStatusAdviceV01 shrhldrIdDsclsrRspnStsAdvc;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 49;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptedStatus1 .class, DateAndDateTime2Choice.class, DateCode20Choice.class, DateFormat46Choice.class, DateType1Code.class, DisclosureRequestIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, IdentificationSource3Choice.class, MxSeev04900101 .class, NoReasonCode.class, OtherIdentification1 .class, PartyIdentification195Choice.class, PartyIdentification215 .class, RejectedReason30Choice.class, RejectedStatus29Choice.class, RejectedStatusReason29 .class, RejectionReason52Code.class, ResponseProcessingStatus1Choice.class, SecurityIdentification19 .class, ShareholderIdentificationDisclosureResponseStatusAdviceV01 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.049.001.01";

    public MxSeev04900101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev04900101(final String xml) {
        this();
        MxSeev04900101 tmp = parse(xml);
        shrhldrIdDsclsrRspnStsAdvc = tmp.getShrhldrIdDsclsrRspnStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev04900101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the shrhldrIdDsclsrRspnStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link ShareholderIdentificationDisclosureResponseStatusAdviceV01 }
     *     
     */
    public ShareholderIdentificationDisclosureResponseStatusAdviceV01 getShrhldrIdDsclsrRspnStsAdvc() {
        return shrhldrIdDsclsrRspnStsAdvc;
    }

    /**
     * Sets the value of the shrhldrIdDsclsrRspnStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareholderIdentificationDisclosureResponseStatusAdviceV01 }
     *     
     */
    public MxSeev04900101 setShrhldrIdDsclsrRspnStsAdvc(ShareholderIdentificationDisclosureResponseStatusAdviceV01 value) {
        this.shrhldrIdDsclsrRspnStsAdvc = value;
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
    public static MxSeev04900101 parse(String xml) {
        return ((MxSeev04900101) MxReadImpl.parse(MxSeev04900101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev04900101 parse(String xml, MxRead parserImpl) {
        return ((MxSeev04900101) parserImpl.read(MxSeev04900101 .class, xml, _classes));
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
     * Creates an MxSeev04900101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev04900101 message
     * @return
     *     a new instance of MxSeev04900101
     */
    public final static MxSeev04900101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSeev04900101 .class);
    }

}
