package br.gov.controller.prodesp;

import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import br.gov.bean.folhaOrdinaria.CPF;
import br.gov.bean.folhaOrdinaria.CPFComAtributo;
import br.gov.bean.folhaOrdinaria.CertidaoNascimentoComAtributo;
import br.gov.bean.folhaOrdinaria.DescritorMensal;
import br.gov.bean.folhaOrdinaria.FolhaOrdinariaAgentePublico;
import br.gov.bean.folhaOrdinaria.IdentificacaoAgentePublicoExt;
import br.gov.bean.folhaOrdinaria.IdentificacaoPensionistaExt;
import br.gov.bean.folhaOrdinaria.PISPASEPComAtributo;
import br.gov.bean.folhaOrdinaria.RGComAtributo;
import br.gov.bean.folhaOrdinaria.TipoDocumento;
import br.gov.bean.folhaOrdinaria.TipoDocumentoIdentificacaoIndividual;
import br.gov.bean.folhaOrdinaria.TipoVerbaRemuneratoria;
import br.gov.bean.folhaOrdinaria.Verbas;
import br.gov.model.folhaOrdinaria.CPFT;
import br.gov.model.folhaOrdinaria.DescritorMensalT;
import br.gov.model.folhaOrdinaria.FolhaOrdinariaAgentePublicoT;
import br.gov.model.folhaOrdinaria.IdentificacaoAgentePublicoExtT;
import br.gov.model.folhaOrdinaria.IdentificacaoPensionistaExtT;
import br.gov.model.folhaOrdinaria.ObjectFactory;
import br.gov.model.folhaOrdinaria.TipoDocumentoT;
import br.gov.model.folhaOrdinaria.TipoVerbaRemuneratoriaT;
import br.gov.model.folhaOrdinaria.VerbasT;
import br.gov.prodesp.bean.Arquivos;
import br.gov.prodesp.exception.TipoArquivoIncorretoException;

public class FolhaOrdinariaAgentePublicoController extends GenericoController {

	static ObjectFactory obj = new ObjectFactory();
	final Logger logger = Logger.getLogger(this.getClass().getName());
	static Map<String, FolhaOrdinariaAgentePublico> mapaGeral = new HashMap<String, FolhaOrdinariaAgentePublico>();
	static final String agentePublico = "01";
	static final String verbas = "02";
	static final String pensionistas = "03";
	static final String verbasPensionistas = "04";
	
	String anoExercicio = "";

	protected void getLinhas(BufferedReader br, String linha) throws IOException {
		String codCliente = "";
		FolhaOrdinariaAgentePublico folhaOrdinaria = new FolhaOrdinariaAgentePublico();
		IdentificacaoAgentePublicoExt agPubl = null;
		List<Verbas> listaVerbasPensionista = null;

		while (linha != null) {

			if (linha.length() > 0) {
				codCliente = linha.substring(2, 5).replaceAll("\\|", "");
				String tipoRegistro = linha.substring(0, 2).replaceAll("\\|", "");

				if (tipoRegistro.equals(agentePublico)) {

					if (agPubl != null) {

						if (!mapaGeral.containsKey(codCliente)) {
							break;

						} else {
							folhaOrdinaria = mapaGeral.get(codCliente);
							folhaOrdinaria.getListaIdentificacaoAgentePublico().add(agPubl);
						}
						
					} else {
						preencherDescritor(folhaOrdinaria, linha);
					}
					agPubl = new IdentificacaoAgentePublicoExt();
					preencherRegistro_01(linha, folhaOrdinaria, agPubl);
					

					// linhaAnterior = linha;
					listaVerbasPensionista = new ArrayList<Verbas>();
					mapaGeral.put(codCliente, folhaOrdinaria);
				} else if (tipoRegistro.equals(verbas)) {
					preencherRegistro_02(linha, agPubl);
				} else if (tipoRegistro.equals(pensionistas)) {
					preencherRegistro_03(linha, folhaOrdinaria);
				} else if (tipoRegistro.equals(verbasPensionistas)) {
					preencherRegistro_04(linha, listaVerbasPensionista);
					folhaOrdinaria.getListaIdentificacaoPensionista().get(0).getValores().getVerbas()
							.add(preencherRegistro_04(linha, listaVerbasPensionista));
				}

			}
			
			linha = br.readLine();
		}

		// Leitura do Ultimo registro

		folhaOrdinaria.getListaIdentificacaoAgentePublico().add(agPubl);
		
		
		String nome = nomeArquivo ;
		Map.Entry<String,FolhaOrdinariaAgentePublico> entry = mapaGeral.entrySet().iterator().next();
			
		String nomeArquivo = getNomeFormatado( entry.getKey(),	String.valueOf(folhaOrdinaria.getDescritor().getAnoExercicio()),String.valueOf(folhaOrdinaria.getDescritor().getMesExercicio()), nome);
		
		logger.info("GERANDO OS DADOS DO ARQUIVO " + nomeArquivo + " PARA: "+ nomeArquivo);
		System.out.println("GERANDO OS DADOS DO ARQUIVO " + nomeArquivo + " PARA: "+ nomeArquivo);
		
	

		
		if(caminhoTemp == null) {
			caminhoTemp = createTemporaryDirectory(Paths.get(caminhoArquivoLeitura));
		}

		String arquivoParaSerGerado = caminhoTemp + "//" + nomeArquivo;
		mapaGeral.clear();

		try {
			gerarArquivoXML(folhaOrdinaria, arquivoParaSerGerado);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if(linha == null) {
			br.close();
			
		}else {
			
			getLinhas( br,  linha) ;
		}

		
	}


	private void preencherDescritor(FolhaOrdinariaAgentePublico folhaOrdinaria, String linha) {
		String tipoDocumento = linha.substring(20, 120).replaceAll("\\|", "");
		 anoExercicio = linha.substring(16, 20).replaceAll("\\|", "");
		String entidade = linha.substring(120, 125).replaceAll("\\|", "");
		String municipio = linha.substring(125, 129).replaceAll("\\|", "");
		// String mesExercicio = linha.substring(152, 154).replaceAll("\\|", "");
		/**
		 * Pegar o mes de exercicio na posição 155, que corresponde ao mes competente da
		 * alta - 2017-01-24
		 * 
		 */

		String mesExercicio = linha.substring(154, 156).replaceAll("\\|", "");
		String mesCompetencia = linha.substring(154, 156).replaceAll("\\|", "");
		SimpleDateFormat sfd = new SimpleDateFormat("yyyy-MM-dd");
		String dataCriacaoXml = sfd.format(new Date());
		TipoDocumento tp = new TipoDocumento();
		tp.setValor(tipoDocumento);

		DescritorMensal des = new DescritorMensal(anoExercicio, tp, entidade, municipio, dataCriacaoXml, mesExercicio);
		folhaOrdinaria.setDescritor(des);
		folhaOrdinaria.setMesCompetencia(mesCompetencia);

	}

	private void preencherRegistro_01(String linha, FolhaOrdinariaAgentePublico folhaOrdinaria,
			IdentificacaoAgentePublicoExt agPubl) {
		// String chave = linha.substring(5, 16).replaceAll("\\|", "");

		// String dataCriacaoXml = linha.substring(129, 139).replaceAll("\\|",
		// "");
		// String filler = linha.substring(139, 152).replaceAll("\\|", "");

		String tipo = linha.substring(156, 158).replaceAll("\\|", "");
		String numeroCpf = linha.substring(158, 169).replaceAll("\\|", "");
		String nome = linha.substring(169, 424).replaceAll("\\|", "");

		String municipioLotacao = linha.substring(424, 428).replaceAll("\\|", "");

		String entidadeLotacao = linha.substring(428, 433).replaceAll("\\|", "");
		String cargoPolitico = linha.substring(433, 434).replaceAll("\\|", "");
		String funcaoGoverno = linha.substring(434, 436).replaceAll("\\|", "");
		String estagiario = linha.substring(436, 437).replaceAll("\\|", "");
		String codigoCargo = linha.substring(437, 487).replaceAll("\\|", "");
		String situacao = linha.substring(487, 492).replaceAll("\\|", "");
		String regimeJuridico = linha.substring(492, 493).replaceAll("\\|", "");
		String possuiAutor = linha.substring(493, 494).replaceAll("\\|", "");
		String numeroProcesso = linha.substring(494, 544).replaceAll("\\|", "");
		String totalGeralBruto = linha.substring(544, 557).replaceAll("\\|", "");
		String totalGeralDesc = linha.substring(557, 570).replaceAll("\\|", "");
		String totalGeralLiquido = linha.substring(570, 583).replaceAll("\\|", "");
		// String filler2 = linha.substring(583, 600).replaceAll("\\|", "");

		agPubl.setCargoPolitico(Short.parseShort(cargoPolitico));
		agPubl.setCodigoCargo(codigoCargo);
		// agPubl.setCodigoFuncao(funcaoGoverno);
		CPF cpf = new CPF();
		cpf.setNumero(numeroCpf);
		cpf.setTipo(tipo);

		agPubl.setCpf(cpf);
		agPubl.setEntidadeLotacao(entidadeLotacao);
		agPubl.setEstagiario(estagiario);
		agPubl.setFuncaoGoverno(funcaoGoverno);
		agPubl.setMunicipioLotacao(municipioLotacao);
		agPubl.setNome(nome);
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

		try {
			agPubl.getValores().setTotalGeralDaRemuneracaoBruta(totalGeralBruto);
			agPubl.getValores().setTotalGeralDaRemuneracaoLiquida(totalGeralLiquido);
			agPubl.getValores().setTotalGeralDeDescontos(totalGeralDesc);
		} catch (Exception e) {
			System.out.print(linha);
			logger.info("ERRO NA LINHA " + linha);
			throw new RuntimeException();
		}

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
		System.out.println(quantidadeHorasExtras);
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
		vr.setCodigoTipoVerbaRemuneratoria(tipoVerbaRemuneratoria);
		vb.setTipoVerbaRemuneratoria(vr);

		agPubl.getValores().getVerbas().add(vb);
	}

	private void preencherRegistro_03(String linha, FolhaOrdinariaAgentePublico folhaOrdinaria) {

		String nome = linha.substring(152, 407).replaceAll("\\|", "");
		String dataNascimento = linha.substring(407, 417).replaceAll("\\|", "");
		String tipoDocumento = linha.substring(417, 419).replaceAll("\\|", "");
		String tipoCPF = linha.substring(417, 419).replaceAll("\\|", "");
		String ncpf = linha.substring(419, 430).replaceAll("\\|", "");
		String tipoCertidao = linha.substring(430, 432).replaceAll("\\|", "");
		String certidaoNasc = linha.substring(432, 443).replaceAll("\\|", "");
		String tipoPisPasep = linha.substring(443, 445).replaceAll("\\|", "");
		String pisPasep = linha.substring(445, 456).replaceAll("\\|", "");
		String tipoRG = linha.substring(456, 458).replaceAll("\\|", "");
		String RG = linha.substring(458, 469).replaceAll("\\|", "");
		String qualificacao = linha.substring(469, 470).replaceAll("\\|", "");
		String outraQualificacao = linha.substring(470, 520).replaceAll("\\|", "");
		String municipioLotacao = linha.substring(520, 524).replaceAll("\\|", "");
		String entidadeLotacao = linha.substring(524, 529).replaceAll("\\|", "");
		String totalGeralBruto = linha.substring(529, 542).replaceAll("\\|", "");
		String totalGeralDesc = linha.substring(542, 555).replaceAll("\\|", "");
		String totalGeralLiquido = linha.substring(555, 567).replaceAll("\\|", "");

		IdentificacaoPensionistaExt ip = new IdentificacaoPensionistaExt();
		ip.setNome(nome);
		ip.setDataNascimento(dataNascimento);
		ip.setEntidadeLotacaoAgentePublico(entidadeLotacao);
		ip.setMunicipioLotacaoAgentePublico(municipioLotacao);
		ip.setQualificacaoPensionista(qualificacao);
		ip.setOutraQualificacaoPensionista(outraQualificacao);

		TipoDocumentoIdentificacaoIndividual tpDocumento = new TipoDocumentoIdentificacaoIndividual();

		CertidaoNascimentoComAtributo certidao = new CertidaoNascimentoComAtributo();
		certidao.setNumero(certidaoNasc);
		certidao.setTipo(tipoCertidao);
		tpDocumento.setCertidaoNascimentoComAtributo(certidao);

		CPFComAtributo cpf = new CPFComAtributo();
		cpf.setNumero(ncpf);
		cpf.setTipo(tipoCPF);
		tpDocumento.setCpf(cpf);

		PISPASEPComAtributo pis = new PISPASEPComAtributo();
		pis.setNumero(pisPasep);
		pis.setTipo(tipoPisPasep);
		tpDocumento.setPispasepComAtributo(pis);

		RGComAtributo rg = new RGComAtributo();
		rg.setTipo(tipoRG);
		rg.setNumero(RG);
		tpDocumento.setRgComAtributo(rg);
		ip.setTipoDocumento(tpDocumento);

		IdentificacaoPensionistaExt.Valores valores = new IdentificacaoPensionistaExt().getValores();
		valores.setTotalGeralDaRemuneracaoBruta(totalGeralBruto);
		valores.setTotalGeralDaRemuneracaoLiquida(totalGeralLiquido);
		valores.setTotalGeralDeDescontos(totalGeralDesc);
		ip.setValores(valores);

		folhaOrdinaria.getListaIdentificacaoPensionista().add(ip);

	}

	private Verbas preencherRegistro_04(String linha, List<Verbas> verbas) {

		String municipioVerba = linha.substring(152, 156).replaceAll("\\|", "");
		String entidadeVerba = linha.substring(156, 161).replaceAll("\\|", "");
		String codVerba = linha.substring(161, 211).replaceAll("\\|", "");
		String valorVerba = linha.substring(211, 224).replaceAll("\\|", "");
		String naturezaVerba = linha.substring(224, 225).replaceAll("\\|", "");
		String especie = linha.substring(225, 226).replaceAll("\\|", "");
		String tipoVerbaRemuneratoria = linha.substring(226, 229).replaceAll("\\|", "");
		Verbas vb = new Verbas();
		vb.setMunicipioVerbaRemuneratoria(municipioVerba);
		vb.setEspecie(especie);
		vb.setEntidadeVerbaRemuneratoria(entidadeVerba);
		vb.setNatureza(naturezaVerba);
		vb.setCodigoVerbaRemuneratoria(codVerba);
		vb.setValor(valorVerba);
		TipoVerbaRemuneratoria vr = new TipoVerbaRemuneratoria();
		vr.setCodigoTipoVerbaRemuneratoria(tipoVerbaRemuneratoria);
		vb.setTipoVerbaRemuneratoria(vr);

		// verbas.add(vb);
		return vb;
	}

	public void rotinaFolhaOrdinaria() throws Exception {
		rotina();
	}

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
//			String nomeFormatado = getNomeFormatado(nome);
//			renomerArquivoComErros(arq, nome, nomeFormatado);
//			mapaGeral.clear();
//
//		}
//	
//	}

	public String getCaminhoLeitura() {
		return new Utils().getCaminhoFolhaOrdinaria();
	}

	public String getLocationMashaller() {
		return "http://www.tce.sp.gov.br/audesp/xml/remuneracao ../folhaOrdinaria/AUDESP_FOLHA_ORDINARIA_AGENTE_PUBLICO_"+anoExercicio+"_A.XSD";
	}

	public void gerarArquivoXML(FolhaOrdinariaAgentePublico folha, String nomeArquivo)
			throws TipoArquivoIncorretoException, Exception {

		FolhaOrdinariaAgentePublicoT folhaT = obj.createFolhaOrdinariaAgentePublicoT();

		DescritorMensalT des = preencherDescritor(folha.getDescritor());
		// folhaT.setMesCompetencia(folha.getMesCompetencia());

		for (int i = 0; i < folha.getListaIdentificacaoAgentePublico().size(); i++) {
			folhaT.getIdentificacaoAgentePublico()
					.add(preencherIdentificacaoAgentePublicoExtT(folha.getListaIdentificacaoAgentePublico().get(i)));
		}

		for (int i = 0; i < folha.getListaIdentificacaoPensionista().size(); i++) {
			folhaT.getIdentificacaoPensionista()
					.add(preencherIdentificacaoPensionista(folha.getListaIdentificacaoPensionista().get(i)));

			for (int j = 0; j < folha.getListaIdentificacaoPensionista().get(i).getValores().getVerbas().size(); j++) {
				Verbas vb = folha.getListaIdentificacaoPensionista().get(i).getValores().getVerbas().get(j);
				VerbasT vbT = obj.createVerbasT();
				vbT.setCodigoVerbaRemuneratoria(vb.getCodigoVerbaRemuneratoria());
				vbT.setEntidadeVerbaRemuneratoria(vb.getEntidadeVerbaRemuneratoria());
				vbT.setEspecie(vb.getEspecie());
				vbT.setMunicipioVerbaRemuneratoria(vb.getMunicipioVerbaRemuneratoria());
				vbT.setNatureza(vb.getNatureza());

				vbT.setValor(vb.getValor());
				TipoVerbaRemuneratoriaT tvrT = obj.createTipoVerbaRemuneratoriaT();
				tvrT.setCodigoTipoVerbaRemuneratoria(vb.getTipoVerbaRemuneratoria().getCodigoTipoVerbaRemuneratoria());
				vbT.setTipoVerbaRemuneratoria(tvrT);

				vbT.setQuantidadeHorasExtras(vb.getQuantidadeHorasExtras());
				vbT.setQuantidadeDiasFerias(vb.getQuantidadeDiasFerias());
				vbT.setQuantidadeDiasLicencaPremio(vb.getQuantidadeDiasLicencaPremio());
				
				folhaT.getIdentificacaoPensionista().get(i).getValores().getVerbas().add(vbT);
			}
		}

		folhaT.setDescritor(des);

		salvarArquivo(folhaT, FolhaOrdinariaAgentePublicoT.class, nomeArquivo);

	}

	private DescritorMensalT preencherDescritor(DescritorMensal descritor) {
		DescritorMensalT des = obj.createDescritorMensalT();
		des.setAnoExercicio(descritor.getAnoExercicio());
		if (descritor.getTipoDocumento().getValor().contains("ORDINARIA")) {
			des.setTipoDocumento(TipoDocumentoT.FOLHA_ORDINÁRIA);
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
		if (linha.contains("ORDINARIA")) {
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
		agentePublico.setCodigoFuncao(agp.getCodigoFuncao());
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

		return agentePublico;
	}

	private IdentificacaoPensionistaExtT preencherIdentificacaoPensionista(IdentificacaoPensionistaExt pen) {
		IdentificacaoPensionistaExtT pensionista = obj.createIdentificacaoPensionistaExtT();
		pensionista.setDataNascimento(pen.getDataNascimento());
		pensionista.setEntidadeLotacaoAgentePublico(pen.getEntidadeLotacaoAgentePublico());
		pensionista.setMunicipioLotacaoAgentePublico(pen.getMunicipioLotacaoAgentePublico());
		pensionista.setNome(pen.getNome());
		pensionista.setOutraQualificacaoPensionista(pen.getOutraQualificacaoPensionista());
		pensionista.setQualificacaoPensionista(pen.getQualificacaoPensionista());
		// pensionista.setTipoDocumento(preencherTipoDocumento(pen.getTipoDocumento()));
		pensionista.setCPF(getCPF(pen.getTipoDocumento().getCpf()));
		pensionista.setValores(preencherValores(pen.getValores()));

		return pensionista;
	}

	private CPFT getCPF(CPFComAtributo cpfComAtributo) {
		CPFT cpf = obj.createCPFT();
		cpf.setNumero(cpfComAtributo.getNumero());
		cpf.setTipo(cpfComAtributo.getTipo());
		return cpf;
	}

	private IdentificacaoAgentePublicoExtT.Valores preencherValores(IdentificacaoAgentePublicoExt.Valores remuneracao) {

		IdentificacaoAgentePublicoExtT.Valores valores = obj.createIdentificacaoAgentePublicoExtTValores();
		valores.setTotalGeralDaRemuneracaoBruta(remuneracao.getTotalGeralDaRemuneracaoBruta());
		valores.setTotalGeralDaRemuneracaoLiquida(remuneracao.getTotalGeralDaRemuneracaoLiquida());
		valores.setTotalGeralDeDescontos(remuneracao.getTotalGeralDeDescontos());

		for (int i = 0; i < remuneracao.getVerbas().size(); i++) {
			valores.getVerbas().add(preencherVerbasT(remuneracao.getVerbas().get(i)));
		}

		return valores;

	}

	private IdentificacaoPensionistaExtT.Valores preencherValores(IdentificacaoPensionistaExt.Valores remuneracao) {

		IdentificacaoPensionistaExtT.Valores valores = obj.createIdentificacaoPensionistaExtTValores();
		valores.setTotalGeralDaRemuneracaoBruta(remuneracao.getTotalGeralDaRemuneracaoBruta());
		valores.setTotalGeralDaRemuneracaoLiquida(remuneracao.getTotalGeralDaRemuneracaoLiquida());
		valores.setTotalGeralDeDescontos(remuneracao.getTotalGeralDeDescontos());

	
		return valores;

	}

	private VerbasT preencherVerbasT(Verbas vb) {
		VerbasT verba = obj.createVerbasT();
		verba.setCodigoVerbaRemuneratoria(vb.getCodigoVerbaRemuneratoria());
		verba.setEntidadeVerbaRemuneratoria(vb.getEntidadeVerbaRemuneratoria());
		verba.setEspecie(vb.getEspecie());
		verba.setMunicipioVerbaRemuneratoria(vb.getMunicipioVerbaRemuneratoria());
		verba.setNatureza(vb.getNatureza());
		verba.setTipoVerbaRemuneratoria(vb.getTipoVerbaRemuneratoriaT());
		verba.setValor(vb.getValor());
		


		
		
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

	public void upload(BufferedReader isr, String nome, String linha) throws Exception {
		logger.info("UPLOAD:: " + "Upload Folha Ordinaria" + nome);
		Arquivos arq = new Arquivos();
		nomeArquivo = nome;

		leituraArquivo(isr, linha);
		String key = "";
		for (Map.Entry<String, FolhaOrdinariaAgentePublico> entry : mapaGeral.entrySet()) {
			FolhaOrdinariaAgentePublico cad = entry.getValue();
			key = entry.getKey().replaceAll(" ", "");
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