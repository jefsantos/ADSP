//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.01.18 às 01:54:56 PM BRST 
//


package br.gov.model.resumoFolha;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DescritorPlanejamento_t complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DescritorPlanejamento_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tce.sp.gov.br/audesp/xml/generico}Descritor_t">
 *       &lt;sequence>
 *         &lt;element name="CicloOrcamento" type="{http://www.tce.sp.gov.br/audesp/xml/generico}CicloOrcamento_t"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescritorPlanejamento_t", propOrder = {
    "cicloOrcamento"
})
public class DescritorPlanejamentoT
    extends DescritorT
{

    @XmlElement(name = "CicloOrcamento", required = true)
    protected String cicloOrcamento;

    /**
     * Obtém o valor da propriedade cicloOrcamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCicloOrcamento() {
        return cicloOrcamento;
    }

    /**
     * Define o valor da propriedade cicloOrcamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCicloOrcamento(String value) {
        this.cicloOrcamento = value;
    }

}
