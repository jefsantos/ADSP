//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.14 at 03:23:01 PM BRST 
//


package br.gov.model.generico2015;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificacaoPensionista_t", namespace = "http://www.tce.sp.gov.br/audesp/xml/atospessoal", propOrder = {
    "nome",
    "dataNascimento",
    "tipoDocumento",
    "qualificacaoPensionista",
    "outraQualificacaoPensionista",
    "municipioLotacaoAgentePublico",
    "entidadeLotacaoAgentePublico"
})
public class IdentificacaoPensionistaT {

    @XmlElement(name = "Nome", required = true)
    protected String nome;
    @XmlElement(name = "DataNascimento", required = true)
    protected XMLGregorianCalendar dataNascimento;
    @XmlElement(name = "TipoDocumento", required = true)
    protected TipoDocumentoIdentificacaoIndividualT tipoDocumento;
    @XmlElement(name = "QualificacaoPensionista")
    protected short qualificacaoPensionista;
    @XmlElement(name = "OutraQualificacaoPensionista")
    protected String outraQualificacaoPensionista;
    @XmlElement(name = "MunicipioLotacaoAgentePublico", required = true)
    protected String municipioLotacaoAgentePublico;
    @XmlElement(name = "EntidadeLotacaoAgentePublico")
    protected int entidadeLotacaoAgentePublico;

     
    public String getNome() {
        return nome;
    }

     
    public void setNome(String value) {
        this.nome = value;
    }

     
    public XMLGregorianCalendar getDataNascimento() {
        return dataNascimento;
    }

     
    public void setDataNascimento(XMLGregorianCalendar value) {
        this.dataNascimento = value;
    }

     
    public TipoDocumentoIdentificacaoIndividualT getTipoDocumento() {
        return tipoDocumento;
    }

     
    public void setTipoDocumento(TipoDocumentoIdentificacaoIndividualT value) {
        this.tipoDocumento = value;
    }

     
    public short getQualificacaoPensionista() {
        return qualificacaoPensionista;
    }

     
    public void setQualificacaoPensionista(short value) {
        this.qualificacaoPensionista = value;
    }

     
    public String getOutraQualificacaoPensionista() {
        return outraQualificacaoPensionista;
    }

     
    public void setOutraQualificacaoPensionista(String value) {
        this.outraQualificacaoPensionista = value;
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

}
