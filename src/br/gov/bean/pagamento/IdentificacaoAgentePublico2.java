package br.gov.bean.pagamento;

import java.math.BigDecimal;

import br.gov.model.pagamento.CPFT;
import br.gov.model.pagamento.ObjectFactory;


public class IdentificacaoAgentePublico2 {


	private CPF cpf;
    private String municipioLotacao;
    private int entidadeLotacao;
    private String codigoCargo;
    private String codigoFuncao;
    private short formaPagamento;
    private String numeroBanco;
    private String agencia;
    private String contaCorrente;
    private IdentificacaoAgentePublico2 .Valores valores;
	
    
    public CPF getCpf() {
		return cpf;
	}

    
	public  CPFT getCpfT() {
		ObjectFactory obj = new ObjectFactory();
		CPFT cpfT = obj.createCPFT();
		cpfT.setNumero(cpf.getNumero());
		cpfT.setTipo(cpf.getTipo());
		return cpfT;

	}


	public void setCpf(CPF cpf) {
		this.cpf = cpf;
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



	public short getFormaPagamento() {
		return formaPagamento;
	}



	public void setFormaPagamento(short formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento =  Short.parseShort(formaPagamento);
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



	public IdentificacaoAgentePublico2.Valores getValores() {
		return valores;
	}
	

	
//	public IdentificacaoAgentePublicoT2 .Valores .Valores getValoresT() {
//		return valores;
//	}
	


	public void setValores(IdentificacaoAgentePublico2.Valores valores) {
		this.valores = valores;
	}



	public static class Valores {

    	private BigDecimal valorPagoContaCorrente;
    	private BigDecimal valorPagoOutrasFormas;
    	
		public BigDecimal getValorPagoContaCorrente() {
			return valorPagoContaCorrente;
		}
		public void setValorPagoContaCorrente(BigDecimal valorPagoContaCorrente) {
			this.valorPagoContaCorrente = valorPagoContaCorrente;
		}
		
		
		public void setValorPagoContaCorrente(String valorPagoContaCorrente) {
			this.valorPagoContaCorrente = new BigDecimal(valorPagoContaCorrente);
		}
		public BigDecimal getValorPagoOutrasFormas() {
			return valorPagoOutrasFormas;
		}
		public void setValorPagoOutrasFormas(BigDecimal valorPagoOutrasFormas) {
			this.valorPagoOutrasFormas = valorPagoOutrasFormas;
		}
		public void setValorPagoOutrasFormas(String valorPagoOutrasFormas) {
			this.valorPagoOutrasFormas = new BigDecimal(valorPagoOutrasFormas);
		}
    	
    	
        }
	
}
