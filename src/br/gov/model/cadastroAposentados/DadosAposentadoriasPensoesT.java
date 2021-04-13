//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.01.18 às 01:53:12 PM BRST 
//


package br.gov.model.cadastroAposentados;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de DadosAposentadoriasPensoes_t complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DadosAposentadoriasPensoes_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Nome" type="{http://www.tce.sp.gov.br/audesp/xml/atospessoal}NomeMaiusculoAcentuadoComNumerosPontoBarraTraco_t"/>
 *         &lt;element name="CPF" type="{http://www.tce.sp.gov.br/audesp/xml/generico}CPF_t"/>
 *         &lt;element name="DataNascimento" type="{http://www.tce.sp.gov.br/audesp/xml/generico}DataValida_t"/>
 *         &lt;element name="DadosAposentadoriaPensao" type="{http://www.tce.sp.gov.br/audesp/xml/remuneracao}DadosAposentadoriaPensao_t" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosAposentadoriasPensoes_t", namespace = "http://www.tce.sp.gov.br/audesp/xml/remuneracao", propOrder = {
    "nome",
    "cpf",
    "dataNascimento",
    "dadosAposentadoriaPensao"
})
public class DadosAposentadoriasPensoesT {

    @XmlElement(name = "Nome", required = true)
    protected String nome;
    @XmlElement(name = "CPF", required = true)
    protected CPFT cpf;
    @XmlElement(name = "DataNascimento", required = true)
    @XmlSchemaType(name = "date")
    protected String dataNascimento;
    @XmlElement(name = "DadosAposentadoriaPensao", required = true)
    protected List<DadosAposentadoriaPensaoT> dadosAposentadoriaPensao;

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
     * Obtém o valor da propriedade dataNascimento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getDataNascimento() {
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
    public void setDataNascimento(String value) {
        this.dataNascimento = value;
    }

    /**
     * Gets the value of the dadosAposentadoriaPensao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dadosAposentadoriaPensao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDadosAposentadoriaPensao().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DadosAposentadoriaPensaoT }
     * 
     * 
     */
    public List<DadosAposentadoriaPensaoT> getDadosAposentadoriaPensao() {
        if (dadosAposentadoriaPensao == null) {
            dadosAposentadoriaPensao = new ArrayList<DadosAposentadoriaPensaoT>();
        }
        return this.dadosAposentadoriaPensao;
    }

}
