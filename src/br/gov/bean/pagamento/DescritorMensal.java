package br.gov.bean.pagamento;

public class DescritorMensal extends Descritor {

	 private int mesExercicio;

	public int getMesExercicio() {
		return mesExercicio;
	}

	public void setMesExercicio(int mesExercicio) {
		this.mesExercicio = mesExercicio;
	}

	public DescritorMensal(String anoExercicio, TipoDocumento tipoDocumento, String entidade, String municipio,
			String dataCriacaoXML, String mesExercicio) {
		super(anoExercicio, tipoDocumento, entidade, municipio, dataCriacaoXML);
		this.mesExercicio = Integer.parseInt(mesExercicio);
	}
	 
	 
	public DescritorMensal() {
		
	}
}
