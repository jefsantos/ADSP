package br.gov.prodesp.bean;

import java.io.Serializable;

public class Document implements Serializable, Comparable<Document> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;

	private String size;

	private String type;

	private String typeArchive;

	private double tamanho;

	private String data;

	private String localArquivo;

	public Document(String name, String size, String type, String data, String typeArchive, String caminho) {
		this.name = name;
		this.size = size;
		this.type = type;
		this.data = data;
		this.typeArchive = typeArchive;
		this.localArquivo = caminho;

	}

	public Document(String name, String size, String type) {
		this.name = name;
		this.size = size;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public String getData() {
		if (data != null) {
			return data;
		}
		return "";
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getTypeArchive() {
		return typeArchive;
	}

	public void setTypeArchive(String typeArchive) {
		this.typeArchive = typeArchive;
	}

	public String getLocalArquivo() {
		return localArquivo;
	}

	public void setLocalArquivo(String localArquivo) {
		this.localArquivo = localArquivo;
	}

	// Eclipse Generated hashCode and equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((size == null) ? 0 : size.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((localArquivo == null) ? 0 : localArquivo.hashCode());
		result = prime * result + ((typeArchive == null) ? 0 : typeArchive.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Document other = (Document) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		else if (!data.equals(other.data))
			return false;
		if (size == null) {
			if (other.size != null)
				return false;
		} else if (!size.equals(other.size))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		else if (!typeArchive.equals(other.typeArchive))
			return false;
		else if (!localArquivo.equals(other.localArquivo))
			return false;

		return true;
	}

	@Override
	public String toString() {
		return name;
	}

	public int compareTo(Document document) {
		return this.getName().compareTo(document.getName());
	}
}