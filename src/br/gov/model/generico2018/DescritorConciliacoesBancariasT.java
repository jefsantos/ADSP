//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.01.23 às 11:30:00 AM BRST 
//


package br.gov.model.generico2018;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DescritorConciliacoesBancarias_t complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DescritorConciliacoesBancarias_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tce.sp.gov.br/audesp/xml/generico}DescritorContasAnuais_t">
 *       &lt;sequence>
 *         &lt;element name="MesExercicio">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="12"/>
 *               &lt;maxInclusive value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescritorConciliacoesBancarias_t", propOrder = {
    "mesExercicio"
})
public class DescritorConciliacoesBancariasT
    extends DescritorContasAnuaisT
{

    @XmlElement(name = "MesExercicio")
    protected int mesExercicio;

    /**
     * Obtém o valor da propriedade mesExercicio.
     * 
     */
    public int getMesExercicio() {
        return mesExercicio;
    }

    /**
     * Define o valor da propriedade mesExercicio.
     * 
     */
    public void setMesExercicio(int value) {
        this.mesExercicio = value;
    }

}
