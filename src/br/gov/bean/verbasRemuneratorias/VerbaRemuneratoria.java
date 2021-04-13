package br.gov.bean.verbasRemuneratorias;

public class VerbaRemuneratoria {

	private String codigo;
	private String nome;
	private short entraNoCalculoDoTetoConstitucional;

	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public short getEntraNoCalculoDoTetoConstitucional() {
		return entraNoCalculoDoTetoConstitucional;
	}

	public void setEntraNoCalculoDoTetoConstitucional(short entraNoCalculoDoTetoConstitucional) {
		this.entraNoCalculoDoTetoConstitucional = entraNoCalculoDoTetoConstitucional;
	}

	public void setEntraNoCalculoDoTetoConstitucional(int entraNoCalculoDoTetoConstitucional) {
		this.entraNoCalculoDoTetoConstitucional = (short) entraNoCalculoDoTetoConstitucional;
	}

	public VerbaRemuneratoria(String codigo, String nome, short entraNoCalculoDoTetoConstitucional) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.entraNoCalculoDoTetoConstitucional = entraNoCalculoDoTetoConstitucional;
	}

	public VerbaRemuneratoria(String codigo, String nome, int entraNoCalculoDoTetoConstitucional) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.entraNoCalculoDoTetoConstitucional = (short) entraNoCalculoDoTetoConstitucional;
	}

	public VerbaRemuneratoria() {
		super();
	}

}
