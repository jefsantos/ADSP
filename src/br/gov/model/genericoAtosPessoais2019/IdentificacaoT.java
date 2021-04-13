//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.01.18 às 01:58:02 PM BRST 
//


package br.gov.model.genericoAtosPessoais2019;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Identificacao_t complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Identificacao_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="CNPJ" type="{http://www.tce.sp.gov.br/audesp/xml/generico}CNPJ_t"/>
 *         &lt;element name="CPF" type="{http://www.tce.sp.gov.br/audesp/xml/generico}CPF_t"/>
 *         &lt;element name="IdentificacaoEspecial" type="{http://www.tce.sp.gov.br/audesp/xml/generico}IdentificacaoEspecial_t"/>
 *         &lt;element name="InscricaoGenerica" type="{http://www.tce.sp.gov.br/audesp/xml/generico}IdentificacaoInscricaoGenerica_t"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Identificacao_t", propOrder = {
    "cnpj",
    "cpf",
    "identificacaoEspecial",
    "inscricaoGenerica"
})
public class IdentificacaoT {

    @XmlElement(name = "CNPJ")
    protected CNPJT cnpj;
    @XmlElement(name = "CPF")
    protected CPFT cpf;
    @XmlElement(name = "IdentificacaoEspecial")
    protected IdentificacaoEspecialT identificacaoEspecial;
    @XmlElement(name = "InscricaoGenerica")
    protected IdentificacaoInscricaoGenericaT inscricaoGenerica;

    /**
     * Obtém o valor da propriedade cnpj.
     * 
     * @return
     *     possible object is
     *     {@link CNPJT }
     *     
     */
    public CNPJT getCNPJ() {
        return cnpj;
    }

    /**
     * Define o valor da propriedade cnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link CNPJT }
     *     
     */
    public void setCNPJ(CNPJT value) {
        this.cnpj = value;
    }

    /**
     * Obtém o valor da propriedade cpf.
     * 
     * @return
     *     possible object is
     *     {@link CPFT }
     *     
     */
    public CPFT getCPF() {
        return cpf;
    }

    /**
     * Define o valor da propriedade cpf.
     * 
     * @param value
     *     allowed object is
     *     {@link CPFT }
     *     
     */
    public void setCPF(CPFT value) {
        this.cpf = value;
    }

    /**
     * Obtém o valor da propriedade identificacaoEspecial.
     * 
     * @return
     *     possible object is
     *     {@link IdentificacaoEspecialT }
     *     
     */
    public IdentificacaoEspecialT getIdentificacaoEspecial() {
        return identificacaoEspecial;
    }

    /**
     * Define o valor da propriedade identificacaoEspecial.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificacaoEspecialT }
     *     
     */
    public void setIdentificacaoEspecial(IdentificacaoEspecialT value) {
        this.identificacaoEspecial = value;
    }

    /**
     * Obtém o valor da propriedade inscricaoGenerica.
     * 
     * @return
     *     possible object is
     *     {@link IdentificacaoInscricaoGenericaT }
     *     
     */
    public IdentificacaoInscricaoGenericaT getInscricaoGenerica() {
        return inscricaoGenerica;
    }

    /**
     * Define o valor da propriedade inscricaoGenerica.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificacaoInscricaoGenericaT }
     *     
     */
    public void setInscricaoGenerica(IdentificacaoInscricaoGenericaT value) {
        this.inscricaoGenerica = value;
    }

}
