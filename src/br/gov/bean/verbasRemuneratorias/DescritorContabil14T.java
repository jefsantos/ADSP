//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.13 at 05:30:46 PM BRT 
//


package br.gov.bean.verbasRemuneratorias;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DescritorContabil_14_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescritorContabil_14_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tce.sp.gov.br/audesp/xml/generico}Descritor_t">
 *       &lt;sequence>
 *         &lt;element name="MesExercicio" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescritorContabil_14_t", propOrder = {
    "mesExercicio"
})
public class DescritorContabil14T
    extends DescritorT
{

    @XmlElement(name = "MesExercicio", required = true)
    protected BigInteger mesExercicio;

    /**
     * Gets the value of the mesExercicio property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMesExercicio() {
        return mesExercicio;
    }

    /**
     * Sets the value of the mesExercicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMesExercicio(BigInteger value) {
        this.mesExercicio = value;
    }

}
