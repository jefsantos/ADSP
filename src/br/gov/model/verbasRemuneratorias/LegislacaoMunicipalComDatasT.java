//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.01.18 às 01:55:17 PM BRST 
//


package br.gov.model.verbasRemuneratorias;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de LegislacaoMunicipalComDatas_t complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="LegislacaoMunicipalComDatas_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tce.sp.gov.br/audesp/xml/auxiliar}LegislacaoMunicipal_t">
 *       &lt;sequence>
 *         &lt;element name="DataPublicacao" type="{http://www.tce.sp.gov.br/audesp/xml/auxiliar}DataLei_t"/>
 *         &lt;element name="DataVigencia" type="{http://www.tce.sp.gov.br/audesp/xml/auxiliar}DataLei_t"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegislacaoMunicipalComDatas_t", namespace = "http://www.tce.sp.gov.br/audesp/xml/auxiliar", propOrder = {
    "dataPublicacao",
    "dataVigencia"
})
public class LegislacaoMunicipalComDatasT
    extends LegislacaoMunicipalT
{

    @XmlElement(name = "DataPublicacao", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataPublicacao;
    @XmlElement(name = "DataVigencia", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataVigencia;

    /**
     * Obtém o valor da propriedade dataPublicacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataPublicacao() {
        return dataPublicacao;
    }

    /**
     * Define o valor da propriedade dataPublicacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataPublicacao(XMLGregorianCalendar value) {
        this.dataPublicacao = value;
    }

    /**
     * Obtém o valor da propriedade dataVigencia.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataVigencia() {
        return dataVigencia;
    }

    /**
     * Define o valor da propriedade dataVigencia.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataVigencia(XMLGregorianCalendar value) {
        this.dataVigencia = value;
    }

}
