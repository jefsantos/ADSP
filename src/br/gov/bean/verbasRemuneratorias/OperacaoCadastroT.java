//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.13 at 05:30:46 PM BRT 
//


package br.gov.bean.verbasRemuneratorias;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperacaoCadastro_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperacaoCadastro_t">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INCLUSAO"/>
 *     &lt;enumeration value="ALTERACAO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OperacaoCadastro_t")
@XmlEnum
public enum OperacaoCadastroT {

    INCLUSAO,
    ALTERACAO;

    public String value() {
        return name();
    }

    public static OperacaoCadastroT fromValue(String v) {
        return valueOf(v);
    }

}
