//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.01.18 às 01:53:35 PM BRST 
//


package br.gov.model.folhaOrdinaria;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de FolhaOrdinariaAgentePublico_t complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="FolhaOrdinariaAgentePublico_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Descritor" type="{http://www.tce.sp.gov.br/audesp/xml/generico}DescritorMensal_t"/>
 *         &lt;element name="IdentificacaoAgentePublico" type="{http://www.tce.sp.gov.br/audesp/xml/remuneracao}IdentificacaoAgentePublicoExt_t" maxOccurs="unbounded"/>
 *         &lt;element name="IdentificacaoPensionista" type="{http://www.tce.sp.gov.br/audesp/xml/remuneracao}IdentificacaoPensionistaExt_t" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FolhaOrdinariaAgentePublico_t", namespace = "http://www.tce.sp.gov.br/audesp/xml/remuneracao", propOrder = {
    "descritor",
    "identificacaoAgentePublico",
    "identificacaoPensionista"
})

@XmlRootElement(name = "FolhaOrdinariaAgentePublico")
public class FolhaOrdinariaAgentePublicoT {

    @XmlElement(name = "Descritor", required = true)
    protected DescritorMensalT descritor;
    @XmlElement(name = "IdentificacaoAgentePublico", required = true)
    protected List<IdentificacaoAgentePublicoExtT> identificacaoAgentePublico;
    @XmlElement(name = "IdentificacaoPensionista")
    protected List<IdentificacaoPensionistaExtT> identificacaoPensionista;

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
     * Gets the value of the identificacaoAgentePublico property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identificacaoAgentePublico property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentificacaoAgentePublico().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentificacaoAgentePublicoExtT }
     * 
     * 
     */
    public List<IdentificacaoAgentePublicoExtT> getIdentificacaoAgentePublico() {
        if (identificacaoAgentePublico == null) {
            identificacaoAgentePublico = new ArrayList<IdentificacaoAgentePublicoExtT>();
        }
        return this.identificacaoAgentePublico;
    }

    /**
     * Gets the value of the identificacaoPensionista property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identificacaoPensionista property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentificacaoPensionista().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentificacaoPensionistaExtT }
     * 
     * 
     */
    public List<IdentificacaoPensionistaExtT> getIdentificacaoPensionista() {
        if (identificacaoPensionista == null) {
            identificacaoPensionista = new ArrayList<IdentificacaoPensionistaExtT>();
        }
        return this.identificacaoPensionista;
    }

}
