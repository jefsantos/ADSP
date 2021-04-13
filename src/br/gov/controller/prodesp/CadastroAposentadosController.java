package br.gov.controller.prodesp;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import br.gov.bean.cadastroAposentados.CadastroAposentadoPensionista;
import br.gov.bean.cadastroAposentados.DadosAposentadoriaPensao;
import br.gov.bean.cadastroAposentados.DadosAposentadoriasPensoes;
import br.gov.bean.cadastroAposentados.Descritor;
import br.gov.bean.cadastroAposentados.MunicipioEntidade;
import br.gov.model.cadastroAposentados.CPFT;
import br.gov.model.cadastroAposentados.CadastroAposentadoPensionistaT;
import br.gov.model.cadastroAposentados.DadosAposentadoriaPensaoT;
import br.gov.model.cadastroAposentados.DadosAposentadoriasPensoesT;
import br.gov.model.cadastroAposentados.DescritorT;
import br.gov.model.cadastroAposentados.ObjectFactory;
import br.gov.model.cadastroAposentados.TipoDocumentoT;
import br.gov.prodesp.bean.Arquivos;
import br.gov.prodesp.exception.TipoArquivoIncorretoException;
import org.apache.log4j.Logger;

public class CadastroAposentadosController extends GenericoController {


	final  Logger logger = Logger.getLogger(this.getClass().getName());
	ObjectFactory obj = new ObjectFactory();
	

	Map<String, CadastroAposentadoPensionista> mapaGeral = new HashMap<String, CadastroAposentadoPensionista>();
	int anoExercicio;

	protected void getLinhas(BufferedReader br, String linha) throws IOException {
		String codCliente = "";
		DadosAposentadoriaPensao pensao = null;
		String cpf_chaveAnterior = "";
		String dataAposentadoria = "";
		String cpf_chave = "";
		//int anoExercicio = 0;
		String tipoDoc = "";
		int entidade = 0;
		String municipio = "";

		SimpleDateFormat sfd = new SimpleDateFormat("yyyy-MM-dd");
		String dataCriacaoXml = sfd.format(new Date());
		String nome = "";
		String cpf = "";
		String dataNasc = "";

		DadosAposentadoriasPensoes pensoes;
		CadastroAposentadoPensionista cad = null;

		while (linha != null) {
			if (linha.length() > 0) {
			String tipoRegistro = linha.substring(0, 2).replaceAll("\\|", "");

			if (tipoRegistro.equals("01")) {

				codCliente = linha.substring(2, 5).replaceAll("\\|", "");
				// String chave =linha.substring(arg0);
				cpf_chave = linha.substring(5, 16).replaceAll("\\|", "");
				// String decritor =linha.substring(16);
				anoExercicio = Integer.parseInt(linha.substring(16, 20).replaceAll("\\|", ""));
				tipoDoc = linha.substring(20, 120).replaceAll("\\|", "");
				entidade = Integer.parseInt((linha.substring(120, 125).replaceAll("\\|", "")));
				municipio = linha.substring(125, 129).replaceAll("\\|", "");
				// dataCriacaoXml = linha.substring(129, 139).replaceAll("\\|",
				// "");

				nome = linha.substring(152, 407).replaceAll("\\|", "");
				cpf = linha.substring(407, 418).replaceAll("\\|", "");
				dataNasc = linha.substring(418, 428).replaceAll("\\|", "");

			}

			else if (tipoRegistro.equals("02")) {

				cpf_chaveAnterior = cpf_chave;
				cpf_chave = linha.substring(5, 16).replaceAll("\\|", "");

				if (cpf_chaveAnterior.equals(cpf_chave)) {

					String codMunicipio = linha.substring(152, 156).replaceAll("\\|", "");
					int codEntidade = Integer.parseInt(linha.substring(156, 161).replaceAll("\\|", ""));
					String codOrigem = linha.substring(161, 416).replaceAll("\\|", "");
					dataAposentadoria = linha.substring(416, 426).replaceAll("\\|", "");

					MunicipioEntidade municipioEntidade = new MunicipioEntidade(codMunicipio, codEntidade);

					pensao = new DadosAposentadoriaPensao(municipioEntidade, codOrigem, dataAposentadoria);

				} else {
					logger.error("OCORREU UM ERRO NO PROCESSAMENTO DO ARQUIVO   CHAVES DIFERENTES" + cpf_chaveAnterior + "  -  "+cpf_chave);
				}

			}

			// Verificar se precisa de chave
			String chave = codCliente;

			if (!mapaGeral.containsKey(chave)) {

				cad = new CadastroAposentadoPensionista();

				Descritor des = new Descritor(anoExercicio, tipoDoc, entidade, municipio, dataCriacaoXml);

				CPFT cpfT = obj.createCPFT();
				cpfT.setNumero(cpf);
				cpfT.setTipo("02");

				pensoes = new DadosAposentadoriasPensoes();
				pensoes.setCpf(cpfT);
				pensoes.setDataNascimento(dataNasc);
				pensoes.setNome(nome);

				cad.addListaPensoes(pensoes);
				cad.setDescritor(des);

				mapaGeral.put(chave, cad);

			} else {
				cad = mapaGeral.get(chave);

				if (tipoRegistro.equals("01")) {
					CPFT cpfT = obj.createCPFT();
					cpfT.setNumero(cpf);
					cpfT.setTipo("02");
					pensoes = new DadosAposentadoriasPensoes();
					pensoes.setCpf(cpfT);
					pensoes.setDataNascimento(dataNasc);
					pensoes.setNome(nome);
					cad.addListaPensoes(pensoes);
				}
				if (tipoRegistro.equals("02")) {
					pensoes = cad.getPensoes().get(cad.getPensoes().size() - 1);
					pensoes.addLista(pensao);
				}
			}

			mapaGeral.put(chave, cad);
			}
			linha = br.readLine();
		}
		br.close();
		
		Arquivos arq = new Arquivos();
		String key = "";
		
		try {
			for (Map.Entry<String, CadastroAposentadoPensionista> entry : mapaGeral.entrySet()) {
				logger.info("GERANDO OS DADOS DO ARQUIVO " + nome);
				key = entry.getKey().replaceAll(" ", "");
				String caminho = caminhoArquivoLeitura + "//" + key.substring(0, 3);
				arq.verificarDiretorio(caminho);
				CadastroAposentadoPensionista cad1 = entry.getValue();
				String nomeArquivo = getNomeFormatado(key, String.valueOf(cad.getDescritor().getAnoExercicio()), "",
						nome);
				String arquivoParaSerGerado = caminho + "//" + nomeArquivo;

				gerarArquivoXML(cad1, arquivoParaSerGerado);
				gerarArquivoXML(cad1, CAMINHOTRANSMISSAO + "//" + nomeArquivo);

			}
		} catch (TipoArquivoIncorretoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void gerarArquivoXML(CadastroAposentadoPensionista cad, String nomeArquivo)
			throws TipoArquivoIncorretoException, Exception {

		CadastroAposentadoPensionistaT cadastro = obj.createCadastroAposentadoPensionistaT();
		cadastro.setDescritor(preencherDescritor(cad.getDescritor()));
		criarListaAposentadosPensoes(cadastro.getListaAposentadoriasPensoes(), cad.getPensoes());
		logger.info("ARQUIVO PARA SER GERADO " + nomeArquivo + "Cadastro Aposentadorias ");
			salvarArquivo(cadastro, CadastroAposentadoPensionistaT.class, nomeArquivo);

	}

	private DescritorT preencherDescritor(Descritor descritor) {
		DescritorT des = obj.createDescritorT();
		des.setAnoExercicio(descritor.getAnoExercicio());
		if (descritor.getTipoDocumento().contains("APOSENTADOS")) {
			des.setTipoDocumento(TipoDocumentoT.CADASTRO_DE_APOSENTADOS_E_PENSIONISTAS);
		} else {
			throw new TipoArquivoIncorretoException();
		}
		des.setEntidade(descritor.getEntidade());
		des.setMunicipio(descritor.getMunicipio());
		des.setDataCriacaoXML(descritor.getDataCriacaoXML());
		return des;
	}

	protected boolean isArquivoLayoutCorreto(String linha) {
		if (linha.contains("APOSENTADOS")) {
			return true;
		} else {
			return false;
		}
	}

	private void criarListaAposentadosPensoes(List<DadosAposentadoriasPensoesT> lista,
			List<DadosAposentadoriasPensoes> pensoes) {
		for (int i = 0; i < pensoes.size(); i++) {
			DadosAposentadoriasPensoesT pensoesT = obj.createDadosAposentadoriasPensoesT();
			pensoesT.setCPF(pensoes.get(i).getCpf());
			pensoesT.setDataNascimento(pensoes.get(i).getDataNascimento());
			pensoesT.setNome(pensoes.get(i).getNome());
			List<DadosAposentadoriaPensao> listaAposentadosPensao = pensoes.get(i).getLista();

			for (int j = 0; j < listaAposentadosPensao.size(); j++) {
				DadosAposentadoriaPensaoT dadosAposentadoriaPensao = listaAposentadosPensao.get(j)
						.getDadosAposentadoriaPensaoT();
				pensoesT.getDadosAposentadoriaPensao().add(dadosAposentadoriaPensao);
			}

			lista.add(pensoesT);
		}
	}

	public void rotinaCadatroAposentados() throws Exception {
		rotina();

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
		for (Map.Entry<String, CadastroAposentadoPensionista> entry : mapaGeral.entrySet()) {
			logger.info("GERANDO OS DADOS DO ARQUIVO " + nome);
			key = entry.getKey().replaceAll(" ", "");
			String caminho = caminhoArquivoLeitura + "//" + key.substring(0, 3);
			arq.verificarDiretorio(caminho);
			CadastroAposentadoPensionista cad = entry.getValue();
			String nomeArquivo = getNomeFormatado(key, String.valueOf(cad.getDescritor().getAnoExercicio()), "", nome);
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
		logger.info("UPLOAD:: " +"Cadastro de Aposentados" + nome);
		Arquivos arq = new Arquivos();
		nomeArquivo = nome;

		leituraArquivo(isr, linha);
		String key = "";
		for (Map.Entry<String, CadastroAposentadoPensionista> entry : mapaGeral.entrySet()) {
			key = entry.getKey().replaceAll(" ", "");
			CadastroAposentadoPensionista cad = entry.getValue();
			String nomeArquivo = getNomeFormatado(key, String.valueOf(cad.getDescritor().getAnoExercicio()), "", nome);
			String caminho = caminhoArquivoLeitura + "//" + key.substring(0, 3);
			arq.verificarDiretorio(caminho);
		
			String arquivoParaSerGerado = caminho + "//" + nomeArquivo;

			gerarArquivoXML(cad, arquivoParaSerGerado);
			gerarArquivoXML(cad, CAMINHOTRANSMISSAO + "//" + nomeArquivo);

		}
		mapaGeral.clear();

	}

	public String getCaminhoLeitura() {
		return new Utils().getCaminhoAposentadoPensionistas();
	}

	public String getLocationMashaller() {
		return "http://www.tce.sp.gov.br/audesp/xml/remuneracao ../cadastroAposentados/AUDESP_CADASTRO_APOSENTADOS_PENSIONISTAS_"+anoExercicio+"_A.XSD";
		
		//return "http://www.tce.sp.gov.br/audesp/xml/remuneracao ../cadastroAposentados/AUDESP_CADASTRO_APOSENTADOS_PENSIONISTAS_2018_A.XSD";
	}

}
