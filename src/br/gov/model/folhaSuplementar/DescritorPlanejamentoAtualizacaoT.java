//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa??o de Refer?ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica??es neste arquivo ser?o perdidas ap?s a recompila??o do esquema de origem. 
// Gerado em: 2019.01.18 ?s 01:54:03 PM BRST 
//


package br.gov.model.folhaSuplementar;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DescritorPlanejamentoAtualizacao_t complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte?do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DescritorPlanejamentoAtualizacao_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tce.sp.gov.br/audesp/xml/generico}Descritor_t">
 *       &lt;sequence>
 *         &lt;element name="MesExercicio" type="{http://www.tce.sp.gov.br/audesp/xml/generico}MesReferenciaPlanejamento_t"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescritorPlanejamentoAtualizacao_t", propOrder = {
    "mesExercicio"
})
public class DescritorPlanejamentoAtualizacaoT
    extends DescritorT
{

    @XmlElement(name = "MesExercicio", required = true)
    protected BigInteger mesExercicio;

    /**
     * Obt?m o valor da propriedade mesExercicio.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMesExercicio() {
        return mesExercicio;
    }

    /**
     * Define o valor da propriedade mesExercicio.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMesExercicio(BigInteger value) {
        this.mesExercicio = value;
    }

}
