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
@XmlType(name = "IdentificacaoIndividual_t", propOrder = {
    "cnpj",
    "cpf",
    "identificacaoEspecial"
})
public class IdentificacaoIndividualT {

    @XmlElement(name = "CNPJ")
    protected CNPJT cnpj;
    @XmlElement(name = "CPF")
    protected CPFT cpf;
    @XmlElement(name = "IdentificacaoEspecial")
    protected IdentificacaoEspecialT identificacaoEspecial;

     
    public CNPJT getCNPJ() {
        return cnpj;
    }

     
    public void setCNPJ(CNPJT value) {
        this.cnpj = value;
    }

     
    public CPFT getCPF() {
        return cpf;
    }

     
    public void setCPF(CPFT value) {
        this.cpf = value;
    }

     
    public IdentificacaoEspecialT getIdentificacaoEspecial() {
        return identificacaoEspecial;
    }

     
    public void setIdentificacaoEspecial(IdentificacaoEspecialT value) {
        this.identificacaoEspecial = value;
    }

}