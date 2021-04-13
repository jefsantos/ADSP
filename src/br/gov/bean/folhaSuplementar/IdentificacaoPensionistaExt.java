package br.gov.bean.folhaSuplementar;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class IdentificacaoPensionistaExt  extends IdentificacaoPensionista {

	 private IdentificacaoPensionistaExt.Valores valores;
	 
	 public IdentificacaoPensionistaExt.Valores getValores() {
		 if(valores == null){
			 valores = new IdentificacaoPensionistaExt.Valores();
		 }
		return valores;
	}

	public void setValores(IdentificacaoPensionistaExt.Valores valores) {
		this.valores = valores;
	}


	public static class Valores {

		 private BigDecimal totalGeralDaRemuneracaoBruta;
		 private BigDecimal totalGeralDeDescontos;
		 private BigDecimal totalGeralDaRemuneracaoLiquida;
		 private BigDecimal valorPagoContaCorrente;
		 private BigDecimal valorPagoOutrasFormas;
		 private List<Verbas> verbas;
		
		 public BigDecimal getTotalGeralDaRemuneracaoBruta() {
			return totalGeralDaRemuneracaoBruta;
		}
		public void setTotalGeralDaRemuneracaoBruta(BigDecimal totalGeralDaRemuneracaoBruta) {
			this.totalGeralDaRemuneracaoBruta = totalGeralDaRemuneracaoBruta;
		}
		
		public void setTotalGeralDaRemuneracaoBruta(String totalGeralDaRemuneracaoBruta) {
			this.totalGeralDaRemuneracaoBruta =  new BigDecimal (totalGeralDaRemuneracaoBruta);
		}
		public BigDecimal getTotalGeralDeDescontos() {
			return totalGeralDeDescontos;
		}
		public void setTotalGeralDeDescontos(BigDecimal totalGeralDeDescontos) {
			this.totalGeralDeDescontos = totalGeralDeDescontos;
		}
		public void setTotalGeralDeDescontos(String totalGeralDeDescontos) {
			this.totalGeralDeDescontos = new BigDecimal (totalGeralDeDescontos);
		}
		
		public BigDecimal getTotalGeralDaRemuneracaoLiquida() {
			return totalGeralDaRemuneracaoLiquida;
		}
		public void setTotalGeralDaRemuneracaoLiquida(BigDecimal totalGeralDaRemuneracaoLiquida) {
			this.totalGeralDaRemuneracaoLiquida = totalGeralDaRemuneracaoLiquida;
		}
	
		public void setTotalGeralDaRemuneracaoLiquida(String totalGeralDaRemuneracaoLiquida) {
			this.totalGeralDaRemuneracaoLiquida = new BigDecimal (totalGeralDaRemuneracaoLiquida);
		}
		
		
		
		public BigDecimal getValorPagoContaCorrente() {
			return valorPagoContaCorrente;
		}
		public void setValorPagoContaCorrente(BigDecimal valorPagoContaCorrente) {
			this.valorPagoContaCorrente = valorPagoContaCorrente;
		}
		
		
		public void setValorPagoContaCorrente(String valorPagoContaCorrente) {
			this.valorPagoContaCorrente = new BigDecimal (valorPagoContaCorrente);
		}
		public BigDecimal getValorPagoOutrasFormas() {
			return valorPagoOutrasFormas;
		}
		public void setValorPagoOutrasFormas(BigDecimal valorPagoOutrasFormas) {
			this.valorPagoOutrasFormas = valorPagoOutrasFormas;
		}
		
		public void setValorPagoOutrasFormas(String valorPagoOutrasFormas) {
			this.valorPagoOutrasFormas = new BigDecimal (valorPagoOutrasFormas);
		}
		public List<Verbas> getVerbas() {
			if(verbas == null){
				verbas = new ArrayList<Verbas>();
			}
			return verbas;
		}
		public void setVerbas(List<Verbas> verbas) {
			this.verbas = verbas;
		}
		 
		 
		 
}
}