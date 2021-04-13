//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.01.18 às 01:51:26 PM BRST 
//


package br.gov.model.generico2019;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de IdentificacaoPensionista_t complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
    @XmlSchemaType(name = "date")
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
    @XmlSchemaType(name = "integer")
    protected int entidadeLotacaoAgentePublico;

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
     * Obtém o valor da propriedade dataNascimento.
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
     * Define o valor da propriedade dataNascimento.
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
     * Obtém o valor da propriedade cpf.
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
     * Define o valor da propriedade cpf.
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
     * Obtém o valor da propriedade qualificacaoPensionista.
     * 
     */
    public short getQualificacaoPensionista() {
        return qualificacaoPensionista;
    }

    /**
     * Define o valor da propriedade qualificacaoPensionista.
     * 
     */
    public void setQualificacaoPensionista(short value) {
        this.qualificacaoPensionista = value;
    }

    /**
     * Obtém o valor da propriedade outraQualificacaoPensionista.
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
     * Define o valor da propriedade outraQualificacaoPensionista.
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
     * Obtém o valor da propriedade municipioLotacaoAgentePublico.
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
     * Define o valor da propriedade municipioLotacaoAgentePublico.
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
     * Obtém o valor da propriedade entidadeLotacaoAgentePublico.
     * 
     */
    public int getEntidadeLotacaoAgentePublico() {
        return entidadeLotacaoAgentePublico;
    }

    /**
     * Define o valor da propriedade entidadeLotacaoAgentePublico.
     * 
     */
    public void setEntidadeLotacaoAgentePublico(int value) {
        this.entidadeLotacaoAgentePublico = value;
    }

}
