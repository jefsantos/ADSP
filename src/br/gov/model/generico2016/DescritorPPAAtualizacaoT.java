//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.14 at 03:23:37 PM BRST 
//


package br.gov.model.generico2016;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescritorPPAAtualizacao_t", propOrder = {
    "mesExercicio"
})
public class DescritorPPAAtualizacaoT
    extends DescritorPPAT
{

    @XmlElement(name = "MesExercicio", required = true)
    protected BigInteger mesExercicio;

     
    public BigInteger getMesExercicio() {
        return mesExercicio;
    }

     
    public void setMesExercicio(BigInteger value) {
        this.mesExercicio = value;
    }

}