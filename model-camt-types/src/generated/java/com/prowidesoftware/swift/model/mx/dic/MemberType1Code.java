
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MemberType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MemberType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DRCT"/&gt;
 *     &lt;enumeration value="IDRT"/&gt;
 *     &lt;enumeration value="RMTE"/&gt;
 *     &lt;enumeration value="EURO"/&gt;
 *     &lt;enumeration value="STEP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MemberType1Code")
@XmlEnum
public enum MemberType1Code {


    /**
     * Member has full rights in the system. In principle, this membership status entails financial responsibility for its own operations and sponsored members' operations submitted to the system.
     * 
     */
    DRCT,

    /**
     * Member has limited rights in the system specifications. In principle, this membership status entails no financial responsibility for its operations submitted to the system.
     * 
     */
    IDRT,

    /**
     * Member has access to the system from a remote location or through remote technical means.
     * 
     */
    RMTE,

    /**
     * Member is entitled to access the Euro1 system of the Euro Banking Association (EBA).
     * 
     */
    EURO,

    /**
     * Member is entitled to access the Step1 system of the Euro Banking Association (EBA).
     * 
     */
    STEP;

    public String value() {
        return name();
    }

    public static MemberType1Code fromValue(String v) {
        return valueOf(v);
    }

}
