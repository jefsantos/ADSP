//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.01.18 às 01:54:03 PM BRST 
//


package br.gov.model.folhaSuplementar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de IdentificacaoAgentePublico_t complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
@XmlSeeAlso({
    IdentificacaoAgentePublicoExtT.class
})
public class IdentificacaoAgentePublicoT {

    @XmlElement(name = "CPF", required = true)
    protected CPFT cpf;
    @XmlElement(name = "Nome", required = true)
    protected String nome;
    @XmlElement(name = "MunicipioLotacao", required = true)
    protected String municipioLotacao;
    @XmlElement(name = "EntidadeLotacao")
    @XmlSchemaType(name = "integer")
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
     * Obtém o valor da propriedade municipioLotacao.
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
     * Define o valor da propriedade municipioLotacao.
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
     * Obtém o valor da propriedade entidadeLotacao.
     * 
     */
    public int getEntidadeLotacao() {
        return entidadeLotacao;
    }

    /**
     * Define o valor da propriedade entidadeLotacao.
     * 
     */
    public void setEntidadeLotacao(int value) {
        this.entidadeLotacao = value;
    }

    /**
     * Obtém o valor da propriedade cargoPolitico.
     * 
     */
    public short getCargoPolitico() {
        return cargoPolitico;
    }

    /**
     * Define o valor da propriedade cargoPolitico.
     * 
     */
    public void setCargoPolitico(short value) {
        this.cargoPolitico = value;
    }

    /**
     * Obtém o valor da propriedade funcaoGoverno.
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
     * Define o valor da propriedade funcaoGoverno.
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
     * Obtém o valor da propriedade estagiario.
     * 
     */
    public short getEstagiario() {
        return estagiario;
    }

    /**
     * Define o valor da propriedade estagiario.
     * 
     */
    public void setEstagiario(short value) {
        this.estagiario = value;
    }

    /**
     * Obtém o valor da propriedade codigoCargo.
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
     * Define o valor da propriedade codigoCargo.
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
     * Obtém o valor da propriedade codigoFuncao.
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
     * Define o valor da propriedade codigoFuncao.
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
     * Obtém o valor da propriedade situacao.
     * 
     */
    public short getSituacao() {
        return situacao;
    }

    /**
     * Define o valor da propriedade situacao.
     * 
     */
    public void setSituacao(short value) {
        this.situacao = value;
    }

    /**
     * Obtém o valor da propriedade regimeJuridico.
     * 
     */
    public short getRegimeJuridico() {
        return regimeJuridico;
    }

    /**
     * Define o valor da propriedade regimeJuridico.
     * 
     */
    public void setRegimeJuridico(short value) {
        this.regimeJuridico = value;
    }

    /**
     * Obtém o valor da propriedade possuiAutorizRecebAcimaTeto.
     * 
     */
    public short getPossuiAutorizRecebAcimaTeto() {
        return possuiAutorizRecebAcimaTeto;
    }

    /**
     * Define o valor da propriedade possuiAutorizRecebAcimaTeto.
     * 
     */
    public void setPossuiAutorizRecebAcimaTeto(short value) {
        this.possuiAutorizRecebAcimaTeto = value;
    }

    /**
     * Obtém o valor da propriedade numeroProcessoJudicial.
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
     * Define o valor da propriedade numeroProcessoJudicial.
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
