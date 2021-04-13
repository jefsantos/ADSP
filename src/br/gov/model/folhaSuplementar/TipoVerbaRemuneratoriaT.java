//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.01.18 às 01:54:03 PM BRST 
//


package br.gov.model.folhaSuplementar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TipoVerbaRemuneratoria_t complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TipoVerbaRemuneratoria_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoTipoVerbaRemuneratoria" type="{http://www.tce.sp.gov.br/audesp/xml/atospessoal}TipoVerbaRemuneratoria_t"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoVerbaRemuneratoria_t", namespace = "http://www.tce.sp.gov.br/audesp/xml/remuneracao", propOrder = {
    "codigoTipoVerbaRemuneratoria"
})
public class TipoVerbaRemuneratoriaT {

    @XmlElement(name = "CodigoTipoVerbaRemuneratoria")
    protected short codigoTipoVerbaRemuneratoria;

    /**
     * Obtém o valor da propriedade codigoTipoVerbaRemuneratoria.
     * 
     */
    public short getCodigoTipoVerbaRemuneratoria() {
        return codigoTipoVerbaRemuneratoria;
    }

    /**
     * Define o valor da propriedade codigoTipoVerbaRemuneratoria.
     * 
     */
    public void setCodigoTipoVerbaRemuneratoria(short value) {
        this.codigoTipoVerbaRemuneratoria = value;
    }

}
