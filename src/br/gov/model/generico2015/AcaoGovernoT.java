//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.14 at 03:23:01 PM BRST 
//


package br.gov.model.generico2015;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcaoGoverno_t", propOrder = {
    "numeroAcao",
    "tipoAcao"
})
public class AcaoGovernoT {

    @XmlElement(name = "NumeroAcao")
    protected int numeroAcao;
    @XmlElement(name = "TipoAcao", required = true)
    protected String tipoAcao;

     
    public int getNumeroAcao() {
        return numeroAcao;
    }

     
    public void setNumeroAcao(int value) {
        this.numeroAcao = value;
    }

     
    public String getTipoAcao() {
        return tipoAcao;
    }

     
    public void setTipoAcao(String value) {
        this.tipoAcao = value;
    }

}
