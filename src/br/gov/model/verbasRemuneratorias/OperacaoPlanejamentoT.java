//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.01.18 às 01:55:17 PM BRST 
//


package br.gov.model.verbasRemuneratorias;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OperacaoPlanejamento_t.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="OperacaoPlanejamento_t">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INCLUSAO"/>
 *     &lt;enumeration value="EXCLUSAO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OperacaoPlanejamento_t")
@XmlEnum
public enum OperacaoPlanejamentoT {

    INCLUSAO,
    EXCLUSAO;

    public String value() {
        return name();
    }

    public static OperacaoPlanejamentoT fromValue(String v) {
        return valueOf(v);
    }

}
