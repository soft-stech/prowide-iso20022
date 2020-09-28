
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserInterface2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserInterface2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MDSP"/&gt;
 *     &lt;enumeration value="CDSP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UserInterface2Code")
@XmlEnum
public enum UserInterface2Code {


    /**
     * Merchant display or interface.
     * 
     */
    MDSP,

    /**
     * Cardholder display or interface.
     * 
     */
    CDSP;

    public String value() {
        return name();
    }

    public static UserInterface2Code fromValue(String v) {
        return valueOf(v);
    }

}
