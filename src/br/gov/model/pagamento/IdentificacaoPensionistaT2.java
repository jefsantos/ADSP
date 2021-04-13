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
 * <p>Classe Java de IdentificacaoPensionista_t2 complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="IdentificacaoPensionista_t2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CPF" type="{http://www.tce.sp.gov.br/audesp/xml/generico}CPF_t"/>
 *         &lt;sequence>
 *           &lt;element name="MunicipioLotacaoAgentePublico" type="{http://www.tce.sp.gov.br/audesp/xml/generico}CodigoMunicipio_t"/>
 *           &lt;element name="EntidadeLotacaoAgentePublico" type="{http://www.tce.sp.gov.br/audesp/xml/generico}CodigoEntidade_t"/>
 *         &lt;/sequence>
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
@XmlType(name = "IdentificacaoPensionista_t2", namespace = "http://www.tce.sp.gov.br/audesp/xml/remuneracao", propOrder = {
    "cpf",
    "municipioLotacaoAgentePublico",
    "entidadeLotacaoAgentePublico",
    "formaPagamento",
    "numeroBanco",
    "agencia",
    "contaCorrente",
    "valores"
})
public class IdentificacaoPensionistaT2 {

    @XmlElement(name = "CPF", required = true)
    protected CPFT cpf;
    @XmlElement(name = "MunicipioLotacaoAgentePublico", required = true)
    protected String municipioLotacaoAgentePublico;
    @XmlElement(name = "EntidadeLotacaoAgentePublico")
    @XmlSchemaType(name = "integer")
    protected int entidadeLotacaoAgentePublico;
    protected short formaPagamento;
    protected String numeroBanco;
    protected String agencia;
    @XmlElement(name = "ContaCorrente")
    protected String contaCorrente;
    @XmlElement(name = "Valores", required = true)
    protected IdentificacaoPensionistaT2 .Valores valores;

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
     * Obtém o valor da propriedade municipioLotacaoAgentePublico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipioLotacaoAgentePublico() {
        return municipioLotacaoAgentePublico;
    }

    /**
     * Define o valor da propriedade municipioLotacaoAgentePublico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipioLotacaoAgentePublico(String value) {
        this.municipioLotacaoAgentePublico = value;
    }

    /**
     * Obtém o valor da propriedade entidadeLotacaoAgentePublico.
     * 
     */
    public int getEntidadeLotacaoAgentePublico() {
        return entidadeLotacaoAgentePublico;
    }

    /**
     * Define o valor da propriedade entidadeLotacaoAgentePublico.
     * 
     */
    public void setEntidadeLotacaoAgentePublico(int value) {
        this.entidadeLotacaoAgentePublico = value;
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
     *     {@link IdentificacaoPensionistaT2 .Valores }
     *     
     */
    public IdentificacaoPensionistaT2 .Valores getValores() {
        return valores;
    }

    /**
     * Define o valor da propriedade valores.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificacaoPensionistaT2 .Valores }
     *     
     */
    public void setValores(IdentificacaoPensionistaT2 .Valores value) {
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
