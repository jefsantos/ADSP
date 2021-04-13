////
//// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
//// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
//// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
//// Gerado em: 2019.01.21 às 10:09:53 AM BRST 
////
//
//
//package br.gov.model.pagamento;
//
//import java.util.ArrayList;
//import java.util.List;
//import javax.xml.bind.annotation.XmlAccessType;
//import javax.xml.bind.annotation.XmlAccessorType;
//import javax.xml.bind.annotation.XmlElement;
//import javax.xml.bind.annotation.XmlSchemaType;
//import javax.xml.bind.annotation.XmlType;
//
//
///**
// * <p>Classe Java de PagamentoFolhaOrdinariaAgentePublico_t complex type.
// * 
// * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
// * 
// * <pre>
// * &lt;complexType name="PagamentoFolhaOrdinariaAgentePublico_t">
// *   &lt;complexContent>
// *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
// *       &lt;sequence>
// *         &lt;element name="Descritor" type="{http://www.tce.sp.gov.br/audesp/xml/generico}DescritorMensal_t"/>
// *         &lt;element name="AnoPagamento" type="{http://www.tce.sp.gov.br/audesp/xml/generico}Ano_t"/>
// *         &lt;element name="MesPagamento" type="{http://www.tce.sp.gov.br/audesp/xml/generico}Mes_t"/>
// *         &lt;element name="IdentificacaoAgentePublico" type="{http://www.tce.sp.gov.br/audesp/xml/remuneracao}IdentificacaoAgentePublico_t2" maxOccurs="unbounded"/>
// *         &lt;element name="IdentificacaoPensionista" type="{http://www.tce.sp.gov.br/audesp/xml/remuneracao}IdentificacaoPensionista_t2" maxOccurs="unbounded" minOccurs="0"/>
// *       &lt;/sequence>
// *     &lt;/restriction>
// *   &lt;/complexContent>
// * &lt;/complexType>
// * </pre>
// * 
// * 
// */
//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "PagamentoFolhaOrdinariaAgentePublico_t", namespace = "http://www.tce.sp.gov.br/audesp/xml/remuneracao", propOrder = {
//    "descritor",
//    "anoPagamento",
//    "mesPagamento",
//    "identificacaoAgentePublico",
//    "identificacaoPensionista"
//})
//public class PagamentoFolhaOrdinariaAgentePublicoT {
//
//    @XmlElement(name = "Descritor", required = true)
//    protected DescritorMensalT descritor;
//    @XmlElement(name = "AnoPagamento")
//    @XmlSchemaType(name = "integer")
//    protected int anoPagamento;
//    @XmlElement(name = "MesPagamento")
//    @XmlSchemaType(name = "integer")
//    protected int mesPagamento;
//    @XmlElement(name = "IdentificacaoAgentePublico", required = true)
//    protected List<IdentificacaoAgentePublicoT2> identificacaoAgentePublico;
//    @XmlElement(name = "IdentificacaoPensionista")
//    protected List<IdentificacaoPensionistaT2> identificacaoPensionista;
//
//    /**
//     * Obtém o valor da propriedade descritor.
//     * 
//     * @return
//     *     possible object is
//     *     {@link DescritorMensalT }
//     *     
//     */
//    public DescritorMensalT getDescritor() {
//        return descritor;
//    }
//
//    /**
//     * Define o valor da propriedade descritor.
//     * 
//     * @param value
//     *     allowed object is
//     *     {@link DescritorMensalT }
//     *     
//     */
//    public void setDescritor(DescritorMensalT value) {
//        this.descritor = value;
//    }
//
//    /**
//     * Obtém o valor da propriedade anoPagamento.
//     * 
//     */
//    public int getAnoPagamento() {
//        return anoPagamento;
//    }
//
//    /**
//     * Define o valor da propriedade anoPagamento.
//     * 
//     */
//    public void setAnoPagamento(int value) {
//        this.anoPagamento = value;
//    }
//
//    /**
//     * Obtém o valor da propriedade mesPagamento.
//     * 
//     */
//    public int getMesPagamento() {
//        return mesPagamento;
//    }
//
//    /**
//     * Define o valor da propriedade mesPagamento.
//     * 
//     */
//    public void setMesPagamento(int value) {
//        this.mesPagamento = value;
//    }
//
//    /**
//     * Gets the value of the identificacaoAgentePublico property.
//     * 
//     * <p>
//     * This accessor method returns a reference to the live list,
//     * not a snapshot. Therefore any modification you make to the
//     * returned list will be present inside the JAXB object.
//     * This is why there is not a <CODE>set</CODE> method for the identificacaoAgentePublico property.
//     * 
//     * <p>
//     * For example, to add a new item, do as follows:
//     * <pre>
//     *    getIdentificacaoAgentePublico().add(newItem);
//     * </pre>
//     * 
//     * 
//     * <p>
//     * Objects of the following type(s) are allowed in the list
//     * {@link IdentificacaoAgentePublicoT2 }
//     * 
//     * 
//     */
//    public List<IdentificacaoAgentePublicoT2> getIdentificacaoAgentePublico() {
//        if (identificacaoAgentePublico == null) {
//            identificacaoAgentePublico = new ArrayList<IdentificacaoAgentePublicoT2>();
//        }
//        return this.identificacaoAgentePublico;
//    }
//
//    /**
//     * Gets the value of the identificacaoPensionista property.
//     * 
//     * <p>
//     * This accessor method returns a reference to the live list,
//     * not a snapshot. Therefore any modification you make to the
//     * returned list will be present inside the JAXB object.
//     * This is why there is not a <CODE>set</CODE> method for the identificacaoPensionista property.
//     * 
//     * <p>
//     * For example, to add a new item, do as follows:
//     * <pre>
//     *    getIdentificacaoPensionista().add(newItem);
//     * </pre>
//     * 
//     * 
//     * <p>
//     * Objects of the following type(s) are allowed in the list
//     * {@link IdentificacaoPensionistaT2 }
//     * 
//     * 
//     */
//    public List<IdentificacaoPensionistaT2> getIdentificacaoPensionista() {
//        if (identificacaoPensionista == null) {
//            identificacaoPensionista = new ArrayList<IdentificacaoPensionistaT2>();
//        }
//        return this.identificacaoPensionista;
//    }
//
//}
