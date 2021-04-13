package br.gov.bean.folhaOrdinaria;


public class CertidaoNascimentoComAtributo {

	    protected String numero;
	    protected String tipo;
	    
		public String getNumero() {
			return numero;
		}
		public void setNumero(String numero) {
			this.numero = numero;
		}
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		public CertidaoNascimentoComAtributo(String numero, String tipo) {
			super();
			this.numero = numero;
			this.tipo = tipo;
		}
	
		public CertidaoNascimentoComAtributo() {
			super();
		}
	    
	    
}
