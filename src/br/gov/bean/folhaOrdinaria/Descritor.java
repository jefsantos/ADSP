package br.gov.bean.folhaOrdinaria;

public class Descritor {

	    private int anoExercicio;
	    private TipoDocumento tipoDocumento;
	    private int entidade;
	    private String municipio;
	    private String dataCriacaoXML;
	    
		public int getAnoExercicio() {
			return anoExercicio;
		}
		public void setAnoExercicio(int anoExercicio) {
			this.anoExercicio = anoExercicio;
		}
		public TipoDocumento getTipoDocumento() {
			return tipoDocumento;
		}
		public void setTipoDocumento(TipoDocumento tipoDocumento) {
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
			this.dataCriacaoXML = dataCriacaoXML;
		}
		public Descritor(String anoExercicio, TipoDocumento tipoDocumento, String entidade, String municipio,
				String dataCriacaoXML) {
			super();
			this.anoExercicio = Integer.parseInt(anoExercicio);
			this.tipoDocumento = tipoDocumento;
			this.entidade = Integer.parseInt(entidade);
			this.municipio = municipio;
			this.dataCriacaoXML = dataCriacaoXML;
		}
	
		public Descritor() {
			super();
		}
	
	
}
