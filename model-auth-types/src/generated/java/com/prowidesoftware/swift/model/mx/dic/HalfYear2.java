
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information related with a half year period.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HalfYear2", propOrder = {
    "mnth"
})
public class HalfYear2 {

    @XmlElement(name = "Mnth", required = true)
    protected List<MonthType2> mnth;

    /**
     * Gets the value of the mnth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mnth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMnth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonthType2 }
     * 
     * 
     */
    public List<MonthType2> getMnth() {
        if (mnth == null) {
            mnth = new ArrayList<MonthType2>();
        }
        return this.mnth;
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

    /**
     * Adds a new item to the mnth list.
     * @see #getMnth()
     * 
     */
    public HalfYear2 addMnth(MonthType2 mnth) {
        getMnth().add(mnth);
        return this;
    }

}
