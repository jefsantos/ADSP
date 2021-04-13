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
 * <p>Java class for IdentificacaoAgentePublico_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentificacaoAgentePublico_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CPF" type="{http://www.tce.sp.gov.br/audesp/xml/generico}CPF_t"/>
 *         &lt;element name="Nome">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;sequence>
 *           &lt;element name="MunicipioLotacao" type="{http://www.tce.sp.gov.br/audesp/xml/generico}CodigoMunicipio_t"/>
 *           &lt;element name="EntidadeLotacao" type="{http://www.tce.sp.gov.br/audesp/xml/generico}CodigoEntidade_t"/>
 *         &lt;/sequence>
 *         &lt;element name="CargoPolitico" type="{http://www.tce.sp.gov.br/audesp/xml/atospessoal}CargoPolitico_t"/>
 *         &lt;element name="FuncaoGoverno" type="{http://www.tce.sp.gov.br/audesp/xml/auxiliar}CodigoFuncaoGoverno_ListaAmpliada_t"/>
 *         &lt;element name="Estagiario" type="{http://www.tce.sp.gov.br/audesp/xml/atospessoal}Estagiario_t"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="CodigoCargo" type="{http://www.tce.sp.gov.br/audesp/xml/atospessoal}CodigoAlphaNumericoPontoBarraTraco_t"/>
 *           &lt;element name="CodigoFuncao" type="{http://www.tce.sp.gov.br/audesp/xml/atospessoal}CodigoAlphaNumericoPontoBarraTraco_t"/>
 *         &lt;/choice>
 *         &lt;element name="Situacao" type="{http://www.tce.sp.gov.br/audesp/xml/atospessoal}TipoSituacao_t"/>
 *         &lt;element name="RegimeJuridico" type="{http://www.tce.sp.gov.br/audesp/xml/atospessoal}TipoRegimeJuridico_t"/>
 *         &lt;element name="PossuiAutorizRecebAcimaTeto" type="{http://www.tce.sp.gov.br/audesp/xml/atospessoal}PossuiAutorizacaoJudicialReceberAcimaTeto_t"/>
 *         &lt;element name="NumeroProcessoJudicial" type="{http://www.tce.sp.gov.br/audesp/xml/atospessoal}CodigoAlphaNumericoPontoBarraTraco_t" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificacaoAgentePublico_t", namespace = "http://www.tce.sp.gov.br/audesp/xml/atospessoal", propOrder = {
    "cpf",
    "nome",
    "municipioLotacao",
    "entidadeLotacao",
    "cargoPolitico",
    "funcaoGoverno",
    "estagiario",
    "codigoCargo",
    "codigoFuncao",
    "situacao",
    "regimeJuridico",
    "possuiAutorizRecebAcimaTeto",
    "numeroProcessoJudicial"
})
public class IdentificacaoAgentePublicoT {

    @XmlElement(name = "CPF", required = true)
    protected CPFT cpf;
    @XmlElement(name = "Nome", required = true)
    protected String nome;
    @XmlElement(name = "MunicipioLotacao", required = true)
    protected String municipioLotacao;
    @XmlElement(name = "EntidadeLotacao")
    protected int entidadeLotacao;
    @XmlElement(name = "CargoPolitico")
    protected short cargoPolitico;
    @XmlElement(name = "FuncaoGoverno", required = true)
    protected String funcaoGoverno;
    @XmlElement(name = "Estagiario")
    protected short estagiario;
    @XmlElement(name = "CodigoCargo")
    protected String codigoCargo;
    @XmlElement(name = "CodigoFuncao")
    protected String codigoFuncao;
    @XmlElement(name = "Situacao")
    protected short situacao;
    @XmlElement(name = "RegimeJuridico")
    protected short regimeJuridico;
    @XmlElement(name = "PossuiAutorizRecebAcimaTeto")
    protected short possuiAutorizRecebAcimaTeto;
    @XmlElement(name = "NumeroProcessoJudicial")
    protected String numeroProcessoJudicial;

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
     * Gets the value of the nome property.
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
     * Sets the value of the nome property.
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
     * Gets the value of the municipioLotacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipioLotacao() {
        return municipioLotacao;
    }

    /**
     * Sets the value of the municipioLotacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipioLotacao(String value) {
        this.municipioLotacao = value;
    }

    /**
     * Gets the value of the entidadeLotacao property.
     * 
     */
    public int getEntidadeLotacao() {
        return entidadeLotacao;
    }

    /**
     * Sets the value of the entidadeLotacao property.
     * 
     */
    public void setEntidadeLotacao(int value) {
        this.entidadeLotacao = value;
    }

    /**
     * Gets the value of the cargoPolitico property.
     * 
     */
    public short getCargoPolitico() {
        return cargoPolitico;
    }

    /**
     * Sets the value of the cargoPolitico property.
     * 
     */
    public void setCargoPolitico(short value) {
        this.cargoPolitico = value;
    }

    /**
     * Gets the value of the funcaoGoverno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuncaoGoverno() {
        return funcaoGoverno;
    }

    /**
     * Sets the value of the funcaoGoverno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuncaoGoverno(String value) {
        this.funcaoGoverno = value;
    }

    /**
     * Gets the value of the estagiario property.
     * 
     */
    public short getEstagiario() {
        return estagiario;
    }

    /**
     * Sets the value of the estagiario property.
     * 
     */
    public void setEstagiario(short value) {
        this.estagiario = value;
    }

    /**
     * Gets the value of the codigoCargo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCargo() {
        return codigoCargo;
    }

    /**
     * Sets the value of the codigoCargo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCargo(String value) {
        this.codigoCargo = value;
    }

    /**
     * Gets the value of the codigoFuncao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoFuncao() {
        return codigoFuncao;
    }

    /**
     * Sets the value of the codigoFuncao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoFuncao(String value) {
        this.codigoFuncao = value;
    }

    /**
     * Gets the value of the situacao property.
     * 
     */
    public short getSituacao() {
        return situacao;
    }

    /**
     * Sets the value of the situacao property.
     * 
     */
    public void setSituacao(short value) {
        this.situacao = value;
    }

    /**
     * Gets the value of the regimeJuridico property.
     * 
     */
    public short getRegimeJuridico() {
        return regimeJuridico;
    }

    /**
     * Sets the value of the regimeJuridico property.
     * 
     */
    public void setRegimeJuridico(short value) {
        this.regimeJuridico = value;
    }

    /**
     * Gets the value of the possuiAutorizRecebAcimaTeto property.
     * 
     */
    public short getPossuiAutorizRecebAcimaTeto() {
        return possuiAutorizRecebAcimaTeto;
    }

    /**
     * Sets the value of the possuiAutorizRecebAcimaTeto property.
     * 
     */
    public void setPossuiAutorizRecebAcimaTeto(short value) {
        this.possuiAutorizRecebAcimaTeto = value;
    }

    /**
     * Gets the value of the numeroProcessoJudicial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroProcessoJudicial() {
        return numeroProcessoJudicial;
    }

    /**
     * Sets the value of the numeroProcessoJudicial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroProcessoJudicial(String value) {
        this.numeroProcessoJudicial = value;
    }

}
