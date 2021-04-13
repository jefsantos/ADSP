package br.gov.bean.folhaOrdinaria;

import br.gov.model.folhaOrdinaria.ObjectFactory;
import br.gov.model.folhaOrdinaria.TipoDocumentoIdentificacaoIndividualT;

public class IdentificacaoPensionista {
	
	    protected String nome;
	    protected String dataNascimento;
	    protected TipoDocumentoIdentificacaoIndividual tipoDocumento;
	    protected short qualificacaoPensionista;
	    protected String outraQualificacaoPensionista;
	    protected String municipioLotacaoAgentePublico;
	    protected int entidadeLotacaoAgentePublico;
	    
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getDataNascimento() {
			return dataNascimento;
		}
		public void setDataNascimento(String dataNascimento) {
			this.dataNascimento = dataNascimento;
		}
		public TipoDocumentoIdentificacaoIndividual getTipoDocumento() {
			return tipoDocumento;
		}
		
		public  TipoDocumentoIdentificacaoIndividualT getTipoDocumentoT(){
			 ObjectFactory obj = new ObjectFactory();
			 TipoDocumentoIdentificacaoIndividualT doc = obj.createTipoDocumentoIdentificacaoIndividualT();
			 doc.setCertidaoNascimentoComAtributoT(tipoDocumento.getCertidaoNascimentoComAtributoT());
			 doc.setCPF(tipoDocumento.getCpfT());
			 doc.setPISPASEPComAtributoT(tipoDocumento.getPispasepComAtributoT());
			 doc.setRGComAtributoT(tipoDocumento.getRgComAtributoT());
			 return doc;
		}
		
		public void setTipoDocumento(TipoDocumentoIdentificacaoIndividual tipoDocumento) {
			this.tipoDocumento = tipoDocumento;
		}
		public short getQualificacaoPensionista() {
			return qualificacaoPensionista;
		}
		public void setQualificacaoPensionista(short qualificacaoPensionista) {
			this.qualificacaoPensionista = qualificacaoPensionista;
		}
		
		public void setQualificacaoPensionista(String qualificacaoPensionista) {
			this.qualificacaoPensionista = Short.parseShort(qualificacaoPensionista);
		}
		public String getOutraQualificacaoPensionista() {
			return outraQualificacaoPensionista;
		}
		public void setOutraQualificacaoPensionista(String outraQualificacaoPensionista) {
			this.outraQualificacaoPensionista = outraQualificacaoPensionista;
		}
		public String getMunicipioLotacaoAgentePublico() {
			return municipioLotacaoAgentePublico;
		}
		public void setMunicipioLotacaoAgentePublico(String municipioLotacaoAgentePublico) {
			this.municipioLotacaoAgentePublico = municipioLotacaoAgentePublico;
		}
		public int getEntidadeLotacaoAgentePublico() {
			return entidadeLotacaoAgentePublico;
		}
		public void setEntidadeLotacaoAgentePublico(int entidadeLotacaoAgentePublico) {
			this.entidadeLotacaoAgentePublico = entidadeLotacaoAgentePublico;
		}
	
		public void setEntidadeLotacaoAgentePublico(String entidadeLotacaoAgentePublico) {
			this.entidadeLotacaoAgentePublico = Integer.parseInt(entidadeLotacaoAgentePublico);
		}
	    

}
