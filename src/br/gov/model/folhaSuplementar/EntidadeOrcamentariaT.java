//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2019.01.18 �s 01:54:03 PM BRST 
//


package br.gov.model.folhaSuplementar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de EntidadeOrcamentaria_t complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EntidadeOrcamentaria_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Orgao" type="{http://www.tce.sp.gov.br/audesp/xml/generico}CodigoEntidade_t"/>
 *         &lt;element name="UO" type="{http://www.tce.sp.gov.br/audesp/xml/generico}CodigoEntidadeContabil_t"/>
 *         &lt;element name="UE" type="{http://www.tce.sp.gov.br/audesp/xml/generico}CodigoEntidadeContabil_t"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntidadeOrcamentaria_t", propOrder = {
    "orgao",
    "uo",
    "ue"
})
public class EntidadeOrcamentariaT {

    @XmlElement(name = "Orgao")
    @XmlSchemaType(name = "integer")
    protected int orgao;
    @XmlElement(name = "UO")
    @XmlSchemaType(name = "integer")
    protected int uo;
    @XmlElement(name = "UE")
    @XmlSchemaType(name = "integer")
    protected int ue;

    /**
     * Obt�m o valor da propriedade orgao.
     * 
     */
    public int getOrgao() {
        return orgao;
    }

    /**
     * Define o valor da propriedade orgao.
     * 
     */
    public void setOrgao(int value) {
        this.orgao = value;
    }

    /**
     * Obt�m o valor da propriedade uo.
     * 
     */
    public int getUO() {
        return uo;
    }

    /**
     * Define o valor da propriedade uo.
     * 
     */
    public void setUO(int value) {
        this.uo = value;
    }

    /**
     * Obt�m o valor da propriedade ue.
     * 
     */
    public int getUE() {
        return ue;
    }

    /**
     * Define o valor da propriedade ue.
     * 
     */
    public void setUE(int value) {
        this.ue = value;
    }

}
