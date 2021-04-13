package br.gov.bean.pagamento;

import java.math.BigDecimal;

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


		 private BigDecimal valorPagoContaCorrente;
		 private BigDecimal valorPagoOutrasFormas;
	
				
		
		
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
	
		 
		 
		 
}
}