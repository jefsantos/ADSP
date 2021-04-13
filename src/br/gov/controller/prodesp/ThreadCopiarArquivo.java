package br.gov.controller.prodesp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.Path;

public class ThreadCopiarArquivo implements Runnable {

	private Path path;
	private Path diretorioTransmissao;
	private Path diretoriosClientes;
	
	public ThreadCopiarArquivo(Path path, Path diretorioTransmissao, Path diretoriosClientes) {
		super();
		this.path = path;
		this.diretorioTransmissao = diretorioTransmissao;
		this.diretoriosClientes = diretoriosClientes;
	}



	@Override
	public void run() {
		 System.out.println(String.format("chamando  thread: %s",
                 Thread.currentThread().getName()) + path + "CLI"+ diretoriosClientes+ "TRANS"+ diretorioTransmissao);
		 
		if(path != null && diretoriosClientes != null && diretorioTransmissao != null ) {
			try {
				
				 System.out.println(String.format("execute thread: %s",
		                 Thread.currentThread().getName()));
				
				copyFileUsingFileChannels(new File(path.toString()),new File(diretorioTransmissao.toString()));
			
				copyFileUsingFileChannels(new File(path.toString()),new File(diretoriosClientes.toString()));
				
				
				
			} catch (Exception e) {
				System.out.println("Erro ao mover o arquivo: " + path +"----" + e +"======"+e.getCause() + "--------"+e.getMessage());
	
			}
		}else {
			
			System.out.println("DADOS INCOMPLETOS"+ path + "------"+ diretoriosClientes+ "------"+ diretorioTransmissao);
			
		}
	}
	
	
	
	private  void copyFileUsingFileChannels(File source, File dest)  {

		FileChannel inputChannel1 = null;
		FileChannel outputChannel1 = null;


		try {

			FileInputStream f1=	 new FileInputStream(source);
			FileOutputStream f2 = new FileOutputStream(dest);
			
			inputChannel1 = f1.getChannel();
			outputChannel1 = f2.getChannel();

			outputChannel1.transferFrom(inputChannel1, 0, inputChannel1.size());

			inputChannel1.close();
			outputChannel1.close();
			
			f1.close();
			f2.close();
			

			}catch (Exception e) {
				System.out.println("Erro ao copiar arquivos"+e);

			}

	}

	
	
}
