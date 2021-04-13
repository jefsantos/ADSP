//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.13 at 05:30:46 PM BRT 
//


package br.gov.bean.verbasRemuneratorias;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for IdentificacaoPensionista_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentificacaoPensionista_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Nome">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DataNascimento" type="{http://www.tce.sp.gov.br/audesp/xml/generico}DataNascimentoValida_t"/>
 *         &lt;element name="CPF" type="{http://www.tce.sp.gov.br/audesp/xml/generico}CPF_t"/>
 *         &lt;element name="QualificacaoPensionista" type="{http://www.tce.sp.gov.br/audesp/xml/atospessoal}TipoQualificacaoPensionista_t"/>
 *         &lt;element name="OutraQualificacaoPensionista" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;sequence>
 *           &lt;element name="MunicipioLotacaoAgentePublico" type="{http://www.tce.sp.gov.br/audesp/xml/generico}CodigoMunicipio_t"/>
 *           &lt;element name="EntidadeLotacaoAgentePublico" type="{http://www.tce.sp.gov.br/audesp/xml/generico}CodigoEntidade_t"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificacaoPensionista_t", namespace = "http://www.tce.sp.gov.br/audesp/xml/atospessoal", propOrder = {
    "nome",
    "dataNascimento",
    "cpf",
    "qualificacaoPensionista",
    "outraQualificacaoPensionista",
    "municipioLotacaoAgentePublico",
    "entidadeLotacaoAgentePublico"
})
public class IdentificacaoPensionistaT {

    @XmlElement(name = "Nome", required = true)
    protected String nome;
    @XmlElement(name = "DataNascimento", required = true)
    protected XMLGregorianCalendar dataNascimento;
    @XmlElement(name = "CPF", required = true)
    protected CPFT cpf;
    @XmlElement(name = "QualificacaoPensionista")
    protected short qualificacaoPensionista;
    @XmlElement(name = "OutraQualificacaoPensionista")
    protected String outraQualificacaoPensionista;
    @XmlElement(name = "MunicipioLotacaoAgentePublico", required = true)
    protected String municipioLotacaoAgentePublico;
    @XmlElement(name = "EntidadeLotacaoAgentePublico")
    protected int entidadeLotacaoAgentePublico;

    /**
     * Gets the value of the nome property.
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
     * Sets the value of the nome property.
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
     * Gets the value of the dataNascimento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataNascimento() {
        return dataNascimento;
    }

    /**
     * Sets the value of the dataNascimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataNascimento(XMLGregorianCalendar value) {
        this.dataNascimento = value;
    }

    /**
     * Gets the value of the cpf property.
     * 
     * @return
     *     possible object is
     *     {@link CPFT }
     *     
     */
    public CPFT getCPF() {
        return cpf;
    }

    /**
     * Sets the value of the cpf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPFT }
     *     
     */
    public void setCPF(CPFT value) {
        this.cpf = value;
    }

    /**
     * Gets the value of the qualificacaoPensionista property.
     * 
     */
    public short getQualificacaoPensionista() {
        return qualificacaoPensionista;
    }

    /**
     * Sets the value of the qualificacaoPensionista property.
     * 
     */
    public void setQualificacaoPensionista(short value) {
        this.qualificacaoPensionista = value;
    }

    /**
     * Gets the value of the outraQualificacaoPensionista property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutraQualificacaoPensionista() {
        return outraQualificacaoPensionista;
    }

    /**
     * Sets the value of the outraQualificacaoPensionista property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutraQualificacaoPensionista(String value) {
        this.outraQualificacaoPensionista = value;
    }

    /**
     * Gets the value of the municipioLotacaoAgentePublico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipioLotacaoAgentePublico() {
        return municipioLotacaoAgentePublico;
    }

    /**
     * Sets the value of the municipioLotacaoAgentePublico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipioLotacaoAgentePublico(String value) {
        this.municipioLotacaoAgentePublico = value;
    }

    /**
     * Gets the value of the entidadeLotacaoAgentePublico property.
     * 
     */
    public int getEntidadeLotacaoAgentePublico() {
        return entidadeLotacaoAgentePublico;
    }

    /**
     * Sets the value of the entidadeLotacaoAgentePublico property.
     * 
     */
    public void setEntidadeLotacaoAgentePublico(int value) {
        this.entidadeLotacaoAgentePublico = value;
    }

}
