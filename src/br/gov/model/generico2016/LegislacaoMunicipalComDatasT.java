//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.14 at 03:23:20 PM BRST 
//


package br.gov.model.generico2016;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegislacaoMunicipalComDatas_t", namespace = "http://www.tce.sp.gov.br/audesp/xml/auxiliar", propOrder = {
    "dataPublicacao",
    "dataVigencia"
})
public class LegislacaoMunicipalComDatasT
    extends LegislacaoMunicipalT
{

    @XmlElement(name = "DataPublicacao", required = true)
    protected XMLGregorianCalendar dataPublicacao;
    @XmlElement(name = "DataVigencia", required = true)
    protected XMLGregorianCalendar dataVigencia;

     
    public XMLGregorianCalendar getDataPublicacao() {
        return dataPublicacao;
    }

     
    public void setDataPublicacao(XMLGregorianCalendar value) {
        this.dataPublicacao = value;
    }

     
    public XMLGregorianCalendar getDataVigencia() {
        return dataVigencia;
    }

     
    public void setDataVigencia(XMLGregorianCalendar value) {
        this.dataVigencia = value;
    }

}
