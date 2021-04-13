//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.01.18 às 01:55:17 PM BRST 
//


package br.gov.model.verbasRemuneratorias;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de VerbasRemuneratorias_t complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VerbasRemuneratorias_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Codigo" type="{http://www.tce.sp.gov.br/audesp/xml/atospessoal}CodigoAlphaNumericoPontoBarraTraco_t"/>
 *         &lt;element name="Nome">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EntraNoCalculoDoTetoConstitucional" type="{http://www.tce.sp.gov.br/audesp/xml/atospessoal}EntraNoCalculoDoTetoConstitucional_t"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerbasRemuneratorias_t", namespace = "http://www.tce.sp.gov.br/audesp/xml/remuneracao", propOrder = {
    "codigo",
    "nome",
    "entraNoCalculoDoTetoConstitucional"
})
public class VerbasRemuneratoriasT {

    @XmlElement(name = "Codigo", required = true)
    protected String codigo;
    @XmlElement(name = "Nome", required = true)
    protected String nome;
    @XmlElement(name = "EntraNoCalculoDoTetoConstitucional")
    protected short entraNoCalculoDoTetoConstitucional;

    /**
     * Obtém o valor da propriedade codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define o valor da propriedade codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Obtém o valor da propriedade entraNoCalculoDoTetoConstitucional.
     * 
     */
    public short getEntraNoCalculoDoTetoConstitucional() {
        return entraNoCalculoDoTetoConstitucional;
    }

    /**
     * Define o valor da propriedade entraNoCalculoDoTetoConstitucional.
     * 
     */
    public void setEntraNoCalculoDoTetoConstitucional(short value) {
        this.entraNoCalculoDoTetoConstitucional = value;
    }

}
