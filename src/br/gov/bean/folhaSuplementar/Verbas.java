package br.gov.bean.folhaSuplementar;

import java.math.BigDecimal;

import br.gov.model.folhaSuplementar.ObjectFactory;
import br.gov.model.folhaSuplementar.TipoVerbaRemuneratoriaT;

public class Verbas {

	private String municipioVerbaRemuneratoria;
	private int entidadeVerbaRemuneratoria;
	private String codigoVerbaRemuneratoria;
	private BigDecimal valor;
	private short natureza;
	private short especie;
	private TipoVerbaRemuneratoria tipoVerbaRemuneratoria;

	private BigDecimal quantidadeHorasExtras;
	private BigDecimal complementoHorasExtras;

	private Integer quantidadeDiasFerias;
	private Integer complementoDiasFerias;

	private Integer quantidadeDiasLicencaPremio;
	private Integer complementoDiasLicencaPremio;

	
	
	public String getMunicipioVerbaRemuneratoria() {
		return municipioVerbaRemuneratoria;
	}

	public void setMunicipioVerbaRemuneratoria(String municipioVerbaRemuneratoria) {
		this.municipioVerbaRemuneratoria = municipioVerbaRemuneratoria;
	}

	public int getEntidadeVerbaRemuneratoria() {
		return entidadeVerbaRemuneratoria;
	}

	public void setEntidadeVerbaRemuneratoria(int entidadeVerbaRemuneratoria) {
		this.entidadeVerbaRemuneratoria = entidadeVerbaRemuneratoria;
	}

	public void setEntidadeVerbaRemuneratoria(String entidadeVerbaRemuneratoria) {
		this.entidadeVerbaRemuneratoria = Integer.parseInt(entidadeVerbaRemuneratoria);
	}

	public String getCodigoVerbaRemuneratoria() {
		return codigoVerbaRemuneratoria;
	}

	public void setCodigoVerbaRemuneratoria(String codigoVerbaRemuneratoria) {
		this.codigoVerbaRemuneratoria = codigoVerbaRemuneratoria;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public void setValor(String valor) {
		this.valor = new BigDecimal(valor);
	}

	public short getNatureza() {
		return natureza;
	}

	public void setNatureza(short natureza) {
		this.natureza = natureza;
	}

	public void setNatureza(String natureza) {
		this.natureza = Short.parseShort(natureza);
	}

	public short getEspecie() {
		return especie;
	}

	public void setEspecie(short especie) {
		this.especie = especie;
	}

	public void setEspecie(String especie) {
		this.especie = Short.parseShort(especie);
	}

	public TipoVerbaRemuneratoria getTipoVerbaRemuneratoria() {
		return tipoVerbaRemuneratoria;
	}

	public void setTipoVerbaRemuneratoria(TipoVerbaRemuneratoria tipoVerbaRemuneratoria) {
		this.tipoVerbaRemuneratoria = tipoVerbaRemuneratoria;
	}

	public TipoVerbaRemuneratoriaT getTipoVerbaRemuneratoriaT() {
		ObjectFactory obj = new ObjectFactory();
		TipoVerbaRemuneratoriaT tipoVerbaRemuneratoria = obj.createTipoVerbaRemuneratoriaT();
		tipoVerbaRemuneratoria
				.setCodigoTipoVerbaRemuneratoria(this.tipoVerbaRemuneratoria.getCodigoTipoVerbaRemuneratoria());
		return tipoVerbaRemuneratoria;
	}

	public BigDecimal getQuantidadeHorasExtras() {
		return quantidadeHorasExtras;
	}

	public BigDecimal getComplementoHorasExtras() {
		return complementoHorasExtras;
	}

	
	
	public void setQuantidadeHorasExtras(BigDecimal quantidadeHorasExtras) {
		this.quantidadeHorasExtras = quantidadeHorasExtras;
	}
	
	public void setComplementoHorasExtras(BigDecimal complementoHorasExtras) {
		this.complementoHorasExtras = complementoHorasExtras;
	}
	

	public void setQuantidadeHorasExtras(String valor) {
		this.quantidadeHorasExtras = new BigDecimal(valor);
	}
	
	public void setComplementoHorasExtras(String valor) {
		this.complementoHorasExtras = new BigDecimal(valor);
	}
	
	

	public Integer getQuantidadeDiasFerias() {
		return quantidadeDiasFerias;
	}
	
	public Integer getComplementoDiasFerias() {
		return complementoDiasFerias;
	}
	

	public void setQuantidadeDiasFerias(String quantidadeDiasFerias) {
		this.quantidadeDiasFerias = Integer.parseInt(quantidadeDiasFerias);
	}
	
	public void setComplementoDiasFerias(String complementoDiasFerias) {
		this.complementoDiasFerias = Integer.parseInt(complementoDiasFerias);
	}
	
	

	public Integer getQuantidadeDiasLicencaPremio() {
		return quantidadeDiasLicencaPremio;
	}

	public Integer getComplementoDiasLicencaPremio() {
		return complementoDiasLicencaPremio;
	}
	
	
	public void setQuantidadeDiasLicencaPremio(String quantidadeDiasLicencaPremio) {
		this.quantidadeDiasLicencaPremio = Integer.parseInt(quantidadeDiasLicencaPremio);
	}
	
	public void setComplementoDiasLicencaPremio(String complementoDiasLicencaPremio) {
		this.complementoDiasLicencaPremio = Integer.parseInt(complementoDiasLicencaPremio);
	}	

}



















//package br.gov.bean.folhaSuplementar;
//
//import java.math.BigDecimal;
//
//import br.gov.model.folhaSuplementar.ObjectFactory;
//import br.gov.model.folhaSuplementar.TipoVerbaRemuneratoriaT;
//
//public class Verbas {
//
//	private String municipioVerbaRemuneratoria;
//	private int entidadeVerbaRemuneratoria;
//	private String codigoVerbaRemuneratoria;
//	private BigDecimal valor;
//	private short natureza;
//	private short especie;
//	private TipoVerbaRemuneratoria tipoVerbaRemuneratoria;
//
//	private BigDecimal quantidadeHorasExtras;
//	private BigDecimal complementoHorasExtras;
//
//	private Integer quantidadeDiasFerias;
//	private Integer complementoDiasFerias;
//
//	private Integer quantidadeDiasLicencaPremio;
//	private Integer complementoDiasLicencaPremio;
//
//	
//	
//	public String getMunicipioVerbaRemuneratoria() {
//		return municipioVerbaRemuneratoria;
//	}
//
//	public void setMunicipioVerbaRemuneratoria(String municipioVerbaRemuneratoria) {
//		this.municipioVerbaRemuneratoria = municipioVerbaRemuneratoria;
//	}
//
//	public int getEntidadeVerbaRemuneratoria() {
//		return entidadeVerbaRemuneratoria;
//	}
//
//	public void setEntidadeVerbaRemuneratoria(int entidadeVerbaRemuneratoria) {
//		this.entidadeVerbaRemuneratoria = entidadeVerbaRemuneratoria;
//	}
//
//	public void setEntidadeVerbaRemuneratoria(String entidadeVerbaRemuneratoria) {
//		this.entidadeVerbaRemuneratoria = Integer.parseInt(entidadeVerbaRemuneratoria);
//	}
//
//	public String getCodigoVerbaRemuneratoria() {
//		return codigoVerbaRemuneratoria;
//	}
//
//	public void setCodigoVerbaRemuneratoria(String codigoVerbaRemuneratoria) {
//		this.codigoVerbaRemuneratoria = codigoVerbaRemuneratoria;
//	}
//
//	public BigDecimal getValor() {
//		return valor;
//	}
//
//	public void setValor(BigDecimal valor) {
//		this.valor = valor;
//	}
//
//	public void setValor(String valor) {
//		this.valor = new BigDecimal(valor);
//	}
//
//	public short getNatureza() {
//		return natureza;
//	}
//
//	public void setNatureza(short natureza) {
//		this.natureza = natureza;
//	}
//
//	public void setNatureza(String natureza) {
//		this.natureza = Short.parseShort(natureza);
//	}
//
//	public short getEspecie() {
//		return especie;
//	}
//
//	public void setEspecie(short especie) {
//		this.especie = especie;
//	}
//
//	public void setEspecie(String especie) {
//		this.especie = Short.parseShort(especie);
//	}
//
//	public TipoVerbaRemuneratoria getTipoVerbaRemuneratoria() {
//		return tipoVerbaRemuneratoria;
//	}
//
//	public void setTipoVerbaRemuneratoria(TipoVerbaRemuneratoria tipoVerbaRemuneratoria) {
//		this.tipoVerbaRemuneratoria = tipoVerbaRemuneratoria;
//	}
//
//	public TipoVerbaRemuneratoriaT getTipoVerbaRemuneratoriaT() {
//		ObjectFactory obj = new ObjectFactory();
//		TipoVerbaRemuneratoriaT tipoVerbaRemuneratoria = obj.createTipoVerbaRemuneratoriaT();
//		tipoVerbaRemuneratoria
//				.setCodigoTipoVerbaRemuneratoria(this.tipoVerbaRemuneratoria.getCodigoTipoVerbaRemuneratoria());
//		return tipoVerbaRemuneratoria;
//	}
//
//	public BigDecimal getQuantidadeHorasExtras() {
//		return quantidadeHorasExtras;
//	}
//
//	public BigDecimal getComplementoHorasExtras() {
//		return complementoHorasExtras;
//	}
//
//	
//	
//	public void setQuantidadeHorasExtras(BigDecimal quantidadeHorasExtras) {
//		this.quantidadeHorasExtras = quantidadeHorasExtras;
//	}
//	
//	public void setComplementoHorasExtras(BigDecimal complementoHorasExtras) {
//		this.complementoHorasExtras = complementoHorasExtras;
//	}
//	
//
//	public void setQuantidadeHorasExtras(String valor) {
//		this.quantidadeHorasExtras = new BigDecimal(valor);
//	}
//	
//	public void setComplementoHorasExtras(String valor) {
//		this.complementoHorasExtras = new BigDecimal(valor);
//	}
//	
//	
//
//	public Integer getQuantidadeDiasFerias() {
//		return quantidadeDiasFerias;
//	}
//	
//	public Integer getComplementoDiasFerias() {
//		return complementoDiasFerias;
//	}
//	
//
//	public void setQuantidadeDiasFerias(String quantidadeDiasFerias) {
//		this.quantidadeDiasFerias = Integer.parseInt(quantidadeDiasFerias);
//	}
//	
//	public void setComplementoDiasFerias(String complementoDiasFerias) {
//		this.complementoDiasFerias = Integer.parseInt(complementoDiasFerias);
//	}
//	
//	
//
//	public Integer getQuantidadeDiasLicencaPremio() {
//		return quantidadeDiasLicencaPremio;
//	}
//
//	public Integer getComplementoDiasLicencaPremio() {
//		return complementoDiasLicencaPremio;
//	}
//	
//	
//	public void setQuantidadeDiasLicencaPremio(String quantidadeDiasLicencaPremio) {
//		this.quantidadeDiasLicencaPremio = Integer.parseInt(quantidadeDiasLicencaPremio);
//	}
//	
//	public void setComplementoDiasLicencaPremio(String complementoDiasLicencaPremio) {
//		this.complementoDiasLicencaPremio = Integer.parseInt(complementoDiasLicencaPremio);
//	}	
//
//}
