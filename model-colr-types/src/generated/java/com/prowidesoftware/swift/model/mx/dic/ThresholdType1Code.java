
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThresholdType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ThresholdType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SECU"/&gt;
 *     &lt;enumeration value="UNSE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ThresholdType1Code")
@XmlEnum
public enum ThresholdType1Code {


    /**
     * Means that once the threshold is breached, collateral must be posted to cover the full exposure.
     * 
     */
    SECU,

    /**
     * Means that the threshold provides a predetermined level of free trading. Once the threshold is breached, collateral must be posted to cover the exposure over and above the threshold level.
     * 
     */
    UNSE;

    public String value() {
        return name();
    }

    public static ThresholdType1Code fromValue(String v) {
        return valueOf(v);
    }

}
