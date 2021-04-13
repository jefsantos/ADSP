package br.gov.bean.resumoFolha;

import java.math.BigDecimal;

import br.gov.model.resumoFolha.MunicipioEntidadeT;
import br.gov.model.resumoFolha.ObjectFactory;

public class ResumoFolha {
	
	
	private MunicipioEntidade municipioEntidade;
	private String vlFgts;
	private String vlContribPrevGeralAgPolitico;
	private String vlContribPrevProprioAgPolitico;
	private String vlContribPrevGeralAgNaoPolitico  ;
	private String vlContribPrevProprioAgNaoPolitico;
	
	
	public ResumoFolha (){
		
	}
	
	public MunicipioEntidade getMunicipioEntidade() {
		return municipioEntidade;
	}
	
	
	
    public MunicipioEntidadeT getMunicipioEntidadeT() {
    	ObjectFactory obj = new ObjectFactory();
    	MunicipioEntidadeT municipio = obj.createMunicipioEntidadeT();
    	municipio.setCodigoEntidade(municipioEntidade.getCodigoEntidade());
    	municipio.setCodigoMunicipio(municipioEntidade.getCodigoMunicipio());
  		return municipio;
  	}
	
	
	
	public void setMunicipioEntidade(MunicipioEntidade municipioEntidade) {
		this.municipioEntidade = municipioEntidade;
	}
	public String getVlFgts() {
		return vlFgts;
	}
	
	
	public BigDecimal getBigDecimalVlFgts() {
		return new BigDecimal(vlFgts) ;
	}
	
	public void setVlFgts(String vlFgts) {
		this.vlFgts = vlFgts;
	}
	public String getVlContribPrevGeralAgPolitico() {
		return vlContribPrevGeralAgPolitico;
	}
	
	public BigDecimal getBigDecimalVlContribPrevGeralAgPolitico() {
		return new BigDecimal(vlContribPrevGeralAgPolitico) ;
	}
	
	public void setVlContribPrevGeralAgPolitico(String vlContribPrevGeralAgPolitico) {
		this.vlContribPrevGeralAgPolitico = vlContribPrevGeralAgPolitico;
	}
	public String getVlContribPrevProprioAgPolitico() {
		return vlContribPrevProprioAgPolitico;
	}
	
	
	public BigDecimal getBigDecimalVlContribPrevProprioAgPolitico() {
		return new BigDecimal(vlContribPrevProprioAgPolitico) ;
	}
	public void setVlContribPrevProprioAgPolitico(String vlContribPrevProprioAgPolitico) {
		this.vlContribPrevProprioAgPolitico = vlContribPrevProprioAgPolitico;
	}
	public String getVlContribPrevGeralAgNaoPolitico() {
		return vlContribPrevGeralAgNaoPolitico;
	}
	
	public BigDecimal getBigDecimalVlContribPrevGeralAgNaoPolitico() {
		return  new BigDecimal(vlContribPrevGeralAgNaoPolitico);
	}
	public void setVlContribPrevGeralAgNaoPolitico(String vlContribPrevGeralAgNaoPolitico) {
		this.vlContribPrevGeralAgNaoPolitico = vlContribPrevGeralAgNaoPolitico;
	}
	public String getVlContribPrevProprioAgNaoPolitico() {
		return vlContribPrevProprioAgNaoPolitico;
	}
	
	public BigDecimal getBigDecimalVlContribPrevProprioAgNaoPolitico() {
		return new BigDecimal(vlContribPrevProprioAgNaoPolitico) ;
	}
	
	
	public void setVlContribPrevProprioAgNaoPolitico(String vlContribPrevProprioAgNaoPolitico) {
		this.vlContribPrevProprioAgNaoPolitico = vlContribPrevProprioAgNaoPolitico;
	}
	
	




	public ResumoFolha(MunicipioEntidade municipioEntidade,String vlFgts,String vlContribPrevGeralAgPolitico,String vlContribPrevProprioAgPolitico,
			String vlContribPrevGeralAgNaoPolitico,String vlContribPrevProprioAgNaoPolitico){
		super();
		
		this.municipioEntidade = municipioEntidade;
		this.vlFgts = vlFgts;
		this.vlContribPrevGeralAgPolitico = vlContribPrevGeralAgPolitico;
		this.vlContribPrevProprioAgPolitico = vlContribPrevProprioAgPolitico;
		this.vlContribPrevGeralAgNaoPolitico = vlContribPrevGeralAgNaoPolitico;
		this.vlContribPrevProprioAgNaoPolitico = vlContribPrevProprioAgNaoPolitico;
		
	}
	
	
	
	
}
