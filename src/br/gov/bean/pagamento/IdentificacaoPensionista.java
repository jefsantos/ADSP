package br.gov.bean.pagamento;


public class IdentificacaoPensionista {
	
	    protected CPF cpf;
	    protected String municipioEntidadeLotacao;
	    protected int entidadeLotacaoAgentePublico;
	    protected short formaPagamento;
	    protected String numeroBanco;
	    protected String agencia;
	    protected String contaCorrente;
	    
		public CPF getCpf() {
			return cpf;
		}
		public void setCpf(CPF cpf) {
			this.cpf = cpf;
		}
		public String getMunicipioEntidadeLotacao() {
			return municipioEntidadeLotacao;
		}
		public void setMunicipioEntidadeLotacao(String municipioEntidadeLotacao) {
			this.municipioEntidadeLotacao = municipioEntidadeLotacao;
		}
		public int getEntidadeLotacaoAgentePublico() {
			return entidadeLotacaoAgentePublico;
		}
		public void setEntidadeLotacaoAgentePublico(int entidadeLotacaoAgentePublico) {
			this.entidadeLotacaoAgentePublico = entidadeLotacaoAgentePublico;
		}
		public short getFormaPagamento() {
			return formaPagamento;
		}
		public void setFormaPagamento(short formaPagamento) {
			this.formaPagamento = formaPagamento;
		}
		public String getNumeroBanco() {
			return numeroBanco;
		}
		public void setNumeroBanco(String numeroBanco) {
			this.numeroBanco = numeroBanco;
		}
		public String getAgencia() {
			return agencia;
		}
		public void setAgencia(String agencia) {
			this.agencia = agencia;
		}
		public String getContaCorrente() {
			return contaCorrente;
		}
		public void setContaCorrente(String contaCorrente) {
			this.contaCorrente = contaCorrente;
		}
	    

	    

}
