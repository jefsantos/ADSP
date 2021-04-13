package br.gov.prodesp.bean;

import java.io.File;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;
import br.gov.controller.prodesp.Utils;

@ManagedBean(name = "documentService")
@ApplicationScoped
public class DocumentService implements Serializable {


	private static final long serialVersionUID = 1L;

	public void listf(String directoryName, TreeNode treeNode, String tipoArquivo) {
		File directory = new File(directoryName);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		DecimalFormat dcf = new DecimalFormat("0.00");
		File[] fList = directory.listFiles();
	

		if (fList != null) {
			Arrays.sort(fList);
			for (File file : fList) {
				if (file.isFile()) {
			
					if(file.length()>=1024) {
					double tamanho = file.length() / 1024;
					new DefaultTreeNode(new Document(file.getName(), dcf.format(tamanho) + " KB", "Arquivo",
							sdf.format(file.lastModified()), tipoArquivo, file.toString()), treeNode);
					}else {
				    new DefaultTreeNode(new Document(file.getName(), dcf.format(file.length()) + " bytes", "Arquivo",
						  sdf.format(file.lastModified()), tipoArquivo, file.toString()), treeNode);
						
					}

				} else if (file.isDirectory()) {
					String nome = file.getAbsoluteFile().toString();
					double tamanho = folderSize(file);
					int tam = nome.lastIndexOf("\\");
					nome = nome.substring(tam + 1);
					TreeNode work;
					if (tamanho > 1048576) {
						work = new DefaultTreeNode(new Document(nome, dcf.format(tamanho / 1024 / 1024) + " MB",
								"Pasta", sdf.format(file.lastModified()), tipoArquivo, file.toString()), treeNode);
					} 
						
					else if (tamanho > 1024) {
						work = new DefaultTreeNode(new Document(nome, dcf.format(tamanho / 1024) + " KB", "Pasta",
								sdf.format(file.lastModified()), tipoArquivo, file.toString()), treeNode);
					} else {
						work = new DefaultTreeNode(new Document(nome, dcf.format(tamanho) + " bytes", "Pasta",
								sdf.format(file.lastModified()), tipoArquivo, file.toString()), treeNode);

					}
					
					listf(file.getAbsolutePath(), work, tipoArquivo);
				}
			}
		}
	}

	// @Override
	// public int compare(int[] o1, int[] o2) {
	// return Integer.compare(o2[0], o1[0]);
	// }

	public long folderSize(File directory) {
		long lenght = 0;
		for (File file : directory.listFiles()) {
			if (file.isFile()) {
				lenght += file.length();
			} else {
				lenght += folderSize(file);
			}
		}
		return lenght;
	}

	public TreeNode createDocuments() {
		
		Utils utils = new Utils();
		
		TreeNode root = new DefaultTreeNode(new Document("Files", "-", "Pasta"), null);

		TreeNode vr = new DefaultTreeNode(new Document("Verbas Remuneratorias", "", ""), root);
		String verbasRemuneratorias = utils.getCaminhoVerbasRemuneratorias() ;
		listf(verbasRemuneratorias, vr, "Verbas Remuneratorias");
		//
		TreeNode ca = new DefaultTreeNode(new Document("Cadastro Aposentados e Pensionistas", "", ""), root);
		String cadastroAposentados = utils.getCaminhoAposentadoPensionistas() ;
		listf(cadastroAposentados, ca, "Cadastro Aposentados e Pensionistas");


		TreeNode fo = new DefaultTreeNode(new Document("Folha Ordinária", "", ""), root);
		String folhaOrdinaria = utils.getCaminhoFolhaOrdinaria() ;
		listf(folhaOrdinaria, fo, "Folha Ordinaria");

		TreeNode fs = new DefaultTreeNode(new Document("Folha Suplementar", "", ""), root);
		String folhaSuplementar = utils.getCaminhoFolhaSuplementar() ;
		listf(folhaSuplementar, fs, "Folha Suplementar");

		TreeNode pfo = new DefaultTreeNode(new Document("Pagamento da Folha Ordinária", "", ""), root);
		String pagamentoFO = utils.getCaminhoPagamentoFolha() ;
		listf(pagamentoFO, pfo, "Pagamento da Folha Ordinaria");

		TreeNode rs = new DefaultTreeNode(new Document("Resumo Mensal da Folha de Pagamento", "", ""), root);
		String resumoMensal = utils.getCaminhoResumoMensal() ;
		listf(resumoMensal, rs, "Resumo Mensal da Folha de Pagamento");
		
		TreeNode trans = new DefaultTreeNode(new Document("Transmissao", "", ""), root);
		String transmissao = utils.getCaminhoTransmissao() ;
		listf(transmissao, trans, "Transmissao");

		return root;
	}
}