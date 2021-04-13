package br.gov.controller.prodesp;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import br.gov.bean.resumoFolha.DescritorMensal;
import br.gov.bean.resumoFolha.MunicipioEntidade;
import br.gov.bean.resumoFolha.ResumoFolha;
import br.gov.bean.resumoFolha.ResumoFolhaPagamento;
import br.gov.model.resumoFolha.DescritorMensalT;
import br.gov.model.resumoFolha.ObjectFactory;
import br.gov.model.resumoFolha.TipoDocumentoT;
import br.gov.prodesp.bean.Arquivos;
import br.gov.prodesp.exception.TipoArquivoIncorretoException;

public class ResumoFolhaController extends GenericoController {

	ObjectFactory obj = new ObjectFactory();
	Map<String, ResumoFolhaPagamento> mapaGeral = new HashMap<String, ResumoFolhaPagamento>();
	final  Logger logger = Logger.getLogger(this.getClass().getName());
	int anoExercicio =0;

	protected void getLinhas(BufferedReader br, String linha) throws IOException {
		String codCliente = "";
		while (linha != null) {
			if (linha.length() > 0) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String dataCriacaoXML = sdf.format(new Date());

//			String tipoRegistro = linha.substring(0, 2).replaceAll("\\|", "");
			codCliente = linha.substring(2, 5).replaceAll("\\|", "");
			// String chave =linha.substring(3,5).replace("|", "");
//			String filler = linha.substring(5, 16).replaceAll("\\|", "");
			// String descritor = linha.substring(beginIndex)
			 anoExercicio = (Integer.parseInt(linha.substring(16, 20).replaceAll("\\|", "")));
			String tipoDoc = linha.substring(20, 120).replaceAll("\\|", "");
			int entidade = Integer.parseInt((linha.substring(120, 125).replaceAll("\\|", "")));
			String municipio = linha.substring(125, 129).replaceAll("\\|", "");
			

			// String dataCriacaoXML = linha.substring(129,
			// 139).replaceAll("\\|", "");
			/////////////////////////////////////////////////
//			String chFiller = linha.substring(139, 152);
			String mesCompetencia = linha.substring(152, 154).replaceAll("\\|", "");
			// String dados = linha.substring(189, 444).replaceAll("\\|", "");
			String codMunicipio = linha.substring(156, 160).replaceAll("\\|", "");
			String codEntidade = linha.substring(160, 165).replaceAll("\\|", "");
			// String valores = linha.substring(158, 163).replaceAll("\\|", "");
			// String totGerFgts = linha.substring(163, 177).replaceAll("\\|",
			// "");// alterar caso de erro
			String vlFgts = linha.substring(165, 179).replaceAll("\\|", "");
			// String vlFgts = linha.substring(158, 163);
			String vlPrevPolitico = linha.substring(179, 193).replaceAll("\\|", "");
			String vlPrevProprioPolitico = linha.substring(193, 207).replaceAll("\\|", "");
			String vlPrevNaoPolitico = linha.substring(207, 221).replaceAll("\\|", "");
			String vlPrevProprioNaoPolitico = linha.substring(221, 235).replaceAll("\\|", "");

			///FOLHA DESCENTRALIZADA
			MunicipioEntidade municipioEntidade = new MunicipioEntidade(linha.substring(125, 129).replaceAll("\\|", ""),
					linha.substring(120, 125).replaceAll("\\|", ""));
			
			///FOLHA CENTRALIZADA
			
//			MunicipioEntidade municipioEntidade = new MunicipioEntidade(codMunicipio,
//					codEntidade);
			

			ResumoFolha resumo = new ResumoFolha(municipioEntidade, vlFgts, vlPrevPolitico, vlPrevProprioPolitico,
					vlPrevNaoPolitico, vlPrevProprioNaoPolitico);

			String chave = codCliente;

			DescritorMensal descritorMensal = new DescritorMensal(anoExercicio, tipoDoc, entidade, municipio,
					dataCriacaoXML, mesCompetencia);
			
			
			ResumoFolhaPagamento rfp ;
			if(mapaGeral.containsKey(chave)){
				rfp = mapaGeral.get(chave);
			}else{
				rfp = new ResumoFolhaPagamento();
				
			}
			
			rfp.getListaResumoFolha().add(resumo);

			rfp.setDescritorMensal(descritorMensal);

			mapaGeral.put(chave, rfp);
			}
			linha = br.readLine();
		}
		br.close();
	}

	public void gerarArquivoXML(ResumoFolhaPagamento rfolhaPagamento, String nomeArquivo)
			throws TipoArquivoIncorretoException, Exception {

		br.gov.model.resumoFolha.ResumoFolhaPagamento resumofolhaT = obj.createResumoFolhaPagamento();
		resumofolhaT.setDescritor(preencherDescritor(rfolhaPagamento.getDescritorMensal()));

		criarListaFolhaT(resumofolhaT.getListaResumoFolhaPagamento(), rfolhaPagamento.getListaResumoFolha());
		logger.info("ARQUIVO PARA SER GERADO " + nomeArquivo + "Verbas Remuneratorias Totais");
		salvarArquivo(resumofolhaT, br.gov.model.resumoFolha.ResumoFolhaPagamento.class, nomeArquivo);

	}

	private DescritorMensalT preencherDescritor(DescritorMensal descritor) {
		DescritorMensalT des = obj.createDescritorMensalT();
		des.setAnoExercicio(descritor.getAnoExercicio());
		if (descritor.getTipoDocumento().contains("RESUMO MENSAL")) {
			des.setTipoDocumento(TipoDocumentoT.RESUMO_MENSAL_DA_FOLHA_DE_PAGAMENTO);
		} else {
			throw new TipoArquivoIncorretoException();
		}
		des.setEntidade(descritor.getEntidade());
		des.setMunicipio(descritor.getMunicipio());
		des.setDataCriacaoXML(descritor.getDataCriacaoXML());
		des.setMesExercicio(descritor.getMesExercicio());
		return des;
	}

	protected boolean isArquivoLayoutCorreto(String linha) {
		if (linha.contains("RESUMO MENSAL")) {
			return true;
		} else {
			return false;
		}
	}

	private void criarListaFolhaT(List<br.gov.model.resumoFolha.ResumoFolha> lista, List<ResumoFolha> listaResumo) {
		for (int i = 0; i < listaResumo.size(); i++) {
			br.gov.model.resumoFolha.ResumoFolha resumofolhaT = obj.createResumoFolha();

			resumofolhaT.setMunicipioEntidadeLotacao(listaResumo.get(i).getMunicipioEntidadeT());

			resumofolhaT.setVlFGTS(listaResumo.get(i).getBigDecimalVlFgts());
			resumofolhaT
					.setVlContribPrevGeralAgPolitico(listaResumo.get(i).getBigDecimalVlContribPrevGeralAgPolitico());
			resumofolhaT.setVlContribPrevProprioAgPolitico(
					listaResumo.get(i).getBigDecimalVlContribPrevProprioAgPolitico());
			resumofolhaT.setVlContribPrevGeralAgNaoPolitico(
					listaResumo.get(i).getBigDecimalVlContribPrevGeralAgNaoPolitico());
			resumofolhaT.setVlContribPrevProprioAgNaoPolitico(
					listaResumo.get(i).getBigDecimalVlContribPrevProprioAgNaoPolitico());
			lista.add(resumofolhaT);
	
		}
	}

	public void rotinaResumoFolha() throws Exception {
		//rotina();
		Arquivos arq = new Arquivos();
		List<String> nomes = arq.listarArquivos(caminhoArquivoLeitura);
		if (nomes.size() == 0) {
			logger.info("Não existe arquivos para serem lidos" + caminhoArquivoLeitura);
		}
		
		try {
			for (int i = 0; i < nomes.size(); i++) {
				logger.info("LENDO O ARQUIVO " + nomes.get(i));
			
				leituraArquivo(caminhoArquivoLeitura + "//" + nomes.get(i));
				String key = "";
				for (Map.Entry<String, ResumoFolhaPagamento> entry : mapaGeral.entrySet()) {
					ResumoFolhaPagamento rfp = entry.getValue();
					key = entry.getKey().replaceAll(" ", "");
					key = key.replace("CADASTRODEVERBASREMUNERATORIAS", "CVR");
//					String nomeArquivo = key + nomes.get(i).replace(".txt", "").replace(".TXT", "") + ".xml";
					
					String nomeArquivo = getNomeFormatado(key, String.valueOf(rfp.getDescritorMensal().getAnoExercicio()), String.valueOf(rfp.getDescritorMensal().getMesExercicio()), nomes.get(i));
					String caminho = caminhoArquivoLeitura + "//" + key.substring(0, 3);
					arq.verificarDiretorio(caminho);
				
					String arquivoParaSerGerado = caminho + "//" + nomeArquivo;

					try {
						gerarArquivoXML(rfp, arquivoParaSerGerado);
						gerarArquivoXML(rfp, CAMINHOTRANSMISSAO + "//" + nomeArquivo);
					} catch (TipoArquivoIncorretoException ex) {
						
						moverArquivoPastaCorreta(caminhoArquivoLeitura + "//" + nomes.get(i));

					}catch (Exception e) {
						System.out.println("ERRO AO LER O ARQUIVO" + nomes.get(i));
						logger.info("ERRO AO LER O ARQUIVO " + caminhoArquivoLeitura);
						arq.verificarDiretorio(caminhoArquivoLeitura + "//" + "Erros");
						String nomeFormatado = getNomeFormatado(nomes.get(i), "");
						renomerArquivoComErros(arq, nomes.get(i), nomeFormatado);
						mapaGeral.clear();
		
					}

				}
				mapaGeral.clear();
				String nome = "";
				if(key.length()> 3){
					nome = key.substring(0, 3);
				}
				String nomeFormatado = getNomeFormatado(nomes.get(i), nome);
				arq.verificarDiretorio(caminhoArquivoLeitura + "//" + "Lidos");
				renomerArquivoPastaLidos(arq, nomes.get(i), nomeFormatado);
			}
		} catch (TipoArquivoIncorretoException e) {
		}
	}
	
	
	public void lerArquivo(String nome) throws Exception {
		Arquivos arq = new Arquivos();
		System.out.println("LENDO O ARQUIVO " + nome);
		logger.info("LENDO O ARQUIVO " + nome);
		try {
			leituraArquivo(caminhoArquivoLeitura + "//" + nome);
		} catch (Exception e) {
			System.out.println("ERRO AO LER O ARQUIVO " + nome);
			logger.info("ERRO AO LER O ARQUIVO " + caminhoArquivoLeitura);
			arq.verificarDiretorio(caminhoArquivoLeitura + "//" + "Erros");
			String nomeFormatado = getNomeFormatado(nome, "");
			renomerArquivoComErros(arq, nome, nomeFormatado);
			mapaGeral.clear();

		}
		String key = "";
		for (Map.Entry<String, ResumoFolhaPagamento> entry : mapaGeral.entrySet()) {
			logger.info("GERANDO OS DADOS DO ARQUIVO " + nome);
			System.out.println("GERANDO OS DADOS DO ARQUIVO " + nome);
			ResumoFolhaPagamento cad = entry.getValue();
			key = entry.getKey().replaceAll(" ", "");

			String nomeArquivo = getNomeFormatado(key, String.valueOf(cad.getDescritorMensal().getAnoExercicio()), String.valueOf(cad.getDescritorMensal().getMesExercicio()), nome);
			String caminho = caminhoArquivoLeitura + "//" + key.substring(0, 3);
			arq.verificarDiretorio(caminho);
		
			String arquivoParaSerGerado = caminho + "//" + nomeArquivo;

			gerarArquivoXML(cad, arquivoParaSerGerado);
			gerarArquivoXML(cad, CAMINHOTRANSMISSAO + "//" + nomeArquivo);
		}
		
	if (!mapaGeral.isEmpty()) {
		mapaGeral.clear();
		arq.verificarDiretorio(caminhoArquivoLeitura + "//" + "Lidos");
		String nomeFormatado = getNomeFormatado(nome, key);
		renomerArquivoPastaLidos(arq, nome, nomeFormatado);
	}

}

	public String getCaminhoLeitura() {
		return new Utils().getCaminhoResumoMensal();
	}

	public String getLocationMashaller() {
		return "http://www.tce.sp.gov.br/audesp/xml/remuneracao ../remuneracao/AUDESP_RESUMO_MENSAL_FOLHA_PAGAMENTO_"+anoExercicio+"_A.XSD";
	}

	public void upload(BufferedReader isr, String nome, String linha) throws Exception {
		logger.info("UPLOAD:: " +"Upload Resumo Folha" + nome);
		Arquivos arq = new Arquivos();
		nomeArquivo = nome;

		leituraArquivo(isr, linha);
		String key = "";
		for (Map.Entry<String, ResumoFolhaPagamento> entry : mapaGeral.entrySet()) {
			key = entry.getKey().replaceAll(" ", "");
			ResumoFolhaPagamento cad = entry.getValue();
			String nomeArquivo = getNomeFormatado(key, String.valueOf(cad.getDescritorMensal().getAnoExercicio()), String.valueOf(cad.getDescritorMensal().getMesExercicio()), nome);
			String caminho = caminhoArquivoLeitura + "//" + key.substring(0, 3);
			arq.verificarDiretorio(caminho);
			
			String arquivoParaSerGerado = caminho + "//" + nomeArquivo;

			gerarArquivoXML(cad, arquivoParaSerGerado);
			gerarArquivoXML(cad, CAMINHOTRANSMISSAO + "//" + nomeArquivo);

		}
		mapaGeral.clear();

	}

}
