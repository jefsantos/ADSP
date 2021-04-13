package br.gov.prodesp.view;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.apache.log4j.Logger;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

import br.gov.prodesp.bean.Document;




@ManagedBean
@SessionScoped
public class FileDownloadView  implements Serializable{


	private static final long serialVersionUID = 1L;

	
	private StreamedContent file;
	private String nomeArquivo;
	private String tipoArquivo;
	private String localArquivo;
	final static Logger logger = Logger.getLogger(FileDownloadView.class);

	public void valueChange(ActionEvent e) {
		Document doc  = (Document) e.getComponent().getAttributes().get("doc");
		nomeArquivo = (String) e.getComponent().getAttributes().get("nome");
		tipoArquivo = (String) e.getComponent().getAttributes().get("tipoArquivo");
		localArquivo =	doc.getLocalArquivo();
		
	}

	public String atualizar() {
		return "";
	}

	

	
	public void apagarArquivo() {
		try {
			File file = new File(localArquivo);
			
			if (file.delete()) {
				System.out.println(file.getName() + " is deleted!");
			} else {
				System.out.println("Delete operation is failed.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	public void gerarArquivo() throws FileNotFoundException {
		if (nomeArquivo == null) {
			nomeArquivo = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("nome");
			tipoArquivo = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap()
					.get("tipoArquivo");
		}
		InputStream stream = new FileInputStream(localArquivo);

		file = new DefaultStreamedContent(stream, "text/*", nomeArquivo);

	}

	public boolean isNumber(String numero) {
		try {
			Integer.parseInt(numero);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public StreamedContent getFile() throws FileNotFoundException {
		gerarArquivo();
		return file;
	}
	
	
	

}