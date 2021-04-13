package br.gov.controller.prodesp;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import br.gov.bean.verbasRemuneratorias.CadastroVerbasRemuneratorias;
import br.gov.bean.verbasRemuneratorias.Descritor;
import br.gov.bean.verbasRemuneratorias.VerbaRemuneratoria;
import br.gov.bean.verbasRemuneratorias.VerbasRemuneratorias;
import br.gov.model.verbasRemuneratorias.CadastroVerbasRemuneratoriasT;
import br.gov.model.verbasRemuneratorias.DescritorT;
import br.gov.model.verbasRemuneratorias.ObjectFactory;
import br.gov.model.verbasRemuneratorias.TipoDocumentoT;
import br.gov.model.verbasRemuneratorias.VerbasRemuneratoriasT;
import br.gov.prodesp.bean.Arquivos;
import br.gov.prodesp.exception.TipoArquivoIncorretoException;

public class VerbasRemuneratoriasController extends GenericoController {

	final  Logger logger = Logger.getLogger(this.getClass().getName());
	ObjectFactory obj = new ObjectFactory();
	int anoExercicio = 0;
	Map<String, CadastroVerbasRemuneratorias> mapaGeral = new HashMap<String, CadastroVerbasRemuneratorias>();

	protected void getLinhas(BufferedReader br, String linha) throws IOException {
		String codCliente;
		while (linha != null) {
			if (linha.length() > 0) {

			String tipoRegistro = linha.substring(0, 2).replaceAll("\\|", "");
			codCliente = linha.substring(2, 5).replaceAll("\\|", "");
			// String chave =linha.substring(3,5).replace("|", "");
			// String filler = linha.substring(5, 16).replaceAll("\\|", "");;
			// String descritor = linha.substring(beginIndex)
			 anoExercicio = (Integer.parseInt(linha.substring(16, 20).replaceAll("\\|", "")));
			String tipoDoc = linha.substring(20, 120).replaceAll("\\|", "");
			int entidade = Integer.parseInt((linha.substring(120, 125).replaceAll("\\|", "")));
			String municipio = linha.substring(125, 129).replaceAll("\\|", "");
			
//			String dataCriacaoXML = linha.substring(129, 139).replaceAll("\\|", "");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String dataCriacaoXML = sdf.format(new Date());
			
			
			// String verbasRemuneratorias = linha.substring(129, 139);
			String codVerba = linha.substring(139, 189).replaceAll("\\|", "");
			String nomeVerba = linha.substring(189, 444).replaceAll("\\|", "");
			String entraCalc = linha.substring(444, 445);
			Integer entraCalcTeto = Integer.parseInt(entraCalc);

			// Verificar se precisa de chave
			String chave = codCliente + "_" + tipoRegistro + "_" + anoExercicio + "_" + "CVR" + "_" + entidade + "_"
					+ municipio + "_" + dataCriacaoXML.replaceAll("-", "");

			VerbaRemuneratoria verba = new VerbaRemuneratoria(codVerba, nomeVerba, entraCalcTeto);

			if (!mapaGeral.containsKey(chave)) {
				Descritor des = new Descritor(anoExercicio, tipoDoc, entidade, municipio, dataCriacaoXML);
				CadastroVerbasRemuneratorias cad = new CadastroVerbasRemuneratorias();
				cad.setDescritor(des);
				cad.setVerba(new VerbasRemuneratorias(verba));

				mapaGeral.put(chave, cad);

			} else {
				CadastroVerbasRemuneratorias cad = mapaGeral.get(chave);
				cad.getVerba().addLista(verba);
				mapaGeral.put(chave, cad);

			}
			}
			linha = br.readLine();
		}
		br.close();
	}

	public void gerarArquivoXML(CadastroVerbasRemuneratorias cad, String nomeArquivo)
			throws TipoArquivoIncorretoException, Exception {

		CadastroVerbasRemuneratoriasT cadastro = obj.createCadastroVerbasRemuneratoriasT();
		cadastro.setDescritor(preencherDescritor(cad.getDescritor()));
		criarListaVerbasRemuneratoriasT(cadastro.getVerbasRemuneratorias(), cad.getVerba());
		logger.info("ARQUIVO PARA SER GERADO " + nomeArquivo + "Verbas Remuneratorias");
		salvarArquivo(cadastro, CadastroVerbasRemuneratoriasT.class, nomeArquivo);

	}

	private DescritorT preencherDescritor(Descritor descritor) {
		DescritorT des = obj.createDescritorT();
		des.setAnoExercicio(descritor.getAnoExercicio());
		if (descritor.getTipoDocumento().contains("CADASTRO DE VERBAS REMUNERATORIAS")) {
			des.setTipoDocumento(TipoDocumentoT.CADASTRO_DE_VERBAS_REMUNERATÓRIAS);
		} else {
			throw new TipoArquivoIncorretoException();
		}
		des.setEntidade(descritor.getEntidade());
		des.setMunicipio(descritor.getMunicipio());
		des.setDataCriacaoXML(descritor.getDataCriacaoXML());
		return des;
	}

	protected boolean isArquivoLayoutCorreto(String linha) {
		if (linha.contains("VERBAS REMUNERATORIAS")) {
			return true;
		} else {
			return false;
		}
	}

	private void criarListaVerbasRemuneratoriasT(List<VerbasRemuneratoriasT> lista, VerbasRemuneratorias vr) {
		for (int i = 0; i < vr.getLista().size(); i++) {
			VerbasRemuneratoriasT verbas = obj.createVerbasRemuneratoriasT();
			verbas.setCodigo(vr.getLista().get(i).getCodigo());
			verbas.setEntraNoCalculoDoTetoConstitucional(vr.getLista().get(i).getEntraNoCalculoDoTetoConstitucional());
			verbas.setNome(vr.getLista().get(i).getNome());
			lista.add(verbas);
		}
	}

	public void rotinaVerbasRemuneratorias() throws Exception {
		Arquivos arq = new Arquivos();
		List<String> nomes = arq.listarArquivos(caminhoArquivoLeitura);
		if (nomes.size() == 0) {
			logger.info("Não existe arquivos para serem lidos" + caminhoArquivoLeitura);
		}
		for (Iterator<String> i = nomes.iterator(); i.hasNext();) {
			String nome = i.next();
			logger.info("LENDO O ARQUIVO " + nome);

			try {
				leituraArquivo(caminhoArquivoLeitura + "//" + nome);
				String key = "";
				for (Map.Entry<String, CadastroVerbasRemuneratorias> entry : mapaGeral.entrySet()) {
					key = entry.getKey().replaceAll(" ", "");
					CadastroVerbasRemuneratorias cad = entry.getValue();

					String nomeArquivo = getNomeFormatado(key.substring(0, 3), String.valueOf(cad.getDescritor().getAnoExercicio()), key.substring(4, 6),
							nome);
					String caminho = caminhoArquivoLeitura + "//" + key.substring(0, 3);
					arq.verificarDiretorio(caminho);

					String arquivoParaSerGerado = caminho + "//" + nomeArquivo;

					try {
						gerarArquivoXML(cad, arquivoParaSerGerado);
						gerarArquivoXML(cad, CAMINHOTRANSMISSAO + "//" + nomeArquivo);
					} catch (TipoArquivoIncorretoException ex) {
						moverArquivoPastaCorreta(caminhoArquivoLeitura + "//" + nome);

					} catch (Exception e) {
						System.out.println("ERRO AO LER O ARQUIVO" + nomeArquivo);
						logger.info("ERRO AO LER O ARQUIVO " + caminhoArquivoLeitura);
						arq.verificarDiretorio(caminhoArquivoLeitura + "//" + "Erros");
						String nomeFormatado = getNomeFormatado(nomeArquivo, "");
						renomerArquivoComErros(arq, nomeArquivo, nomeFormatado);
						mapaGeral.clear();

					}

				}
				mapaGeral.clear();
				String nomeFormatado = getNomeFormatado(nome, key.substring(0, 3));

				arq.verificarDiretorio(caminhoArquivoLeitura + "//" + "Lidos");

				renomerArquivoPastaLidos(arq, nome, nomeFormatado);

			} catch (TipoArquivoIncorretoException e) {
				System.out.println(e.getMessage());
				arq.verificarDiretorio(caminhoArquivoLeitura + "//" + "Erros");
				renomerArquivoComErros(arq, nomeArquivo, nomeArquivo);

			}
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
		for (Map.Entry<String, CadastroVerbasRemuneratorias> entry : mapaGeral.entrySet()) {
			logger.info("GERANDO OS DADOS DO ARQUIVO " + nome);
			CadastroVerbasRemuneratorias cad = entry.getValue();
			System.out.println("GERANDO OS DADOS DO ARQUIVO " + nome);
			key = entry.getKey().replaceAll(" ", "");
			String nomeArquivo = getNomeFormatado(key.substring(0, 3), String.valueOf(cad.getDescritor().getAnoExercicio()), key.substring(4, 6),
					nome);
			String caminho = caminhoArquivoLeitura + "//" + key.substring(0, 3);
			arq.verificarDiretorio(caminho);
			
			String arquivoParaSerGerado = caminho + "//" + nomeArquivo;

			gerarArquivoXML(cad, arquivoParaSerGerado);
			gerarArquivoXML(cad, CAMINHOTRANSMISSAO + "//" + nomeArquivo);
		}
		
	if (!mapaGeral.isEmpty()) {
		mapaGeral.clear();
		arq.verificarDiretorio(caminhoArquivoLeitura + "//" + "Lidos");
		String nomeFormatado = getNomeFormatado(nome, key.substring(0, 3));
		renomerArquivoPastaLidos(arq, nome, nomeFormatado);
	}

}
	public void upload(BufferedReader isr, String nome, String linha) throws Exception {
		logger.info("UPLOAD:: " +"Upload Verbas Remuneratorias" + nome);
		Arquivos arq = new Arquivos();
		nomeArquivo = nome;

		leituraArquivo(isr, linha);
		String key = "";
		for (Map.Entry<String, CadastroVerbasRemuneratorias> entry : mapaGeral.entrySet()) {
			key = entry.getKey().replaceAll(" ", "");
			CadastroVerbasRemuneratorias cad = entry.getValue();

			String nomeArquivo = getNomeFormatado(key.substring(0, 3), String.valueOf(cad.getDescritor().getAnoExercicio()), key.substring(4, 6),
					nome);
			String caminho = caminhoArquivoLeitura + "//" + key.substring(0, 3);
			arq.verificarDiretorio(caminho);
			
			String arquivoParaSerGerado = caminho + "//" + nomeArquivo;

			gerarArquivoXML(cad, arquivoParaSerGerado);
			gerarArquivoXML(cad, CAMINHOTRANSMISSAO + "//" + nomeArquivo);
			
		}
		mapaGeral.clear();

	}

	public String getCaminhoLeitura() {
		return new Utils().getCaminhoVerbasRemuneratorias();
	}

	public String getLocationMashaller() {
		return "http://www.tce.sp.gov.br/audesp/xml/remuneracao ../verbasremuneratorias/AUDESP_VERBAS_REMUNERATORIAS_"+anoExercicio+"_A.XSD";
	}
}
