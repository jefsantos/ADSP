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
 * <p>Java class for DespesaComLicitacao_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DespesaComLicitacao_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoComLicitacao" type="{http://www.tce.sp.gov.br/audesp/xml/auxiliar}CodigoComLicitacao_t"/>
 *         &lt;element name="NumeroLicitacao" type="{http://www.tce.sp.gov.br/audesp/xml/auxiliar}NumeroLicitacao_t"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DespesaComLicitacao_t", namespace = "http://www.tce.sp.gov.br/audesp/xml/auxiliar", propOrder = {
    "codigoComLicitacao",
    "numeroLicitacao"
})
public class DespesaComLicitacaoT {

    @XmlElement(name = "CodigoComLicitacao", required = true)
    protected String codigoComLicitacao;
    @XmlElement(name = "NumeroLicitacao", required = true)
    protected String numeroLicitacao;

    /**
     * Gets the value of the codigoComLicitacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoComLicitacao() {
        return codigoComLicitacao;
    }

    /**
     * Sets the value of the codigoComLicitacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoComLicitacao(String value) {
        this.codigoComLicitacao = value;
    }

    /**
     * Gets the value of the numeroLicitacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroLicitacao() {
        return numeroLicitacao;
    }

    /**
     * Sets the value of the numeroLicitacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroLicitacao(String value) {
        this.numeroLicitacao = value;
    }

}