//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.14 at 03:23:37 PM BRST 
//


package br.gov.model.generico2016;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntidadeOrcamentaria_t", propOrder = {
    "orgao",
    "uo",
    "ue"
})
public class EntidadeOrcamentariaT {

    @XmlElement(name = "Orgao")
    protected int orgao;
    @XmlElement(name = "UO")
    protected int uo;
    @XmlElement(name = "UE")
    protected int ue;

     
    public int getOrgao() {
        return orgao;
    }

     
    public void setOrgao(int value) {
        this.orgao = value;
    }

     
    public int getUO() {
        return uo;
    }

     
    public void setUO(int value) {
        this.uo = value;
    }

     
    public int getUE() {
        return ue;
    }

     
    public void setUE(int value) {
        this.ue = value;
    }

}
