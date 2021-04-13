package br.gov.bean.folhaSuplementar;


public class CPF {

	    private String numero;
	    private String tipo;
	    
		public String getNumero() {
			if(numero == null){
				return "NUMERO INVALIDO CPF ________ VERIFICAR";
			}
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
		public CPF(String numero, String tipo) {
			super();
			this.numero = numero;
			this.tipo = tipo;
		}
	
		
		public CPF() {
			super();
		}
	    
	    
	
}
