package br.gov.bean.resumoFolha;



public class MunicipioEntidade {

	
    private String codigoMunicipio;
    private int codigoEntidade;
    
	public String getCodigoMunicipio() {
		return codigoMunicipio;
	}
	public void setCodigoMunicipio(String codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}
	public int getCodigoEntidade() {
		return codigoEntidade;
	}
	public void setCodigoEntidade(int codigoEntidade) {
		this.codigoEntidade = codigoEntidade;
	}
	public MunicipioEntidade(String codigoMunicipio, String codigoEntidade) {
		super();
		this.codigoMunicipio = codigoMunicipio;
		this.codigoEntidade =Integer.parseInt(codigoEntidade) ;
	}

	public MunicipioEntidade() {
		super();
	}
    
    
}

