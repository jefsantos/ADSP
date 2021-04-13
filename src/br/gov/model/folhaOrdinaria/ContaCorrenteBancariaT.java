//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.01.18 às 01:53:35 PM BRST 
//


package br.gov.model.folhaOrdinaria;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ContaCorrenteBancaria_t complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ContaCorrenteBancaria_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Banco" type="{http://www.tce.sp.gov.br/audesp/xml/generico}CodigoBanco_t"/>
 *         &lt;element name="Agencia" type="{http://www.tce.sp.gov.br/audesp/xml/generico}CodigoAgenciaBancaria_t"/>
 *         &lt;element name="DVAgencia" type="{http://www.tce.sp.gov.br/audesp/xml/generico}DigitoVerificador_t" minOccurs="0"/>
 *         &lt;element name="ContaCorrente" type="{http://www.tce.sp.gov.br/audesp/xml/generico}NumeroContaCorrenteBancaria_t"/>
 *         &lt;element name="DVContaCorrente" type="{http://www.tce.sp.gov.br/audesp/xml/generico}DigitoVerificador_t" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContaCorrenteBancaria_t", propOrder = {
    "banco",
    "agencia",
    "dvAgencia",
    "contaCorrente",
    "dvContaCorrente"
})
public class ContaCorrenteBancariaT {

    @XmlElement(name = "Banco", required = true)
    protected String banco;
    @XmlElement(name = "Agencia", required = true)
    protected String agencia;
    @XmlElement(name = "DVAgencia")
    protected String dvAgencia;
    @XmlElement(name = "ContaCorrente", required = true)
    protected String contaCorrente;
    @XmlElement(name = "DVContaCorrente")
    protected String dvContaCorrente;

    /**
     * Obtém o valor da propriedade banco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBanco() {
        return banco;
    }

    /**
     * Define o valor da propriedade banco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBanco(String value) {
        this.banco = value;
    }

    /**
     * Obtém o valor da propriedade agencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencia() {
        return agencia;
    }

    /**
     * Define o valor da propriedade agencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencia(String value) {
        this.agencia = value;
    }

    /**
     * Obtém o valor da propriedade dvAgencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDVAgencia() {
        return dvAgencia;
    }

    /**
     * Define o valor da propriedade dvAgencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDVAgencia(String value) {
        this.dvAgencia = value;
    }

    /**
     * Obtém o valor da propriedade contaCorrente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContaCorrente() {
        return contaCorrente;
    }

    /**
     * Define o valor da propriedade contaCorrente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContaCorrente(String value) {
        this.contaCorrente = value;
    }

    /**
     * Obtém o valor da propriedade dvContaCorrente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDVContaCorrente() {
        return dvContaCorrente;
    }

    /**
     * Define o valor da propriedade dvContaCorrente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDVContaCorrente(String value) {
        this.dvContaCorrente = value;
    }

}
