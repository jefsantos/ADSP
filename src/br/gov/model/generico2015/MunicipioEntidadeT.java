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
@XmlType(name = "MunicipioEntidade_t", propOrder = {
    "codigoMunicipio",
    "codigoEntidade"
})
public class MunicipioEntidadeT {

    @XmlElement(required = true)
    protected String codigoMunicipio;
    protected int codigoEntidade;

     
    public String getCodigoMunicipio() {
        return codigoMunicipio;
    }

     
    public void setCodigoMunicipio(String value) {
        this.codigoMunicipio = value;
    }

     
    public int getCodigoEntidade() {
        return codigoEntidade;
    }

     
    public void setCodigoEntidade(int value) {
        this.codigoEntidade = value;
    }

}
