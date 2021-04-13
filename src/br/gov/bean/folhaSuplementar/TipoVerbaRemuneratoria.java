package br.gov.bean.folhaSuplementar;

public class TipoVerbaRemuneratoria {

	private short codigoTipoVerbaRemuneratoria;

	public short getCodigoTipoVerbaRemuneratoria() {
		return codigoTipoVerbaRemuneratoria;
	}

	public void setCodigoTipoVerbaRemuneratoria(short codigoTipoVerbaRemuneratoria) {
		this.codigoTipoVerbaRemuneratoria = codigoTipoVerbaRemuneratoria;
	}
	
	public void setCodigoTipoVerbaRemuneratoria(String codigoTipoVerbaRemuneratoria) {
		try {
			this.codigoTipoVerbaRemuneratoria = Short.parseShort(codigoTipoVerbaRemuneratoria);
		} catch (Exception e) {
			throw new IllegalArgumentException(codigoTipoVerbaRemuneratoria);
		}
	}
	   
}
