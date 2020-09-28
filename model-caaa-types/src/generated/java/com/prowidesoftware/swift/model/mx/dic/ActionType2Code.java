
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BUSY"/&gt;
 *     &lt;enumeration value="CPTR"/&gt;
 *     &lt;enumeration value="DISP"/&gt;
 *     &lt;enumeration value="NOVR"/&gt;
 *     &lt;enumeration value="RQID"/&gt;
 *     &lt;enumeration value="PINL"/&gt;
 *     &lt;enumeration value="PINR"/&gt;
 *     &lt;enumeration value="PRNT"/&gt;
 *     &lt;enumeration value="RFRL"/&gt;
 *     &lt;enumeration value="RQDT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActionType2Code")
@XmlEnum
public enum ActionType2Code {


    /**
     * Server busy, try later.
     * 
     */
    BUSY,

    /**
     * Capture the card.
     * 
     */
    CPTR,

    /**
     * Display a message.
     * 
     */
    DISP,

    /**
     * Payment application cannot propose to the merchant an override of the payment transaction.
     * 
     */
    NOVR,

    /**
     * Additional identification required (passport, ID card, etc.).
     * 
     */
    RQID,

    /**
     * Last PIN (Personal Identification Number) try.
     * 
     */
    PINL,

    /**
     * PIN (Personal Identification Number) is wrong, retry a PIN verification.
     * 
     */
    PINR,

    /**
     * Print a message.
     * 
     */
    PRNT,

    /**
     * Referral has to be performed.
     * 
     */
    RFRL,

    /**
     * Request additional data through a displayed text and request confirmation by an attendant.
     * 
     */
    RQDT;

    public String value() {
        return name();
    }

    public static ActionType2Code fromValue(String v) {
        return valueOf(v);
    }

}
