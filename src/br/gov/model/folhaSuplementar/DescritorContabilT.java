//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa??o de Refer?ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica??es neste arquivo ser?o perdidas ap?s a recompila??o do esquema de origem. 
// Gerado em: 2019.01.18 ?s 01:54:03 PM BRST 
//


package br.gov.model.folhaSuplementar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DescritorContabil_t complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte?do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DescritorContabil_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tce.sp.gov.br/audesp/xml/generico}Descritor_t">
 *       &lt;sequence>
 *         &lt;element name="MesExercicio">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="1"/>
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
@XmlType(name = "DescritorContabil_t", propOrder = {
    "mesExercicio"
})
public class DescritorContabilT
    extends DescritorT
{

    @XmlElement(name = "MesExercicio")
    protected int mesExercicio;

    /**
     * Obt?m o valor da propriedade mesExercicio.
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
