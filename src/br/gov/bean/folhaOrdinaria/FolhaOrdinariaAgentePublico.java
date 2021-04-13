package br.gov.bean.folhaOrdinaria;

import java.util.ArrayList;
import java.util.List;

public class FolhaOrdinariaAgentePublico {
	
    private DescritorMensal descritor;
    private int mesCompetencia;
    private List<IdentificacaoAgentePublicoExt> listaIdentificacaoAgentePublico = new ArrayList<IdentificacaoAgentePublicoExt>();
    private List<IdentificacaoPensionistaExt> listaIdentificacaoPensionista  = new ArrayList<IdentificacaoPensionistaExt>();
    
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
	
	public List<IdentificacaoAgentePublicoExt> getListaIdentificacaoAgentePublico() {
		return listaIdentificacaoAgentePublico;
	}
	public void setListaIdentificacaoAgentePublico(List<IdentificacaoAgentePublicoExt> listaIdentificacaoAgentePublico) {
		this.listaIdentificacaoAgentePublico = listaIdentificacaoAgentePublico;
	}
	public List<IdentificacaoPensionistaExt> getListaIdentificacaoPensionista() {
		return listaIdentificacaoPensionista;
	}
	public void setListaIdentificacaoPensionista(List<IdentificacaoPensionistaExt> listaIdentificacaoPensionista) {
		this.listaIdentificacaoPensionista = listaIdentificacaoPensionista;
	}
}
