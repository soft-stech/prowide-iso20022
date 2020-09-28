
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NewSecuritiesIssuanceType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NewSecuritiesIssuanceType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DEFE"/&gt;
 *     &lt;enumeration value="NDEF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NewSecuritiesIssuanceType3Code")
@XmlEnum
public enum NewSecuritiesIssuanceType3Code {


    /**
     * Funds have been placed in escrow by a trustee or agent to ensure payment on a portion of the outstanding balance of the original security on maturity date.
     * 
     */
    DEFE,

    /**
     * Funds will not be guaranteed at maturity by the issuer or paying agent for this newly issued non-defeased security.
     * 
     */
    NDEF;

    public String value() {
        return name();
    }

    public static NewSecuritiesIssuanceType3Code fromValue(String v) {
        return valueOf(v);
    }

}
