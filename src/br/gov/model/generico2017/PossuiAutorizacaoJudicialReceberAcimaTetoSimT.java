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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PossuiAutorizacaoJudicialReceberAcimaTetoSim_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PossuiAutorizacaoJudicialReceberAcimaTetoSim_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PossuiAutorizacaoJudicialReceberAcimaTeto">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;enumeration value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NumeroProcessoJudicial" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PossuiAutorizacaoJudicialReceberAcimaTetoSim_t", namespace = "http://www.tce.sp.gov.br/audesp/xml/atospessoal", propOrder = {
    "possuiAutorizacaoJudicialReceberAcimaTeto",
    "numeroProcessoJudicial"
})
public class PossuiAutorizacaoJudicialReceberAcimaTetoSimT {

    @XmlElement(name = "PossuiAutorizacaoJudicialReceberAcimaTeto")
    protected short possuiAutorizacaoJudicialReceberAcimaTeto;
    @XmlElement(name = "NumeroProcessoJudicial", required = true)
    protected Object numeroProcessoJudicial;

    /**
     * Gets the value of the possuiAutorizacaoJudicialReceberAcimaTeto property.
     * 
     */
    public short getPossuiAutorizacaoJudicialReceberAcimaTeto() {
        return possuiAutorizacaoJudicialReceberAcimaTeto;
    }

    /**
     * Sets the value of the possuiAutorizacaoJudicialReceberAcimaTeto property.
     * 
     */
    public void setPossuiAutorizacaoJudicialReceberAcimaTeto(short value) {
        this.possuiAutorizacaoJudicialReceberAcimaTeto = value;
    }

    /**
     * Gets the value of the numeroProcessoJudicial property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNumeroProcessoJudicial() {
        return numeroProcessoJudicial;
    }

    /**
     * Sets the value of the numeroProcessoJudicial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNumeroProcessoJudicial(Object value) {
        this.numeroProcessoJudicial = value;
    }

}
