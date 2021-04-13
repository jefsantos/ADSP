//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.01.23 às 11:30:00 AM BRST 
//


package br.gov.model.generico2018;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AcaoGoverno_t complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AcaoGoverno_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumeroAcao" type="{http://www.tce.sp.gov.br/audesp/xml/generico}CodigoAcao_t"/>
 *         &lt;element name="TipoAcao" type="{http://www.tce.sp.gov.br/audesp/xml/generico}TipoAcao_t"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcaoGoverno_t", propOrder = {
    "numeroAcao",
    "tipoAcao"
})
public class AcaoGovernoT {

    @XmlElement(name = "NumeroAcao")
    @XmlSchemaType(name = "integer")
    protected int numeroAcao;
    @XmlElement(name = "TipoAcao", required = true)
    protected String tipoAcao;

    /**
     * Obtém o valor da propriedade numeroAcao.
     * 
     */
    public int getNumeroAcao() {
        return numeroAcao;
    }

    /**
     * Define o valor da propriedade numeroAcao.
     * 
     */
    public void setNumeroAcao(int value) {
        this.numeroAcao = value;
    }

    /**
     * Obtém o valor da propriedade tipoAcao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoAcao() {
        return tipoAcao;
    }

    /**
     * Define o valor da propriedade tipoAcao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoAcao(String value) {
        this.tipoAcao = value;
    }

}
