//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.01.23 às 11:30:00 AM BRST 
//


package br.gov.model.generico2018;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DescritorPPA_t complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DescritorPPA_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tce.sp.gov.br/audesp/xml/generico}Descritor_t">
 *       &lt;sequence>
 *         &lt;element name="AnoInicioPPA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="2018"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "DescritorPPA_t", propOrder = {
    "anoInicioPPA"
})
@XmlSeeAlso({
    DescritorPPAAtualizacaoT.class
})
public class DescritorPPAT
    extends DescritorT
{

    @XmlElement(name = "AnoInicioPPA", required = true)
    protected String anoInicioPPA;

    /**
     * Obtém o valor da propriedade anoInicioPPA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnoInicioPPA() {
        return anoInicioPPA;
    }

    /**
     * Define o valor da propriedade anoInicioPPA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnoInicioPPA(String value) {
        this.anoInicioPPA = value;
    }

}
