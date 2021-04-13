//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.01.18 às 01:54:56 PM BRST 
//


package br.gov.model.resumoFolha;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ResumoFolha complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ResumoFolha">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MunicipioEntidadeLotacao" type="{http://www.tce.sp.gov.br/audesp/xml/generico}MunicipioEntidade_t"/>
 *         &lt;element name="VlFGTS" type="{http://www.tce.sp.gov.br/audesp/xml/generico}DecimalPositivo_t"/>
 *         &lt;element name="VlContribPrevGeralAgPolitico" type="{http://www.tce.sp.gov.br/audesp/xml/generico}DecimalPositivo_t"/>
 *         &lt;element name="VlContribPrevProprioAgPolitico" type="{http://www.tce.sp.gov.br/audesp/xml/generico}DecimalPositivo_t"/>
 *         &lt;element name="VlContribPrevGeralAgNaoPolitico" type="{http://www.tce.sp.gov.br/audesp/xml/generico}DecimalPositivo_t"/>
 *         &lt;element name="VlContribPrevProprioAgNaoPolitico" type="{http://www.tce.sp.gov.br/audesp/xml/generico}DecimalPositivo_t"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResumoFolha", namespace = "http://www.tce.sp.gov.br/audesp/xml/remuneracao", propOrder = {
    "municipioEntidadeLotacao",
    "vlFGTS",
    "vlContribPrevGeralAgPolitico",
    "vlContribPrevProprioAgPolitico",
    "vlContribPrevGeralAgNaoPolitico",
    "vlContribPrevProprioAgNaoPolitico"
})
public class ResumoFolha {

    @XmlElement(name = "MunicipioEntidadeLotacao", required = true)
    protected MunicipioEntidadeT municipioEntidadeLotacao;
    @XmlElement(name = "VlFGTS", required = true)
    protected BigDecimal vlFGTS;
    @XmlElement(name = "VlContribPrevGeralAgPolitico", required = true)
    protected BigDecimal vlContribPrevGeralAgPolitico;
    @XmlElement(name = "VlContribPrevProprioAgPolitico", required = true)
    protected BigDecimal vlContribPrevProprioAgPolitico;
    @XmlElement(name = "VlContribPrevGeralAgNaoPolitico", required = true)
    protected BigDecimal vlContribPrevGeralAgNaoPolitico;
    @XmlElement(name = "VlContribPrevProprioAgNaoPolitico", required = true)
    protected BigDecimal vlContribPrevProprioAgNaoPolitico;

    /**
     * Obtém o valor da propriedade municipioEntidadeLotacao.
     * 
     * @return
     *     possible object is
     *     {@link MunicipioEntidadeT }
     *     
     */
    public MunicipioEntidadeT getMunicipioEntidadeLotacao() {
        return municipioEntidadeLotacao;
    }

    /**
     * Define o valor da propriedade municipioEntidadeLotacao.
     * 
     * @param value
     *     allowed object is
     *     {@link MunicipioEntidadeT }
     *     
     */
    public void setMunicipioEntidadeLotacao(MunicipioEntidadeT value) {
        this.municipioEntidadeLotacao = value;
    }

    /**
     * Obtém o valor da propriedade vlFGTS.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlFGTS() {
        return vlFGTS;
    }

    /**
     * Define o valor da propriedade vlFGTS.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlFGTS(BigDecimal value) {
        this.vlFGTS = value;
    }

    /**
     * Obtém o valor da propriedade vlContribPrevGeralAgPolitico.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlContribPrevGeralAgPolitico() {
        return vlContribPrevGeralAgPolitico;
    }

    /**
     * Define o valor da propriedade vlContribPrevGeralAgPolitico.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlContribPrevGeralAgPolitico(BigDecimal value) {
        this.vlContribPrevGeralAgPolitico = value;
    }

    /**
     * Obtém o valor da propriedade vlContribPrevProprioAgPolitico.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlContribPrevProprioAgPolitico() {
        return vlContribPrevProprioAgPolitico;
    }

    /**
     * Define o valor da propriedade vlContribPrevProprioAgPolitico.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlContribPrevProprioAgPolitico(BigDecimal value) {
        this.vlContribPrevProprioAgPolitico = value;
    }

    /**
     * Obtém o valor da propriedade vlContribPrevGeralAgNaoPolitico.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlContribPrevGeralAgNaoPolitico() {
        return vlContribPrevGeralAgNaoPolitico;
    }

    /**
     * Define o valor da propriedade vlContribPrevGeralAgNaoPolitico.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlContribPrevGeralAgNaoPolitico(BigDecimal value) {
        this.vlContribPrevGeralAgNaoPolitico = value;
    }

    /**
     * Obtém o valor da propriedade vlContribPrevProprioAgNaoPolitico.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlContribPrevProprioAgNaoPolitico() {
        return vlContribPrevProprioAgNaoPolitico;
    }

    /**
     * Define o valor da propriedade vlContribPrevProprioAgNaoPolitico.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlContribPrevProprioAgNaoPolitico(BigDecimal value) {
        this.vlContribPrevProprioAgNaoPolitico = value;
    }

}
