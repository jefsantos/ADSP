//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.01.21 às 10:09:53 AM BRST 
//


package br.gov.model.pagamento;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de IdentificacaoAgentePublico_t2 complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="IdentificacaoAgentePublico_t2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CPF" type="{http://www.tce.sp.gov.br/audesp/xml/generico}CPF_t"/>
 *         &lt;sequence>
 *           &lt;element name="MunicipioLotacao" type="{http://www.tce.sp.gov.br/audesp/xml/generico}CodigoMunicipio_t"/>
 *           &lt;element name="EntidadeLotacao" type="{http://www.tce.sp.gov.br/audesp/xml/generico}CodigoEntidade_t"/>
 *         &lt;/sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="CodigoCargo" type="{http://www.tce.sp.gov.br/audesp/xml/atospessoal}CodigoAlphaNumericoPontoBarraTraco_t"/>
 *           &lt;element name="CodigoFuncao" type="{http://www.tce.sp.gov.br/audesp/xml/atospessoal}CodigoAlphaNumericoPontoBarraTraco_t"/>
 *         &lt;/choice>
 *         &lt;element name="formaPagamento" type="{http://www.tce.sp.gov.br/audesp/xml/atospessoal}TipoFormaPagamento_t"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="numeroBanco">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;minLength value="1"/>
 *                 &lt;maxLength value="255"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="agencia">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;minLength value="1"/>
 *                 &lt;maxLength value="255"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="ContaCorrente">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;minLength value="1"/>
 *                 &lt;maxLength value="255"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *         &lt;/sequence>
 *         &lt;element name="Valores">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;group ref="{http://www.tce.sp.gov.br/audesp/xml/remuneracao}ValorPagamentoFolhaOrdinaria_group"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificacaoAgentePublico_t2", namespace = "http://www.tce.sp.gov.br/audesp/xml/remuneracao", propOrder = {
    "cpf",
    "municipioLotacao",
    "entidadeLotacao",
    "codigoCargo",
    "codigoFuncao",
    "formaPagamento",
    "numeroBanco",
    "agencia",
    "contaCorrente",
    "valores"
})
public class IdentificacaoAgentePublicoT2 {

    @XmlElement(name = "CPF", required = true)
    protected CPFT cpf;
    @XmlElement(name = "MunicipioLotacao", required = true)
    protected String municipioLotacao;
    @XmlElement(name = "EntidadeLotacao")
    @XmlSchemaType(name = "integer")
    protected int entidadeLotacao;
    @XmlElement(name = "CodigoCargo")
    protected String codigoCargo;
    @XmlElement(name = "CodigoFuncao")
    protected String codigoFuncao;
    protected short formaPagamento;
    protected String numeroBanco;
    protected String agencia;
    @XmlElement(name = "ContaCorrente")
    protected String contaCorrente;
    @XmlElement(name = "Valores", required = true)
    protected IdentificacaoAgentePublicoT2 .Valores valores;

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
     * Obtém o valor da propriedade formaPagamento.
     * 
     */
    public short getFormaPagamento() {
        return formaPagamento;
    }

    /**
     * Define o valor da propriedade formaPagamento.
     * 
     */
    public void setFormaPagamento(short value) {
        this.formaPagamento = value;
    }

    /**
     * Obtém o valor da propriedade numeroBanco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroBanco() {
        return numeroBanco;
    }

    /**
     * Define o valor da propriedade numeroBanco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroBanco(String value) {
        this.numeroBanco = value;
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
     * Obtém o valor da propriedade valores.
     * 
     * @return
     *     possible object is
     *     {@link IdentificacaoAgentePublicoT2 .Valores }
     *     
     */
    public IdentificacaoAgentePublicoT2 .Valores getValores() {
        return valores;
    }

    /**
     * Define o valor da propriedade valores.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificacaoAgentePublicoT2 .Valores }
     *     
     */
    public void setValores(IdentificacaoAgentePublicoT2 .Valores value) {
        this.valores = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;group ref="{http://www.tce.sp.gov.br/audesp/xml/remuneracao}ValorPagamentoFolhaOrdinaria_group"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "valorPagoContaCorrente",
        "valorPagoOutrasFormas"
    })
    public static class Valores {

        @XmlElement(namespace = "http://www.tce.sp.gov.br/audesp/xml/remuneracao", required = true)
        protected BigDecimal valorPagoContaCorrente;
        @XmlElement(namespace = "http://www.tce.sp.gov.br/audesp/xml/remuneracao", required = true)
        protected BigDecimal valorPagoOutrasFormas;

        /**
         * Obtém o valor da propriedade valorPagoContaCorrente.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorPagoContaCorrente() {
            return valorPagoContaCorrente;
        }

        /**
         * Define o valor da propriedade valorPagoContaCorrente.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorPagoContaCorrente(BigDecimal value) {
            this.valorPagoContaCorrente = value;
        }

        /**
         * Obtém o valor da propriedade valorPagoOutrasFormas.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorPagoOutrasFormas() {
            return valorPagoOutrasFormas;
        }

        /**
         * Define o valor da propriedade valorPagoOutrasFormas.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorPagoOutrasFormas(BigDecimal value) {
            this.valorPagoOutrasFormas = value;
        }

    }

}
