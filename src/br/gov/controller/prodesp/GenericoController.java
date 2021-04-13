package br.gov.controller.prodesp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;

import org.apache.log4j.Logger;

import br.gov.prodesp.bean.Arquivos;
import br.gov.prodesp.bean.Document;
import br.gov.prodesp.exception.TipoArquivoIncorretoException;

public class GenericoController {

	Utils utils = new Utils();
	public  final String CAMINHORAIZ = utils.getCaminhoRaiz();
	public  final String CAMINHOTRANSMISSAO = utils.getCaminhoTransmissao();
	protected String caminhoArquivoLeitura = getCaminhoLeitura();
	private  List<Thread> threads = new ArrayList<Thread>();
	
	Path caminhoTemp = null;
	
	protected String nomeArquivo = "  ";

	Logger logger = Logger.getLogger(this.getClass().getName());

	
	public void rotina() throws Exception {
		Arquivos arq = new Arquivos();
		List<String> nomes = arq.listarArquivos(caminhoArquivoLeitura);
		if (nomes.size() == 0) {
			logger.info("Não existe arquivos para serem lidos" + caminhoArquivoLeitura);
		}
		try {

			for (int i = 0; i < nomes.size(); i++) {
				logger.info("LENDO O ARQUIVO " + nomes.get(i));
				leituraArquivo(caminhoArquivoLeitura + "//" + nomes.get(i));
				arq.verificarDiretorio(caminhoArquivoLeitura + "//" + "Lidos");
				String nomeFormatado = getNomeFormatado(nomes.get(i));
				renomerArquivoPastaLidos(arq, nomes.get(i), nomeFormatado);
			}
		} catch (TipoArquivoIncorretoException e) {
		}

	}
	
	public String getLocationMashaller() {
		return null;
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
			String nomeFormatado = getNomeFormatado(nome);
			renomerArquivoComErros(arq, nome, nomeFormatado);
	

		}
	
	}
	

	protected <T> void salvarArquivo(Object obj, Class<T> classe, String nomeArquivo)
			throws JAXBException, PropertyException {
		logger.info("SALVANDO O ARQUIVO " + nomeArquivo);
		JAXBContext context = JAXBContext.newInstance(classe);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");
		
		
//		logger.info("XML " + getLocationMashaller());
		marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, getLocationMashaller());
	
		try {

			FileOutputStream fos = new FileOutputStream(nomeArquivo);
			marshaller.marshal(obj, fos);
 			logger.info("XML convertido com sucesso.");
			//System.out.println("XML convertido com sucesso.");
			fos.close();
		} catch (Exception e) {
			logger.info("ERRO AO SALVAR ARQUIVO!!!!");
		}

	}

	public String getCaminhoLeitura() {
		throw new IllegalArgumentException("Metodo getCaminhoLeitura não implementado");
	}
	

	
	
	 

	protected void renomerArquivoPastaLidos(Arquivos arq, String nome, String nomeFormatado) {
		boolean isOk = arq.renomearArquivos(getCaminhoLeitura() + "\\" + nome,
				getCaminhoLeitura() + "\\Lidos\\" + nomeFormatado);
		if (isOk) {
			logger.info("ARQUIVO RENOMEADO COM SUCESSO");
		} else {
			logger.error("ERRO AO RENOMEAR ARQUIVO");
		}
	}

	protected void renomerArquivoComErros(Arquivos arq, String nome, String nomeFormatado) {
		boolean isOk = arq.renomearArquivos(getCaminhoLeitura() + "\\" + nome,
				getCaminhoLeitura() + "\\Erros\\" + nomeFormatado);
		if (isOk) {
			logger.info("ARQUIVO RENOMEADO COM SUCESSO");
		} else {
			logger.error("ERRO AO RENOMEAR ARQUIVO" + nomeFormatado);
			Date date = new Date();
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

			String[] nomes = nomeFormatado.split("\\.");
			if (nomes.length == 0) {
				nomes = new String[1];
				nomes[0] = new String(nomeFormatado);

			}

			nomeFormatado = nomes[0] + "_" + dateFormat.format(date).toString().replaceAll("", "_") + nomes[1];
			isOk = arq.renomearArquivos(getCaminhoLeitura() + "\\" + nome,
					getCaminhoLeitura() + "\\Erros\\" + nomeFormatado);
			if (isOk) {
				logger.info("ARQUIVO RENOMEADO COM SUCESSO");
			}
		}
	}

	public void moverArquivosPastaErros(Document df) {
		Arquivos arq = new Arquivos();

		String caminhoErros = df.getLocalArquivo();
		int indice = caminhoErros.lastIndexOf("\\");
		caminhoErros = caminhoErros.substring(0, indice) + "\\Erros" + caminhoErros.substring(indice);
		String caminho = df.getLocalArquivo();
		arq.verificarDiretorio(caminhoErros.substring(0, indice) + "\\Erros");

		boolean isOk = arq.renomearArquivoeSemAlterarNome(caminho, caminhoErros);
		if (isOk) {
			logger.info("ARQUIVO RENOMEADO COM SUCESSO");
		} else {
			logger.error("ERRO AO RENOMEAR ARQUIVO" + caminho);
			isOk = arq.renomearArquivos(caminho, caminhoErros);
			if (isOk) {
				logger.info("ARQUIVO RENOMEADO COM SUCESSO");
			}
		}
	}



	public void moverArquivosDeErrosParaLer(Document df) {
		Arquivos arq = new Arquivos();
		String caminho = df.getLocalArquivo();
		String caminhoParaLer = df.getLocalArquivo().replace("\\Erros", "");
		boolean isOk = arq.renomearArquivoeSemAlterarNome(caminho, caminhoParaLer);
		if (isOk) {
			logger.info("ARQUIVO RENOMEADO COM SUCESSO");
		} else {
			 logger.error("ERRO AO RENOMEAR ARQUIVO"+ caminhoParaLer);
			isOk = arq.renomearArquivos(caminho, caminhoParaLer);
			if (isOk) {
				logger.info("ARQUIVO RENOMEADO COM SUCESSO");
			}
		}
	}



	protected String getNomeFormatado(String nomeArquivo) {
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmm");
		String nome = nomeArquivo.toLowerCase().replace(".txt", "");
		nome = nome + "_" + dateFormat.format(date) + ".txt";
		return nome;
	}
	
	protected String getNomeFormatado(String nomeArquivo, String key ) {
		
		return getNomeFormatado(nomeArquivo);
	}

	protected String getNomeFormatado(String cliente, String ano, String mes, String nomeArquivo) {
//		Date date = new Date();
//		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmm");
		nomeArquivo = nomeArquivo.toUpperCase();

//		System.out.println("cliente"+ cliente);
//		System.out.println("ano"+ ano);
//		System.out.println("mes"+ mes);
//		System.out.println("nomeArquivo"+ nomeArquivo);
		
		if (mes.length() < 2) {
			mes = "0" + mes;
		}

		
		if(nomeArquivo.contains("CRV")) {
			if(nomeArquivo.contains("LPA767D")) {
				nomeArquivo =  "CVR_PENS_"+ nomeArquivo;
			}else if(nomeArquivo.toUpperCase().contains("LPA6D2D")) {
				nomeArquivo = "CVR_DIF_"+ nomeArquivo;
			}
			
		}
		String nomeArquivoMod = cliente + "_" + ano + mes + "_" + nomeArquivo.replace(".txt", "").replace(".TXT", "")+ ".xml";
//				+ "_" + dateFormat.format(date) + ".xml";
		return nomeArquivoMod;
	}

	protected void getLinhas(BufferedReader br, String linha) throws IOException {
		throw new IllegalArgumentException("Metodo getLinhas não implementado");
	}

	protected void leituraArquivo(BufferedReader br, String linha) throws IOException {
		if (linha != null && isArquivoLayoutCorreto(linha)) {
			// tratamento para remocao das aspas simples, o mainframe futuramente fara esse tratamento
			// Helenice 2018-02-01
			linha = linha.replace("\'", " ");
			getLinhas(br, linha);
		} else {
			br.close();
			boolean isMovido = moverArquivoPastaCorreta(nomeArquivo);
			if (!isMovido) {
				throw new TipoArquivoIncorretoException();
			}
		}
		if (caminhoTemp != null) {
			moverArquivosTemporarios(caminhoTemp.toString());
			 long tempo = 10000;
			
			try {
				Thread.sleep(tempo);
				 System.out.println("Deletando:" +caminhoTemp);
				 deleteDir(new File(caminhoTemp.toString()));
				 System.out.println("Arquivo Apagado....." +caminhoTemp);
			} catch (Exception e) {
				 System.out.println("Erro ao apagar:" +caminhoTemp);
			}
			caminhoTemp = null;
		}
	}

	
	
	void deleteDir(File file) {
	    File[] contents = file.listFiles();
	    if (contents != null) {
	        for (File f : contents) {
	            deleteDir(f);
	        }
	    }
	    file.delete();
	}
	
	
	protected void leituraArquivo(String nomeArquivo) throws TipoArquivoIncorretoException, Exception {
		this.nomeArquivo = nomeArquivo.substring(nomeArquivo.indexOf("//") + 2);
		InputStream is = new FileInputStream(nomeArquivo);
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String linha = br.readLine();
		
		if(linha != null) {
		  leituraArquivo(br, linha);
		}else {
			br.close();
			throw new TipoArquivoIncorretoException();
		}
	}
	
	protected Path createTemporaryDirectory(Path rootDirectory) {
	    Path tempDirectory = null;
		try {
			tempDirectory = Files.createTempDirectory(rootDirectory, "");
			System.out.println("Temporary directory created successfully!");
		    String dirPath = tempDirectory.toString();
		    System.out.println(dirPath);
		   
		} catch (IOException e) {
			e.printStackTrace();
		}
		 return tempDirectory;
	}
	
	
	protected boolean verifyDirectoryIsEmpty(File file){
		
		if(file.isDirectory()){

			if(file.list().length == 0){
				System.out.println("Directory is  empty!");
				return true;

			}else{
				System.out.println("Directory is not empty!");
			}

		}else{
			System.out.println("This is not a directory");
		}
		return false;
	}
	
		

	protected boolean isArquivoLayoutCorreto(String linha) {
		throw new IllegalArgumentException("Metodo isArquivoLayoutCorreto não implementado");
	}
	
	
	
	public void moverArquivosTemporarios(String caminhoArquivoLeituraTemporario) {
		logger.info("MOVER ARQUIVOS!!!");
		Path pastaTemporaria = Paths.get(caminhoArquivoLeituraTemporario);
		Arquivos arq = new Arquivos();
		Path erroPath = pastaTemporaria;
		Path pastaTransmissao = Paths.get(CAMINHOTRANSMISSAO);

		try (DirectoryStream<Path> diretorioDeTransmissao = Files.newDirectoryStream(pastaTemporaria)) {
			for (Path path : diretorioDeTransmissao) {
				erroPath = path;
				
				arq.verificarDiretorio(caminhoArquivoLeitura +"\\"+ path.getFileName().toString().substring(0, 3));
				Path pastaCliente = Paths.get(caminhoArquivoLeitura+"\\" + path.getFileName().toString().substring(0, 3));
	
				Path diretoriosClientes = pastaCliente.resolve(path.getFileName());
				Path diretorioTransmissao = pastaTransmissao.resolve(path.getFileName());
				
				Thread t = new Thread(new ThreadCopiarArquivo( path,  diretorioTransmissao,  diretoriosClientes));
				 t.run();
				 threads.add(t);
				
			}
		
			diretorioDeTransmissao.close();
			WaitForThreads();

		} catch (IOException ex) {
			System.out.println("Erro ao mover os arquivos (moverArquivos)" + erroPath.toString());
			ex.printStackTrace();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
	}
	
	
	private void WaitForThreads(){
		System.out.println("LISTA"+ threads.size());
		for (Thread thread : threads)
			try {
				
//				boolean isAtive = thread.isAlive();
				
				thread.join();

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	

	protected boolean moverArquivoPastaCorreta(String caminhoArquivo) throws IOException {

		Arquivos arq = new Arquivos();
		Utils util = new Utils();
		InputStream is = new FileInputStream(caminhoArquivo);
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String linha = br.readLine();
		br.close();
		String novoCaminho = "";
		String nomeArquivo = "";
		logger.info("TENTANDO MOVER O ARQUIVO PARA A PASTA CORRETA " + linha);
	

		if (linha == null) {
			System.out.println(caminhoArquivo);
			nomeArquivo = caminhoArquivo.substring(caminhoArquivo.lastIndexOf("//"));
			novoCaminho = caminhoArquivo.substring(0, caminhoArquivo.lastIndexOf("//")) + "\\Erros";
			arq.verificarDiretorio(novoCaminho);
			novoCaminho += nomeArquivo;
		
		} else {
			if (linha.contains("ORDINARIA")) {
				novoCaminho = util.getCaminhoFolhaOrdinaria() + nomeArquivo;

			} else if (linha.contains("SUPLEMENTAR")) {
				novoCaminho = util.getCaminhoFolhaSuplementar() + nomeArquivo;

			} else if (linha.contains("PAGAMENTO")) {
				novoCaminho = util.getCaminhoPagamentoFolha()  + nomeArquivo;

			} else if (linha.contains("APOSENTADOS")) {
				novoCaminho = util.getCaminhoAposentadoPensionistas()  + nomeArquivo;

			} else if (linha.contains("RESUMO")) {
				novoCaminho = util.getCaminhoResumoMensal() + nomeArquivo;

			} else if (linha.contains("VERBAS REMUNERATORIAS")) {
				novoCaminho = util.getCaminhoVerbasRemuneratorias()+ nomeArquivo;
			}
			nomeArquivo = caminhoArquivo.substring(caminhoArquivo.lastIndexOf("//"));
		}
		logger.info("RENOMEANDO DE :" + caminhoArquivo);
		logger.info("PARA :" + novoCaminho);
		return arq.renomearArquivoeSemAlterarNome(caminhoArquivo, novoCaminho);
	}

}
