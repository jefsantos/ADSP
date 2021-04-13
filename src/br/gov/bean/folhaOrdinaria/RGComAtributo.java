package br.gov.bean.folhaOrdinaria;

public class RGComAtributo {

	private String numero;
    private String tipo;
    
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
	public RGComAtributo(String numero, String tipo) {
		super();
		this.numero = numero;
		this.tipo = tipo;
	}
    
	public RGComAtributo() {
		super();
	}	
}
