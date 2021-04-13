//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.01.18 às 01:54:03 PM BRST 
//


package br.gov.model.folhaSuplementar;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de IdentificacaoPensionistaExt_t complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="IdentificacaoPensionistaExt_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tce.sp.gov.br/audesp/xml/atospessoal}IdentificacaoPensionista_t">
 *       &lt;sequence>
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
 *                 &lt;group ref="{http://www.tce.sp.gov.br/audesp/xml/remuneracao}ValorFolhaSuplementar_group"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificacaoPensionistaExt_t", namespace = "http://www.tce.sp.gov.br/audesp/xml/remuneracao", propOrder = {
    "formaPagamento",
    "numeroBanco",
    "agencia",
    "contaCorrente",
    "valores"
})
public class IdentificacaoPensionistaExtT
    extends IdentificacaoPensionistaT
{

    protected short formaPagamento;
    protected String numeroBanco;
    protected String agencia;
    @XmlElement(name = "ContaCorrente")
    protected String contaCorrente;
    @XmlElement(name = "Valores", required = true)
    protected IdentificacaoPensionistaExtT.Valores valores;

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
     *     {@link IdentificacaoPensionistaExtT.Valores }
     *     
     */
    public IdentificacaoPensionistaExtT.Valores getValores() {
        return valores;
    }

    /**
     * Define o valor da propriedade valores.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificacaoPensionistaExtT.Valores }
     *     
     */
    public void setValores(IdentificacaoPensionistaExtT.Valores value) {
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
     *       &lt;group ref="{http://www.tce.sp.gov.br/audesp/xml/remuneracao}ValorFolhaSuplementar_group"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "totalGeralDaRemuneracaoBruta",
        "totalGeralDeDescontos",
        "totalGeralDaRemuneracaoLiquida",
        "valorPagoContaCorrente",
        "valorPagoOutrasFormas",
        "verbas"
    })
    public static class Valores {

        @XmlElement(namespace = "http://www.tce.sp.gov.br/audesp/xml/remuneracao", required = true)
        protected BigDecimal totalGeralDaRemuneracaoBruta;
        @XmlElement(namespace = "http://www.tce.sp.gov.br/audesp/xml/remuneracao", required = true)
        protected BigDecimal totalGeralDeDescontos;
        @XmlElement(namespace = "http://www.tce.sp.gov.br/audesp/xml/remuneracao", required = true)
        protected BigDecimal totalGeralDaRemuneracaoLiquida;
        @XmlElement(namespace = "http://www.tce.sp.gov.br/audesp/xml/remuneracao", required = true)
        protected BigDecimal valorPagoContaCorrente;
        @XmlElement(namespace = "http://www.tce.sp.gov.br/audesp/xml/remuneracao", required = true)
        protected BigDecimal valorPagoOutrasFormas;
        @XmlElement(name = "Verbas", namespace = "http://www.tce.sp.gov.br/audesp/xml/remuneracao", required = true)
        protected List<VerbasT> verbas;

        /**
         * Obtém o valor da propriedade totalGeralDaRemuneracaoBruta.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalGeralDaRemuneracaoBruta() {
            return totalGeralDaRemuneracaoBruta;
        }

        /**
         * Define o valor da propriedade totalGeralDaRemuneracaoBruta.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalGeralDaRemuneracaoBruta(BigDecimal value) {
            this.totalGeralDaRemuneracaoBruta = value;
        }

        /**
         * Obtém o valor da propriedade totalGeralDeDescontos.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalGeralDeDescontos() {
            return totalGeralDeDescontos;
        }

        /**
         * Define o valor da propriedade totalGeralDeDescontos.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalGeralDeDescontos(BigDecimal value) {
            this.totalGeralDeDescontos = value;
        }

        /**
         * Obtém o valor da propriedade totalGeralDaRemuneracaoLiquida.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalGeralDaRemuneracaoLiquida() {
            return totalGeralDaRemuneracaoLiquida;
        }

        /**
         * Define o valor da propriedade totalGeralDaRemuneracaoLiquida.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalGeralDaRemuneracaoLiquida(BigDecimal value) {
            this.totalGeralDaRemuneracaoLiquida = value;
        }

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

        /**
         * Gets the value of the verbas property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the verbas property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVerbas().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VerbasT }
         * 
         * 
         */
        public List<VerbasT> getVerbas() {
            if (verbas == null) {
                verbas = new ArrayList<VerbasT>();
            }
            return this.verbas;
        }

    }

}
