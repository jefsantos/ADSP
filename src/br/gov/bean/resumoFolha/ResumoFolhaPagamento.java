package br.gov.bean.resumoFolha;

import java.util.ArrayList;
import java.util.List;

public class ResumoFolhaPagamento {
	
	private DescritorMensal descritorMensal;
	List<ResumoFolha> listaResumoFolha = new ArrayList<ResumoFolha>();
	
	
	public DescritorMensal getDescritorMensal() {
		return descritorMensal;
	}
	public void setDescritorMensal(DescritorMensal descritorMensal) {
		this.descritorMensal = descritorMensal;
	}
	public List<ResumoFolha> getListaResumoFolha() {
		return listaResumoFolha;
	}
	public void setListaResumoFolha(List<ResumoFolha> listaResumoFolha) {
		this.listaResumoFolha = listaResumoFolha;
	}

	
	

}
