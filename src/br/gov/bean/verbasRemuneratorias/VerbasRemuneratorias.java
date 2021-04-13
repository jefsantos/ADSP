package br.gov.bean.verbasRemuneratorias;

import java.util.ArrayList;
import java.util.List;

public class VerbasRemuneratorias {

	
	private List<VerbaRemuneratoria> lista = new ArrayList<VerbaRemuneratoria>();

	public List<VerbaRemuneratoria> getLista() {
		return lista;
	}

	public void addLista(VerbaRemuneratoria e) {
		this.lista.add(e)	;
		
		}

	public VerbasRemuneratorias(VerbaRemuneratoria e) {
		super();
		addLista(e);
	}

	
	public VerbasRemuneratorias() {
		super();
	}

	

}
