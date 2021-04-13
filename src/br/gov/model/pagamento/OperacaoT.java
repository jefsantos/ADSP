//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.01.21 às 10:09:53 AM BRST 
//


package br.gov.model.pagamento;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Operacao_t.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Operacao_t">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INCLUSAO"/>
 *     &lt;enumeration value="EXCLUSAO"/>
 *     &lt;enumeration value="ALTERACAO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Operacao_t")
@XmlEnum
public enum OperacaoT {

    INCLUSAO,
    EXCLUSAO,
    ALTERACAO;

    public String value() {
        return name();
    }

    public static OperacaoT fromValue(String v) {
        return valueOf(v);
    }

}
