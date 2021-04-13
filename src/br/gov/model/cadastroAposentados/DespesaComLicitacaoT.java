//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.01.18 às 01:53:12 PM BRST 
//


package br.gov.model.cadastroAposentados;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DespesaComLicitacao_t complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
     * Obtém o valor da propriedade codigoComLicitacao.
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
     * Define o valor da propriedade codigoComLicitacao.
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
     * Obtém o valor da propriedade numeroLicitacao.
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
     * Define o valor da propriedade numeroLicitacao.
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
