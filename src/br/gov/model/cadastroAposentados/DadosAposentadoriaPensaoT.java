//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.01.18 às 01:53:12 PM BRST 
//


package br.gov.model.cadastroAposentados;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de DadosAposentadoriaPensao_t complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DadosAposentadoriaPensao_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MunicipioEntidade" type="{http://www.tce.sp.gov.br/audesp/xml/generico}MunicipioEntidade_t"/>
 *         &lt;choice>
 *           &lt;element name="CargoOrigem" type="{http://www.tce.sp.gov.br/audesp/xml/atospessoal}NomeMaiusculoAcentuadoComNumerosPontoBarraTraco_t"/>
 *           &lt;element name="SemInformacaoDeCargo" type="{http://www.tce.sp.gov.br/audesp/xml/atospessoal}campoOpcional_t"/>
 *         &lt;/choice>
 *         &lt;element name="DataAposentadoriaPensao" type="{http://www.tce.sp.gov.br/audesp/xml/generico}DataValida_t" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosAposentadoriaPensao_t", namespace = "http://www.tce.sp.gov.br/audesp/xml/remuneracao", propOrder = {
    "municipioEntidade",
    "cargoOrigem",
    "semInformacaoDeCargo",
    "dataAposentadoriaPensao"
})
public class DadosAposentadoriaPensaoT {

    @XmlElement(name = "MunicipioEntidade", required = true)
    protected MunicipioEntidadeT municipioEntidade;
    @XmlElement(name = "CargoOrigem")
    protected String cargoOrigem;
    @XmlElement(name = "SemInformacaoDeCargo")
    protected String semInformacaoDeCargo;
    @XmlElement(name = "DataAposentadoriaPensao")
    @XmlSchemaType(name = "date")
    protected String dataAposentadoriaPensao;

    /**
     * Obtém o valor da propriedade municipioEntidade.
     * 
     * @return
     *     possible object is
     *     {@link MunicipioEntidadeT }
     *     
     */
    public MunicipioEntidadeT getMunicipioEntidade() {
        return municipioEntidade;
    }

    /**
     * Define o valor da propriedade municipioEntidade.
     * 
     * @param value
     *     allowed object is
     *     {@link MunicipioEntidadeT }
     *     
     */
    public void setMunicipioEntidade(MunicipioEntidadeT value) {
        this.municipioEntidade = value;
    }

    /**
     * Obtém o valor da propriedade cargoOrigem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoOrigem() {
        return cargoOrigem;
    }

    /**
     * Define o valor da propriedade cargoOrigem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoOrigem(String value) {
        this.cargoOrigem = value;
    }

    /**
     * Obtém o valor da propriedade semInformacaoDeCargo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSemInformacaoDeCargo() {
        return semInformacaoDeCargo;
    }

    /**
     * Define o valor da propriedade semInformacaoDeCargo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSemInformacaoDeCargo(String value) {
        this.semInformacaoDeCargo = value;
    }

    /**
     * Obtém o valor da propriedade dataAposentadoriaPensao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getDataAposentadoriaPensao() {
        return dataAposentadoriaPensao;
    }

    /**
     * Define o valor da propriedade dataAposentadoriaPensao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAposentadoriaPensao(String value) {
        this.dataAposentadoriaPensao = value;
    }

}
