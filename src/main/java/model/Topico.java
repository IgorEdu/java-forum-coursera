package model;

import java.util.List;

public class Topico {
	private String titulo;
	private String texto;
	private Usuario usuarioCriador;
	private List<Comentario> comentarios;
	
	public Topico(String titulo, String texto, Usuario usuarioCriador) {
		super();
		this.titulo = titulo;
		this.texto = texto;
		this.usuarioCriador = usuarioCriador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Usuario getUsuarioCriador() {
		return usuarioCriador;
	}

	public void setUsuarioCriador(Usuario usuarioCriador) {
		this.usuarioCriador = usuarioCriador;
	}
	
	public List<Comentario> getComentarios(){
		return this.comentarios;
	}

	
}
