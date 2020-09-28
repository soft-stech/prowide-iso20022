
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionEventProcessingStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CorporateActionEventProcessingStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COMP"/&gt;
 *     &lt;enumeration value="PEND"/&gt;
 *     &lt;enumeration value="RECD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CorporateActionEventProcessingStatus1Code")
@XmlEnum
public enum CorporateActionEventProcessingStatus1Code {


    /**
     * Specifies that a corporate action event processing has been completed.
     * 
     */
    COMP,

    /**
     * Specifies that a corporate action event processing has not been completed.
     * 
     */
    PEND,

    /**
     * Corporate action event processing specifying that the funds paid have been reconciled with the funds received from the agent (meaning that there is no more risk of payment to be reversed).
     * 
     */
    RECD;

    public String value() {
        return name();
    }

    public static CorporateActionEventProcessingStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
