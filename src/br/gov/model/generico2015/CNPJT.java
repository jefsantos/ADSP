//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.14 at 03:23:01 PM BRST 
//


package br.gov.model.generico2015;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CNPJ_t", propOrder = {
    "numero"
})
public class CNPJT {

    @XmlElement(name = "Numero", required = true)
    protected String numero;
    @XmlAttribute(name = "Tipo", required = true)
    protected String tipo;

     
    public String getNumero() {
        return numero;
    }

     
    public void setNumero(String value) {
        this.numero = value;
    }

     
    public String getTipo() {
        if (tipo == null) {
            return "01";
        } else {
            return tipo;
        }
    }

     
    public void setTipo(String value) {
        this.tipo = value;
    }

}
