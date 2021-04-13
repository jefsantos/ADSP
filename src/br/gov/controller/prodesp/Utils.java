package br.gov.controller.prodesp;

import java.io.FileInputStream;
import java.net.URLDecoder;
import java.util.Properties;

public final class Utils {
	
	private Properties  prop = getProp();

	private  String caminhoRaiz = getCaminhoRaiz();
	
	
	public Properties getProp() {
		try {
			Properties props = new Properties();
			String caminho = URLDecoder
					.decode(this.getClass().getResource("../../../../.").getPath() + "configuracao.properties", "UTF-8");
			props.load(new FileInputStream(caminho));
			return props;
		} catch (Exception e) {
			System.out.println("ERRO AO ENCONTRAR ARQUIVO DE CONFIGURAÇÃO");
			return null;
		}

	}
	
	public int getQuantidadeDias() {
		return (int) Integer.parseInt(prop.getProperty("quantidadeDias").trim());
	}
	
	
	public String getCaminhoRaiz() {
		return prop.getProperty("caminhoRaiz");
	}
	
//	public String getPastaTemporaria() {
//		return prop.getProperty("pastaTemporaria");
//	}
	
	public  String getCaminhoTransmissao() {
		String caminho = getProp().getProperty("caminhoRaiz")+ getProp().getProperty("pastaTransmissao");
		return caminho;
	}

	public String getUsuario() {
		return prop.getProperty("user");
	}
	public String getSenha() {
		return prop.getProperty("password");
	}
	

	
	
	//Cadastro Aposentados e Pensionistas
	public String getCaminhoAposentadoPensionistas() {
		return caminhoRaiz +prop.getProperty("pastaAposentadosEPensionistas");
	}
	//Verbas Remuneratorias
	public String getCaminhoVerbasRemuneratorias() {
		return caminhoRaiz +prop.getProperty("pastaVerbasRemuneratorias");
	}
	//Folha Ordinária
	public String getCaminhoFolhaOrdinaria() {
		return caminhoRaiz +prop.getProperty("pastaFolhaOrdinaria");
	}
	//Folha Suplementar
	public String getCaminhoFolhaSuplementar() {
		return caminhoRaiz +prop.getProperty("pastaFolhaSuplementar");
	}
	//Pagamento da Folha Ordinária
	public String getCaminhoPagamentoFolha() {
		return caminhoRaiz+prop.getProperty("pastaPagamentoDaFolhaOrdinaria");
	}
	//Resumo Mensal da Folha de Pagamento
	public String getCaminhoResumoMensal() {
		return caminhoRaiz +prop.getProperty("pastaResumoMensal") ;
	}
	
	

}
