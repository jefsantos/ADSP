package br.gov.controller.prodesp;

import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import br.gov.bean.folhaSuplementar.CPF;
import br.gov.bean.folhaSuplementar.DescritorMensal;
import br.gov.bean.folhaSuplementar.FolhaSuplementarAgentePublico;
import br.gov.bean.folhaSuplementar.IdentificacaoAgentePublicoExt;
import br.gov.bean.folhaSuplementar.TipoDocumento;
import br.gov.bean.folhaSuplementar.TipoVerbaRemuneratoria;
import br.gov.bean.folhaSuplementar.Verbas;
import br.gov.model.folhaSuplementar.CPFT;
import br.gov.model.folhaSuplementar.DescritorMensalT;
import br.gov.model.folhaSuplementar.FolhaSuplementarAgentePublicoT;
import br.gov.model.folhaSuplementar.IdentificacaoAgentePublicoExtT;
import br.gov.model.folhaSuplementar.ObjectFactory;
import br.gov.model.folhaSuplementar.TipoDocumentoT;
import br.gov.model.folhaSuplementar.VerbasT;
import br.gov.prodesp.bean.Arquivos;
import br.gov.prodesp.exception.TipoArquivoIncorretoException;

public class FolhaSuplementarAgentePublicoController extends GenericoController {

	private ObjectFactory obj = new ObjectFactory();
	final Logger logger = Logger.getLogger(this.getClass().getName());
	Map<String, FolhaSuplementarAgentePublico> mapaGeral = new HashMap<String, FolhaSuplementarAgentePublico>();

	static final String agentePublico = "01";
	static final String verbas = "02";
	static final String pensionistas = "03";
	static final String verbasPensionistas = "04";
	String anoExercicio;

	public void rotinaFolhaSuplementar() throws Exception {
		rotina();
	}

	public void lerArquivo(String nome) throws Exception {
		Arquivos arq = new Arquivos();
		System.out.println("LENDO O ARQUIVO " + nome);
		logger.info("LENDO O ARQUIVO " + nome);
		try {
			leituraArquivo(caminhoArquivoLeitura + "//" + nome);
			arq.verificarDiretorio(caminhoArquivoLeitura + "//" + "Lidos");
			String nomeFormatado = getNomeFormatado(nome);
			renomerArquivoPastaLidos(arq, nome, nomeFormatado);
		} catch (Exception e) {
			System.out.println("ERRO AO LER O ARQUIVO " + nome);
			logger.info("ERRO AO LER O ARQUIVO " + caminhoArquivoLeitura);
			arq.verificarDiretorio(caminhoArquivoLeitura + "//" + "Erros");
			String nomeFormatado = getNomeFormatado(nome, "");
			renomerArquivoComErros(arq, nome, nomeFormatado);
			mapaGeral.clear();

		}

	}

	protected void getLinhas(BufferedReader br, String linha) throws IOException {
		String codCliente = "";

		FolhaSuplementarAgentePublico folhaSuplementar = new FolhaSuplementarAgentePublico();
		IdentificacaoAgentePublicoExt agPubl = null;
		// String linhaAnterior = "";

		while (linha != null) {
			if (linha.length() > 0) {
				String tipoRegistro = linha.substring(0, 2).replaceAll("\\|", "");
				codCliente = linha.substring(2, 5).replaceAll("\\|", "");
				if (tipoRegistro.equals(agentePublico)) {

					if (agPubl != null) {

						if (!mapaGeral.containsKey(codCliente)) {
							break;
						} else {
							folhaSuplementar = mapaGeral.get(codCliente);
							folhaSuplementar.getListaIdentificacaoAgentePublico().add(agPubl);

						}
					} else {
						preencherDescritor(folhaSuplementar, linha);
					}

					agPubl = new IdentificacaoAgentePublicoExt();
					preencherRegistro_01(linha, folhaSuplementar, agPubl);
					mapaGeral.put(codCliente, folhaSuplementar);

				} else if (tipoRegistro.equals(verbas)) {
					preencherRegistro_02(linha, agPubl);
				} else if (tipoRegistro.equals(pensionistas)) {
					System.out.println(pensionistas);
					throw new RuntimeException();
					// preencherRegistro_03(linha, folhaOrdinaria);
				} else if (tipoRegistro.equals(verbasPensionistas)) {
					System.out.println(verbasPensionistas);
					throw new RuntimeException();
					// preencherRegistro_04(linha);
				}
			}
			linha = br.readLine();

		}

		folhaSuplementar.getListaIdentificacaoAgentePublico().add(agPubl);
		String nome = nomeArquivo;
		Map.Entry<String, FolhaSuplementarAgentePublico> entry = mapaGeral.entrySet().iterator().next();

		String nomeArquivo = getNomeFormatado(entry.getKey(),
				String.valueOf(folhaSuplementar.getDescritor().getAnoExercicio()),
				String.valueOf(folhaSuplementar.getDescritor().getMesExercicio()), nome);

		logger.info("GERANDO OS DADOS DO ARQUIVO " + nome + " PARA: " + nomeArquivo);
		System.out.println("GERANDO OS DADOS DO ARQUIVO " + nome + " PARA: " + nomeArquivo);

		if (caminhoTemp == null) {
			caminhoTemp = createTemporaryDirectory(Paths.get(caminhoArquivoLeitura));
		}

		String arquivoParaSerGerado = caminhoTemp + "//" + nomeArquivo;
		mapaGeral.clear();

		try {
			gerarArquivoXML(folhaSuplementar, arquivoParaSerGerado);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (linha == null) {
			br.close();

		} else {

			getLinhas(br, linha);
		}

	}

	public void gerarArquivoXML(FolhaSuplementarAgentePublico folhaSuplementar, String nomeArquivo)
			throws TipoArquivoIncorretoException, Exception {
		FolhaSuplementarAgentePublicoT folhaT = obj.createFolhaSuplementarAgentePublicoT();

		DescritorMensalT des = preencherDescritor(folhaSuplementar.getDescritor());
		// folhaT.setMesCompetencia(folhaSuplementar.getMesCompetencia());
		folhaT.setDataPagamento(folhaSuplementar.getDataPagamento());

		for (int i = 0; i < folhaSuplementar.getListaIdentificacaoAgentePublico().size(); i++) {
			folhaT.getIdentificacaoAgentePublico().add(preencherIdentificacaoAgentePublicoExtT(
					folhaSuplementar.getListaIdentificacaoAgentePublico().get(i)));
		}

		folhaT.setDescritor(des);

		salvarArquivo(folhaT, FolhaSuplementarAgentePublicoT.class, nomeArquivo);

	}

	private void preencherDescritor(FolhaSuplementarAgentePublico folhaSuplementar, String linha) {

		 anoExercicio = linha.substring(16, 20).replaceAll("\\|", "");
		String tipoDocumento = linha.substring(20, 120).replaceAll("\\|", "");
		String entidade = linha.substring(120, 125).replaceAll("\\|", "");
		String municipio = linha.substring(125, 129).replaceAll("\\|", "");
		String mesExercicio = linha.substring(152, 154).replaceAll("\\|", "");
		String mesCompetencia = linha.substring(154, 156).replaceAll("\\|", "");
		String dataPagamento = linha.substring(156, 166).replaceAll("\\|", "");

		SimpleDateFormat sfd = new SimpleDateFormat("yyyy-MM-dd");
		String dataCriacaoXml = sfd.format(new Date());
		TipoDocumento tp = new TipoDocumento();
		tp.setValor(tipoDocumento);

		DescritorMensal des = new DescritorMensal(anoExercicio, tp, entidade, municipio, dataCriacaoXml, mesExercicio);
		folhaSuplementar.setDescritor(des);
		folhaSuplementar.setMesCompetencia(mesCompetencia);
		folhaSuplementar.setDataPagamento(dataPagamento);
	}

	private void preencherRegistro_01(String linha, FolhaSuplementarAgentePublico folhaSuplementar,
			IdentificacaoAgentePublicoExt agPubl) {
		// String chave = linha.substring(5, 16).replaceAll("\\|", "");

		// String dataCriacaoXml = linha.substring(129, 139).replaceAll("\\|",
		// "");
		// String filler = linha.substring(139, 152).replaceAll("\\|", "");

		String tipo = linha.substring(166, 168).replaceAll("\\|", "");
		String numeroCpf = linha.substring(168, 179).replaceAll("\\|", "");
		String nome = linha.substring(179, 434).replaceAll("\\|", "");

		String municipioLotacao = linha.substring(434, 438).replaceAll("\\|", "");
		String entidadeLotacao = linha.substring(438, 443).replaceAll("\\|", "");
		String cargoPolitico = linha.substring(443, 444).replaceAll("\\|", "");
		String funcaoGoverno = linha.substring(444, 446).replaceAll("\\|", "");
		String estagiario = linha.substring(446, 447).replaceAll("\\|", "");
		String codigoCargo = linha.substring(447, 497).replaceAll("\\|", "");
		String situacao = linha.substring(497, 502).replaceAll("\\|", "");
		String regimeJuridico = linha.substring(502, 503).replaceAll("\\|", "");
		String possuiAutor = linha.substring(503, 504).replaceAll("\\|", "");
		String numeroProcesso = linha.substring(504, 505).replaceAll("\\|", "");
		String formaPagamento = linha.substring(505, 506).replaceAll("\\|", "");
		String numeroBanco = linha.substring(506, 761).replaceAll("\\|", "");
		String agencia = linha.substring(761, 1016).replaceAll("\\|", "");
		String contaCorrente = linha.substring(1016, 1271).replaceAll("\\|", "");

		String totRemBruta = linha.substring(1271, 1284).replaceAll("\\|", "");
		String totDesc = linha.substring(1284, 1297).replaceAll("\\|", "");
		String totLiquido = linha.substring(1297, 1310).replaceAll("\\|", "");
		String vlPgCC = linha.substring(1310, 1323).replaceAll("\\|", "");
		String vlPgOutraCC = linha.substring(1323, 1336).replaceAll("\\|", "").trim();
		if (vlPgOutraCC.equals("")) {
			vlPgOutraCC = "0.0";
		}

		// String filler2 = linha.substring(583, 600).replaceAll("\\|", "");

		agPubl.setCargoPolitico(Short.parseShort(cargoPolitico));
		agPubl.setCodigoCargo(codigoCargo);
		agPubl.setCodigoFuncao(funcaoGoverno);
		CPF cpf = new CPF();
		cpf.setNumero(numeroCpf);
		cpf.setTipo(tipo);

		agPubl.setCpf(cpf);
		agPubl.setEntidadeLotacao(entidadeLotacao);
		agPubl.setEstagiario(estagiario);
		agPubl.setFuncaoGoverno(funcaoGoverno);
		agPubl.setMunicipioLotacao(municipioLotacao);
		agPubl.setNome(nome);
		agPubl.setFormaPagamento(formaPagamento);
		agPubl.setAgencia(agencia);
		agPubl.setNumeroBanco(numeroBanco);
		agPubl.setContaCorrente(contaCorrente);

		if (!numeroProcesso.trim().equals("")) {
			agPubl.setNumeroProcessoJudicial(numeroProcesso);
		}
		if (!possuiAutor.trim().equals("")) {
			agPubl.setPossuiAutorizRecebAcimaTeto(possuiAutor);
		}

		if (!regimeJuridico.trim().equals("")) {
			agPubl.setRegimeJuridico(regimeJuridico);
		}

		if (!situacao.trim().equals("")) {
			agPubl.setSituacao(situacao);
		}

		agPubl.getValores().setTotalGeralDaRemuneracaoBruta(totRemBruta);
		agPubl.getValores().setTotalGeralDaRemuneracaoLiquida(totLiquido);
		agPubl.getValores().setTotalGeralDeDescontos(totDesc);
		agPubl.getValores().setValorPagoContaCorrente(vlPgCC);

		agPubl.getValores().setValorPagoOutrasFormas(vlPgOutraCC);

	}

	private void preencherRegistro_02(String linha, IdentificacaoAgentePublicoExt agPubl) {
		String municipioVerba = linha.substring(152, 156).replaceAll("\\|", "");
		String entidadeVerba = linha.substring(156, 161).replaceAll("\\|", "");
		String codVerba = linha.substring(161, 211).replaceAll("\\|", "");
		String valorVerba = linha.substring(211, 224).replaceAll("\\|", "");
		String naturezaVerba = linha.substring(224, 225).replaceAll("\\|", "");
		String especie = linha.substring(225, 226).replaceAll("\\|", "");
		String tipoVerbaRemuneratoria = linha.substring(226, 229).replaceAll("\\|", "");
		
		String quantidadeHorasExtras = linha.substring(229, 235).replaceAll("\\|", "");
		String quantidadeDiasFerias = linha.substring(235, 238).replaceAll("\\|", "");
		String quantidadeDiasLicencaPremio = linha.substring(238, 241).replaceAll("\\|", "");
		String complementoHorasExtras = quantidadeHorasExtras;
		String complementoDiasFerias = quantidadeDiasFerias;
		String complementoDiasLicencaPremio = quantidadeDiasLicencaPremio;
		
		
	

		Verbas vb = new Verbas();
		vb.setMunicipioVerbaRemuneratoria(municipioVerba);
		vb.setEspecie(especie);
		vb.setEntidadeVerbaRemuneratoria(entidadeVerba);
		vb.setNatureza(naturezaVerba);
		vb.setCodigoVerbaRemuneratoria(codVerba);
		vb.setValor(valorVerba);
		
		//quantidade horas extras OPEN///
		if( !quantidadeHorasExtras.isEmpty() && !quantidadeHorasExtras.equalsIgnoreCase("0.00"))
			vb.setQuantidadeHorasExtras(quantidadeHorasExtras);
		
		if(complementoHorasExtras.equalsIgnoreCase("0.00"))
			vb.setComplementoHorasExtras(complementoHorasExtras);

		//quantidade horas extras OPEN///
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////<-->
		if(!quantidadeDiasFerias.isEmpty() && !quantidadeDiasFerias.equalsIgnoreCase("000"))
			vb.setQuantidadeDiasFerias(quantidadeDiasFerias);
		
		if(complementoDiasFerias.equalsIgnoreCase("000"))
			vb.setComplementoDiasFerias(complementoDiasFerias);
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////<-->		
		if(!quantidadeDiasLicencaPremio.isEmpty() && !quantidadeDiasLicencaPremio.equalsIgnoreCase("000")) 
			vb.setQuantidadeDiasLicencaPremio(quantidadeDiasLicencaPremio);
		
		if(complementoDiasLicencaPremio.equalsIgnoreCase("000"))
			vb.setComplementoDiasLicencaPremio(complementoDiasLicencaPremio);
	

	
		
		
		TipoVerbaRemuneratoria vr = new TipoVerbaRemuneratoria();
		// if(!tipoVerbaRemuneratoria.trim().equals("")){
		vr.setCodigoTipoVerbaRemuneratoria(tipoVerbaRemuneratoria);
		// }else{
		// System.out.println("VERIFICAR>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+
		// tipoVerbaRemuneratoria);

		// }
		vb.setTipoVerbaRemuneratoria(vr);
System.out.println("linha 336: " + complementoHorasExtras);
		agPubl.getValores().getVerbas().add(vb);
	}

	private DescritorMensalT preencherDescritor(DescritorMensal descritor) {
		DescritorMensalT des = obj.createDescritorMensalT();
		des.setAnoExercicio(descritor.getAnoExercicio());
		if (descritor.getTipoDocumento().getValor().contains("SUPLEMENTAR")) {
			des.setTipoDocumento(TipoDocumentoT.FOLHA_SUPLEMENTAR);
		} else {
			throw new TipoArquivoIncorretoException();
		}
		des.setEntidade(descritor.getEntidade());
		des.setMunicipio(descritor.getMunicipio());
		des.setMesExercicio(descritor.getMesExercicio());
		des.setDataCriacaoXML(descritor.getDataCriacaoXML());
		return des;
	}

	protected boolean isArquivoLayoutCorreto(String linha) {
		if (linha.contains("SUPLEMENTAR")) {
			return true;
		} else {
			return false;
		}
	}

	private CPFT preencherCPFT(CPF cpF) {
		CPFT cpf = obj.createCPFT();
		cpf.setNumero(cpF.getNumero());
		cpf.setTipo(cpF.getTipo());
		return cpf;

	}

	private IdentificacaoAgentePublicoExtT preencherIdentificacaoAgentePublicoExtT(IdentificacaoAgentePublicoExt agp) {
		IdentificacaoAgentePublicoExtT agentePublico = obj.createIdentificacaoAgentePublicoExtT();
		agentePublico.setCargoPolitico(agp.getCargoPolitico());
		agentePublico.setCodigoCargo(agp.getCodigoCargo());
		// agentePublico.setCodigoFuncao(agp.getCodigoFuncao());
		agentePublico.setCPF(preencherCPFT(agp.getCpf()));
		agentePublico.setEntidadeLotacao(agp.getEntidadeLotacao());
		agentePublico.setEstagiario(agp.getEstagiario());
		agentePublico.setFuncaoGoverno(agp.getFuncaoGoverno());
		agentePublico.setMunicipioLotacao(agp.getMunicipioLotacao());
		agentePublico.setNome(agp.getNome());
		agentePublico.setNumeroProcessoJudicial(agp.getNumeroProcessoJudicial());
		agentePublico.setSituacao(agp.getSituacao());
		agentePublico.setPossuiAutorizRecebAcimaTeto(agp.getPossuiAutorizRecebAcimaTeto());
		agentePublico.setRegimeJuridico(agp.getRegimeJuridico());
		agentePublico.setSituacao(agp.getSituacao());
		agentePublico.setValores(preencherValores(agp.getValores()));
		agentePublico.setAgencia(agp.getAgencia());
		agentePublico.setFormaPagamento(agp.getFormaPagamento());
		agentePublico.setContaCorrente(agp.getContaCorrente());
		agentePublico.setNumeroBanco(agp.getNumeroBanco());

		return agentePublico;
	}

	private IdentificacaoAgentePublicoExtT.Valores preencherValores(IdentificacaoAgentePublicoExt.Valores remuneracao) {

		IdentificacaoAgentePublicoExtT.Valores valores = obj.createIdentificacaoAgentePublicoExtTValores();
		valores.setTotalGeralDaRemuneracaoBruta(remuneracao.getTotalGeralDaRemuneracaoBruta());
		valores.setTotalGeralDaRemuneracaoLiquida(remuneracao.getTotalGeralDaRemuneracaoLiquida());
		valores.setTotalGeralDeDescontos(remuneracao.getTotalGeralDeDescontos());
		valores.setValorPagoContaCorrente(remuneracao.getValorPagoContaCorrente());
		valores.setValorPagoOutrasFormas(remuneracao.getValorPagoOutrasFormas());

		for (int i = 0; i < remuneracao.getVerbas().size(); i++) {
			valores.getVerbas().add(preencherVerbasT(remuneracao.getVerbas().get(i)));
		}

		return valores;

	}

	private VerbasT preencherVerbasT(Verbas vb) {
		VerbasT verba = obj.createVerbasT();
		verba.setCodigoVerbaRemuneratoria(vb.getCodigoVerbaRemuneratoria());
		System.out.println(vb.getComplementoHorasExtras());
		verba.setEntidadeVerbaRemuneratoria(vb.getEntidadeVerbaRemuneratoria());
		verba.setEspecie(vb.getEspecie());
		verba.setMunicipioVerbaRemuneratoria(vb.getMunicipioVerbaRemuneratoria());
		verba.setNatureza(vb.getNatureza());
		verba.setTipoVerbaRemuneratoria(vb.getTipoVerbaRemuneratoriaT());
		verba.setValor(vb.getValor());

		System.out.println(vb.getComplementoHorasExtras());
		System.out.println(vb.getComplementoDiasFerias());
		System.out.println(vb.getComplementoDiasLicencaPremio());

		if(vb.getQuantidadeHorasExtras()!=null && vb.getQuantidadeHorasExtras() != new BigDecimal("0.00")) 
			verba.setQuantidadeHorasExtras(vb.getQuantidadeHorasExtras());
		
		 if(vb.getComplementoHorasExtras() !=null && vb.getComplementoHorasExtras().toString().equalsIgnoreCase("0.00"))
		verba.setComplementoHorasExtras(vb.getComplementoHorasExtras().toString().replace("0.00", ""));

		
		 
		if(vb.getQuantidadeDiasFerias()!=null && vb.getQuantidadeDiasFerias()!= new Integer("000"))
			verba.setQuantidadeDiasFerias(vb.getQuantidadeDiasFerias());
		
		if((vb.getComplementoDiasFerias() !=null ||vb.getComplementoDiasFerias() == new Integer("000") || vb.getComplementoDiasFerias() == new Integer("0")))
			 verba.setComplementoDiasFerias(vb.getComplementoDiasFerias().toString().replace("0", ""));
		
		///////////////////////////////////////////////////////////////////////////////////////////
		
		if(vb.getQuantidadeDiasLicencaPremio()!=null &&  vb.getQuantidadeDiasLicencaPremio()!= new Integer("000")) 
			verba.setQuantidadeDiasLicencaPremio(vb.getQuantidadeDiasLicencaPremio());
		
				if((vb.getComplementoDiasLicencaPremio() !=null ||vb.getComplementoDiasLicencaPremio() == new Integer("000") || vb.getComplementoDiasLicencaPremio() == new Integer("0")))
						verba.setComplementoDiasLicencaPremio(vb.getComplementoDiasLicencaPremio().toString().replace("0", ""));
		
		
		return verba;

		

	}

	public String getCaminhoLeitura() {
		return new Utils().getCaminhoFolhaSuplementar();
	}

	public String getLocationMashaller() {
		return "http://www.tce.sp.gov.br/audesp/xml/remuneracao ../folhaSuplementar/AUDESP_FOLHA_SUPLEMENTAR_AGENTE_PUBLICO_"+anoExercicio+"_A.XSD";
	}

	public void upload(BufferedReader isr, String nome, String linha) throws Exception {
		logger.info("UPLOAD:: " + "Upload Folha Suplementar" + nome);
		Arquivos arq = new Arquivos();
		nomeArquivo = nome;

		leituraArquivo(isr, linha);
		String key = "";
		for (Map.Entry<String, FolhaSuplementarAgentePublico> entry : mapaGeral.entrySet()) {
			key = entry.getKey().replaceAll(" ", "");
			FolhaSuplementarAgentePublico folhaSuplementar  = entry.getValue();
//			String nomeArquivo = key + "_" + nome.replace(".txt", "").replace(".TXT", "") + ".xml";
			String nomeArquivo = getNomeFormatado(entry.getKey(),
					String.valueOf(folhaSuplementar.getDescritor().getAnoExercicio()),
					String.valueOf(folhaSuplementar.getDescritor().getMesExercicio()), nome);
			String caminho = caminhoArquivoLeitura + "//" + key.substring(0, 3);
			arq.verificarDiretorio(caminho);
			FolhaSuplementarAgentePublico cad = entry.getValue();
			String arquivoParaSerGerado = caminho + "//" + nomeArquivo;

			gerarArquivoXML(cad, arquivoParaSerGerado);
			gerarArquivoXML(cad, CAMINHOTRANSMISSAO + "//" + nomeArquivo);

		}
		mapaGeral.clear();

	}

}


















//package br.gov.controller.prodesp;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.math.BigDecimal;
//import java.nio.file.Paths;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Map;
//
//import org.apache.log4j.Logger;
//
//import br.gov.bean.folhaSuplementar.CPF;
//import br.gov.bean.folhaSuplementar.DescritorMensal;
//import br.gov.bean.folhaSuplementar.FolhaSuplementarAgentePublico;
//import br.gov.bean.folhaSuplementar.IdentificacaoAgentePublicoExt;
//import br.gov.bean.folhaSuplementar.TipoDocumento;
//import br.gov.bean.folhaSuplementar.TipoVerbaRemuneratoria;
//import br.gov.bean.folhaSuplementar.Verbas;
//import br.gov.model.folhaSuplementar.CPFT;
//import br.gov.model.folhaSuplementar.DescritorMensalT;
//import br.gov.model.folhaSuplementar.FolhaSuplementarAgentePublicoT;
//import br.gov.model.folhaSuplementar.IdentificacaoAgentePublicoExtT;
//import br.gov.model.folhaSuplementar.ObjectFactory;
//import br.gov.model.folhaSuplementar.TipoDocumentoT;
//import br.gov.model.folhaSuplementar.VerbasT;
//import br.gov.prodesp.bean.Arquivos;
//import br.gov.prodesp.exception.TipoArquivoIncorretoException;
//
//public class FolhaSuplementarAgentePublicoController extends GenericoController {
//
//	private ObjectFactory obj = new ObjectFactory();
//	final Logger logger = Logger.getLogger(this.getClass().getName());
//	Map<String, FolhaSuplementarAgentePublico> mapaGeral = new HashMap<String, FolhaSuplementarAgentePublico>();
//
//	static final String agentePublico = "01";
//	static final String verbas = "02";
//	static final String pensionistas = "03";
//	static final String verbasPensionistas = "04";
//	String anoExercicio;
//
//	public void rotinaFolhaSuplementar() throws Exception {
//		rotina();
//	}
//
//	public void lerArquivo(String nome) throws Exception {
//		Arquivos arq = new Arquivos();
//		System.out.println("LENDO O ARQUIVO " + nome);
//		logger.info("LENDO O ARQUIVO " + nome);
//		try {
//			leituraArquivo(caminhoArquivoLeitura + "//" + nome);
//			arq.verificarDiretorio(caminhoArquivoLeitura + "//" + "Lidos");
//			String nomeFormatado = getNomeFormatado(nome);
//			renomerArquivoPastaLidos(arq, nome, nomeFormatado);
//		} catch (Exception e) {
//			System.out.println("ERRO AO LER O ARQUIVO " + nome);
//			logger.info("ERRO AO LER O ARQUIVO " + caminhoArquivoLeitura);
//			arq.verificarDiretorio(caminhoArquivoLeitura + "//" + "Erros");
//			String nomeFormatado = getNomeFormatado(nome, "");
//			renomerArquivoComErros(arq, nome, nomeFormatado);
//			mapaGeral.clear();
//
//		}
//
//	}
//
//	protected void getLinhas(BufferedReader br, String linha) throws IOException {
//		String codCliente = "";
//
//		FolhaSuplementarAgentePublico folhaSuplementar = new FolhaSuplementarAgentePublico();
//		IdentificacaoAgentePublicoExt agPubl = null;
//		// String linhaAnterior = "";
//
//		while (linha != null) {
//			if (linha.length() > 0) {
//				String tipoRegistro = linha.substring(0, 2).replaceAll("\\|", "");
//				codCliente = linha.substring(2, 5).replaceAll("\\|", "");
//				if (tipoRegistro.equals(agentePublico)) {
//
//					if (agPubl != null) {
//
//						if (!mapaGeral.containsKey(codCliente)) {
//							break;
//						} else {
//							folhaSuplementar = mapaGeral.get(codCliente);
//							folhaSuplementar.getListaIdentificacaoAgentePublico().add(agPubl);
//
//						}
//					} else {
//						preencherDescritor(folhaSuplementar, linha);
//					}
//
//					agPubl = new IdentificacaoAgentePublicoExt();
//					preencherRegistro_01(linha, folhaSuplementar, agPubl);
//					mapaGeral.put(codCliente, folhaSuplementar);
//
//				} else if (tipoRegistro.equals(verbas)) {
//					preencherRegistro_02(linha, agPubl);
//				} else if (tipoRegistro.equals(pensionistas)) {
//					System.out.println(pensionistas);
//					throw new RuntimeException();
//					// preencherRegistro_03(linha, folhaOrdinaria);
//				} else if (tipoRegistro.equals(verbasPensionistas)) {
//					System.out.println(verbasPensionistas);
//					throw new RuntimeException();
//					// preencherRegistro_04(linha);
//				}
//			}
//			linha = br.readLine();
//
//		}
//
//		folhaSuplementar.getListaIdentificacaoAgentePublico().add(agPubl);
//		String nome = nomeArquivo;
//		Map.Entry<String, FolhaSuplementarAgentePublico> entry = mapaGeral.entrySet().iterator().next();
//
//		String nomeArquivo = getNomeFormatado(entry.getKey(),
//				String.valueOf(folhaSuplementar.getDescritor().getAnoExercicio()),
//				String.valueOf(folhaSuplementar.getDescritor().getMesExercicio()), nome);
//
//		logger.info("GERANDO OS DADOS DO ARQUIVO " + nome + " PARA: " + nomeArquivo);
//		System.out.println("GERANDO OS DADOS DO ARQUIVO " + nome + " PARA: " + nomeArquivo);
//
//		if (caminhoTemp == null) {
//			caminhoTemp = createTemporaryDirectory(Paths.get(caminhoArquivoLeitura));
//		}
//
//		String arquivoParaSerGerado = caminhoTemp + "//" + nomeArquivo;
//		mapaGeral.clear();
//
//		try {
//			gerarArquivoXML(folhaSuplementar, arquivoParaSerGerado);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		if (linha == null) {
//			br.close();
//
//		} else {
//
//			getLinhas(br, linha);
//		}
//
//	}
//
//	public void gerarArquivoXML(FolhaSuplementarAgentePublico folhaSuplementar, String nomeArquivo)
//			throws TipoArquivoIncorretoException, Exception {
//		FolhaSuplementarAgentePublicoT folhaT = obj.createFolhaSuplementarAgentePublicoT();
//
//		DescritorMensalT des = preencherDescritor(folhaSuplementar.getDescritor());
//		// folhaT.setMesCompetencia(folhaSuplementar.getMesCompetencia());
//		folhaT.setDataPagamento(folhaSuplementar.getDataPagamento());
//
//		for (int i = 0; i < folhaSuplementar.getListaIdentificacaoAgentePublico().size(); i++) {
//			folhaT.getIdentificacaoAgentePublico().add(preencherIdentificacaoAgentePublicoExtT(
//					folhaSuplementar.getListaIdentificacaoAgentePublico().get(i)));
//		}
//
//		folhaT.setDescritor(des);
//
//		salvarArquivo(folhaT, FolhaSuplementarAgentePublicoT.class, nomeArquivo);
//
//	}
//
//	private void preencherDescritor(FolhaSuplementarAgentePublico folhaSuplementar, String linha) {
//
//		 anoExercicio = linha.substring(16, 20).replaceAll("\\|", "");
//		String tipoDocumento = linha.substring(20, 120).replaceAll("\\|", "");
//		String entidade = linha.substring(120, 125).replaceAll("\\|", "");
//		String municipio = linha.substring(125, 129).replaceAll("\\|", "");
//		String mesExercicio = linha.substring(152, 154).replaceAll("\\|", "");
//		String mesCompetencia = linha.substring(154, 156).replaceAll("\\|", "");
//		String dataPagamento = linha.substring(156, 166).replaceAll("\\|", "");
//
//		SimpleDateFormat sfd = new SimpleDateFormat("yyyy-MM-dd");
//		String dataCriacaoXml = sfd.format(new Date());
//		TipoDocumento tp = new TipoDocumento();
//		tp.setValor(tipoDocumento);
//
//		DescritorMensal des = new DescritorMensal(anoExercicio, tp, entidade, municipio, dataCriacaoXml, mesExercicio);
//		folhaSuplementar.setDescritor(des);
//		folhaSuplementar.setMesCompetencia(mesCompetencia);
//		folhaSuplementar.setDataPagamento(dataPagamento);
//	}
//
//	private void preencherRegistro_01(String linha, FolhaSuplementarAgentePublico folhaSuplementar,
//			IdentificacaoAgentePublicoExt agPubl) {
//		// String chave = linha.substring(5, 16).replaceAll("\\|", "");
//
//		// String dataCriacaoXml = linha.substring(129, 139).replaceAll("\\|",
//		// "");
//		// String filler = linha.substring(139, 152).replaceAll("\\|", "");
//
//		String tipo = linha.substring(166, 168).replaceAll("\\|", "");
//		String numeroCpf = linha.substring(168, 179).replaceAll("\\|", "");
//		String nome = linha.substring(179, 434).replaceAll("\\|", "");
//
//		String municipioLotacao = linha.substring(434, 438).replaceAll("\\|", "");
//		String entidadeLotacao = linha.substring(438, 443).replaceAll("\\|", "");
//		String cargoPolitico = linha.substring(443, 444).replaceAll("\\|", "");
//		String funcaoGoverno = linha.substring(444, 446).replaceAll("\\|", "");
//		String estagiario = linha.substring(446, 447).replaceAll("\\|", "");
//		String codigoCargo = linha.substring(447, 497).replaceAll("\\|", "");
//		String situacao = linha.substring(497, 502).replaceAll("\\|", "");
//		String regimeJuridico = linha.substring(502, 503).replaceAll("\\|", "");
//		String possuiAutor = linha.substring(503, 504).replaceAll("\\|", "");
//		String numeroProcesso = linha.substring(504, 505).replaceAll("\\|", "");
//		String formaPagamento = linha.substring(505, 506).replaceAll("\\|", "");
//		String numeroBanco = linha.substring(506, 761).replaceAll("\\|", "");
//		String agencia = linha.substring(761, 1016).replaceAll("\\|", "");
//		String contaCorrente = linha.substring(1016, 1271).replaceAll("\\|", "");
//
//		String totRemBruta = linha.substring(1271, 1284).replaceAll("\\|", "");
//		String totDesc = linha.substring(1284, 1297).replaceAll("\\|", "");
//		String totLiquido = linha.substring(1297, 1310).replaceAll("\\|", "");
//		String vlPgCC = linha.substring(1310, 1323).replaceAll("\\|", "");
//		String vlPgOutraCC = linha.substring(1323, 1336).replaceAll("\\|", "").trim();
//		if (vlPgOutraCC.equals("")) {
//			vlPgOutraCC = "0.0";
//		}
//
//		// String filler2 = linha.substring(583, 600).replaceAll("\\|", "");
//
//		agPubl.setCargoPolitico(Short.parseShort(cargoPolitico));
//		agPubl.setCodigoCargo(codigoCargo);
//		agPubl.setCodigoFuncao(funcaoGoverno);
//		CPF cpf = new CPF();
//		cpf.setNumero(numeroCpf);
//		cpf.setTipo(tipo);
//
//		agPubl.setCpf(cpf);
//		agPubl.setEntidadeLotacao(entidadeLotacao);
//		agPubl.setEstagiario(estagiario);
//		agPubl.setFuncaoGoverno(funcaoGoverno);
//		agPubl.setMunicipioLotacao(municipioLotacao);
//		agPubl.setNome(nome);
//		agPubl.setFormaPagamento(formaPagamento);
//		agPubl.setAgencia(agencia);
//		agPubl.setNumeroBanco(numeroBanco);
//		agPubl.setContaCorrente(contaCorrente);
//
//		if (!numeroProcesso.trim().equals("")) {
//			agPubl.setNumeroProcessoJudicial(numeroProcesso);
//		}
//		if (!possuiAutor.trim().equals("")) {
//			agPubl.setPossuiAutorizRecebAcimaTeto(possuiAutor);
//		}
//
//		if (!regimeJuridico.trim().equals("")) {
//			agPubl.setRegimeJuridico(regimeJuridico);
//		}
//
//		if (!situacao.trim().equals("")) {
//			agPubl.setSituacao(situacao);
//		}
//
//		agPubl.getValores().setTotalGeralDaRemuneracaoBruta(totRemBruta);
//		agPubl.getValores().setTotalGeralDaRemuneracaoLiquida(totLiquido);
//		agPubl.getValores().setTotalGeralDeDescontos(totDesc);
//		agPubl.getValores().setValorPagoContaCorrente(vlPgCC);
//
//		agPubl.getValores().setValorPagoOutrasFormas(vlPgOutraCC);
//
//	}
//
//	private void preencherRegistro_02(String linha, IdentificacaoAgentePublicoExt agPubl) {
//		String municipioVerba = linha.substring(152, 156).replaceAll("\\|", "");
//		String entidadeVerba = linha.substring(156, 161).replaceAll("\\|", "");
//		String codVerba = linha.substring(161, 211).replaceAll("\\|", "");
//		String valorVerba = linha.substring(211, 224).replaceAll("\\|", "");
//		String naturezaVerba = linha.substring(224, 225).replaceAll("\\|", "");
//		String especie = linha.substring(225, 226).replaceAll("\\|", "");
//		String tipoVerbaRemuneratoria = linha.substring(226, 229).replaceAll("\\|", "");
//		
//		String quantidadeHorasExtras = linha.substring(229, 235).replaceAll("\\|", "");
//		String quantidadeDiasFerias = linha.substring(235, 238).replaceAll("\\|", "");
//		String quantidadeDiasLicencaPremio = linha.substring(238, 241).replaceAll("\\|", "");
//		String complementoHorasExtras = quantidadeHorasExtras;
//		String complementoDiasFerias = quantidadeDiasFerias;
//		String complementoDiasLicencaPremio = quantidadeDiasLicencaPremio;
//		
//		
//	
//
//		Verbas vb = new Verbas();
//		vb.setMunicipioVerbaRemuneratoria(municipioVerba);
//		vb.setEspecie(especie);
//		vb.setEntidadeVerbaRemuneratoria(entidadeVerba);
//		vb.setNatureza(naturezaVerba);
//		vb.setCodigoVerbaRemuneratoria(codVerba);
//		vb.setValor(valorVerba);
//		
//		//quantidade horas extras OPEN///
//		if( !quantidadeHorasExtras.isEmpty() && !quantidadeHorasExtras.equalsIgnoreCase("0.00"))
//			vb.setQuantidadeHorasExtras(quantidadeHorasExtras);
//		
//		if(complementoHorasExtras.equalsIgnoreCase("0.00"))
//			vb.setComplementoHorasExtras(complementoHorasExtras);
//
//		//quantidade horas extras OPEN///
//		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////<-->
//		if(!quantidadeDiasFerias.isEmpty() && !quantidadeDiasFerias.equalsIgnoreCase("000"))
//			vb.setQuantidadeDiasFerias(quantidadeDiasFerias);
//		
//		if(complementoDiasFerias.equalsIgnoreCase("000"))
//			vb.setComplementoDiasFerias(complementoDiasFerias);
//		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////<-->		
//		if(!quantidadeDiasLicencaPremio.isEmpty() && !quantidadeDiasLicencaPremio.equalsIgnoreCase("000")) 
//			vb.setQuantidadeDiasLicencaPremio(quantidadeDiasLicencaPremio);
//		
//		if(complementoDiasLicencaPremio.equalsIgnoreCase("000"))
//			vb.setComplementoDiasLicencaPremio(complementoDiasLicencaPremio);
//	
//
//	
//		
//		
//		TipoVerbaRemuneratoria vr = new TipoVerbaRemuneratoria();
//		// if(!tipoVerbaRemuneratoria.trim().equals("")){
//		vr.setCodigoTipoVerbaRemuneratoria(tipoVerbaRemuneratoria);
//		// }else{
//		// System.out.println("VERIFICAR>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+
//		// tipoVerbaRemuneratoria);
//
//		// }
//		vb.setTipoVerbaRemuneratoria(vr);
//System.out.println("linha 336: " + complementoHorasExtras);
//		agPubl.getValores().getVerbas().add(vb);
//	}
//
//	private DescritorMensalT preencherDescritor(DescritorMensal descritor) {
//		DescritorMensalT des = obj.createDescritorMensalT();
//		des.setAnoExercicio(descritor.getAnoExercicio());
//		if (descritor.getTipoDocumento().getValor().contains("SUPLEMENTAR")) {
//			des.setTipoDocumento(TipoDocumentoT.FOLHA_SUPLEMENTAR);
//		} else {
//			throw new TipoArquivoIncorretoException();
//		}
//		des.setEntidade(descritor.getEntidade());
//		des.setMunicipio(descritor.getMunicipio());
//		des.setMesExercicio(descritor.getMesExercicio());
//		des.setDataCriacaoXML(descritor.getDataCriacaoXML());
//		return des;
//	}
//
//	protected boolean isArquivoLayoutCorreto(String linha) {
//		if (linha.contains("SUPLEMENTAR")) {
//			return true;
//		} else {
//			return false;
//		}
//	}
//
//	private CPFT preencherCPFT(CPF cpF) {
//		CPFT cpf = obj.createCPFT();
//		cpf.setNumero(cpF.getNumero());
//		cpf.setTipo(cpF.getTipo());
//		return cpf;
//
//	}
//
//	private IdentificacaoAgentePublicoExtT preencherIdentificacaoAgentePublicoExtT(IdentificacaoAgentePublicoExt agp) {
//		IdentificacaoAgentePublicoExtT agentePublico = obj.createIdentificacaoAgentePublicoExtT();
//		agentePublico.setCargoPolitico(agp.getCargoPolitico());
//		agentePublico.setCodigoCargo(agp.getCodigoCargo());
//		// agentePublico.setCodigoFuncao(agp.getCodigoFuncao());
//		agentePublico.setCPF(preencherCPFT(agp.getCpf()));
//		agentePublico.setEntidadeLotacao(agp.getEntidadeLotacao());
//		agentePublico.setEstagiario(agp.getEstagiario());
//		agentePublico.setFuncaoGoverno(agp.getFuncaoGoverno());
//		agentePublico.setMunicipioLotacao(agp.getMunicipioLotacao());
//		agentePublico.setNome(agp.getNome());
//		agentePublico.setNumeroProcessoJudicial(agp.getNumeroProcessoJudicial());
//		agentePublico.setSituacao(agp.getSituacao());
//		agentePublico.setPossuiAutorizRecebAcimaTeto(agp.getPossuiAutorizRecebAcimaTeto());
//		agentePublico.setRegimeJuridico(agp.getRegimeJuridico());
//		agentePublico.setSituacao(agp.getSituacao());
//		agentePublico.setValores(preencherValores(agp.getValores()));
//		agentePublico.setAgencia(agp.getAgencia());
//		agentePublico.setFormaPagamento(agp.getFormaPagamento());
//		agentePublico.setContaCorrente(agp.getContaCorrente());
//		agentePublico.setNumeroBanco(agp.getNumeroBanco());
//
//		return agentePublico;
//	}
//
//	private IdentificacaoAgentePublicoExtT.Valores preencherValores(IdentificacaoAgentePublicoExt.Valores remuneracao) {
//
//		IdentificacaoAgentePublicoExtT.Valores valores = obj.createIdentificacaoAgentePublicoExtTValores();
//		valores.setTotalGeralDaRemuneracaoBruta(remuneracao.getTotalGeralDaRemuneracaoBruta());
//		valores.setTotalGeralDaRemuneracaoLiquida(remuneracao.getTotalGeralDaRemuneracaoLiquida());
//		valores.setTotalGeralDeDescontos(remuneracao.getTotalGeralDeDescontos());
//		valores.setValorPagoContaCorrente(remuneracao.getValorPagoContaCorrente());
//		valores.setValorPagoOutrasFormas(remuneracao.getValorPagoOutrasFormas());
//
//		for (int i = 0; i < remuneracao.getVerbas().size(); i++) {
//			valores.getVerbas().add(preencherVerbasT(remuneracao.getVerbas().get(i)));
//		}
//
//		return valores;
//
//	}
//
//	private VerbasT preencherVerbasT(Verbas vb) {
//		VerbasT verba = obj.createVerbasT();
//		verba.setCodigoVerbaRemuneratoria(vb.getCodigoVerbaRemuneratoria());
//		System.out.println(vb.getComplementoHorasExtras());
//		verba.setEntidadeVerbaRemuneratoria(vb.getEntidadeVerbaRemuneratoria());
//		verba.setEspecie(vb.getEspecie());
//		verba.setMunicipioVerbaRemuneratoria(vb.getMunicipioVerbaRemuneratoria());
//		verba.setNatureza(vb.getNatureza());
//		verba.setTipoVerbaRemuneratoria(vb.getTipoVerbaRemuneratoriaT());
//		verba.setValor(vb.getValor());
//
//		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		if(vb.getQuantidadeHorasExtras()!=null && vb.getQuantidadeHorasExtras() != new BigDecimal("0.00")) 
//			verba.setQuantidadeHorasExtras(vb.getQuantidadeHorasExtras());
//		
//
//		 if((vb.getComplementoHorasExtras() == new BigDecimal("0.00")))
//			 System.out.println("Horas Extras"+ vb.getComplementoHorasExtras());
//		verba.setComplementoHorasExtras(vb.getComplementoHorasExtras());
//		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		
//		if(vb.getQuantidadeDiasFerias()!=null && vb.getQuantidadeDiasFerias()!= new Integer("000"))
//			verba.setQuantidadeDiasFerias(vb.getQuantidadeDiasFerias());
//
//		if((vb.getComplementoDiasFerias() == new Integer("000") || vb.getComplementoDiasFerias() == new Integer("0")))
//			System.out.println(vb.getComplementoDiasFerias());
//			verba.setComplementoDiasFerias(vb.getComplementoDiasFerias());
//		
//		///////////////////////////////////////////////////////////////////////////////////////////
//		
//		if(vb.getQuantidadeDiasLicencaPremio()!=null &&  vb.getQuantidadeDiasLicencaPremio()!= new Integer("000")) 
//			verba.setQuantidadeDiasLicencaPremio(vb.getQuantidadeDiasLicencaPremio());
//		
//		
//		if((vb.getComplementoDiasLicencaPremio() == new Integer("000")))
//			System.out.println("Licenca Premio: "+vb.getComplementoDiasLicencaPremio());
//						verba.setComplementoDiasLicencaPremio(vb.getComplementoDiasLicencaPremio());
//		
//		
//		return verba;
//		/////Opção Correta
//		
//		
////		if(vb.getQuantidadeHorasExtras()!=null && vb.getQuantidadeHorasExtras() != new BigDecimal("0.00")) 
////			verba.setQuantidadeHorasExtras(vb.getQuantidadeHorasExtras());
////		
////
////		 if((vb.getComplementoHorasExtras() == new BigDecimal("0.00")))
////			 System.out.println(vb.getComplementoHorasExtras());
////		verba.setComplementoHorasExtras(vb.getComplementoHorasExtras());
////		
////		
////		if(vb.getQuantidadeDiasFerias()!=null)
////			verba.setQuantidadeDiasFerias(vb.getQuantidadeDiasFerias());
////		
////		if(vb.getQuantidadeDiasLicencaPremio()!=null)
////			verba.setQuantidadeDiasLicencaPremio(vb.getQuantidadeDiasLicencaPremio());
////		return verba;
//		
//		
//		
//		
//		
//		
//		
//		
//
//	}
//
//	public String getCaminhoLeitura() {
//		return new Utils().getCaminhoFolhaSuplementar();
//	}
//
//	public String getLocationMashaller() {
//		return "http://www.tce.sp.gov.br/audesp/xml/remuneracao ../folhaSuplementar/AUDESP_FOLHA_SUPLEMENTAR_AGENTE_PUBLICO_"+anoExercicio+"_A.XSD";
//	}
//
//	public void upload(BufferedReader isr, String nome, String linha) throws Exception {
//		logger.info("UPLOAD:: " + "Upload Folha Suplementar" + nome);
//		Arquivos arq = new Arquivos();
//		nomeArquivo = nome;
//
//		leituraArquivo(isr, linha);
//		String key = "";
//		for (Map.Entry<String, FolhaSuplementarAgentePublico> entry : mapaGeral.entrySet()) {
//			key = entry.getKey().replaceAll(" ", "");
//			FolhaSuplementarAgentePublico folhaSuplementar  = entry.getValue();
////			String nomeArquivo = key + "_" + nome.replace(".txt", "").replace(".TXT", "") + ".xml";
//			String nomeArquivo = getNomeFormatado(entry.getKey(),
//					String.valueOf(folhaSuplementar.getDescritor().getAnoExercicio()),
//					String.valueOf(folhaSuplementar.getDescritor().getMesExercicio()), nome);
//			String caminho = caminhoArquivoLeitura + "//" + key.substring(0, 3);
//			arq.verificarDiretorio(caminho);
//			FolhaSuplementarAgentePublico cad = entry.getValue();
//			String arquivoParaSerGerado = caminho + "//" + nomeArquivo;
//
//			gerarArquivoXML(cad, arquivoParaSerGerado);
//			gerarArquivoXML(cad, CAMINHOTRANSMISSAO + "//" + nomeArquivo);
//
//		}
//		mapaGeral.clear();
//
//	}
//
//}