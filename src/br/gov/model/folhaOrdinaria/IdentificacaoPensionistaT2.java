//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.07 at 05:00:15 PM BRST 
//


package br.gov.model.folhaOrdinaria;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificacaoPensionista_t2", propOrder = {
    "tipoDocumento",
    "municipioLotacaoAgentePublico",
    "entidadeLotacaoAgentePublico",
    "formaPagamento",
    "numeroBanco",
    "agencia",
    "contaCorrente",
    "valores"
})
public class IdentificacaoPensionistaT2 {

    @XmlElement(name = "TipoDocumento", required = true)
    protected TipoDocumentoIdentificacaoIndividualT tipoDocumento;
    @XmlElement(name = "MunicipioLotacaoAgentePublico", required = true)
    protected String municipioLotacaoAgentePublico;
    @XmlElement(name = "EntidadeLotacaoAgentePublico")
    protected int entidadeLotacaoAgentePublico;
    protected short formaPagamento;
    protected String numeroBanco;
    protected String agencia;
    @XmlElement(name = "ContaCorrente")
    protected String contaCorrente;
    @XmlElement(name = "Valores", required = true)
    protected IdentificacaoPensionistaT2 .Valores valores;

     
    public TipoDocumentoIdentificacaoIndividualT getTipoDocumento() {
        return tipoDocumento;
    }

     
    public void setTipoDocumento(TipoDocumentoIdentificacaoIndividualT value) {
        this.tipoDocumento = value;
    }

     
    public String getMunicipioLotacaoAgentePublico() {
        return municipioLotacaoAgentePublico;
    }

     
    public void setMunicipioLotacaoAgentePublico(String value) {
        this.municipioLotacaoAgentePublico = value;
    }

     
    public int getEntidadeLotacaoAgentePublico() {
        return entidadeLotacaoAgentePublico;
    }

     
    public void setEntidadeLotacaoAgentePublico(int value) {
        this.entidadeLotacaoAgentePublico = value;
    }

     
    public short getFormaPagamento() {
        return formaPagamento;
    }

     
    public void setFormaPagamento(short value) {
        this.formaPagamento = value;
    }

     
    public String getNumeroBanco() {
        return numeroBanco;
    }

     
    public void setNumeroBanco(String value) {
        this.numeroBanco = value;
    }

     
    public String getAgencia() {
        return agencia;
    }

     
    public void setAgencia(String value) {
        this.agencia = value;
    }

     
    public String getContaCorrente() {
        return contaCorrente;
    }

     
    public void setContaCorrente(String value) {
        this.contaCorrente = value;
    }

     
    public IdentificacaoPensionistaT2 .Valores getValores() {
        return valores;
    }

     
    public void setValores(IdentificacaoPensionistaT2 .Valores value) {
        this.valores = value;
    }


     
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "valorPagoContaCorrente",
        "valorPagoOutrasFormas"
    })
    public static class Valores {

        @XmlElement(namespace = "", required = true)
        protected BigDecimal valorPagoContaCorrente;
        @XmlElement(namespace = "", required = true)
        protected BigDecimal valorPagoOutrasFormas;

         
        public BigDecimal getValorPagoContaCorrente() {
            return valorPagoContaCorrente;
        }

         
        public void setValorPagoContaCorrente(BigDecimal value) {
            this.valorPagoContaCorrente = value;
        }

         
        public BigDecimal getValorPagoOutrasFormas() {
            return valorPagoOutrasFormas;
        }

         
        public void setValorPagoOutrasFormas(BigDecimal value) {
            this.valorPagoOutrasFormas = value;
        }

    }

}