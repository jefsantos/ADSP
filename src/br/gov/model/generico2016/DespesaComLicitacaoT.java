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


 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DespesaComLicitacao_t", namespace = "http://www.tce.sp.gov.br/audesp/xml/auxiliar", propOrder = {
    "codigoComLicitacao",
    "numeroLicitacao"
})
public class DespesaComLicitacaoT {

    @XmlElement(name = "CodigoComLicitacao", required = true)
    protected String codigoComLicitacao;
    @XmlElement(name = "NumeroLicitacao", required = true)
    protected String numeroLicitacao;

     
    public String getCodigoComLicitacao() {
        return codigoComLicitacao;
    }

     
    public void setCodigoComLicitacao(String value) {
        this.codigoComLicitacao = value;
    }

     
    public String getNumeroLicitacao() {
        return numeroLicitacao;
    }

     
    public void setNumeroLicitacao(String value) {
        this.numeroLicitacao = value;
    }

}
