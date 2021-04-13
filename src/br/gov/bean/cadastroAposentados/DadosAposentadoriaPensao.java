package br.gov.bean.cadastroAposentados;

import br.gov.model.cadastroAposentados.DadosAposentadoriaPensaoT;
import br.gov.model.cadastroAposentados.MunicipioEntidadeT;
import br.gov.model.cadastroAposentados.ObjectFactory;

public class DadosAposentadoriaPensao {

    private MunicipioEntidade municipioEntidade;
    private String cargoOrigem;
    private String semInformacaoDeCargo;
    private String dataAposentadoriaPensao;
	
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
	public String getCargoOrigem() {
		return cargoOrigem;
	}
	public void setCargoOrigem(String cargoOrigem) {
		this.cargoOrigem = cargoOrigem;
	}
	public String getSemInformacaoDeCargo() {
		return semInformacaoDeCargo;
	}
	public void setSemInformacaoDeCargo(String semInformacaoDeCargo) {
		this.semInformacaoDeCargo = semInformacaoDeCargo;
	}
	public String getDataAposentadoriaPensao() {
		return dataAposentadoriaPensao;
	}
	public void setDataAposentadoriaPensao(String dataAposentadoriaPensao) {
		this.dataAposentadoriaPensao = dataAposentadoriaPensao;
	}
	
	public DadosAposentadoriaPensao() {
		super();
	}
	public DadosAposentadoriaPensao(MunicipioEntidade municipioEntidade, String cargoOrigem,
			String dataAposentadoriaPensao) {
		super();
		this.municipioEntidade = municipioEntidade;
		this.cargoOrigem = cargoOrigem;
		this.dataAposentadoriaPensao = dataAposentadoriaPensao;
	}
	
	
	public DadosAposentadoriaPensaoT getDadosAposentadoriaPensaoT (){
		ObjectFactory obj = new ObjectFactory();
		DadosAposentadoriaPensaoT dadosAposentadoriaPensaoT = obj.createDadosAposentadoriaPensaoT();
		if(cargoOrigem == null  || cargoOrigem.equals("")){
			dadosAposentadoriaPensaoT.setSemInformacaoDeCargo("");
		}
		else{
			dadosAposentadoriaPensaoT.setCargoOrigem(cargoOrigem);
		}
		dadosAposentadoriaPensaoT.setDataAposentadoriaPensao(dataAposentadoriaPensao);
		dadosAposentadoriaPensaoT.setMunicipioEntidade(getMunicipioEntidadeT());

		return dadosAposentadoriaPensaoT;
	}
	
	
    
    
}
