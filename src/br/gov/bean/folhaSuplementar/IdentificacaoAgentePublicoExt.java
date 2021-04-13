package br.gov.bean.folhaSuplementar;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class IdentificacaoAgentePublicoExt extends IdentificacaoAgentePublico {
	 
	private IdentificacaoAgentePublicoExt.Valores valores = new IdentificacaoAgentePublicoExt.Valores();
	private short formaPagamento;
	private String numeroBanco;
	private String agencia;
	private String contaCorrente;
	
	
	public short getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(short formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = Short.parseShort(formaPagamento);
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

	public IdentificacaoAgentePublicoExt.Valores getValores() {
		return valores;
	}

	public void setValores(IdentificacaoAgentePublicoExt.Valores valores) {
		this.valores = valores;
	}


	public static class Valores {

	    
		    private BigDecimal totalGeralDaRemuneracaoBruta;
		    private BigDecimal totalGeralDeDescontos;
		    private BigDecimal totalGeralDaRemuneracaoLiquida;
		    private BigDecimal valorPagoContaCorrente;
		    private BigDecimal valorPagoOutrasFormas;
		    private List<Verbas> verbas = new ArrayList<Verbas>();
		    
			public BigDecimal getTotalGeralDaRemuneracaoBruta() {
				return totalGeralDaRemuneracaoBruta;
			}
			public void setTotalGeralDaRemuneracaoBruta(BigDecimal totalGeralDaRemuneracaoBruta) {
				this.totalGeralDaRemuneracaoBruta = totalGeralDaRemuneracaoBruta;
			}
			
			public void setTotalGeralDaRemuneracaoBruta(String totalGeralDaRemuneracaoBruta) {
				this.totalGeralDaRemuneracaoBruta =  new BigDecimal(totalGeralDaRemuneracaoBruta);
			}
			public BigDecimal getTotalGeralDeDescontos() {
				return totalGeralDeDescontos;
			}
			public void setTotalGeralDeDescontos(BigDecimal totalGeralDeDescontos) {
				this.totalGeralDeDescontos = totalGeralDeDescontos;
			}
			public void setTotalGeralDeDescontos(String totalGeralDeDescontos) {
				this.totalGeralDeDescontos = new BigDecimal(totalGeralDeDescontos);
			}
			
			public BigDecimal getTotalGeralDaRemuneracaoLiquida() {
				return totalGeralDaRemuneracaoLiquida;
			}
			public void setTotalGeralDaRemuneracaoLiquida(BigDecimal totalGeralDaRemuneracaoLiquida) {
				this.totalGeralDaRemuneracaoLiquida = totalGeralDaRemuneracaoLiquida;
			}
			public void setTotalGeralDaRemuneracaoLiquida(String totalGeralDaRemuneracaoLiquida) {
				this.totalGeralDaRemuneracaoLiquida = new BigDecimal( totalGeralDaRemuneracaoLiquida);
			}
			public List<Verbas> getVerbas() {
				return verbas;
			}
			public void setVerbas(List<Verbas> verbas) {
				this.verbas = verbas;
			}
			public BigDecimal getValorPagoContaCorrente() {
				return valorPagoContaCorrente;
			}
			public void setValorPagoContaCorrente(BigDecimal valorPagoContaCorrente) {
				this.valorPagoContaCorrente = valorPagoContaCorrente;
			}
		
			public void setValorPagoContaCorrente(String valorPagoContaCorrente) {
				this.valorPagoContaCorrente =  new BigDecimal(valorPagoContaCorrente);
			}
			public BigDecimal getValorPagoOutrasFormas() {
				return valorPagoOutrasFormas;
			}
			public void setValorPagoOutrasFormas(BigDecimal valorPagoOutrasFormas) {
				this.valorPagoOutrasFormas = valorPagoOutrasFormas;
			}
			public void setValorPagoOutrasFormas(String valorPagoOutrasFormas) {
				this.valorPagoOutrasFormas = new BigDecimal( valorPagoOutrasFormas);
			}	
		    
		    
		}
}

