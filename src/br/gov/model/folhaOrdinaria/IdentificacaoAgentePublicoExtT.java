//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.01.18 às 01:53:35 PM BRST 
//


package br.gov.model.folhaOrdinaria;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de IdentificacaoAgentePublicoExt_t complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="IdentificacaoAgentePublicoExt_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tce.sp.gov.br/audesp/xml/atospessoal}IdentificacaoAgentePublico_t">
 *       &lt;sequence>
 *         &lt;element name="Valores">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;group ref="{http://www.tce.sp.gov.br/audesp/xml/remuneracao}ValorFolhaOrdinaria_group"/>
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
@XmlType(name = "IdentificacaoAgentePublicoExt_t", namespace = "http://www.tce.sp.gov.br/audesp/xml/remuneracao", propOrder = {
    "valores"
})
public class IdentificacaoAgentePublicoExtT
    extends IdentificacaoAgentePublicoT
{

    @XmlElement(name = "Valores", required = true)
    protected IdentificacaoAgentePublicoExtT.Valores valores;

    /**
     * Obtém o valor da propriedade valores.
     * 
     * @return
     *     possible object is
     *     {@link IdentificacaoAgentePublicoExtT.Valores }
     *     
     */
    public IdentificacaoAgentePublicoExtT.Valores getValores() {
        return valores;
    }

    /**
     * Define o valor da propriedade valores.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificacaoAgentePublicoExtT.Valores }
     *     
     */
    public void setValores(IdentificacaoAgentePublicoExtT.Valores value) {
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
     *       &lt;group ref="{http://www.tce.sp.gov.br/audesp/xml/remuneracao}ValorFolhaOrdinaria_group"/>
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
        "verbas"
    })
    public static class Valores {

        @XmlElement(namespace = "http://www.tce.sp.gov.br/audesp/xml/remuneracao", required = true)
        protected BigDecimal totalGeralDaRemuneracaoBruta;
        @XmlElement(namespace = "http://www.tce.sp.gov.br/audesp/xml/remuneracao", required = true)
        protected BigDecimal totalGeralDeDescontos;
        @XmlElement(namespace = "http://www.tce.sp.gov.br/audesp/xml/remuneracao", required = true)
        protected BigDecimal totalGeralDaRemuneracaoLiquida;
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
