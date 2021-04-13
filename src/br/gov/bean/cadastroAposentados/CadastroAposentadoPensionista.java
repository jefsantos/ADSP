package br.gov.bean.cadastroAposentados;

import java.util.ArrayList;
import java.util.List;

public class CadastroAposentadoPensionista {

	private	Descritor descritor;
	
	private	List<DadosAposentadoriasPensoes> listaPensoes = new ArrayList<DadosAposentadoriasPensoes>();
	
	public Descritor getDescritor() {
		return descritor;
	}
	public void setDescritor(Descritor descritor) {
		this.descritor = descritor;
	}
	
	public CadastroAposentadoPensionista(Descritor descritor, List<DadosAposentadoriasPensoes> pensoes) {
		super();
		this.descritor = descritor;
		this.listaPensoes = pensoes;
	}
	
	public CadastroAposentadoPensionista() {
	}
	public List<DadosAposentadoriasPensoes> getPensoes() {
		return listaPensoes;
	}
	public void setPensoes(List<DadosAposentadoriasPensoes> pensoes) {
		this.listaPensoes = pensoes;
	}
	
	public void setPensoes(DadosAposentadoriasPensoes pensoes) {
		this.listaPensoes = new  ArrayList<DadosAposentadoriasPensoes>();
		addListaPensoes(pensoes);
	}
	
	
	public void addListaPensoes( DadosAposentadoriasPensoes e){
		listaPensoes.add(e);
	}
	
	
	
}
