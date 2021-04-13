package br.gov.bean.verbasRemuneratorias;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.gov.model.verbasRemuneratorias.TipoDocumentoT;

public class Descritor {
	private int anoExercicio;
	private String tipoDocumento;
	private int entidade;
	private String municipio;
	private String dataCriacaoXML;
	
	
	public int getAnoExercicio() {
		return anoExercicio;
	}
	public void setAnoExercicio(int anoExercicio) {
		this.anoExercicio = anoExercicio;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public int getEntidade() {
		return entidade;
	}
	public void setEntidade(int entidade) {
		this.entidade = entidade;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getDataCriacaoXML() {
		return dataCriacaoXML;
	}
	public void setDataCriacaoXML(String dataCriacaoXML) {
//		int ano=  Integer.parseInt(dataCriacaoXML.substring(0,4));
//		int mes = Integer.parseInt(dataCriacaoXML.substring(4,6));
//		int dia = Integer.parseInt(dataCriacaoXML.substring(6,8));
//		LocalDate ldate = LocalDate.of(ano, mes, dia);
//		DateTimeFormatter formato =DateTimeFormatter.ofPattern("yyyy-MM-dd");
//		ldate.format(formato);
//		this.dataCriacaoXML = ldate.toString();
		
		SimpleDateFormat  sfd = new SimpleDateFormat("yyyy-M-dd");
		 this.dataCriacaoXML= sfd.format(new Date());
	}
	public Descritor(int anoExercicio, String tipoDocumento, int entidade, String municipio, String dataCriacaoXML) {
		super();
		this.anoExercicio = anoExercicio;
		this.tipoDocumento = getTipoDocumento(tipoDocumento);
		this.entidade = entidade;
		this.municipio = municipio;
		this.dataCriacaoXML = dataCriacaoXML;
	}
	
	public Descritor() {
		super();
	}
	
	 private String getTipoDocumento(String tpdoc){
		 if(tpdoc.equals("CADASTRO DE VERBAS REMUNEATORIAS")){
			 tpdoc= TipoDocumentoT.CADASTRO_DE_VERBAS_REMUNERATÓRIAS.value();
		 }
		 return tpdoc;
		
		
	}
	

}
