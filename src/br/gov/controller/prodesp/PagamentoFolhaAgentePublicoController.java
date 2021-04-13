package br.gov.controller.prodesp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;

import org.apache.log4j.Logger;

import br.gov.bean.pagamento.CPF;
import br.gov.bean.pagamento.DescritorMensal;
import br.gov.bean.pagamento.IdentificacaoAgentePublico2;
import br.gov.bean.pagamento.PagamentoFolhaOrdinariaAgentePublico;
import br.gov.bean.pagamento.TipoDocumento;
import br.gov.model.pagamento.DescritorMensalT;
import br.gov.model.pagamento.ObjectFactory;
import br.gov.model.pagamento.TipoDocumentoT;
import br.gov.prodesp.bean.Arquivos;
import br.gov.prodesp.exception.TipoArquivoIncorretoException;

public class PagamentoFolhaAgentePublicoController extends GenericoController {

	ObjectFactory obj = new ObjectFactory();
	final Logger logger = Logger.getLogger(this.getClass().getName());
	String anoExercicio;

	static Map<String, PagamentoFolhaOrdinariaAgentePublico> mapaGeral = new HashMap<String, PagamentoFolhaOrdinariaAgentePublico>();
	static final String agentePublico = "01";
	static final String verbas = "02";

	public void rotinaPagamentoFolha() throws Exception {
		rotina();
	}

	protected void getLinhas(BufferedReader br, String linha) throws IOException {
		PagamentoFolhaOrdinariaAgentePublico pag = new PagamentoFolhaOrdinariaAgentePublico();
		IdentificacaoAgentePublico2 iap = null;
		String chave = " ";

		while (linha != null) {
			if (linha.length() > 0) {
				chave = linha.substring(2, 5).replaceAll("\\|", "");
				String tipoRegistro = linha.substring(0, 2);

				if (tipoRegistro.equals("01")) {

					if (iap != null) {

						if (!mapaGeral.containsKey(chave)) {
							System.out.println(chave);
							break;

						} else {
							pag = mapaGeral.get(chave);
//							pag.getIdentificacaoAgentePublico().add(iap);

						}

					} else {
						preencherDescritor(pag, linha);
					}
					iap = new IdentificacaoAgentePublico2();
					chave = preencherRegistroTipo01(pag, iap, linha);
					pag.getIdentificacaoAgentePublico().add(iap);
					mapaGeral.put(chave, pag);

				}
			}
			linha = br.readLine();

		}

		// String nome = nomeArquivo ;
		Map.Entry<String, PagamentoFolhaOrdinariaAgentePublico> entry = mapaGeral.entrySet().iterator().next();

		String nomeArquivo = getNomeFormatado(entry.getKey(), String.valueOf(pag.getDescritor().getAnoExercicio()),
				String.valueOf(pag.getDescritor().getMesExercicio()), this.nomeArquivo);

		logger.info("GERANDO OS DADOS DO ARQUIVO " + nomeArquivo + " PARA: " + nomeArquivo);
		System.out.println("GERANDO OS DADOS DO ARQUIVO " + nomeArquivo + " PARA: " + nomeArquivo);

		mapaGeral.clear();

		if (caminhoTemp == null) {
			caminhoTemp = createTemporaryDirectory(Paths.get(caminhoArquivoLeitura));
		}

		String arquivoParaSerGerado = caminhoTemp + "//" + nomeArquivo;

		try {
			gerarArquivoXML(pag, arquivoParaSerGerado);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (linha == null) {
			br.close();
		} else {
			getLinhas(br, linha);
		}

	}

	private void preencherDescritor(PagamentoFolhaOrdinariaAgentePublico pag, String linha) {
		 anoExercicio = linha.substring(16, 20).replaceAll("\\|", "");
		String tipoDocumento = linha.substring(20, 120).replaceAll("\\|", "");
		String entidade = linha.substring(120, 125).replaceAll("\\|", "");
		String municipio = linha.substring(125, 129).replaceAll("\\|", "");
		SimpleDateFormat sfd = new SimpleDateFormat("yyyy-MM-dd");
		String dataCriacaoXML = sfd.format(new Date());
		// String mesExercicio = linha.substring(139, 141).replaceAll("\\|", "");
		/**
		 * Pegar o mes de exercicio na posição 155, que corresponde ao mes competente da
		 * alta - 2017-01-24
		 * 
		 */
		String mesExercicio = linha.substring(154, 156).replaceAll("\\|", "");
		String mesPagamento = linha.substring(160, 162).replaceAll("\\|", "");
		String anoPagamento = linha.substring(156, 160).replaceAll("\\|", "");

		TipoDocumento tpDoc = new TipoDocumento();
		tpDoc.setValue(tipoDocumento);

		DescritorMensal des = new DescritorMensal(anoExercicio, tpDoc, entidade, municipio, dataCriacaoXML,
				mesExercicio);
		pag.setMesPagamento(mesPagamento);
		pag.setAnoPagamento(anoPagamento);
		pag.setDescritor(des);

	}

	private String preencherRegistroTipo01(PagamentoFolhaOrdinariaAgentePublico pag, IdentificacaoAgentePublico2 iap,
			String linha) {

		String codigoCliente = linha.substring(2, 5).replaceAll("\\|", "");
		// String cpf = linha.substring(5, 16).replaceAll("\\|", "");

		// String dataCriacaoXML = linha.substring(129,
		// 139).replaceAll("\\|", "");

		// String fillerCh = linha.substring(141, 154).replaceAll("\\|", "");
		// String mesCompetencia = linha.substring(154, 156).replaceAll("\\|",
		// "");

		String cpfCod = linha.substring(162, 164).replaceAll("\\|", "");
		String cpfNum = linha.substring(164, 175).replaceAll("\\|", "");

		String municipioLotacao = linha.substring(175, 179).replaceAll("\\|", "");
		String entidadeLotacao = linha.substring(179, 184).replaceAll("\\|", "");
		String codigoCargo = linha.substring(184, 194).replaceAll("\\|", "");
		String formaPagamento = linha.substring(194, 195).replaceAll("\\|", "");
		String numeroBanco = linha.substring(195, 450).replaceAll("\\|", "");
		String agencia = linha.substring(450, 705).replaceAll("\\|", "");
		String contaCorrente = linha.substring(705, 960).replaceAll("\\|", "");

		String vlrPgCtaCorr = linha.substring(960, 973).replaceAll("\\|", "");
		String vlrPgOutraCorr = linha.substring(973, 986).replaceAll("\\|", "");
		// String filler = linha.substring(986, 1017);

		iap.setAgencia(agencia);
		iap.setCodigoCargo(codigoCargo);

		// iap.setCodigoFuncao(codigoFuncao);
		iap.setContaCorrente(contaCorrente);
		CPF cpF = new CPF();
		cpF.setNumero(cpfNum);
		cpF.setTipo(cpfCod);
		iap.setCpf(cpF);
		iap.setEntidadeLotacao(entidadeLotacao);
		iap.setFormaPagamento(formaPagamento);
		iap.setMunicipioLotacao(municipioLotacao);
		iap.setNumeroBanco(numeroBanco);
		iap.setEntidadeLotacao(entidadeLotacao);
		IdentificacaoAgentePublico2.Valores valores = new IdentificacaoAgentePublico2.Valores();
		valores.setValorPagoContaCorrente(vlrPgCtaCorr);
		valores.setValorPagoOutrasFormas(vlrPgOutraCorr);
		iap.setValores(valores);

		// pag.getIdentificacaoAgentePublico().add(iap);
		return codigoCliente;
	}

	public void gerarArquivoXML(PagamentoFolhaOrdinariaAgentePublico pag, String nomeArquivo)
			throws DatatypeConfigurationException, JAXBException, FileNotFoundException {

		br.gov.model.pagamento.PagamentoFolhaOrdinariaAgentePublico pagT = obj
				.createPagamentoFolhaOrdinariaAgentePublico();

		pagT.setDescritor(preencherDescritor(pag.getDescritor()));
		pagT.setAnoPagamento(pag.getAnoPagamento());
		// pagT.setMesCompetencia(12);
		pagT.setMesPagamento(pag.getMesPagamento());
		for (int i = 0; i < pag.getIdentificacaoAgentePublico().size(); i++)
			pagT.getIdentificacaoAgentePublico()
					.add(preencherIdentificadorAgentePublico2(pag.getIdentificacaoAgentePublico().get(i)));
		// System.out.println("ARQUIVO PARA SER GERADO " + nomeArquivo + "FOLHA
		// ORDINARIA "
		// + folha.getIdentificacaoAgentePublico().size());
		salvarArquivo(pagT, br.gov.model.pagamento.PagamentoFolhaOrdinariaAgentePublico.class, nomeArquivo);

	}

	private DescritorMensalT preencherDescritor(DescritorMensal descritor) {
		DescritorMensalT des = obj.createDescritorMensalT();
		des.setAnoExercicio(descritor.getAnoExercicio());
		if (descritor.getTipoDocumento().getValue().contains("PAGAMENTO")) {
			des.setTipoDocumento(TipoDocumentoT.PAGAMENTO_DE_FOLHA_ORDINÁRIA);
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
		if (linha.contains("PAGAMENTO DE FOLHA ORDINARIA")) {
			return true;
		} else {
			return false;
		}
	}



	private br.gov.model.pagamento.IdentificacaoAgentePublico preencherIdentificadorAgentePublico2(
			IdentificacaoAgentePublico2 agentePublico) {
		br.gov.model.pagamento.IdentificacaoAgentePublico t1 = obj.createIdentificacaoAgentePublico();
		t1.setAgencia(agentePublico.getAgencia());
		t1.setCodigoCargo(agentePublico.getCodigoCargo());
		t1.setCodigoFuncao(agentePublico.getCodigoFuncao());
		t1.setContaCorrente(agentePublico.getContaCorrente());
		t1.setCPF(agentePublico.getCpfT());
		t1.setEntidadeLotacao(agentePublico.getEntidadeLotacao());
		t1.setFormaPagamento(agentePublico.getFormaPagamento());
		t1.setMunicipioLotacao(agentePublico.getMunicipioLotacao());
		t1.setNumeroBanco(agentePublico.getNumeroBanco());
		t1.setValores(preencherValores(agentePublico));

		return t1;

	}

	private br.gov.model.pagamento.IdentificacaoAgentePublico.Valores preencherValores(
			IdentificacaoAgentePublico2 agentePublico) {

		br.gov.model.pagamento.IdentificacaoAgentePublico.Valores valores = obj
				.createIdentificacaoAgentePublicoValores();
		valores.setValorPagoContaCorrente(agentePublico.getValores().getValorPagoContaCorrente());
		valores.setValorPagoOutrasFormas(agentePublico.getValores().getValorPagoOutrasFormas());

		return valores;

	}

	public String getCaminhoLeitura() {
		return new Utils().getCaminhoPagamentoFolha();
	}

	public String getLocationMashaller() {
		return "http://www.tce.sp.gov.br/audesp/xml/remuneracao ../folhaOrdinaria/AUDESP_PAGAMENTO_FOLHA_ORDINARIA_AGENTE_PUBLICO_"+anoExercicio+"_A.XSD";
	}

	public void upload(BufferedReader isr, String nome, String linha) throws Exception {
		logger.info("UPLOAD:: " + "Upload Pagamento Folha Agente Publico" + nome);
		Arquivos arq = new Arquivos();
		nomeArquivo = nome;

		leituraArquivo(isr, linha);
		String key = "";
		for (Map.Entry<String, PagamentoFolhaOrdinariaAgentePublico> entry : mapaGeral.entrySet()) {
			key = entry.getKey().replaceAll(" ", "");
			PagamentoFolhaOrdinariaAgentePublico cad = entry.getValue();
			
			String nomeArquivo = getNomeFormatado(key, String.valueOf(cad.getDescritor().getAnoExercicio()),
					String.valueOf(cad.getDescritor().getMesExercicio()), nome);
			String caminho = caminhoArquivoLeitura + "//" + key.substring(0, 3);
			arq.verificarDiretorio(caminho);

			String arquivoParaSerGerado = caminho + "//" + nomeArquivo;

			gerarArquivoXML(cad, arquivoParaSerGerado);
			gerarArquivoXML(cad, CAMINHOTRANSMISSAO + "//" + nomeArquivo);

		}
		mapaGeral.clear();

	}
}