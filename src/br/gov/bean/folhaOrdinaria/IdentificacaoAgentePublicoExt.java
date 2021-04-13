package br.gov.bean.folhaOrdinaria;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class IdentificacaoAgentePublicoExt extends IdentificacaoAgentePublico {
	 
	private IdentificacaoAgentePublicoExt.Valores valores = new IdentificacaoAgentePublicoExt.Valores();

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
		    
		    
		}
}

