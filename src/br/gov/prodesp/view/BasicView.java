package br.gov.prodesp.view;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.apache.log4j.Logger;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

import br.gov.controller.prodesp.CadastroAposentadosController;
import br.gov.controller.prodesp.FolhaOrdinariaAgentePublicoController;
import br.gov.controller.prodesp.FolhaSuplementarAgentePublicoController;
import br.gov.controller.prodesp.GenericoController;
import br.gov.controller.prodesp.PagamentoFolhaAgentePublicoController;
import br.gov.controller.prodesp.ResumoFolhaController;
import br.gov.controller.prodesp.VerbasRemuneratoriasController;
import br.gov.prodesp.agendador.LeituraArquivosJob;
//import br.gov.prodesp.agendador.LeituraArquivosJob;
import br.gov.prodesp.bean.Document;
import br.gov.prodesp.bean.DocumentService;

@ManagedBean(name = "ttBasicView")
@ViewScoped
public class BasicView implements Serializable {

	final static Logger logger = Logger.getLogger(BasicView.class);

	private static final long serialVersionUID = 1L;

	private TreeNode root;

	private Document selectedDocument;

	private TreeNode[] selectedNodes;

	@ManagedProperty("#{documentService}")
	private DocumentService service;

	@PostConstruct
	public void init() {
		root = service.createDocuments();
	}

	public TreeNode getRoot() {
		return root;
	}

	public void setService(DocumentService service) {
		this.service = service;
	}

	public Document getSelectedDocument() {
		return selectedDocument;
	}

	public void setSelectedDocument(Document selectedDocument) {
		this.selectedDocument = selectedDocument;
	}

	public TreeNode[] getSelectedNodes() {
		return selectedNodes;
	}

	public void setSelectedNodes(TreeNode[] selectedNodes) {
		this.selectedNodes = selectedNodes;
	}

	public void moverArquivosParaErros() {

		TreeNode[] nodes = getSelectedNodes();
		if (nodes != null && nodes.length > 0) {

			for (TreeNode node : nodes) {

				DefaultTreeNode df = (DefaultTreeNode) node;

				String pastaRaiz = df.getParent().toString();

				if (((Document) df.getData()).getType().contains("Arquivo")) {

					if (pastaRaiz.contains("Erros")) {
						moverArquivosErrosParaLer((Document) df.getData());

					} else {
						GenericoController gc = new GenericoController();
						gc.moverArquivosPastaErros((Document) df.getData());

					}
			
				} else {
					System.out.println(df.getData());

				}

			}
		}
	}

	public void moverArquivosErrosParaLer(Document df) {


		if (df.getType().contains("Arquivo")) {

			GenericoController gc = new GenericoController();
			gc.moverArquivosDeErrosParaLer(df);

		} else {
			System.out.println(df.getData());

		}

	}

	public void atualizarArquivos() {
		root = service.createDocuments();
	}

	public void lerArquivos() {
		TreeNode[] nodes = getSelectedNodes();
		if (nodes != null && nodes.length > 0) {

			for (TreeNode node : nodes) {

				DefaultTreeNode df = (DefaultTreeNode) node;
				// List<TreeNode> lista = df.getChildren() ;
				String pastaRaiz = df.getParent().toString();

				if (((Document) df.getData()).getType().contains("Arquivo")) {

					try {
						if (pastaRaiz.contains("Suplementar")) {
							FolhaSuplementarAgentePublicoController c = new FolhaSuplementarAgentePublicoController();
							c.lerArquivo(node.getData().toString());

						} else if (pastaRaiz.contains("Verbas")) {
							VerbasRemuneratoriasController c = new VerbasRemuneratoriasController();
							c.lerArquivo(node.getData().toString());
							
						} else if (pastaRaiz.contains("Resumo")) {
							ResumoFolhaController c = new ResumoFolhaController();
							c.lerArquivo(node.getData().toString());

						} else if (pastaRaiz.contains("Pagamento")) {
							PagamentoFolhaAgentePublicoController c = new PagamentoFolhaAgentePublicoController();
							c.lerArquivo(node.getData().toString());

						} else if (pastaRaiz.contains("Folha")) {
							FolhaOrdinariaAgentePublicoController c = new FolhaOrdinariaAgentePublicoController();
							c.lerArquivo(node.getData().toString());

						} else if (pastaRaiz.contains("Aposentados")) {
							CadastroAposentadosController c = new CadastroAposentadosController();
							c.lerArquivo(node.getData().toString());

						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					System.out.println(df.getData());

				}

			}
		}
	}

	public void executarRotinasArquivos() {
		System.out.println("EXECUTANDO A ROTINA MANUALMENTE");
		logger.error("EXECUTANDO A ROTINA MANUALMENTE");
		LeituraArquivosJob job = new LeituraArquivosJob();
		boolean isOk = job.executarRotinaArquivos();

		if (!isOk) {
			System.out.println("OCORREU UM ERRO AO EXECUTAR A ROTINA");
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Selected",
					"OCORREU UM ERRO AO EXECUTAR A ROTINA");
			FacesContext.getCurrentInstance().addMessage(null, message);

		}else {
			logger.error("FIM DA  ROTINA MANUAL");
		}

	}

	public void executarRotinasLimpeza() {
		System.out.println("EXECUTANDO A ROTINA MANUALMENTE DE LIMPEZA");
		logger.error("EXECUTANDO A ROTINA MANUALMENTE DE LIMPEZA");
		LeituraArquivosJob job = new LeituraArquivosJob();
		boolean isOk = job.executarRotinaLimpeza();

		if (!isOk) {
			System.out.println("OCORREU UM ERRO AO EXECUTAR A ROTINA MANUALMENTE DE LIMPEZA");
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Selected",
					"ERRO AO APAGAR ARQUIVOS ANTIGOS");
			FacesContext.getCurrentInstance().addMessage(null, message);

		}else {
			logger.error("FIM DA LIMPEZA");
		}

	}

}