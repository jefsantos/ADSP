//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.01.18 às 01:54:03 PM BRST 
//


package br.gov.model.folhaSuplementar;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Verbas_t complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Verbas_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MunicipioVerbaRemuneratoria" type="{http://www.tce.sp.gov.br/audesp/xml/generico}CodigoMunicipio_t"/>
 *         &lt;element name="EntidadeVerbaRemuneratoria" type="{http://www.tce.sp.gov.br/audesp/xml/generico}CodigoEntidade_t"/>
 *         &lt;element name="CodigoVerbaRemuneratoria" type="{http://www.tce.sp.gov.br/audesp/xml/atospessoal}CodigoAlphaNumericoPontoBarraTraco_t"/>
 *         &lt;element name="Valor" type="{http://www.tce.sp.gov.br/audesp/xml/atospessoal}moeda"/>
 *         &lt;element name="Natureza" type="{http://www.tce.sp.gov.br/audesp/xml/atospessoal}NaturezaVerbas_t"/>
 *         &lt;element name="Especie" type="{http://www.tce.sp.gov.br/audesp/xml/atospessoal}EspecieVerbas_t"/>
 *         &lt;element name="TipoVerbaRemuneratoria" type="{http://www.tce.sp.gov.br/audesp/xml/remuneracao}TipoVerbaRemuneratoria_t"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Verbas_t", namespace = "http://www.tce.sp.gov.br/audesp/xml/remuneracao", propOrder = {
    "municipioVerbaRemuneratoria",
    "entidadeVerbaRemuneratoria",
    "codigoVerbaRemuneratoria",
    "valor",
    "natureza",
    "especie",
    "tipoVerbaRemuneratoria",
    "quantidadeHorasExtras",
    "complementoHorasExtras",
    "quantidadeDiasFerias",
    "complementoDiasFerias", 
    "quantidadeDiasLicencaPremio",
    "complementoDiasLicencaPremio"
})
public class VerbasT {

    @XmlElement(name = "MunicipioVerbaRemuneratoria", required = true)
    protected String municipioVerbaRemuneratoria;
    @XmlElement(name = "EntidadeVerbaRemuneratoria")
    @XmlSchemaType(name = "integer")
    protected int entidadeVerbaRemuneratoria;
    @XmlElement(name = "CodigoVerbaRemuneratoria", required = true)
    protected String codigoVerbaRemuneratoria;
    @XmlElement(name = "Valor", required = true)
    protected BigDecimal valor;
    @XmlElement(name = "Natureza")
    protected short natureza;
    @XmlElement(name = "Especie")
    protected short especie;
    @XmlElement(name = "TipoVerbaRemuneratoria", required = true)
    protected TipoVerbaRemuneratoriaT tipoVerbaRemuneratoria;
    
    @XmlElement(name = "QuantidadeHorasExtras")
    protected BigDecimal quantidadeHorasExtras;
    
    @XmlElement(name = "ComplementoHorasExtras")
    protected String complementoHorasExtras;
    
    @XmlElement(name = "QuantidadeDiasFerias")
    @XmlSchemaType(name = "integer")
    protected Integer quantidadeDiasFerias;
    
    @XmlElement(name = "ComplementoDiasFerias")
    @XmlSchemaType(name = "string")
    protected String complementoDiasFerias;
    
    
    
    @XmlElement(name = "QuantidadeDiasLicencaPremio")
    @XmlSchemaType(name = "integer")
    protected Integer quantidadeDiasLicencaPremio;
    
    @XmlElement(name = "ComplementoDiasLicencaPremio")
    @XmlSchemaType(name = "string")
    protected String complementoDiasLicencaPremio;
    
    
    
    /**
     * Obtém o valor da propriedade municipioVerbaRemuneratoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipioVerbaRemuneratoria() {
        return municipioVerbaRemuneratoria;
    }

    /**
     * Define o valor da propriedade municipioVerbaRemuneratoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipioVerbaRemuneratoria(String value) {
        this.municipioVerbaRemuneratoria = value;
    }

    /**
     * Obtém o valor da propriedade entidadeVerbaRemuneratoria.
     * 
     */
    public int getEntidadeVerbaRemuneratoria() {
        return entidadeVerbaRemuneratoria;
    }

    /**
     * Define o valor da propriedade entidadeVerbaRemuneratoria.
     * 
     */
    public void setEntidadeVerbaRemuneratoria(int value) {
        this.entidadeVerbaRemuneratoria = value;
    }

    /**
     * Obtém o valor da propriedade codigoVerbaRemuneratoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoVerbaRemuneratoria() {
        return codigoVerbaRemuneratoria;
    }

    /**
     * Define o valor da propriedade codigoVerbaRemuneratoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoVerbaRemuneratoria(String value) {
        this.codigoVerbaRemuneratoria = value;
    }

    /**
     * Obtém o valor da propriedade valor.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValor() {
        return valor;
    }

    /**
     * Define o valor da propriedade valor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValor(BigDecimal value) {
        this.valor = value;
    }

    /**
     * Obtém o valor da propriedade natureza.
     * 
     */
    public short getNatureza() {
        return natureza;
    }

    /**
     * Define o valor da propriedade natureza.
     * 
     */
    public void setNatureza(short value) {
        this.natureza = value;
    }

    /**
     * Obtém o valor da propriedade especie.
     * 
     */
    public short getEspecie() {
        return especie;
    }

    /**
     * Define o valor da propriedade especie.
     * 
     */
    public void setEspecie(short value) {
        this.especie = value;
    }

    /**
     * Obtém o valor da propriedade tipoVerbaRemuneratoria.
     * 
     * @return
     *     possible object is
     *     {@link TipoVerbaRemuneratoriaT }
     *     
     */
    public TipoVerbaRemuneratoriaT getTipoVerbaRemuneratoria() {
        return tipoVerbaRemuneratoria;
    }

    /**
     * Define o valor da propriedade tipoVerbaRemuneratoria.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoVerbaRemuneratoriaT }
     *     
     */
    public void setTipoVerbaRemuneratoria(TipoVerbaRemuneratoriaT value) {
        this.tipoVerbaRemuneratoria = value;
    }

	public BigDecimal getQuantidadeHorasExtras() {
		return quantidadeHorasExtras;
	}
	
	public String getComplementoHorasExtras() {
		return complementoHorasExtras;
	}

	public void setQuantidadeHorasExtras(BigDecimal quantidadeHorasExtras) {
		this.quantidadeHorasExtras = quantidadeHorasExtras;
	}
	
	public void setComplementoHorasExtras(String complementoHorasExtras) {
		this.complementoHorasExtras = complementoHorasExtras;
	}
	
	

	public Integer getQuantidadeDiasFerias() {
		return quantidadeDiasFerias;
	}

	public void setQuantidadeDiasFerias(Integer quantidadeDiasFerias) {
		this.quantidadeDiasFerias = quantidadeDiasFerias;
	}

	public String getComplementoDiasFerias() {
		return complementoDiasFerias;
	}

	public void setComplementoDiasFerias(String complementoDiasFerias) {
		this.complementoDiasFerias = complementoDiasFerias;
	}
	
	
	
	public Integer getQuantidadeDiasLicencaPremio() {
		return quantidadeDiasLicencaPremio;
	}

	public void setQuantidadeDiasLicencaPremio(Integer quantidadeDiasLicencaPremio) {
		this.quantidadeDiasLicencaPremio = quantidadeDiasLicencaPremio;
	}
	
	public String getComplementoDiasLicencaPremio() {
		return complementoDiasLicencaPremio;
	}

	public void setComplementoDiasLicencaPremio(String complementoDiasLicencaPremio) {
		this.complementoDiasLicencaPremio = complementoDiasLicencaPremio;
	}

	

}
























////
//// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
//// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
//// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
//// Gerado em: 2019.01.18 às 01:54:03 PM BRST 
////
//
//
//package br.gov.model.folhaSuplementar;
//
//import java.math.BigDecimal;
//import javax.xml.bind.annotation.XmlAccessType;
//import javax.xml.bind.annotation.XmlAccessorType;
//import javax.xml.bind.annotation.XmlElement;
//import javax.xml.bind.annotation.XmlSchemaType;
//import javax.xml.bind.annotation.XmlType;
//
//
///**
// * <p>Classe Java de Verbas_t complex type.
// * 
// * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
// * 
// * <pre>
// * &lt;complexType name="Verbas_t">
// *   &lt;complexContent>
// *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
// *       &lt;sequence>
// *         &lt;element name="MunicipioVerbaRemuneratoria" type="{http://www.tce.sp.gov.br/audesp/xml/generico}CodigoMunicipio_t"/>
// *         &lt;element name="EntidadeVerbaRemuneratoria" type="{http://www.tce.sp.gov.br/audesp/xml/generico}CodigoEntidade_t"/>
// *         &lt;element name="CodigoVerbaRemuneratoria" type="{http://www.tce.sp.gov.br/audesp/xml/atospessoal}CodigoAlphaNumericoPontoBarraTraco_t"/>
// *         &lt;element name="Valor" type="{http://www.tce.sp.gov.br/audesp/xml/atospessoal}moeda"/>
// *         &lt;element name="Natureza" type="{http://www.tce.sp.gov.br/audesp/xml/atospessoal}NaturezaVerbas_t"/>
// *         &lt;element name="Especie" type="{http://www.tce.sp.gov.br/audesp/xml/atospessoal}EspecieVerbas_t"/>
// *         &lt;element name="TipoVerbaRemuneratoria" type="{http://www.tce.sp.gov.br/audesp/xml/remuneracao}TipoVerbaRemuneratoria_t"/>
// *       &lt;/sequence>
// *     &lt;/restriction>
// *   &lt;/complexContent>
// * &lt;/complexType>
// * </pre>
// * 
// * 
// */
//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "Verbas_t", namespace = "http://www.tce.sp.gov.br/audesp/xml/remuneracao", propOrder = {
//    "municipioVerbaRemuneratoria",
//    "entidadeVerbaRemuneratoria",
//    "codigoVerbaRemuneratoria",
//    "valor",
//    "natureza",
//    "especie",
//    "tipoVerbaRemuneratoria",
//    "quantidadeHorasExtras",
//    "complementoHorasExtras",
//    "quantidadeDiasFerias",
//    "complementoDiasFerias", 
//    "quantidadeDiasLicencaPremio",
//    "complementoDiasLicencaPremio"
//})
//public class VerbasT {
//
//    @XmlElement(name = "MunicipioVerbaRemuneratoria", required = true)
//    protected String municipioVerbaRemuneratoria;
//    @XmlElement(name = "EntidadeVerbaRemuneratoria")
//    @XmlSchemaType(name = "integer")
//    protected int entidadeVerbaRemuneratoria;
//    @XmlElement(name = "CodigoVerbaRemuneratoria", required = true)
//    protected String codigoVerbaRemuneratoria;
//    @XmlElement(name = "Valor", required = true)
//    protected BigDecimal valor;
//    @XmlElement(name = "Natureza")
//    protected short natureza;
//    @XmlElement(name = "Especie")
//    protected short especie;
//    @XmlElement(name = "TipoVerbaRemuneratoria", required = true)
//    protected TipoVerbaRemuneratoriaT tipoVerbaRemuneratoria;
//    
//    @XmlElement(name = "QuantidadeHorasExtras")
//    protected BigDecimal quantidadeHorasExtras;
//    
//    @XmlElement(name = "ComplementoHorasExtras", nillable=true)
//    protected BigDecimal complementoHorasExtras;
//    
//    @XmlElement(name = "QuantidadeDiasFerias")
//    @XmlSchemaType(name = "integer")
//    protected Integer quantidadeDiasFerias;
//    
//    @XmlElement(name = "ComplementoDiasFerias")
//    @XmlSchemaType(name = "integer")
//    protected Integer complementoDiasFerias;
//    
//    
//    
//    @XmlElement(name = "QuantidadeDiasLicencaPremio")
//    @XmlSchemaType(name = "integer")
//    protected Integer quantidadeDiasLicencaPremio;
//    
//    @XmlElement(name = "ComplementoDiasLicencaPremio")
//    @XmlSchemaType(name = "integer")
//    protected Integer complementoDiasLicencaPremio;
//    
//    
//    
//    /**
//     * Obtém o valor da propriedade municipioVerbaRemuneratoria.
//     * 
//     * @return
//     *     possible object is
//     *     {@link String }
//     *     
//     */
//    public String getMunicipioVerbaRemuneratoria() {
//        return municipioVerbaRemuneratoria;
//    }
//
//    /**
//     * Define o valor da propriedade municipioVerbaRemuneratoria.
//     * 
//     * @param value
//     *     allowed object is
//     *     {@link String }
//     *     
//     */
//    public void setMunicipioVerbaRemuneratoria(String value) {
//        this.municipioVerbaRemuneratoria = value;
//    }
//
//    /**
//     * Obtém o valor da propriedade entidadeVerbaRemuneratoria.
//     * 
//     */
//    public int getEntidadeVerbaRemuneratoria() {
//        return entidadeVerbaRemuneratoria;
//    }
//
//    /**
//     * Define o valor da propriedade entidadeVerbaRemuneratoria.
//     * 
//     */
//    public void setEntidadeVerbaRemuneratoria(int value) {
//        this.entidadeVerbaRemuneratoria = value;
//    }
//
//    /**
//     * Obtém o valor da propriedade codigoVerbaRemuneratoria.
//     * 
//     * @return
//     *     possible object is
//     *     {@link String }
//     *     
//     */
//    public String getCodigoVerbaRemuneratoria() {
//        return codigoVerbaRemuneratoria;
//    }
//
//    /**
//     * Define o valor da propriedade codigoVerbaRemuneratoria.
//     * 
//     * @param value
//     *     allowed object is
//     *     {@link String }
//     *     
//     */
//    public void setCodigoVerbaRemuneratoria(String value) {
//        this.codigoVerbaRemuneratoria = value;
//    }
//
//    /**
//     * Obtém o valor da propriedade valor.
//     * 
//     * @return
//     *     possible object is
//     *     {@link BigDecimal }
//     *     
//     */
//    public BigDecimal getValor() {
//        return valor;
//    }
//
//    /**
//     * Define o valor da propriedade valor.
//     * 
//     * @param value
//     *     allowed object is
//     *     {@link BigDecimal }
//     *     
//     */
//    public void setValor(BigDecimal value) {
//        this.valor = value;
//    }
//
//    /**
//     * Obtém o valor da propriedade natureza.
//     * 
//     */
//    public short getNatureza() {
//        return natureza;
//    }
//
//    /**
//     * Define o valor da propriedade natureza.
//     * 
//     */
//    public void setNatureza(short value) {
//        this.natureza = value;
//    }
//
//    /**
//     * Obtém o valor da propriedade especie.
//     * 
//     */
//    public short getEspecie() {
//        return especie;
//    }
//
//    /**
//     * Define o valor da propriedade especie.
//     * 
//     */
//    public void setEspecie(short value) {
//        this.especie = value;
//    }
//
//    /**
//     * Obtém o valor da propriedade tipoVerbaRemuneratoria.
//     * 
//     * @return
//     *     possible object is
//     *     {@link TipoVerbaRemuneratoriaT }
//     *     
//     */
//    public TipoVerbaRemuneratoriaT getTipoVerbaRemuneratoria() {
//        return tipoVerbaRemuneratoria;
//    }
//
//    /**
//     * Define o valor da propriedade tipoVerbaRemuneratoria.
//     * 
//     * @param value
//     *     allowed object is
//     *     {@link TipoVerbaRemuneratoriaT }
//     *     
//     */
//    public void setTipoVerbaRemuneratoria(TipoVerbaRemuneratoriaT value) {
//        this.tipoVerbaRemuneratoria = value;
//    }
//
//	public BigDecimal getQuantidadeHorasExtras() {
//		return quantidadeHorasExtras;
//	}
//	
//	public BigDecimal getComplementoHorasExtras() {
//		return complementoHorasExtras;
//	}
//
//	public void setQuantidadeHorasExtras(BigDecimal quantidadeHorasExtras) {
//		this.quantidadeHorasExtras = quantidadeHorasExtras;
//	}
//	
//	public void setComplementoHorasExtras(BigDecimal complementoHorasExtras) {
//		this.complementoHorasExtras = complementoHorasExtras;
//	}
//	
//	
//
//	public Integer getQuantidadeDiasFerias() {
//		return quantidadeDiasFerias;
//	}
//
//	public void setQuantidadeDiasFerias(Integer quantidadeDiasFerias) {
//		this.quantidadeDiasFerias = quantidadeDiasFerias;
//	}
//
//	public Integer getComplementoDiasFerias() {
//		return complementoDiasFerias;
//	}
//
//	public void setComplementoDiasFerias(Integer complementoDiasFerias) {
//		this.complementoDiasFerias = complementoDiasFerias;
//	}
//	
//	
//	
//	public Integer getQuantidadeDiasLicencaPremio() {
//		return quantidadeDiasLicencaPremio;
//	}
//
//	public void setQuantidadeDiasLicencaPremio(Integer quantidadeDiasLicencaPremio) {
//		this.quantidadeDiasLicencaPremio = quantidadeDiasLicencaPremio;
//	}
//	
//	public Integer getComplementoDiasLicencaPremio() {
//		return complementoDiasLicencaPremio;
//	}
//
//	public void setComplementoDiasLicencaPremio(Integer complementoDiasLicencaPremio) {
//		this.complementoDiasLicencaPremio = complementoDiasLicencaPremio;
//	}
//
//	
//
//}
