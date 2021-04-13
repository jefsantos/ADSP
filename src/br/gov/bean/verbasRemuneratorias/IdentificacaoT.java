//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.13 at 05:30:46 PM BRT 
//


package br.gov.bean.verbasRemuneratorias;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Identificacao_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the cnpj property.
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
     * Sets the value of the cnpj property.
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
     * Gets the value of the cpf property.
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
     * Sets the value of the cpf property.
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
     * Gets the value of the identificacaoEspecial property.
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
     * Sets the value of the identificacaoEspecial property.
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
     * Gets the value of the inscricaoGenerica property.
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
     * Sets the value of the inscricaoGenerica property.
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
