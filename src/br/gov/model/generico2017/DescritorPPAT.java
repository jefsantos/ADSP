//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.13 at 05:43:01 PM BRT 
//


package br.gov.model.generico2017;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DescritorPPA_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescritorPPA_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tce.sp.gov.br/audesp/xml/generico}Descritor_t">
 *       &lt;sequence>
 *         &lt;element name="AnoInicioPPA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="2014"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescritorPPA_t", propOrder = {
    "anoInicioPPA"
})
@XmlSeeAlso({
    DescritorPPAAtualizacaoT.class
})
public class DescritorPPAT
    extends DescritorT
{

    @XmlElement(name = "AnoInicioPPA", required = true)
    protected String anoInicioPPA;

    /**
     * Gets the value of the anoInicioPPA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnoInicioPPA() {
        return anoInicioPPA;
    }

    /**
     * Sets the value of the anoInicioPPA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnoInicioPPA(String value) {
        this.anoInicioPPA = value;
    }

}
