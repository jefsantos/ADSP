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
@XmlType(name = "PossuiAutorizacaoJudicialReceberAcimaTetoSim_t", namespace = "http://www.tce.sp.gov.br/audesp/xml/atospessoal", propOrder = {
    "possuiAutorizacaoJudicialReceberAcimaTeto",
    "numeroProcessoJudicial"
})
public class PossuiAutorizacaoJudicialReceberAcimaTetoSimT {

    @XmlElement(name = "PossuiAutorizacaoJudicialReceberAcimaTeto")
    protected short possuiAutorizacaoJudicialReceberAcimaTeto;
    @XmlElement(name = "NumeroProcessoJudicial", required = true)
    protected Object numeroProcessoJudicial;

     
    public short getPossuiAutorizacaoJudicialReceberAcimaTeto() {
        return possuiAutorizacaoJudicialReceberAcimaTeto;
    }

     
    public void setPossuiAutorizacaoJudicialReceberAcimaTeto(short value) {
        this.possuiAutorizacaoJudicialReceberAcimaTeto = value;
    }

     
    public Object getNumeroProcessoJudicial() {
        return numeroProcessoJudicial;
    }

     
    public void setNumeroProcessoJudicial(Object value) {
        this.numeroProcessoJudicial = value;
    }

}