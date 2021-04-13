//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.01.18 às 01:58:22 PM BRST 
//


package br.gov.model.generico2019;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DeclaracaoNegativa_t.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DeclaracaoNegativa_t">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Nenhum dado a declarar"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeclaracaoNegativa_t")
@XmlEnum
public enum DeclaracaoNegativaT {

    @XmlEnumValue("Nenhum dado a declarar")
    NENHUM_DADO_A_DECLARAR("Nenhum dado a declarar");
    private final String value;

    DeclaracaoNegativaT(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeclaracaoNegativaT fromValue(String v) {
        for (DeclaracaoNegativaT c: DeclaracaoNegativaT.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
