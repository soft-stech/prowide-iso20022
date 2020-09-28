
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType34Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssetClassSubProductType34Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MFTG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType34Code")
@XmlEnum
public enum AssetClassSubProductType34Code {


    /**
     * Commodity of type manufacturing.
     * 
     */
    MFTG;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType34Code fromValue(String v) {
        return valueOf(v);
    }

}
