//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa??o de Refer?ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica??es neste arquivo ser?o perdidas ap?s a recompila??o do esquema de origem. 
// Gerado em: 2019.01.18 ?s 01:58:02 PM BRST 
//


package br.gov.model.genericoAtosPessoais2019;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CNPJ_t complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte?do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CNPJ_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Numero">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[0-9]{14}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Tipo" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="01" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CNPJ_t", propOrder = {
    "numero"
})
public class CNPJT {

    @XmlElement(name = "Numero", required = true)
    protected String numero;
    @XmlAttribute(name = "Tipo", required = true)
    protected String tipo;

    /**
     * Obt?m o valor da propriedade numero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Define o valor da propriedade numero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Obt?m o valor da propriedade tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        if (tipo == null) {
            return "01";
        } else {
            return tipo;
        }
    }

    /**
     * Define o valor da propriedade tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

}
