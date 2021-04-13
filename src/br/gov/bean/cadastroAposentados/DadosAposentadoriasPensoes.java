package br.gov.bean.cadastroAposentados;

import java.util.ArrayList;
import java.util.List;

import br.gov.model.cadastroAposentados.CPFT;

public class DadosAposentadoriasPensoes {

	private List<DadosAposentadoriaPensao> lista = new ArrayList<DadosAposentadoriaPensao>();

    private String nome;
    private CPFT cpf;
    private String dataNascimento;
	
	
	public List<DadosAposentadoriaPensao> getLista() {
		return lista;
	}

	
	
	public void addLista(DadosAposentadoriaPensao e) {
		if(e!=null){
			this.lista.add(e)	;
		}
		}

	public DadosAposentadoriasPensoes(DadosAposentadoriaPensao e) {
		super();
		addLista(e);
	}

	
	public DadosAposentadoriasPensoes() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public CPFT getCpf() {
		return cpf;
	}

	public void setCpf(CPFT cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public void setLista(List<DadosAposentadoriaPensao> lista) {
		this.lista = lista;
	}

	
	
	
}
