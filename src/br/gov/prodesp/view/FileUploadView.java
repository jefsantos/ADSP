package br.gov.prodesp.view;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;
import br.gov.controller.prodesp.CadastroAposentadosController;
import br.gov.controller.prodesp.FolhaOrdinariaAgentePublicoController;
import br.gov.controller.prodesp.FolhaSuplementarAgentePublicoController;
import br.gov.controller.prodesp.PagamentoFolhaAgentePublicoController;
import br.gov.controller.prodesp.ResumoFolhaController;
import br.gov.controller.prodesp.Utils;
import br.gov.controller.prodesp.VerbasRemuneratoriasController;
import br.gov.prodesp.bean.Arquivos;

@ManagedBean
public class FileUploadView {
	final static Logger logger = Logger.getLogger(FileUploadView.class);
	private UploadedFile file;

	public UploadedFile getFile() {
		return file;
	}

	public void setFile(UploadedFile file) {
		this.file = file;
	}

	public void carregarArquivo(FileUploadEvent e) throws IOException {
		logger.info("FAZENDO UPLOAD DO ARQUIVO " + e.getFile().getFileName());
		try {
			boolean sucess = true;
			

			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

			String dataAtual = sdf.format(new Date());

			file = e.getFile();
			if (file != null) {

				InputStream is = file.getInputstream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);

				String linha = br.readLine();

				if (linha != null) {

					String nomeArquivo = file.getFileName().replace(".txt", "") + "_" + dataAtual.trim() + ".txt";
					Utils util = new Utils();
			
					if (linha.contains("CADASTRO DE VERBAS REMUNERATORIAS")) {
						try {
							VerbasRemuneratoriasController vr = new VerbasRemuneratoriasController();
							logger.info("LENDO O ARQUIVO " + file.getFileName());
							vr.upload(br, file.getFileName(), linha);

							
							
							copiarArquivoParaLidos(file.getInputstream(),
									util.getCaminhoVerbasRemuneratorias() + "\\Lidos\\" + nomeArquivo);

						} catch (Exception ex) {
							sucess = false;
							FacesMessage message = new FacesMessage("ERRO",
									file.getFileName() + "Erro ao carregar o arquivo do cadastro de verbas remuneradas "
											+ file.getFileName());
							FacesContext.getCurrentInstance().addMessage(null, message);
							logger.error("ERRO  AO FAZER O UPLOAD DO ARQUIVO CADASTRO DE VERBAS REMUNERATORIAS "
									+ file.getFileName());

						}
					} else if (linha.contains("PAGAMENTO DE FOLHA ORDINARIA")) {
						try {
							PagamentoFolhaAgentePublicoController pgfo = new PagamentoFolhaAgentePublicoController();
							logger.info("LENDO O ARQUIVO " + file.getFileName());
							pgfo.upload(br, file.getFileName(), linha);
							copiarArquivoParaLidos(file.getInputstream(),
									util.getCaminhoPagamentoFolha() + "\\Lidos\\" + file.getFileName());
						} catch (Exception ex) {
							sucess = false;
							FacesMessage message = new FacesMessage("ERRO", file.getFileName()
									+ "Erro ao carregar o arquivo  pagammento folha ordinaria " + file.getFileName());
							FacesContext.getCurrentInstance().addMessage(null, message);
							logger.error("ERRO  AO FAZER O UPLOAD DO ARQUIVO PAGAMENTO DE FOLHA ORDINARIA "
									+ file.getFileName());

						}
					} else if (linha.contains("CADASTRO DE APOSENTADOS E PENSIONISTAS")) {
						try {
							CadastroAposentadosController ca = new CadastroAposentadosController();
							logger.info("LENDO O ARQUIVO " + file.getFileName());
							ca.upload(br, file.getFileName(), linha);

							copiarArquivoParaLidos(file.getInputstream(),
									util.getCaminhoAposentadoPensionistas() + "\\Lidos\\" + file.getFileName());
						} catch (Exception ex) {
							sucess = false;
							FacesMessage message = new FacesMessage("ERRO",
									file.getFileName()
											+ "Erro ao carregar o arquivo do cadastro de aposentados e pensionistas "
											+ file.getFileName());
							FacesContext.getCurrentInstance().addMessage(null, message);
							logger.error("ERRO  AO FAZER O UPLOAD DO ARQUIVO CADASTRO DE APOSENTADOS E PENSIONISTAS "
									+ file.getFileName());
						}
					} else if (linha.contains("FOLHA ORDINARIA")) {
						try {
							FolhaOrdinariaAgentePublicoController fo = new FolhaOrdinariaAgentePublicoController();
							logger.info("LENDO O ARQUIVO " + file.getFileName());
							fo.upload(br, file.getFileName(), linha);
							copiarArquivoParaLidos(file.getInputstream(),
									util.getCaminhoFolhaOrdinaria() + "\\Lidos\\" + file.getFileName());
						} catch (Exception ex) {
							sucess = false;
							FacesMessage message = new FacesMessage("ERRO", file.getFileName()
									+ "Erro ao carregar o arquivo folha ordinaria " + file.getFileName());
							FacesContext.getCurrentInstance().addMessage(null, message);
							logger.error("ERRO  AO FAZER O UPLOAD DO ARQUIVO FOLHA ORDINARIA" + file.getFileName());
						}
					} else if (linha.contains("FOLHA SUPLEMENTAR")) {
						try {
							FolhaSuplementarAgentePublicoController fs = new FolhaSuplementarAgentePublicoController();
							logger.info("LENDO O ARQUIVO " + file.getFileName());
							fs.upload(br, file.getFileName(), linha);
							copiarArquivoParaLidos(file.getInputstream(),
									util.getCaminhoFolhaSuplementar() + "\\Lidos\\" + file.getFileName());
						} catch (Exception ex) {
							sucess = false;
							FacesMessage message = new FacesMessage("ERRO", file.getFileName()
									+ "Erro ao carregar o arquivo folha suplementar " + file.getFileName());
							FacesContext.getCurrentInstance().addMessage(null, message);
							logger.error("ERRO  AO FAZER O UPLOAD DO ARQUIVO FOLHA SUPLEMENTAR " + file.getFileName());
						}

					} else if (linha.contains("RESUMO MENSAL DA FOLHA DE PAGAMENTO")) {
						try {
							ResumoFolhaController rf = new ResumoFolhaController();
							logger.info("LENDO O ARQUIVO " + file.getFileName());
							rf.upload(br, file.getFileName(), linha);
							copiarArquivoParaLidos(file.getInputstream(),
									util.getCaminhoResumoMensal() + "\\Lidos\\" + file.getFileName());
						} catch (Exception ex) {
							sucess = false;
							FacesMessage message = new FacesMessage("ERRO",
									"Erro ao carregar o arquivo resumo mensal " + file.getFileName());
							FacesContext.getCurrentInstance().addMessage(null, message);
							logger.error("ERRO  AO FAZER O UPLOAD DO ARQUIVO RESUMO MENSAL DA FOLHA DE PAGAMENTO "
									+ file.getFileName());

						}
					}

				}
				sucess = true;
				if (sucess) {
					FacesMessage message = new FacesMessage("SUCESSO.",
							" UPLOAD DO ARQUIVO " + file.getFileName() + " REALIZADO COM SUCESSO!");
					FacesContext.getCurrentInstance().addMessage(null, message);
					logger.info("UPLOAD DO ARQUIVO  " + file.getFileName() + " REALIZADO COM SUCESSO!");
				}
			}
		} catch (Exception ex) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, null, "Erro ao carregar  o arquivo"));
			logger.error("ERRO  AO FAZER O UPLOAD DO ARQUIVO " + ex.getMessage() + " " + ex.getCause());
		}
	}

	public void copiarArquivoParaLidos(InputStream in, String caminhoArquivo) {
		OutputStream out;
		try {
			Arquivos arq = new Arquivos();
			arq.verificarDiretorio(caminhoArquivo.substring(0,(caminhoArquivo.lastIndexOf("\\"))));
			out = new FileOutputStream(caminhoArquivo);
			IOUtils.copy(in, out);
			IOUtils.closeQuietly(out);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			IOUtils.closeQuietly(in);

		}

	}

}