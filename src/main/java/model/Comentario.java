package model;

public class Comentario {
	private Usuario usuarioComentario;
	private String textoComentario;
	
	public Comentario(Usuario usuarioComentario, String textoComentario) {
		super();
		this.usuarioComentario = usuarioComentario;
		this.textoComentario = textoComentario;
	}

	public Usuario getUsuarioComentario() {
		return usuarioComentario;
	}

	public void setUsuarioComentario(Usuario usuarioComentario) {
		this.usuarioComentario = usuarioComentario;
	}

	public String getTextoComentario() {
		return textoComentario;
	}

	public void setTextoComentario(String textoComentario) {
		this.textoComentario = textoComentario;
	}

}
