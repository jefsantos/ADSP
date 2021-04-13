package br.gov.bean.pagamento;

import java.util.ArrayList;
import java.util.List;



public class PagamentoFolhaOrdinariaAgentePublico {

	    private DescritorMensal descritor;
	    private int mesCompetencia;
	    private int anoPagamento;
	    private int mesPagamento;
	    protected List<IdentificacaoAgentePublico2> identificacaoAgentePublico = new ArrayList<IdentificacaoAgentePublico2>();
	    protected List<IdentificacaoPensionistaExt> identificacaoPensionista  = new ArrayList<IdentificacaoPensionistaExt>();	
	    
		public DescritorMensal getDescritor() {
			return descritor;
		}
		public void setDescritor(DescritorMensal descritor) {
			this.descritor = descritor;
		}
		public int getMesCompetencia() {
			return mesCompetencia;
		}
		public void setMesCompetencia(int mesCompetencia) {
			this.mesCompetencia = mesCompetencia;
		}
		public void setMesCompetencia(String mesCompetencia) {
			this.mesCompetencia = Integer.parseInt(mesCompetencia);
		}
		public int getAnoPagamento() {
			return anoPagamento;
		}
		public void setAnoPagamento(int anoPagamento) {
			this.anoPagamento = anoPagamento;
		}
		
		public void setAnoPagamento(String anoPagamento) {
			this.anoPagamento = Integer.parseInt(anoPagamento);
		}
		
		public int getMesPagamento() {
			return mesPagamento;
		}
		public void setMesPagamento(int mesPagamento) {
			this.mesPagamento = mesPagamento;
		}
		public void setMesPagamento(String mesPagamento) {
			this.mesPagamento = Integer.parseInt(mesPagamento);
		}
		public List<IdentificacaoAgentePublico2> getIdentificacaoAgentePublico() {
			return identificacaoAgentePublico;
		}
		public void setIdentificacaoAgentePublico(List<IdentificacaoAgentePublico2> identificacaoAgentePublico) {
			this.identificacaoAgentePublico = identificacaoAgentePublico;
		}
		public List<IdentificacaoPensionistaExt> getIdentificacaoPensionista() {
			return identificacaoPensionista;
		}
		public void setIdentificacaoPensionista(List<IdentificacaoPensionistaExt> identificacaoPensionista) {
			this.identificacaoPensionista = identificacaoPensionista;
		}
	    
	    

}
