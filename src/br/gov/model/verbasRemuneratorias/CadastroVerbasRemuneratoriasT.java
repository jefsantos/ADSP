//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2019.01.18 �s 01:55:17 PM BRST 
//


package br.gov.model.verbasRemuneratorias;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CadastroVerbasRemuneratorias_t complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CadastroVerbasRemuneratorias_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Descritor" type="{http://www.tce.sp.gov.br/audesp/xml/generico}Descritor_t"/>
 *         &lt;element name="VerbasRemuneratorias" type="{http://www.tce.sp.gov.br/audesp/xml/remuneracao}VerbasRemuneratorias_t" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CadastroVerbasRemuneratorias_t", namespace = "http://www.tce.sp.gov.br/audesp/xml/remuneracao", propOrder = {
    "descritor",
    "verbasRemuneratorias"
})

@XmlRootElement(name = "CadastroVerbasRemuneratorias")
public class CadastroVerbasRemuneratoriasT {

    @XmlElement(name = "Descritor", required = true)
    protected DescritorT descritor;
    @XmlElement(name = "VerbasRemuneratorias", required = true)
    protected List<VerbasRemuneratoriasT> verbasRemuneratorias;

    /**
     * Obt�m o valor da propriedade descritor.
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
     * Gets the value of the verbasRemuneratorias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verbasRemuneratorias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerbasRemuneratorias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerbasRemuneratoriasT }
     * 
     * 
     */
    public List<VerbasRemuneratoriasT> getVerbasRemuneratorias() {
        if (verbasRemuneratorias == null) {
            verbasRemuneratorias = new ArrayList<VerbasRemuneratoriasT>();
        }
        return this.verbasRemuneratorias;
    }

}
