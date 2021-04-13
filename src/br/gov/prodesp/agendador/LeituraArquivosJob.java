package br.gov.prodesp.agendador;

import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;

import br.gov.controller.prodesp.CadastroAposentadosController;
import br.gov.controller.prodesp.FolhaOrdinariaAgentePublicoController;
import br.gov.controller.prodesp.FolhaSuplementarAgentePublicoController;
import br.gov.controller.prodesp.PagamentoFolhaAgentePublicoController;
import br.gov.controller.prodesp.ResumoFolhaController;
import br.gov.controller.prodesp.Utils;
import br.gov.controller.prodesp.VerbasRemuneratoriasController;

public class LeituraArquivosJob implements Job {
	public static boolean executando = false;
	final static Logger logger = Logger.getLogger(LeituraArquivosJob.class);
	Utils utils = new Utils();
	private int QUANTIDADE_DIAS = utils.getQuantidadeDias();

	public void execute(JobExecutionContext context) {
		executarRotinaArquivos();
		executarRotinaLimpeza();
	}

	public boolean executarRotinaLimpeza() {

		try {
			limparArquivos(utils.getCaminhoAposentadoPensionistas());
			limparArquivos(utils.getCaminhoFolhaOrdinaria());
			limparArquivos(utils.getCaminhoFolhaSuplementar());
			limparArquivos(utils.getCaminhoPagamentoFolha());
			limparArquivos(utils.getCaminhoVerbasRemuneratorias());
			limparArquivos(utils.getCaminhoResumoMensal());

			return true;
		} catch (Exception e) {
			logger.info("ERRO AO EXECUTAR ROTINA DE APAGAR ARQUIVOS");
			return false;
		}
	}

	public void limparArquivos(String diretorio) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String dataInicial = sdf.format(new Date());
		File dir = new File(diretorio);
		if (dir.isDirectory()) {
			File[] sub = dir.listFiles();
			for (File f : sub) {
				if (f.isDirectory()) {

					limparArquivos(f.getAbsolutePath());
					if (f.listFiles().length == 0) {
						f.delete();
					}
				} else {
					long dias = getDiferencaDeDias(sdf.format(f.lastModified()), dataInicial);
					if (dias > QUANTIDADE_DIAS) {
						System.out.println("Apagando o arquivo..." + f.getName());
						if (f.delete()) {
							System.out.println(f.getName() + " foi deletado!");
							logger.info(f.getName() + " foi deletado!");
						} else {
							System.out.println("FALHA AO DELETAR O ARQUIVO" + f);
							logger.info("FALHA AO DELETAR O ARQUIVO");
						}
					}
				}
			}
		}
	}

	public long getDiferencaDeDias(String data1, String data2) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		df.setLenient(false);
		Date d1;
		try {
			d1 = df.parse(data1);
			Date d2 = df.parse(data2);
			long dt = (d2.getTime() - d1.getTime()) + 3600000;
			return dt / 86400000L;
		} catch (ParseException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public boolean executarRotinaArquivos() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		logger.info("EXECUTANDO ROTINA " + date);

		if (!executando) {
			executando = true;

			logger.info(" Executando Rotina Geração de Arquivos " + dateFormat.format(date));
			CadastroAposentadosController ca = new CadastroAposentadosController();
			VerbasRemuneratoriasController vr = new VerbasRemuneratoriasController();
			FolhaOrdinariaAgentePublicoController fo = new FolhaOrdinariaAgentePublicoController();
			FolhaSuplementarAgentePublicoController fs = new FolhaSuplementarAgentePublicoController();
			ResumoFolhaController rf = new ResumoFolhaController();
			PagamentoFolhaAgentePublicoController pgfo = new PagamentoFolhaAgentePublicoController();

			try {
			try {
				logger.info("Rotina Geração de Arquivos VERBAS REMUNERATORIAS  ");
				vr.rotinaVerbasRemuneratorias();
			} catch (Exception e) {
				logger.error("OCORREU UM ERRO AO EXECUTAR A ROTINA  VERBAS REMUNERATORIA " + e.getMessage() + " - "
						+ e.getCause());
				e.printStackTrace();
			}
			try {
				logger.info("Rotina Geração de Arquivos CADASTRO DE APOSENTADOS ");
				ca.rotinaCadatroAposentados();
			} catch (Exception e) {
				logger.error("OCORREU UM ERRO AO EXECUTAR A ROTINA CADASTRO DE APOSENTADOS " + e.getMessage() + " - "
						+ e.getCause());
				e.printStackTrace();
			}
			try {
				logger.info("Rotina Geração de Arquivos FOLHA ORDINARIA ");
				fo.rotinaFolhaOrdinaria();
			} catch (Exception e) {
				logger.error("OCORREU UM ERRO AO EXECUTAR A ROTINA FOLHA ORDINARIA " + e.getMessage() + " - "
						+ e.getCause());
				e.printStackTrace();
			}

			try {

				logger.info("Rotina Geração de Arquivos FOLHA SUPLEMENTAR ");
				fs.rotinaFolhaSuplementar();
			} catch (Exception e) {
				logger.error("OCORREU UM ERRO AO EXECUTAR A ROTINA FOLHA SUPLEMENTAR " + e.getMessage() + " - "
						+ e.getCause());
				e.printStackTrace();
			}
			try {

				logger.info("Rotina Geração de Arquivos RESUMO FOLHA ");
				rf.rotinaResumoFolha();
			} catch (Exception e) {
				logger.error(
						"OCORREU UM ERRO AO EXECUTAR A ROTINA  RESUMO FOLHA " + e.getMessage() + " - " + e.getCause());
				e.printStackTrace();
			}
			try {

				logger.info("Rotina Geração de Arquivos PAGAMENTO FOLHA ");
				pgfo.rotinaPagamentoFolha();

			} catch (Exception e) {
				logger.error("OCORREU UM ERRO AO EXECUTAR A ROTINA  PAGAMENTO FOLHA " + e.getMessage() + " - "
						+ e.getCause());
				e.printStackTrace();
			}
			} catch (Exception e) {
				logger.error("OCORREU UM ERRO AO EXECUTAR A ROTINA   " + e.getMessage() + " - "
						+ e.getCause());
				e.printStackTrace();
			
			} finally {
				executando = false;
			}
			
			logger.info(" FIM  " + dateFormat.format(date));

		}
		return false;

	}

}
