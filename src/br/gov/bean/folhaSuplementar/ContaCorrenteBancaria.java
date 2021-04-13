package br.gov.bean.folhaSuplementar;


public class ContaCorrenteBancaria {
    private String banco;
    private String agencia;
    private String dvAgencia;
    private String contaCorrente;
    private String dvContaCorrente;
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getDvAgencia() {
		return dvAgencia;
	}
	public void setDvAgencia(String dvAgencia) {
		this.dvAgencia = dvAgencia;
	}
	public String getContaCorrente() {
		return contaCorrente;
	}
	public void setContaCorrente(String contaCorrente) {
		this.contaCorrente = contaCorrente;
	}
	public String getDvContaCorrente() {
		return dvContaCorrente;
	}
	public void setDvContaCorrente(String dvContaCorrente) {
		this.dvContaCorrente = dvContaCorrente;
	}
	public ContaCorrenteBancaria(String banco, String agencia, String dvAgencia, String contaCorrente,
			String dvContaCorrente) {
		super();
		this.banco = banco;
		this.agencia = agencia;
		this.dvAgencia = dvAgencia;
		this.contaCorrente = contaCorrente;
		this.dvContaCorrente = dvContaCorrente;
	}

	public ContaCorrenteBancaria() {
		super();
	}
    
   
}
