//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.01.18 às 01:58:02 PM BRST 
//


package br.gov.model.genericoAtosPessoais2019;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PossuiAutorizacaoJudicialReceberAcimaTetoSim_t complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PossuiAutorizacaoJudicialReceberAcimaTetoSim_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PossuiAutorizacaoJudicialReceberAcimaTeto">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;enumeration value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NumeroProcessoJudicial" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PossuiAutorizacaoJudicialReceberAcimaTetoSim_t", namespace = "http://www.tce.sp.gov.br/audesp/xml/atospessoal", propOrder = {
    "possuiAutorizacaoJudicialReceberAcimaTeto",
    "numeroProcessoJudicial"
})
public class PossuiAutorizacaoJudicialReceberAcimaTetoSimT {

    @XmlElement(name = "PossuiAutorizacaoJudicialReceberAcimaTeto")
    protected short possuiAutorizacaoJudicialReceberAcimaTeto;
    @XmlElement(name = "NumeroProcessoJudicial", required = true)
    protected Object numeroProcessoJudicial;

    /**
     * Obtém o valor da propriedade possuiAutorizacaoJudicialReceberAcimaTeto.
     * 
     */
    public short getPossuiAutorizacaoJudicialReceberAcimaTeto() {
        return possuiAutorizacaoJudicialReceberAcimaTeto;
    }

    /**
     * Define o valor da propriedade possuiAutorizacaoJudicialReceberAcimaTeto.
     * 
     */
    public void setPossuiAutorizacaoJudicialReceberAcimaTeto(short value) {
        this.possuiAutorizacaoJudicialReceberAcimaTeto = value;
    }

    /**
     * Obtém o valor da propriedade numeroProcessoJudicial.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNumeroProcessoJudicial() {
        return numeroProcessoJudicial;
    }

    /**
     * Define o valor da propriedade numeroProcessoJudicial.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNumeroProcessoJudicial(Object value) {
        this.numeroProcessoJudicial = value;
    }

}
