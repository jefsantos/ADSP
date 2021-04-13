package br.gov.bean.folhaOrdinaria;

public class TipoVerbaRemuneratoria {

	private short codigoTipoVerbaRemuneratoria;

	public short getCodigoTipoVerbaRemuneratoria() {
		return codigoTipoVerbaRemuneratoria;
	}

	public void setCodigoTipoVerbaRemuneratoria(short codigoTipoVerbaRemuneratoria) {
		this.codigoTipoVerbaRemuneratoria = codigoTipoVerbaRemuneratoria;
	}
	
	public void setCodigoTipoVerbaRemuneratoria(String codigoTipoVerbaRemuneratoria) {
		this.codigoTipoVerbaRemuneratoria =  Short.parseShort(codigoTipoVerbaRemuneratoria);
	}
	   
}
