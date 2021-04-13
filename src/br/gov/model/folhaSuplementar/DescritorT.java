//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.01.18 às 01:54:03 PM BRST 
//


package br.gov.model.folhaSuplementar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de Descritor_t complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
@XmlType(name = "Descritor_t",  namespace = "http://www.tce.sp.gov.br/audesp/xml/generico",propOrder = {
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
    @XmlSchemaType(name = "integer")
    protected int anoExercicio;
    @XmlElement(name = "TipoDocumento", required = true)
    @XmlSchemaType(name = "string")
    protected TipoDocumentoT tipoDocumento;
    @XmlElement(name = "Entidade")
    @XmlSchemaType(name = "integer")
    protected int entidade;
    @XmlElement(name = "Municipio", required = true)
    protected String municipio;
    @XmlElement(name = "DataCriacaoXML", required = true)
    @XmlSchemaType(name = "date")
    protected String  dataCriacaoXML;

    /**
     * Obtém o valor da propriedade anoExercicio.
     * 
     */
    public int getAnoExercicio() {
        return anoExercicio;
    }

    /**
     * Define o valor da propriedade anoExercicio.
     * 
     */
    public void setAnoExercicio(int value) {
        this.anoExercicio = value;
    }

    /**
     * Obtém o valor da propriedade tipoDocumento.
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
     * Define o valor da propriedade tipoDocumento.
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
     * Obtém o valor da propriedade entidade.
     * 
     */
    public int getEntidade() {
        return entidade;
    }

    /**
     * Define o valor da propriedade entidade.
     * 
     */
    public void setEntidade(int value) {
        this.entidade = value;
    }

    /**
     * Obtém o valor da propriedade municipio.
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
     * Define o valor da propriedade municipio.
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
     * Obtém o valor da propriedade dataCriacaoXML.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String  getDataCriacaoXML() {
        return dataCriacaoXML;
    }

    /**
     * Define o valor da propriedade dataCriacaoXML.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCriacaoXML(String  value) {
        this.dataCriacaoXML = value;
    }

}
