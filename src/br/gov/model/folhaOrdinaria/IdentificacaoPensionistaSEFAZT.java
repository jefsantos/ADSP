//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.01.18 às 01:53:35 PM BRST 
//


package br.gov.model.folhaOrdinaria;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de IdentificacaoPensionista_SEFAZ_t complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="IdentificacaoPensionista_SEFAZ_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Nome">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DataNascimento" type="{http://www.tce.sp.gov.br/audesp/xml/generico}DataNascimentoValida_t" minOccurs="0"/>
 *         &lt;element name="CPF" type="{http://www.tce.sp.gov.br/audesp/xml/generico}CPF_t"/>
 *         &lt;element name="QualificacaoPensionista" type="{http://www.tce.sp.gov.br/audesp/xml/atospessoal}TipoQualificacaoPensionista_t"/>
 *         &lt;element name="OutraQualificacaoPensionista" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;sequence>
 *           &lt;element name="Municipio" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *           &lt;element name="Orgao" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *           &lt;element name="UO" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *           &lt;element name="UGE" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *           &lt;element name="UA-UGE" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *           &lt;element name="UA" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificacaoPensionista_SEFAZ_t", namespace = "http://www.tce.sp.gov.br/audesp/xml/atospessoal", propOrder = {
    "nome",
    "dataNascimento",
    "cpf",
    "qualificacaoPensionista",
    "outraQualificacaoPensionista",
    "municipio",
    "orgao",
    "uo",
    "uge",
    "uauge",
    "ua"
})
public class IdentificacaoPensionistaSEFAZT {

    @XmlElement(name = "Nome", required = true)
    protected String nome;
    @XmlElement(name = "DataNascimento")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataNascimento;
    @XmlElement(name = "CPF", required = true)
    protected CPFT cpf;
    @XmlElement(name = "QualificacaoPensionista")
    protected short qualificacaoPensionista;
    @XmlElement(name = "OutraQualificacaoPensionista")
    protected String outraQualificacaoPensionista;
    @XmlElement(name = "Municipio", required = true)
    protected BigInteger municipio;
    @XmlElement(name = "Orgao", required = true)
    protected BigInteger orgao;
    @XmlElement(name = "UO", required = true)
    protected BigInteger uo;
    @XmlElement(name = "UGE", required = true)
    protected BigInteger uge;
    @XmlElement(name = "UA-UGE", required = true)
    protected BigInteger uauge;
    @XmlElement(name = "UA", required = true)
    protected BigInteger ua;

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Obtém o valor da propriedade dataNascimento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataNascimento() {
        return dataNascimento;
    }

    /**
     * Define o valor da propriedade dataNascimento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataNascimento(XMLGregorianCalendar value) {
        this.dataNascimento = value;
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
     * Obtém o valor da propriedade qualificacaoPensionista.
     * 
     */
    public short getQualificacaoPensionista() {
        return qualificacaoPensionista;
    }

    /**
     * Define o valor da propriedade qualificacaoPensionista.
     * 
     */
    public void setQualificacaoPensionista(short value) {
        this.qualificacaoPensionista = value;
    }

    /**
     * Obtém o valor da propriedade outraQualificacaoPensionista.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutraQualificacaoPensionista() {
        return outraQualificacaoPensionista;
    }

    /**
     * Define o valor da propriedade outraQualificacaoPensionista.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutraQualificacaoPensionista(String value) {
        this.outraQualificacaoPensionista = value;
    }

    /**
     * Obtém o valor da propriedade municipio.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMunicipio() {
        return municipio;
    }

    /**
     * Define o valor da propriedade municipio.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMunicipio(BigInteger value) {
        this.municipio = value;
    }

    /**
     * Obtém o valor da propriedade orgao.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrgao() {
        return orgao;
    }

    /**
     * Define o valor da propriedade orgao.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrgao(BigInteger value) {
        this.orgao = value;
    }

    /**
     * Obtém o valor da propriedade uo.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUO() {
        return uo;
    }

    /**
     * Define o valor da propriedade uo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUO(BigInteger value) {
        this.uo = value;
    }

    /**
     * Obtém o valor da propriedade uge.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUGE() {
        return uge;
    }

    /**
     * Define o valor da propriedade uge.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUGE(BigInteger value) {
        this.uge = value;
    }

    /**
     * Obtém o valor da propriedade uauge.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUAUGE() {
        return uauge;
    }

    /**
     * Define o valor da propriedade uauge.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUAUGE(BigInteger value) {
        this.uauge = value;
    }

    /**
     * Obtém o valor da propriedade ua.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUA() {
        return ua;
    }

    /**
     * Define o valor da propriedade ua.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUA(BigInteger value) {
        this.ua = value;
    }

}
