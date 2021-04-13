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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CadastroAposentadoPensionista_t complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CadastroAposentadoPensionista_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Descritor" type="{http://www.tce.sp.gov.br/audesp/xml/generico}Descritor_t"/>
 *         &lt;element name="ListaAposentadoriasPensoes" type="{http://www.tce.sp.gov.br/audesp/xml/remuneracao}DadosAposentadoriasPensoes_t" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CadastroAposentadoPensionista_t", namespace = "http://www.tce.sp.gov.br/audesp/xml/remuneracao", propOrder = {
    "descritor",
    "listaAposentadoriasPensoes"
})

@XmlRootElement(name = "CadastroAposentadosPensionistas")
public class CadastroAposentadoPensionistaT {

    @XmlElement(name = "Descritor", required = true)
    protected DescritorT descritor;
    @XmlElement(name = "ListaAposentadoriasPensoes", required = true)
    protected List<DadosAposentadoriasPensoesT> listaAposentadoriasPensoes;

    /**
     * Obtém o valor da propriedade descritor.
     * 
     * @return
     *     possible object is
     *     {@link DescritorT }
     *     
     */
    public DescritorT getDescritor() {
        return descritor;
    }

    /**
     * Define o valor da propriedade descritor.
     * 
     * @param value
     *     allowed object is
     *     {@link DescritorT }
     *     
     */
    public void setDescritor(DescritorT value) {
        this.descritor = value;
    }

    /**
     * Gets the value of the listaAposentadoriasPensoes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaAposentadoriasPensoes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaAposentadoriasPensoes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DadosAposentadoriasPensoesT }
     * 
     * 
     */
    public List<DadosAposentadoriasPensoesT> getListaAposentadoriasPensoes() {
        if (listaAposentadoriasPensoes == null) {
            listaAposentadoriasPensoes = new ArrayList<DadosAposentadoriasPensoesT>();
        }
        return this.listaAposentadoriasPensoes;
    }

}
