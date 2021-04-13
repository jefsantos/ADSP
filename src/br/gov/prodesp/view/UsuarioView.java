 
package br.gov.prodesp.view;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.gov.bean.prodesp.Usuario;
import br.gov.controller.prodesp.Utils;

 
@ManagedBean
@SessionScoped
public class UsuarioView  implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Usuario usuario;

    public UsuarioView() {
        this.usuario = new Usuario();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

	public String logar() {
		Utils utils = new Utils();
		if (utils.getUsuario().equals(usuario.getLogin()) && (utils.getSenha().equals(usuario.getSenha()))) {
			return "controle";
		} else {
			return "index";

		}
	}
    public String sair(){
        return "index";

    }
        public String voltarControle (){
        return "controle";

    }
}
