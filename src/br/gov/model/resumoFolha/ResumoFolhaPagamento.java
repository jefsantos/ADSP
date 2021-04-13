//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.01.18 às 01:54:56 PM BRST 
//


package br.gov.model.resumoFolha;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ResumoFolhaPagamento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ResumoFolhaPagamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Descritor" type="{http://www.tce.sp.gov.br/audesp/xml/generico}DescritorMensal_t"/>
 *         &lt;element name="ListaResumoFolhaPagamento" type="{http://www.tce.sp.gov.br/audesp/xml/remuneracao}ResumoFolha" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResumoFolhaPagamento", namespace = "http://www.tce.sp.gov.br/audesp/xml/remuneracao", propOrder = {
    "descritor",
    "listaResumoFolhaPagamento"
})

@XmlRootElement(name ="ResumoMensalFolhaPagamento")
public class ResumoFolhaPagamento {

    @XmlElement(name = "Descritor", required = true)
    protected DescritorMensalT descritor;
    @XmlElement(name = "ListaResumoFolhaPagamento", required = true)
    protected List<ResumoFolha> listaResumoFolhaPagamento;

    /**
     * Obtém o valor da propriedade descritor.
     * 
     * @return
     *     possible object is
     *     {@link DescritorMensalT }
     *     
     */
    public DescritorMensalT getDescritor() {
        return descritor;
    }

    /**
     * Define o valor da propriedade descritor.
     * 
     * @param value
     *     allowed object is
     *     {@link DescritorMensalT }
     *     
     */
    public void setDescritor(DescritorMensalT value) {
        this.descritor = value;
    }

    /**
     * Gets the value of the listaResumoFolhaPagamento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaResumoFolhaPagamento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaResumoFolhaPagamento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResumoFolha }
     * 
     * 
     */
    public List<ResumoFolha> getListaResumoFolhaPagamento() {
        if (listaResumoFolhaPagamento == null) {
            listaResumoFolhaPagamento = new ArrayList<ResumoFolha>();
        }
        return this.listaResumoFolhaPagamento;
    }

}
