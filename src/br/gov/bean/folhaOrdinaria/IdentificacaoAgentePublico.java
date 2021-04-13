package br.gov.bean.folhaOrdinaria;

public class IdentificacaoAgentePublico {

	    private CPF cpf;
	    private String nome;
	    private String municipioLotacao;
	    private int entidadeLotacao;
	    private short cargoPolitico;
	    private String funcaoGoverno;
	    private short estagiario;
	    private String codigoCargo;
	    private String codigoFuncao;
	    private short situacao;
	    private short regimeJuridico;
	    private short possuiAutorizRecebAcimaTeto;
	    private String numeroProcessoJudicial;
	    
		public CPF getCpf() {
			return cpf;
		}
		public void setCpf(CPF cpf) {
			this.cpf = cpf;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getMunicipioLotacao() {
			return municipioLotacao;
		}
		public void setMunicipioLotacao(String municipioLotacao) {
			this.municipioLotacao = municipioLotacao;
		}
		public int getEntidadeLotacao() {
			return entidadeLotacao;
		}
		public void setEntidadeLotacao(int entidadeLotacao) {
			this.entidadeLotacao = entidadeLotacao;
		}
	
		public void setEntidadeLotacao(String entidadeLotacao) {
			this.entidadeLotacao = Integer.parseInt(entidadeLotacao);
		}
		public short getCargoPolitico() {
			return cargoPolitico;
		}
		public void setCargoPolitico(short cargoPolitico) {
			this.cargoPolitico = cargoPolitico;
		}
		public void setCargoPolitico(String cargoPolitico) {
			this.cargoPolitico =  Short.parseShort(cargoPolitico);
		}
		
		
		public String getFuncaoGoverno() {
			return funcaoGoverno;
		}
		public void setFuncaoGoverno(String funcaoGoverno) {
			this.funcaoGoverno = funcaoGoverno;
		}
		public short getEstagiario() {
			return estagiario;
		}
		public void setEstagiario(short estagiario) {
			this.estagiario = estagiario;
		}
		
		public void setEstagiario(String estagiario) {
			this.estagiario =Short.parseShort( estagiario);
		}
		public String getCodigoCargo() {
			return codigoCargo;
		}
		public void setCodigoCargo(String codigoCargo) {
			this.codigoCargo = codigoCargo;
		}
		public String getCodigoFuncao() {
			return codigoFuncao;
		}
		public void setCodigoFuncao(String codigoFuncao) {
			this.codigoFuncao = codigoFuncao;
		}
		public short getSituacao() {
			return situacao;
		}
		public void setSituacao(short situacao) {
			this.situacao = situacao;
		}
		public void setSituacao(String situacao) {
			this.situacao = Short.parseShort(situacao);
		}
		
		public short getRegimeJuridico() {
			return regimeJuridico;
		}
		public void setRegimeJuridico(short regimeJuridico) {
			this.regimeJuridico = regimeJuridico;
		}
		
		public void setRegimeJuridico(String regimeJuridico) {
			this.regimeJuridico = Short.parseShort(regimeJuridico);
		}
		public short getPossuiAutorizRecebAcimaTeto() {
			return possuiAutorizRecebAcimaTeto;
		}
		public void setPossuiAutorizRecebAcimaTeto(short possuiAutorizRecebAcimaTeto) {
			this.possuiAutorizRecebAcimaTeto = possuiAutorizRecebAcimaTeto;
		}
		
		public void setPossuiAutorizRecebAcimaTeto(String possuiAutorizRecebAcimaTeto) {
			this.possuiAutorizRecebAcimaTeto = Short.parseShort(possuiAutorizRecebAcimaTeto);
		}
		public String getNumeroProcessoJudicial() {
			return numeroProcessoJudicial;
		}
		public void setNumeroProcessoJudicial(String numeroProcessoJudicial) {
			this.numeroProcessoJudicial = numeroProcessoJudicial;
		}
	    
	    
	    
}
