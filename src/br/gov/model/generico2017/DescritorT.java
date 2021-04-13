//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.13 at 05:43:01 PM BRT 
//


package br.gov.model.generico2017;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Descritor_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Descritor_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AnoExercicio" type="{http://www.tce.sp.gov.br/audesp/xml/generico}AnoDoc_t"/>
 *         &lt;element name="TipoDocumento" type="{http://www.tce.sp.gov.br/audesp/xml/generico}TipoDocumento_t"/>
 *         &lt;element name="Entidade" type="{http://www.tce.sp.gov.br/audesp/xml/generico}CodigoEntidade_t"/>
 *         &lt;element name="Municipio" type="{http://www.tce.sp.gov.br/audesp/xml/generico}CodigoMunicipio_t"/>
 *         &lt;element name="DataCriacaoXML" type="{http://www.tce.sp.gov.br/audesp/xml/generico}DataValida_t"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Descritor_t", propOrder = {
    "anoExercicio",
    "tipoDocumento",
    "entidade",
    "municipio",
    "dataCriacaoXML"
})
@XmlSeeAlso({
    DescritorPlanejamentoAtualizacaoT.class,
    DescritorContabil13T.class,
    DescritorContabilT.class,
    DescritorContasAnuaisT.class,
    DescritorPPAT.class,
    DescritorQuadrimestreT.class,
    DescritorPlanejamentoT.class,
    DescritorContabil14T.class,
    DescritorMensalT.class
})
public class DescritorT {

    @XmlElement(name = "AnoExercicio")
    protected int anoExercicio;
    @XmlElement(name = "TipoDocumento", required = true)
    protected TipoDocumentoT tipoDocumento;
    @XmlElement(name = "Entidade")
    protected int entidade;
    @XmlElement(name = "Municipio", required = true)
    protected String municipio;
    @XmlElement(name = "DataCriacaoXML", required = true)
    protected XMLGregorianCalendar dataCriacaoXML;

    /**
     * Gets the value of the anoExercicio property.
     * 
     */
    public int getAnoExercicio() {
        return anoExercicio;
    }

    /**
     * Sets the value of the anoExercicio property.
     * 
     */
    public void setAnoExercicio(int value) {
        this.anoExercicio = value;
    }

    /**
     * Gets the value of the tipoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDocumentoT }
     *     
     */
    public TipoDocumentoT getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Sets the value of the tipoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDocumentoT }
     *     
     */
    public void setTipoDocumento(TipoDocumentoT value) {
        this.tipoDocumento = value;
    }

    /**
     * Gets the value of the entidade property.
     * 
     */
    public int getEntidade() {
        return entidade;
    }

    /**
     * Sets the value of the entidade property.
     * 
     */
    public void setEntidade(int value) {
        this.entidade = value;
    }

    /**
     * Gets the value of the municipio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipio() {
        return municipio;
    }

    /**
     * Sets the value of the municipio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipio(String value) {
        this.municipio = value;
    }

    /**
     * Gets the value of the dataCriacaoXML property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataCriacaoXML() {
        return dataCriacaoXML;
    }

    /**
     * Sets the value of the dataCriacaoXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCriacaoXML(XMLGregorianCalendar value) {
        this.dataCriacaoXML = value;
    }

}
