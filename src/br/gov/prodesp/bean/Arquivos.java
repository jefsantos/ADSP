package br.gov.prodesp.bean;

import java.io.File;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class Arquivos {
	
	final static Logger logger = Logger.getLogger(Arquivos.class);

	public File[] listf(String directoryName) {
		File directory = new File(directoryName);
		File[] fList = directory.listFiles();
		for (File file : fList) {
			if (file.isFile()) {
			} else if (file.isDirectory()) {
				listf(file.getAbsolutePath());
			}
		}
		return fList;
	}

	public ArrayList<String> listarArquivos(String diretorio) {
		ArrayList<String> nomesArquivos = new ArrayList<String>();

		File file = new File(diretorio);

		File afile[] = file.listFiles();
		if (afile != null) {
			for (File a : afile) {

				if (a.getName().contains(".txt") || a.getName().contains(".TXT")) {
					nomesArquivos.add(a.getName());
				}
			}
		}
		return nomesArquivos;
	}

//	public void moverArquivos() {
//
//	}

	public boolean renomearArquivos(String nomeArquivo, String novoNome) {
		novoNome = novoNome.toLowerCase();
		return new File(nomeArquivo).renameTo(new File(novoNome));
	}

	public boolean renomearArquivoeSemAlterarNome(String nomeArquivo, String novoNome) {
		return new File(nomeArquivo).renameTo(new File(novoNome));

	}

	public void verificarDiretorio(String dir) {
		File file = new File(dir);
		if (!file.exists()) {
			if (file.mkdir()) {
				logger.info("Directorio criado com sucesso " + dir);
			} else {
				logger.error("Falha ao criar o diretorio " + dir);
			}
		}

	}

}
