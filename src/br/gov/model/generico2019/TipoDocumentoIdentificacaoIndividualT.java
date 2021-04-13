//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.01.18 às 01:51:26 PM BRST 
//


package br.gov.model.generico2019;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TipoDocumentoIdentificacaoIndividual_t complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TipoDocumentoIdentificacaoIndividual_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="CPF" type="{http://www.tce.sp.gov.br/audesp/xml/atospessoal}CPF_ComAtributo_t"/>
 *         &lt;element name="CertidaoNascimento_ComAtributo_t" type="{http://www.tce.sp.gov.br/audesp/xml/atospessoal}CertidaoNascimento_ComAtributo_t"/>
 *         &lt;element name="PIS_PASEP_ComAtributo_t" type="{http://www.tce.sp.gov.br/audesp/xml/atospessoal}PIS_PASEP_ComAtributo_t"/>
 *         &lt;element name="RG_ComAtributo_t" type="{http://www.tce.sp.gov.br/audesp/xml/atospessoal}RG_ComAtributo_t"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoDocumentoIdentificacaoIndividual_t", namespace = "http://www.tce.sp.gov.br/audesp/xml/atospessoal", propOrder = {
    "cpf",
    "certidaoNascimentoComAtributoT",
    "pispasepComAtributoT",
    "rgComAtributoT"
})
public class TipoDocumentoIdentificacaoIndividualT {

    @XmlElement(name = "CPF")
    protected CPFComAtributoT cpf;
    @XmlElement(name = "CertidaoNascimento_ComAtributo_t")
    protected CertidaoNascimentoComAtributoT certidaoNascimentoComAtributoT;
    @XmlElement(name = "PIS_PASEP_ComAtributo_t")
    protected PISPASEPComAtributoT pispasepComAtributoT;
    @XmlElement(name = "RG_ComAtributo_t")
    protected RGComAtributoT rgComAtributoT;

    /**
     * Obtém o valor da propriedade cpf.
     * 
     * @return
     *     possible object is
     *     {@link CPFComAtributoT }
     *     
     */
    public CPFComAtributoT getCPF() {
        return cpf;
    }

    /**
     * Define o valor da propriedade cpf.
     * 
     * @param value
     *     allowed object is
     *     {@link CPFComAtributoT }
     *     
     */
    public void setCPF(CPFComAtributoT value) {
        this.cpf = value;
    }

    /**
     * Obtém o valor da propriedade certidaoNascimentoComAtributoT.
     * 
     * @return
     *     possible object is
     *     {@link CertidaoNascimentoComAtributoT }
     *     
     */
    public CertidaoNascimentoComAtributoT getCertidaoNascimentoComAtributoT() {
        return certidaoNascimentoComAtributoT;
    }

    /**
     * Define o valor da propriedade certidaoNascimentoComAtributoT.
     * 
     * @param value
     *     allowed object is
     *     {@link CertidaoNascimentoComAtributoT }
     *     
     */
    public void setCertidaoNascimentoComAtributoT(CertidaoNascimentoComAtributoT value) {
        this.certidaoNascimentoComAtributoT = value;
    }

    /**
     * Obtém o valor da propriedade pispasepComAtributoT.
     * 
     * @return
     *     possible object is
     *     {@link PISPASEPComAtributoT }
     *     
     */
    public PISPASEPComAtributoT getPISPASEPComAtributoT() {
        return pispasepComAtributoT;
    }

    /**
     * Define o valor da propriedade pispasepComAtributoT.
     * 
     * @param value
     *     allowed object is
     *     {@link PISPASEPComAtributoT }
     *     
     */
    public void setPISPASEPComAtributoT(PISPASEPComAtributoT value) {
        this.pispasepComAtributoT = value;
    }

    /**
     * Obtém o valor da propriedade rgComAtributoT.
     * 
     * @return
     *     possible object is
     *     {@link RGComAtributoT }
     *     
     */
    public RGComAtributoT getRGComAtributoT() {
        return rgComAtributoT;
    }

    /**
     * Define o valor da propriedade rgComAtributoT.
     * 
     * @param value
     *     allowed object is
     *     {@link RGComAtributoT }
     *     
     */
    public void setRGComAtributoT(RGComAtributoT value) {
        this.rgComAtributoT = value;
    }

}
