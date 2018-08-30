
package com.trex.cashcol;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DebtorItem" type="{http://trex.com/cashcol}DebtorItem" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "debtorItem"
})
@XmlRootElement(name = "getDebtorItemResponse", namespace = "http://trex.com/cashcol")
public class GetDebtorItemResponse {

    @XmlElement(name = "DebtorItem", namespace = "http://trex.com/cashcol", required = true)
    protected List<DebtorItem> debtorItem;

    /**
     * Gets the value of the debtorItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the debtorItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDebtorItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DebtorItem }
     * 
     * 
     */
    public List<DebtorItem> getDebtorItem() {
        if (debtorItem == null) {
            debtorItem = new ArrayList<DebtorItem>();
        }
        return this.debtorItem;
    }

    public void setDebtorItem(List<DebtorItem> debtorItem) {
        this.debtorItem = debtorItem;
    }
}
